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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'@'", "'['", "','", "']'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'||'", "'}'", "'/'", "'region'", "'#'", "':= '", "': '", "'local'", "'input'", "'output'", "':='", "'combine'", "'with'", "'NORMAL'", "'cond'", "'reference'", "'textual'", "'NONE'", "'+'", "'*'", "'host'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'double'"
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
            ruleMemo = new HashMap[72+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) ) ( '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}' )? ) ;
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
        Token lv_id_34=null;
        Token lv_label_35=null;
        Token lv_bodyText_36=null;
        Token lv_newStateID_37=null;
        Enumerator lv_type_2 = null;

        Enumerator lv_type_6 = null;

        Enumerator lv_type_10 = null;

        Enumerator lv_type_11 = null;

        Enumerator lv_type_13 = null;

        Enumerator lv_type_17 = null;

        Enumerator lv_type_19 = null;

        Enumerator lv_type_23 = null;

        Enumerator lv_type_25 = null;

        Enumerator lv_type_27 = null;

        Enumerator lv_type_30 = null;

        EObject lv_signalRenamings_41 = null;

        EObject lv_signalRenamings_43 = null;

        EObject lv_entryActions_47 = null;

        EObject lv_innerActions_49 = null;

        EObject lv_exitActions_51 = null;

        EObject lv_suspensionTrigger_53 = null;

        EObject lv_signals_54 = null;

        EObject lv_regions_55 = null;

        EObject lv_regions_57 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) ) ( '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}' )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) ) ( '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}' )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) ) ( '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) ) ( '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}' )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=13)||(LA7_0>=36 && LA7_0<=39)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? ) | ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )? )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? 'state' (lv_id_34= RULE_ID )? (lv_label_35= RULE_STRING )? (lv_bodyText_36= RULE_STRING )?
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_type_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) ) | ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )?
                    int alt1=16;
                    switch ( input.LA(1) ) {
                        case 11:
                            {
                            switch ( input.LA(2) ) {
                                case 12:
                                    {
                                    int LA1_8 = input.LA(3);

                                    if ( (LA1_8==13) ) {
                                        alt1=4;
                                    }
                                    else if ( ((LA1_8>=36 && LA1_8<=39)) ) {
                                        alt1=10;
                                    }
                                    }
                                    break;
                                case 13:
                                    {
                                    alt1=1;
                                    }
                                    break;
                                case 36:
                                    {
                                    int LA1_10 = input.LA(3);

                                    if ( (LA1_10==13) ) {
                                        alt1=5;
                                    }
                                    else if ( (LA1_10==12) ) {
                                        alt1=11;
                                    }
                                    }
                                    break;
                                case 37:
                                    {
                                    int LA1_11 = input.LA(3);

                                    if ( (LA1_11==12) ) {
                                        alt1=11;
                                    }
                                    else if ( (LA1_11==13) ) {
                                        alt1=5;
                                    }
                                    }
                                    break;
                                case 38:
                                    {
                                    int LA1_12 = input.LA(3);

                                    if ( (LA1_12==13) ) {
                                        alt1=5;
                                    }
                                    else if ( (LA1_12==12) ) {
                                        alt1=11;
                                    }
                                    }
                                    break;
                                case 39:
                                    {
                                    int LA1_13 = input.LA(3);

                                    if ( (LA1_13==13) ) {
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

                                    if ( (LA1_14==13) ) {
                                        alt1=6;
                                    }
                                    else if ( ((LA1_14>=36 && LA1_14<=39)) ) {
                                        alt1=12;
                                    }
                                    }
                                    break;
                                case 36:
                                    {
                                    int LA1_15 = input.LA(3);

                                    if ( (LA1_15==11) ) {
                                        alt1=13;
                                    }
                                    else if ( (LA1_15==13) ) {
                                        alt1=7;
                                    }
                                    }
                                    break;
                                case 37:
                                    {
                                    int LA1_16 = input.LA(3);

                                    if ( (LA1_16==13) ) {
                                        alt1=7;
                                    }
                                    else if ( (LA1_16==11) ) {
                                        alt1=13;
                                    }
                                    }
                                    break;
                                case 38:
                                    {
                                    int LA1_17 = input.LA(3);

                                    if ( (LA1_17==13) ) {
                                        alt1=7;
                                    }
                                    else if ( (LA1_17==11) ) {
                                        alt1=13;
                                    }
                                    }
                                    break;
                                case 39:
                                    {
                                    int LA1_18 = input.LA(3);

                                    if ( (LA1_18==13) ) {
                                        alt1=7;
                                    }
                                    else if ( (LA1_18==11) ) {
                                        alt1=13;
                                    }
                                    }
                                    break;
                                case 13:
                                    {
                                    alt1=2;
                                    }
                                    break;
                            }

                            }
                            break;
                        case 36:
                            {
                            switch ( input.LA(2) ) {
                                case 13:
                                    {
                                    alt1=3;
                                    }
                                    break;
                                case 11:
                                    {
                                    int LA1_21 = input.LA(3);

                                    if ( (LA1_21==12) ) {
                                        alt1=15;
                                    }
                                    else if ( (LA1_21==13) ) {
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
                                    else if ( (LA1_22==13) ) {
                                        alt1=9;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 37:
                            {
                            switch ( input.LA(2) ) {
                                case 11:
                                    {
                                    int LA1_21 = input.LA(3);

                                    if ( (LA1_21==12) ) {
                                        alt1=15;
                                    }
                                    else if ( (LA1_21==13) ) {
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
                                    else if ( (LA1_22==13) ) {
                                        alt1=9;
                                    }
                                    }
                                    break;
                                case 13:
                                    {
                                    alt1=3;
                                    }
                                    break;
                            }

                            }
                            break;
                        case 38:
                            {
                            switch ( input.LA(2) ) {
                                case 12:
                                    {
                                    int LA1_22 = input.LA(3);

                                    if ( (LA1_22==11) ) {
                                        alt1=14;
                                    }
                                    else if ( (LA1_22==13) ) {
                                        alt1=9;
                                    }
                                    }
                                    break;
                                case 13:
                                    {
                                    alt1=3;
                                    }
                                    break;
                                case 11:
                                    {
                                    int LA1_21 = input.LA(3);

                                    if ( (LA1_21==12) ) {
                                        alt1=15;
                                    }
                                    else if ( (LA1_21==13) ) {
                                        alt1=8;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 39:
                            {
                            switch ( input.LA(2) ) {
                                case 13:
                                    {
                                    alt1=3;
                                    }
                                    break;
                                case 11:
                                    {
                                    int LA1_21 = input.LA(3);

                                    if ( (LA1_21==12) ) {
                                        alt1=15;
                                    }
                                    else if ( (LA1_21==13) ) {
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
                                    else if ( (LA1_22==13) ) {
                                        alt1=9;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt1) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: (lv_isInitial_0= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: (lv_isInitial_0= 'init' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: lv_isInitial_0= 'init'
                            {
                            lv_isInitial_0=(Token)input.LT(1);
                            match(input,11,FOLLOW_11_in_ruleState138); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_0_0(), "isInitial"); 
                                  
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
                            match(input,12,FOLLOW_12_in_ruleState178); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_1_0(), "isFinal"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:132:6: (lv_type_2= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:132:6: (lv_type_2= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:135:6: lv_type_2= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState231);
                            lv_type_2=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_2, "StateType", lastConsumedNode);
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
                            match(input,11,FOLLOW_11_in_ruleState263); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_3_0_0(), "isInitial"); 
                                  
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
                            match(input,12,FOLLOW_12_in_ruleState297); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_3_1_0(), "isFinal"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:6: ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:6: ( (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:7: (lv_isInitial_5= 'init' ) (lv_type_6= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:7: (lv_isInitial_5= 'init' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:199:6: lv_isInitial_5= 'init'
                            {
                            lv_isInitial_5=(Token)input.LT(1);
                            match(input,11,FOLLOW_11_in_ruleState339); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_4_0_0(), "isInitial"); 
                                  
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

                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:2: (lv_type_6= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:221:6: lv_type_6= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState386);
                            lv_type_6=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_6, "StateType", lastConsumedNode);
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
                            match(input,12,FOLLOW_12_in_ruleState419); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_5_0_0(), "isFinal"); 
                                  
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
                            match(input,11,FOLLOW_11_in_ruleState453); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_5_1_0(), "isInitial"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:6: ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:6: ( (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:7: (lv_isFinal_9= 'final' ) (lv_type_10= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:7: (lv_isFinal_9= 'final' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:285:6: lv_isFinal_9= 'final'
                            {
                            lv_isFinal_9=(Token)input.LT(1);
                            match(input,12,FOLLOW_12_in_ruleState495); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_6_0_0(), "isFinal"); 
                                  
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

                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:304:2: (lv_type_10= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:307:6: lv_type_10= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_6_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState542);
                            lv_type_10=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_10, "StateType", lastConsumedNode);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:6: ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:6: ( (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:7: (lv_type_11= ruleStateType ) (lv_isInitial_12= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:7: (lv_type_11= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:329:6: lv_type_11= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_7_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState588);
                            lv_type_11=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_11, "StateType", lastConsumedNode);
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
                            match(input,11,FOLLOW_11_in_ruleState613); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_7_1_0(), "isInitial"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:6: ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:6: ( (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:7: (lv_type_13= ruleStateType ) (lv_isFinal_14= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:7: (lv_type_13= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:372:6: lv_type_13= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_8_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState668);
                            lv_type_13=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_13, "StateType", lastConsumedNode);
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
                            match(input,12,FOLLOW_12_in_ruleState693); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_8_1_0(), "isFinal"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_type_17= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: (lv_isInitial_15= 'init' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:414:6: lv_isInitial_15= 'init'
                            {
                            lv_isInitial_15=(Token)input.LT(1);
                            match(input,11,FOLLOW_11_in_ruleState735); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_9_0_0(), "isInitial"); 
                                  
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
                            match(input,12,FOLLOW_12_in_ruleState769); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_9_1_0(), "isFinal"); 
                                  
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

                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:454:2: (lv_type_17= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:457:6: lv_type_17= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_9_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState816);
                            lv_type_17=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_17, "StateType", lastConsumedNode);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: (lv_isInitial_18= 'init' ) (lv_type_19= ruleStateType ) (lv_isFinal_20= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: (lv_isInitial_18= 'init' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:478:6: lv_isInitial_18= 'init'
                            {
                            lv_isInitial_18=(Token)input.LT(1);
                            match(input,11,FOLLOW_11_in_ruleState849); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_10_0_0(), "isInitial"); 
                                  
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

                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:497:2: (lv_type_19= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:500:6: lv_type_19= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_10_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState896);
                            lv_type_19=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_19, "StateType", lastConsumedNode);
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
                            match(input,12,FOLLOW_12_in_ruleState921); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_10_2_0(), "isFinal"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_type_23= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: (lv_isFinal_21= 'final' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:542:6: lv_isFinal_21= 'final'
                            {
                            lv_isFinal_21=(Token)input.LT(1);
                            match(input,12,FOLLOW_12_in_ruleState963); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_11_0_0(), "isFinal"); 
                                  
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
                            match(input,11,FOLLOW_11_in_ruleState997); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_11_1_0(), "isInitial"); 
                                  
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

                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:582:2: (lv_type_23= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:585:6: lv_type_23= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_11_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState1044);
                            lv_type_23=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_23, "StateType", lastConsumedNode);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:6: ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:6: ( (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:7: (lv_isFinal_24= 'final' ) (lv_type_25= ruleStateType ) (lv_isInitial_26= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:7: (lv_isFinal_24= 'final' )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:606:6: lv_isFinal_24= 'final'
                            {
                            lv_isFinal_24=(Token)input.LT(1);
                            match(input,12,FOLLOW_12_in_ruleState1077); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_12_0_0(), "isFinal"); 
                                  
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

                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:625:2: (lv_type_25= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:628:6: lv_type_25= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_12_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState1124);
                            lv_type_25=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_25, "StateType", lastConsumedNode);
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
                            match(input,11,FOLLOW_11_in_ruleState1149); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_12_2_0(), "isInitial"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:6: ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:6: ( (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:7: (lv_type_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:7: (lv_type_27= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:671:6: lv_type_27= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_13_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState1204);
                            lv_type_27=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_27, "StateType", lastConsumedNode);
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
                            match(input,12,FOLLOW_12_in_ruleState1229); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_13_1_0(), "isFinal"); 
                                  
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
                            match(input,11,FOLLOW_11_in_ruleState1263); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_13_2_0(), "isInitial"); 
                                  
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:6: ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:6: ( (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:7: (lv_type_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:7: (lv_type_30= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:735:6: lv_type_30= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_0_14_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState1318);
                            lv_type_30=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_30, "StateType", lastConsumedNode);
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
                            match(input,11,FOLLOW_11_in_ruleState1343); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_14_1_0(), "isInitial"); 
                                  
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
                            match(input,12,FOLLOW_12_in_ruleState1377); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_14_2_0(), "isFinal"); 
                                  
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

                    match(input,13,FOLLOW_13_in_ruleState1402); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_0_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:799:1: (lv_id_34= RULE_ID )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        int LA2_1 = input.LA(2);

                        if ( (synpred16()) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:801:6: lv_id_34= RULE_ID
                            {
                            lv_id_34=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1424); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_0_0_2_0(), "id"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "id", lv_id_34, "ID", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:819:3: (lv_label_35= RULE_STRING )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_STRING) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred17()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:821:6: lv_label_35= RULE_STRING
                            {
                            lv_label_35=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState1455); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_0_0_3_0(), "label"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "label", lv_label_35, "STRING", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:839:3: (lv_bodyText_36= RULE_STRING )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_STRING) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred18()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:841:6: lv_bodyText_36= RULE_STRING
                            {
                            lv_bodyText_36=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState1486); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_0_0_4_0(), "bodyText"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "bodyText", lv_bodyText_36, "STRING", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:7: ( (lv_newStateID_37= RULE_ID ) '@' )? ( RULE_ID ) '[' ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )* (lv_signalRenamings_43= ruleSignalRenaming ) ']'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:7: ( (lv_newStateID_37= RULE_ID ) '@' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==14) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:8: (lv_newStateID_37= RULE_ID ) '@'
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:8: (lv_newStateID_37= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:862:6: lv_newStateID_37= RULE_ID
                            {
                            lv_newStateID_37=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1526); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getStateAccess().getNewStateIDIDTerminalRuleCall_0_1_0_0_0(), "newStateID"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "newStateID", lv_newStateID_37, "ID", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }

                            match(input,14,FOLLOW_14_in_ruleState1543); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getCommercialAtKeyword_0_1_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:884:3: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:887:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1567); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getReferencedStateStateCrossReference_0_1_1_0(), "referencedState"); 
                      	
                    }

                    }

                    match(input,15,FOLLOW_15_in_ruleState1579); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_0_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:1: ( (lv_signalRenamings_41= ruleSignalRenaming ) ',' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==25) ) {
                                int LA6_2 = input.LA(3);

                                if ( (LA6_2==RULE_ID) ) {
                                    int LA6_3 = input.LA(4);

                                    if ( (LA6_3==16) ) {
                                        alt6=1;
                                    }


                                }


                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:2: (lv_signalRenamings_41= ruleSignalRenaming ) ','
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:2: (lv_signalRenamings_41= ruleSignalRenaming )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:907:6: lv_signalRenamings_41= ruleSignalRenaming
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalRenamingsSignalRenamingParserRuleCall_0_1_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignalRenaming_in_ruleState1614);
                    	    lv_signalRenamings_41=ruleSignalRenaming();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "signalRenamings", lv_signalRenamings_41, "SignalRenaming", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }

                    	    match(input,16,FOLLOW_16_in_ruleState1627); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_0_1_3_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:929:3: (lv_signalRenamings_43= ruleSignalRenaming )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:932:6: lv_signalRenamings_43= ruleSignalRenaming
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalRenamingsSignalRenamingParserRuleCall_0_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalRenaming_in_ruleState1663);
                    lv_signalRenamings_43=ruleSignalRenaming();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		add(current, "signalRenamings", lv_signalRenamings_43, "SignalRenaming", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,17,FOLLOW_17_in_ruleState1676); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightSquareBracketKeyword_0_1_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:954:3: ( '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:954:4: '{' ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+ '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleState1688); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:958:1: ( ( 'onentry' (lv_entryActions_47= ruleAction ) ) | ( 'oninner' (lv_innerActions_49= ruleAction ) ) | ( 'onexit' (lv_exitActions_51= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) ) | (lv_signals_54= ruleSignal ) | ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=7;
                        switch ( input.LA(1) ) {
                        case 19:
                            {
                            alt9=1;
                            }
                            break;
                        case 20:
                            {
                            alt9=2;
                            }
                            break;
                        case 21:
                            {
                            alt9=3;
                            }
                            break;
                        case 22:
                            {
                            alt9=4;
                            }
                            break;
                        case 30:
                            {
                            int LA9_6 = input.LA(2);

                            if ( (LA9_6==RULE_ID) ) {
                                int LA9_10 = input.LA(3);

                                if ( (synpred26()) ) {
                                    alt9=5;
                                }
                                else if ( (synpred28()) ) {
                                    alt9=6;
                                }


                            }


                            }
                            break;
                        case 31:
                            {
                            int LA9_7 = input.LA(2);

                            if ( (LA9_7==RULE_ID) ) {
                                int LA9_10 = input.LA(3);

                                if ( (synpred26()) ) {
                                    alt9=5;
                                }
                                else if ( (synpred28()) ) {
                                    alt9=6;
                                }


                            }


                            }
                            break;
                        case 32:
                            {
                            int LA9_8 = input.LA(2);

                            if ( (LA9_8==RULE_ID) ) {
                                int LA9_10 = input.LA(3);

                                if ( (synpred26()) ) {
                                    alt9=5;
                                }
                                else if ( (synpred28()) ) {
                                    alt9=6;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 26:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            {
                            alt9=6;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:958:2: ( 'onentry' (lv_entryActions_47= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:958:2: ( 'onentry' (lv_entryActions_47= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:958:3: 'onentry' (lv_entryActions_47= ruleAction )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleState1699); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_1_1_0_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:962:1: (lv_entryActions_47= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:965:6: lv_entryActions_47= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_1_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState1733);
                    	    lv_entryActions_47=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "entryActions", lv_entryActions_47, "Action", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:6: ( 'oninner' (lv_innerActions_49= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:6: ( 'oninner' (lv_innerActions_49= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:7: 'oninner' (lv_innerActions_49= ruleAction )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleState1754); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_1_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:988:1: (lv_innerActions_49= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:991:6: lv_innerActions_49= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_1_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState1788);
                    	    lv_innerActions_49=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "innerActions", lv_innerActions_49, "Action", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1010:6: ( 'onexit' (lv_exitActions_51= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1010:6: ( 'onexit' (lv_exitActions_51= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1010:7: 'onexit' (lv_exitActions_51= ruleAction )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleState1809); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_1_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1014:1: (lv_exitActions_51= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1017:6: lv_exitActions_51= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_1_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState1843);
                    	    lv_exitActions_51=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "exitActions", lv_exitActions_51, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1036:6: ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1036:6: ( 'suspension' (lv_suspensionTrigger_53= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1036:7: 'suspension' (lv_suspensionTrigger_53= ruleAction )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleState1864); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_1_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1040:1: (lv_suspensionTrigger_53= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1043:6: lv_suspensionTrigger_53= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_1_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState1898);
                    	    lv_suspensionTrigger_53=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		set(current, "suspensionTrigger", lv_suspensionTrigger_53, "Action", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1062:6: (lv_signals_54= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1062:6: (lv_signals_54= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1065:6: lv_signals_54= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_1_1_4_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleState1943);
                    	    lv_signals_54=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "signals", lv_signals_54, "Signal", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:6: ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:6: ( ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:7: ( (lv_regions_55= ruleRegion ) '||' )* (lv_regions_57= ruleRegion )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:7: ( (lv_regions_55= ruleRegion ) '||' )*
                    	    loop8:
                    	    do {
                    	        int alt8=2;
                    	        switch ( input.LA(1) ) {
                    	        case 26:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case RULE_STRING:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case RULE_ID:
                    	                    {
                    	                    int LA8_3 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 30:
                    	                    {
                    	                    int LA8_4 = input.LA(4);

                    	                    if ( (LA8_4==RULE_ID) ) {
                    	                        int LA8_16 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 31:
                    	                    {
                    	                    int LA8_5 = input.LA(4);

                    	                    if ( (LA8_5==RULE_ID) ) {
                    	                        int LA8_16 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 32:
                    	                    {
                    	                    int LA8_6 = input.LA(4);

                    	                    if ( (LA8_6==RULE_ID) ) {
                    	                        int LA8_16 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 11:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 12:
                    	                        {
                    	                        switch ( input.LA(5) ) {
                    	                        case 36:
                    	                            {
                    	                            int LA8_29 = input.LA(6);

                    	                            if ( (LA8_29==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 37:
                    	                            {
                    	                            int LA8_30 = input.LA(6);

                    	                            if ( (LA8_30==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 38:
                    	                            {
                    	                            int LA8_31 = input.LA(6);

                    	                            if ( (LA8_31==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 39:
                    	                            {
                    	                            int LA8_32 = input.LA(6);

                    	                            if ( (LA8_32==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 13:
                    	                            {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                            }
                    	                            break;

                    	                        }

                    	                        }
                    	                        break;
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;
                    	                    case 36:
                    	                        {
                    	                        int LA8_18 = input.LA(5);

                    	                        if ( (LA8_18==12) ) {
                    	                            int LA8_33 = input.LA(6);

                    	                            if ( (LA8_33==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_18==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 37:
                    	                        {
                    	                        int LA8_19 = input.LA(5);

                    	                        if ( (LA8_19==12) ) {
                    	                            int LA8_33 = input.LA(6);

                    	                            if ( (LA8_33==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_19==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 38:
                    	                        {
                    	                        int LA8_20 = input.LA(5);

                    	                        if ( (LA8_20==12) ) {
                    	                            int LA8_33 = input.LA(6);

                    	                            if ( (LA8_33==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_20==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 39:
                    	                        {
                    	                        int LA8_21 = input.LA(5);

                    	                        if ( (LA8_21==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }
                    	                        else if ( (LA8_21==12) ) {
                    	                            int LA8_33 = input.LA(6);

                    	                            if ( (LA8_33==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 11:
                    	                        {
                    	                        switch ( input.LA(5) ) {
                    	                        case 13:
                    	                            {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                            }
                    	                            break;
                    	                        case 36:
                    	                            {
                    	                            int LA8_34 = input.LA(6);

                    	                            if ( (LA8_34==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 37:
                    	                            {
                    	                            int LA8_35 = input.LA(6);

                    	                            if ( (LA8_35==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 38:
                    	                            {
                    	                            int LA8_36 = input.LA(6);

                    	                            if ( (LA8_36==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;
                    	                        case 39:
                    	                            {
                    	                            int LA8_37 = input.LA(6);

                    	                            if ( (LA8_37==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                            }
                    	                            break;

                    	                        }

                    	                        }
                    	                        break;
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;
                    	                    case 36:
                    	                        {
                    	                        int LA8_23 = input.LA(5);

                    	                        if ( (LA8_23==11) ) {
                    	                            int LA8_38 = input.LA(6);

                    	                            if ( (LA8_38==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_23==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 37:
                    	                        {
                    	                        int LA8_24 = input.LA(5);

                    	                        if ( (LA8_24==11) ) {
                    	                            int LA8_38 = input.LA(6);

                    	                            if ( (LA8_38==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_24==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 38:
                    	                        {
                    	                        int LA8_25 = input.LA(5);

                    	                        if ( (LA8_25==11) ) {
                    	                            int LA8_38 = input.LA(6);

                    	                            if ( (LA8_38==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_25==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 39:
                    	                        {
                    	                        int LA8_26 = input.LA(5);

                    	                        if ( (LA8_26==11) ) {
                    	                            int LA8_38 = input.LA(6);

                    	                            if ( (LA8_38==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_26==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 36:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;
                    	                    case 12:
                    	                        {
                    	                        int LA8_27 = input.LA(5);

                    	                        if ( (LA8_27==11) ) {
                    	                            int LA8_39 = input.LA(6);

                    	                            if ( (LA8_39==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_27==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 11:
                    	                        {
                    	                        int LA8_28 = input.LA(5);

                    	                        if ( (LA8_28==12) ) {
                    	                            int LA8_40 = input.LA(6);

                    	                            if ( (LA8_40==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_28==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 11:
                    	                        {
                    	                        int LA8_28 = input.LA(5);

                    	                        if ( (LA8_28==12) ) {
                    	                            int LA8_40 = input.LA(6);

                    	                            if ( (LA8_40==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_28==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 12:
                    	                        {
                    	                        int LA8_27 = input.LA(5);

                    	                        if ( (LA8_27==11) ) {
                    	                            int LA8_39 = input.LA(6);

                    	                            if ( (LA8_39==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_27==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;
                    	                    case 12:
                    	                        {
                    	                        int LA8_27 = input.LA(5);

                    	                        if ( (LA8_27==11) ) {
                    	                            int LA8_39 = input.LA(6);

                    	                            if ( (LA8_39==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_27==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 11:
                    	                        {
                    	                        int LA8_28 = input.LA(5);

                    	                        if ( (LA8_28==12) ) {
                    	                            int LA8_40 = input.LA(6);

                    	                            if ( (LA8_40==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_28==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 11:
                    	                        {
                    	                        int LA8_28 = input.LA(5);

                    	                        if ( (LA8_28==12) ) {
                    	                            int LA8_40 = input.LA(6);

                    	                            if ( (LA8_40==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_28==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 12:
                    	                        {
                    	                        int LA8_27 = input.LA(5);

                    	                        if ( (LA8_27==11) ) {
                    	                            int LA8_39 = input.LA(6);

                    	                            if ( (LA8_39==13) ) {
                    	                                int LA8_13 = input.LA(7);

                    	                                if ( (synpred27()) ) {
                    	                                    alt8=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA8_27==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case RULE_ID:
                    	                {
                    	                int LA8_3 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;
                    	            case 30:
                    	                {
                    	                int LA8_4 = input.LA(3);

                    	                if ( (LA8_4==RULE_ID) ) {
                    	                    int LA8_16 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 31:
                    	                {
                    	                int LA8_5 = input.LA(3);

                    	                if ( (LA8_5==RULE_ID) ) {
                    	                    int LA8_16 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 32:
                    	                {
                    	                int LA8_6 = input.LA(3);

                    	                if ( (LA8_6==RULE_ID) ) {
                    	                    int LA8_16 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 11:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 12:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 36:
                    	                        {
                    	                        int LA8_29 = input.LA(5);

                    	                        if ( (LA8_29==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 37:
                    	                        {
                    	                        int LA8_30 = input.LA(5);

                    	                        if ( (LA8_30==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 38:
                    	                        {
                    	                        int LA8_31 = input.LA(5);

                    	                        if ( (LA8_31==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 39:
                    	                        {
                    	                        int LA8_32 = input.LA(5);

                    	                        if ( (LA8_32==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 36:
                    	                    {
                    	                    int LA8_18 = input.LA(4);

                    	                    if ( (LA8_18==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_18==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    int LA8_19 = input.LA(4);

                    	                    if ( (LA8_19==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_19==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA8_20 = input.LA(4);

                    	                    if ( (LA8_20==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_20==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA8_21 = input.LA(4);

                    	                    if ( (LA8_21==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }
                    	                    else if ( (LA8_21==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 11:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;
                    	                    case 36:
                    	                        {
                    	                        int LA8_34 = input.LA(5);

                    	                        if ( (LA8_34==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 37:
                    	                        {
                    	                        int LA8_35 = input.LA(5);

                    	                        if ( (LA8_35==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 38:
                    	                        {
                    	                        int LA8_36 = input.LA(5);

                    	                        if ( (LA8_36==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 39:
                    	                        {
                    	                        int LA8_37 = input.LA(5);

                    	                        if ( (LA8_37==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 36:
                    	                    {
                    	                    int LA8_23 = input.LA(4);

                    	                    if ( (LA8_23==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_23==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    int LA8_24 = input.LA(4);

                    	                    if ( (LA8_24==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_24==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA8_25 = input.LA(4);

                    	                    if ( (LA8_25==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_25==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA8_26 = input.LA(4);

                    	                    if ( (LA8_26==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_26==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 36:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 37:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 38:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 39:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case RULE_STRING:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case RULE_ID:
                    	                {
                    	                int LA8_3 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;
                    	            case 30:
                    	                {
                    	                int LA8_4 = input.LA(3);

                    	                if ( (LA8_4==RULE_ID) ) {
                    	                    int LA8_16 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 31:
                    	                {
                    	                int LA8_5 = input.LA(3);

                    	                if ( (LA8_5==RULE_ID) ) {
                    	                    int LA8_16 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 32:
                    	                {
                    	                int LA8_6 = input.LA(3);

                    	                if ( (LA8_6==RULE_ID) ) {
                    	                    int LA8_16 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 11:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 12:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 36:
                    	                        {
                    	                        int LA8_29 = input.LA(5);

                    	                        if ( (LA8_29==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 37:
                    	                        {
                    	                        int LA8_30 = input.LA(5);

                    	                        if ( (LA8_30==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 38:
                    	                        {
                    	                        int LA8_31 = input.LA(5);

                    	                        if ( (LA8_31==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 39:
                    	                        {
                    	                        int LA8_32 = input.LA(5);

                    	                        if ( (LA8_32==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 36:
                    	                    {
                    	                    int LA8_18 = input.LA(4);

                    	                    if ( (LA8_18==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_18==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    int LA8_19 = input.LA(4);

                    	                    if ( (LA8_19==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_19==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA8_20 = input.LA(4);

                    	                    if ( (LA8_20==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_20==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA8_21 = input.LA(4);

                    	                    if ( (LA8_21==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }
                    	                    else if ( (LA8_21==12) ) {
                    	                        int LA8_33 = input.LA(5);

                    	                        if ( (LA8_33==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 11:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 13:
                    	                        {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                        }
                    	                        break;
                    	                    case 36:
                    	                        {
                    	                        int LA8_34 = input.LA(5);

                    	                        if ( (LA8_34==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 37:
                    	                        {
                    	                        int LA8_35 = input.LA(5);

                    	                        if ( (LA8_35==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 38:
                    	                        {
                    	                        int LA8_36 = input.LA(5);

                    	                        if ( (LA8_36==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 39:
                    	                        {
                    	                        int LA8_37 = input.LA(5);

                    	                        if ( (LA8_37==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 36:
                    	                    {
                    	                    int LA8_23 = input.LA(4);

                    	                    if ( (LA8_23==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_23==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    int LA8_24 = input.LA(4);

                    	                    if ( (LA8_24==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_24==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA8_25 = input.LA(4);

                    	                    if ( (LA8_25==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_25==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA8_26 = input.LA(4);

                    	                    if ( (LA8_26==11) ) {
                    	                        int LA8_38 = input.LA(5);

                    	                        if ( (LA8_38==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_26==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 36:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 37:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 38:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 39:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 11:
                    	                    {
                    	                    int LA8_28 = input.LA(4);

                    	                    if ( (LA8_28==12) ) {
                    	                        int LA8_40 = input.LA(5);

                    	                        if ( (LA8_40==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_28==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA8_27 = input.LA(4);

                    	                    if ( (LA8_27==11) ) {
                    	                        int LA8_39 = input.LA(5);

                    	                        if ( (LA8_39==13) ) {
                    	                            int LA8_13 = input.LA(6);

                    	                            if ( (synpred27()) ) {
                    	                                alt8=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA8_27==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA8_3 = input.LA(2);

                    	            if ( (synpred27()) ) {
                    	                alt8=1;
                    	            }


                    	            }
                    	            break;
                    	        case 30:
                    	            {
                    	            int LA8_4 = input.LA(2);

                    	            if ( (LA8_4==RULE_ID) ) {
                    	                int LA8_16 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA8_5 = input.LA(2);

                    	            if ( (LA8_5==RULE_ID) ) {
                    	                int LA8_16 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	            }


                    	            }
                    	            break;
                    	        case 32:
                    	            {
                    	            int LA8_6 = input.LA(2);

                    	            if ( (LA8_6==RULE_ID) ) {
                    	                int LA8_16 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	            }


                    	            }
                    	            break;
                    	        case 11:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case 12:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 36:
                    	                    {
                    	                    int LA8_29 = input.LA(4);

                    	                    if ( (LA8_29==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    int LA8_30 = input.LA(4);

                    	                    if ( (LA8_30==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA8_31 = input.LA(4);

                    	                    if ( (LA8_31==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA8_32 = input.LA(4);

                    	                    if ( (LA8_32==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;
                    	            case 36:
                    	                {
                    	                int LA8_18 = input.LA(3);

                    	                if ( (LA8_18==12) ) {
                    	                    int LA8_33 = input.LA(4);

                    	                    if ( (LA8_33==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_18==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 37:
                    	                {
                    	                int LA8_19 = input.LA(3);

                    	                if ( (LA8_19==12) ) {
                    	                    int LA8_33 = input.LA(4);

                    	                    if ( (LA8_33==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_19==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 38:
                    	                {
                    	                int LA8_20 = input.LA(3);

                    	                if ( (LA8_20==12) ) {
                    	                    int LA8_33 = input.LA(4);

                    	                    if ( (LA8_33==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_20==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 39:
                    	                {
                    	                int LA8_21 = input.LA(3);

                    	                if ( (LA8_21==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }
                    	                else if ( (LA8_21==12) ) {
                    	                    int LA8_33 = input.LA(4);

                    	                    if ( (LA8_33==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


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
                    	                switch ( input.LA(3) ) {
                    	                case 13:
                    	                    {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 36:
                    	                    {
                    	                    int LA8_34 = input.LA(4);

                    	                    if ( (LA8_34==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 37:
                    	                    {
                    	                    int LA8_35 = input.LA(4);

                    	                    if ( (LA8_35==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA8_36 = input.LA(4);

                    	                    if ( (LA8_36==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA8_37 = input.LA(4);

                    	                    if ( (LA8_37==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;
                    	            case 36:
                    	                {
                    	                int LA8_23 = input.LA(3);

                    	                if ( (LA8_23==11) ) {
                    	                    int LA8_38 = input.LA(4);

                    	                    if ( (LA8_38==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_23==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 37:
                    	                {
                    	                int LA8_24 = input.LA(3);

                    	                if ( (LA8_24==11) ) {
                    	                    int LA8_38 = input.LA(4);

                    	                    if ( (LA8_38==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_24==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 38:
                    	                {
                    	                int LA8_25 = input.LA(3);

                    	                if ( (LA8_25==11) ) {
                    	                    int LA8_38 = input.LA(4);

                    	                    if ( (LA8_38==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_25==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 39:
                    	                {
                    	                int LA8_26 = input.LA(3);

                    	                if ( (LA8_26==11) ) {
                    	                    int LA8_38 = input.LA(4);

                    	                    if ( (LA8_38==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_26==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case 36:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                int LA8_27 = input.LA(3);

                    	                if ( (LA8_27==11) ) {
                    	                    int LA8_39 = input.LA(4);

                    	                    if ( (LA8_39==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_27==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 11:
                    	                {
                    	                int LA8_28 = input.LA(3);

                    	                if ( (LA8_28==12) ) {
                    	                    int LA8_40 = input.LA(4);

                    	                    if ( (LA8_40==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_28==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case 37:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case 11:
                    	                {
                    	                int LA8_28 = input.LA(3);

                    	                if ( (LA8_28==12) ) {
                    	                    int LA8_40 = input.LA(4);

                    	                    if ( (LA8_40==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_28==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                int LA8_27 = input.LA(3);

                    	                if ( (LA8_27==11) ) {
                    	                    int LA8_39 = input.LA(4);

                    	                    if ( (LA8_39==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_27==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case 38:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                int LA8_27 = input.LA(3);

                    	                if ( (LA8_27==11) ) {
                    	                    int LA8_39 = input.LA(4);

                    	                    if ( (LA8_39==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_27==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 11:
                    	                {
                    	                int LA8_28 = input.LA(3);

                    	                if ( (LA8_28==12) ) {
                    	                    int LA8_40 = input.LA(4);

                    	                    if ( (LA8_40==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_28==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case 39:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case 11:
                    	                {
                    	                int LA8_28 = input.LA(3);

                    	                if ( (LA8_28==12) ) {
                    	                    int LA8_40 = input.LA(4);

                    	                    if ( (LA8_40==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_28==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                int LA8_27 = input.LA(3);

                    	                if ( (LA8_27==11) ) {
                    	                    int LA8_39 = input.LA(4);

                    	                    if ( (LA8_39==13) ) {
                    	                        int LA8_13 = input.LA(5);

                    	                        if ( (synpred27()) ) {
                    	                            alt8=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA8_27==13) ) {
                    	                    int LA8_13 = input.LA(4);

                    	                    if ( (synpred27()) ) {
                    	                        alt8=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA8_13 = input.LA(3);

                    	                if ( (synpred27()) ) {
                    	                    alt8=1;
                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case 13:
                    	            {
                    	            int LA8_13 = input.LA(2);

                    	            if ( (synpred27()) ) {
                    	                alt8=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: (lv_regions_55= ruleRegion ) '||'
                    	    	    {
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: (lv_regions_55= ruleRegion )
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1087:6: lv_regions_55= ruleRegion
                    	    	    {
                    	    	    if ( backtracking==0 ) {
                    	    	       
                    	    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_1_1_5_0_0_0(), currentNode); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleRegion_in_ruleState1989);
                    	    	    lv_regions_55=ruleRegion();
                    	    	    _fsp--;
                    	    	    if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	      	        }
                    	    	      	        
                    	    	      	        try {
                    	    	      	       		add(current, "regions", lv_regions_55, "Region", currentNode);
                    	    	      	        } catch (ValueConverterException vce) {
                    	    	      				handleValueConverterException(vce);
                    	    	      	        }
                    	    	      	        currentNode = currentNode.getParent();
                    	    	      	    
                    	    	    }

                    	    	    }

                    	    	    match(input,23,FOLLOW_23_in_ruleState2002); if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_1_1_5_0_1(), null); 
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop8;
                    	        }
                    	    } while (true);

                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1109:3: (lv_regions_57= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1112:6: lv_regions_57= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_1_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState2038);
                    	    lv_regions_57=ruleRegion();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "regions", lv_regions_57, "Region", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleState2054); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_2(), null); 
                          
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


    // $ANTLR start entryRuleSignalRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1141:1: entryRuleSignalRenaming returns [EObject current=null] : iv_ruleSignalRenaming= ruleSignalRenaming EOF ;
    public final EObject entryRuleSignalRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalRenaming = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1141:56: (iv_ruleSignalRenaming= ruleSignalRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1142:2: iv_ruleSignalRenaming= ruleSignalRenaming EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRenamingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming2089);
            iv_ruleSignalRenaming=ruleSignalRenaming();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalRenaming; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalRenaming2099); if (failed) return current;

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
    // $ANTLR end entryRuleSignalRenaming


    // $ANTLR start ruleSignalRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1149:1: ruleSignalRenaming returns [EObject current=null] : ( ( RULE_ID ) '/' ( RULE_ID ) ) ;
    public final EObject ruleSignalRenaming() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1154:6: ( ( ( RULE_ID ) '/' ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1155:1: ( ( RULE_ID ) '/' ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1155:1: ( ( RULE_ID ) '/' ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1155:2: ( RULE_ID ) '/' ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1155:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1158:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRenamingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalRenaming2146); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalRenamingAccess().getOldSignalSignalCrossReference_0_0(), "oldSignal"); 
              	
            }

            }

            match(input,25,FOLLOW_25_in_ruleSignalRenaming2158); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalRenamingAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1175:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1178:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRenamingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalRenaming2180); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalRenamingAccess().getNewSignalSignalCrossReference_2_0(), "newSignal"); 
              	
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
    // $ANTLR end ruleSignalRenaming


    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1198:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1198:48: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1199:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion2216);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion2226); if (failed) return current;

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
    // $ANTLR end entryRuleRegion


    // $ANTLR start ruleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1206:1: ruleRegion returns [EObject current=null] : ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_1=null;
        EObject lv_variables_2 = null;

        EObject lv_signals_3 = null;

        EObject lv_innerStates_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1211:6: ( ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:1: ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:1: ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:2: ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:2: ( 'region' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:3: 'region'
                    {
                    match(input,26,FOLLOW_26_in_ruleRegion2261); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1216:3: (lv_id_1= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1218:6: lv_id_1= RULE_STRING
                    {
                    lv_id_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegion2285); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRegionAccess().getIdSTRINGTerminalRuleCall_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_1, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:3: ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred33()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred33()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred33()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred32()) ) {
                        alt13=1;
                    }
                    else if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 11:
                    {
                    int LA13_6 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA13_7 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA13_8 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA13_9 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA13_10 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA13_11 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 13:
                    {
                    int LA13_12 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt13=3;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:4: (lv_variables_2= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:4: (lv_variables_2= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1239:6: lv_variables_2= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_2_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion2329);
            	    lv_variables_2=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "variables", lv_variables_2, "Variable", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1258:6: (lv_signals_3= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1258:6: (lv_signals_3= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1261:6: lv_signals_3= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion2373);
            	    lv_signals_3=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "signals", lv_signals_3, "Signal", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:6: (lv_innerStates_4= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:6: (lv_innerStates_4= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1283:6: lv_innerStates_4= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_2_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion2417);
            	    lv_innerStates_4=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerStates", lv_innerStates_4, "State", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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
    // $ANTLR end ruleRegion


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1308:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1308:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1309:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2456);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2466); if (failed) return current;

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1316:1: ruleAction returns [EObject current=null] : ( (lv_isImmediate_0= '#' ) (lv_triggersAndEfects_1= RULE_STRING ) (lv_delay_2= RULE_INT )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_triggersAndEfects_1=null;
        Token lv_delay_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1321:6: ( ( (lv_isImmediate_0= '#' ) (lv_triggersAndEfects_1= RULE_STRING ) (lv_delay_2= RULE_INT )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1322:1: ( (lv_isImmediate_0= '#' ) (lv_triggersAndEfects_1= RULE_STRING ) (lv_delay_2= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1322:1: ( (lv_isImmediate_0= '#' ) (lv_triggersAndEfects_1= RULE_STRING ) (lv_delay_2= RULE_INT )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1322:2: (lv_isImmediate_0= '#' ) (lv_triggersAndEfects_1= RULE_STRING ) (lv_delay_2= RULE_INT )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1322:2: (lv_isImmediate_0= '#' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1324:6: lv_isImmediate_0= '#'
            {
            lv_isImmediate_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleAction2512); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0(), "isImmediate"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "isImmediate", true, "#", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1343:2: (lv_triggersAndEfects_1= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1345:6: lv_triggersAndEfects_1= RULE_STRING
            {
            lv_triggersAndEfects_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2547); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getActionAccess().getTriggersAndEfectsSTRINGTerminalRuleCall_1_0(), "triggersAndEfects"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "triggersAndEfects", lv_triggersAndEfects_1, "STRING", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1363:2: (lv_delay_2= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1365:6: lv_delay_2= RULE_INT
                    {
                    lv_delay_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction2577); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0(), "delay"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "delay", lv_delay_2, "INT", lastConsumedNode);
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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1392:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1392:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1393:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2621);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2631); if (failed) return current;

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1400:1: ruleVariable returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_initialValue_2=null;
        Token lv_hostType_5=null;
        Enumerator lv_type_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1405:6: ( ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1406:1: ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1406:1: ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1406:2: (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1406:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1408:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2678); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1426:2: ( ':= ' (lv_initialValue_2= RULE_INT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1426:3: ':= ' (lv_initialValue_2= RULE_INT )
                    {
                    match(input,28,FOLLOW_28_in_ruleVariable2696); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignSpaceKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1430:1: (lv_initialValue_2= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1432:6: lv_initialValue_2= RULE_INT
                    {
                    lv_initialValue_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable2718); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getVariableAccess().getInitialValueINTTerminalRuleCall_1_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_2, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1450:4: ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1450:5: ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleVariable2738); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1454:1: ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=43 && LA16_0<=48)) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_STRING) ) {
                        alt16=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1454:1: ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1454:2: (lv_type_4= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1454:2: (lv_type_4= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1457:6: lv_type_4= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleVariable2773);
                            lv_type_4=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_4, "ValueType", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1476:6: (lv_hostType_5= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1476:6: (lv_hostType_5= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1478:6: lv_hostType_5= RULE_STRING
                            {
                            lv_hostType_5=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2805); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getVariableAccess().getHostTypeSTRINGTerminalRuleCall_2_1_1_0(), "hostType"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostType", lv_hostType_5, "STRING", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1503:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1503:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal2849);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal2859); if (failed) return current;

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
    // $ANTLR end entryRuleSignal


    // $ANTLR start ruleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1511:1: ruleSignal returns [EObject current=null] : ( ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ':=' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isLocal_0=null;
        Token lv_isInput_1=null;
        Token lv_isOutput_2=null;
        Token lv_name_3=null;
        Token lv_initialValue_5=null;
        Token lv_hostType_8=null;
        Token lv_hostType_12=null;
        Token lv_hostCombineOperator_15=null;
        Enumerator lv_type_7 = null;

        Enumerator lv_type_11 = null;

        Enumerator lv_combineOperator_14 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1516:6: ( ( ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ':=' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1517:1: ( ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ':=' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1517:1: ( ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ':=' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1517:2: ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ':=' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1517:2: ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1517:2: ( (lv_isLocal_0= 'local' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1517:3: (lv_isLocal_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1517:3: (lv_isLocal_0= 'local' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1519:6: lv_isLocal_0= 'local'
                    {
                    lv_isLocal_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleSignal2906); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsLocalLocalKeyword_0_0_0(), "isLocal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isLocal", true, "local", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1539:6: (lv_isInput_1= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1539:6: (lv_isInput_1= 'input' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1541:6: lv_isInput_1= 'input'
                    {
                    lv_isInput_1=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSignal2946); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_1_0(), "isInput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInput", true, "input", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1561:6: (lv_isOutput_2= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1561:6: (lv_isOutput_2= 'output' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1563:6: lv_isOutput_2= 'output'
                    {
                    lv_isOutput_2=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSignal2986); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_0_2_0(), "isOutput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isOutput", true, "output", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1582:3: (lv_name_3= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1584:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal3022); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1602:2: ( ':=' (lv_initialValue_5= RULE_INT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1602:3: ':=' (lv_initialValue_5= RULE_INT )
                    {
                    match(input,33,FOLLOW_33_in_ruleSignal3040); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:1: (lv_initialValue_5= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1608:6: lv_initialValue_5= RULE_INT
                    {
                    lv_initialValue_5=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignal3062); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueINTTerminalRuleCall_2_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_5, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1626:4: ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==34) ) {
                    alt23=2;
                }
                else if ( (LA23_1==RULE_STRING||(LA23_1>=43 && LA23_1<=48)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1626:5: ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1626:5: ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1626:6: ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleSignal3083); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_3_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1630:1: ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=43 && LA20_0<=48)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_STRING) ) {
                        alt20=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1630:1: ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1630:2: (lv_type_7= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1630:2: (lv_type_7= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1633:6: lv_type_7= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal3118);
                            lv_type_7=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_7, "ValueType", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1652:6: (lv_hostType_8= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1652:6: (lv_hostType_8= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1654:6: lv_hostType_8= RULE_STRING
                            {
                            lv_hostType_8=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal3150); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_3_0_1_1_0(), "hostType"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostType", lv_hostType_8, "STRING", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1673:6: ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1673:6: ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1673:7: ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleSignal3176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_3_1_0(), null); 
                          
                    }
                    match(input,34,FOLLOW_34_in_ruleSignal3185); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_3_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1681:1: ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=43 && LA21_0<=48)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_STRING) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1681:1: ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1681:2: (lv_type_11= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1681:2: (lv_type_11= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1684:6: lv_type_11= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal3220);
                            lv_type_11=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "type", lv_type_11, "ValueType", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1703:6: (lv_hostType_12= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1703:6: (lv_hostType_12= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1705:6: lv_hostType_12= RULE_STRING
                            {
                            lv_hostType_12=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal3252); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_3_1_2_1_0(), "hostType"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostType", lv_hostType_12, "STRING", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,35,FOLLOW_35_in_ruleSignal3270); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_3_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1727:1: ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=40 && LA22_0<=43)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_STRING) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1727:1: ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1727:2: (lv_combineOperator_14= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1727:2: (lv_combineOperator_14= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:6: lv_combineOperator_14= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal3305);
                            lv_combineOperator_14=ruleCombineOperator();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "combineOperator", lv_combineOperator_14, "CombineOperator", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1749:6: (lv_hostCombineOperator_15= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1749:6: (lv_hostCombineOperator_15= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1751:6: lv_hostCombineOperator_15= RULE_STRING
                            {
                            lv_hostCombineOperator_15=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal3337); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_3_1_4_1_0(), "hostCombineOperator"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostCombineOperator", lv_hostCombineOperator_15, "STRING", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end ruleSignal


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1778:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1782:6: ( ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt24=1;
                }
                break;
            case 37:
                {
                alt24=2;
                }
                break;
            case 38:
                {
                alt24=3;
                }
                break;
            case 39:
                {
                alt24=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1783:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:4: 'NORMAL'
                    {
                    match(input,36,FOLLOW_36_in_ruleStateType3398); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1789:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1789:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1789:8: 'cond'
                    {
                    match(input,37,FOLLOW_37_in_ruleStateType3413); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1795:6: ( 'reference' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1795:6: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1795:8: 'reference'
                    {
                    match(input,38,FOLLOW_38_in_ruleStateType3428); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1801:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1801:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1801:8: 'textual'
                    {
                    match(input,39,FOLLOW_39_in_ruleStateType3443); if (failed) return current;
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


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1811:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1815:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1816:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1816:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'host' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt25=1;
                }
                break;
            case 41:
                {
                alt25=2;
                }
                break;
            case 42:
                {
                alt25=3;
                }
                break;
            case 43:
                {
                alt25=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1816:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'host' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1816:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1816:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1816:4: 'NONE'
                    {
                    match(input,40,FOLLOW_40_in_ruleCombineOperator3486); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1822:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1822:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1822:8: '+'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator3501); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1828:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1828:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1828:8: '*'
                    {
                    match(input,42,FOLLOW_42_in_ruleCombineOperator3516); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1834:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1834:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1834:8: 'host'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator3531); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_3(), null); 
                          
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
    // $ANTLR end ruleCombineOperator


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1844:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'double' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1848:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'double' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1849:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'double' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1849:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'double' ) | ( 'host' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt26=1;
                }
                break;
            case 45:
                {
                alt26=2;
                }
                break;
            case 46:
                {
                alt26=3;
                }
                break;
            case 47:
                {
                alt26=4;
                }
                break;
            case 48:
                {
                alt26=5;
                }
                break;
            case 43:
                {
                alt26=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1849:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'double' ) | ( 'host' ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1849:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1849:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1849:4: 'PURE'
                    {
                    match(input,44,FOLLOW_44_in_ruleValueType3574); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1855:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1855:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1855:8: 'boolean'
                    {
                    match(input,45,FOLLOW_45_in_ruleValueType3589); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1861:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1861:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1861:8: 'unsigned'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType3604); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1867:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1867:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1867:8: 'integer'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType3619); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1873:6: ( 'double' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1873:6: ( 'double' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1873:8: 'double'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType3634); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1879:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1879:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1879:8: 'host'
                    {
                    match(input,43,FOLLOW_43_in_ruleValueType3649); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5(), null); 
                          
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
    // $ANTLR end ruleValueType

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:801:6: ( RULE_ID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:801:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred161424); if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:821:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:821:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred171455); if (failed) return ;

        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:841:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:841:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred181486); if (failed) return ;

        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1062:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1062:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1062:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1065:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_1_1_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred261943);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: ( ( ruleRegion ) '||' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: ( ruleRegion ) '||'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1087:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_1_1_5_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred271989);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }

        match(input,23,FOLLOW_23_in_synpred272002); if (failed) return ;

        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:6: ( ( ( ( ruleRegion ) '||' )* ( ruleRegion ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:6: ( ( ( ruleRegion ) '||' )* ( ruleRegion ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:6: ( ( ( ruleRegion ) '||' )* ( ruleRegion ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:7: ( ( ruleRegion ) '||' )* ( ruleRegion )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:7: ( ( ruleRegion ) '||' )*
        loop31:
        do {
            int alt31=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case RULE_STRING:
                {
                int LA31_2 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case RULE_ID:
                {
                int LA31_3 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 30:
                {
                int LA31_4 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 31:
                {
                int LA31_5 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 32:
                {
                int LA31_6 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 11:
                {
                int LA31_7 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 12:
                {
                int LA31_8 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 36:
                {
                int LA31_9 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 37:
                {
                int LA31_10 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 38:
                {
                int LA31_11 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 39:
                {
                int LA31_12 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;
            case 13:
                {
                int LA31_13 = input.LA(2);

                if ( (synpred27()) ) {
                    alt31=1;
                }


                }
                break;

            }

            switch (alt31) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: ( ruleRegion ) '||'
        	    {
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1084:8: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1087:6: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_1_1_5_0_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleRegion_in_synpred281989);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }

        	    match(input,23,FOLLOW_23_in_synpred282002); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop31;
            }
        } while (true);

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1109:3: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1112:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_1_1_5_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred282038);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:4: ( ( ruleVariable ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:4: ( ruleVariable )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:4: ( ruleVariable )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1239:6: ruleVariable
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_in_synpred322329);
        ruleVariable();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1258:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1258:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1258:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1261:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred332373);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:6: ( ( ruleState ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:6: ( ruleState )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:6: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1283:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred342417);
        ruleState();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred34

    public final boolean synpred34() {
        backtracking++;
        int start = input.mark();
        try {
            synpred34_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred33() {
        backtracking++;
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred18() {
        backtracking++;
        int start = input.mark();
        try {
            synpred18_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState138 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12_in_ruleState178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11_in_ruleState263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState297 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11_in_ruleState339 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState386 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12_in_ruleState419 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState453 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12_in_ruleState495 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState542 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState588 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState613 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState668 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState693 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11_in_ruleState735 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState769 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState816 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11_in_ruleState849 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState896 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState921 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12_in_ruleState963 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState997 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1044 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12_in_ruleState1077 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1124 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1149 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1204 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1229 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1263 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1318 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1343 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1402 = new BitSet(new long[]{0x0000000000040032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1424 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState1455 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState1486 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1567 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleState1579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_ruleState1614 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleState1627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_ruleState1663 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState1676 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleState1688 = new BitSet(new long[]{0x000000F1C4783830L});
    public static final BitSet FOLLOW_19_in_ruleState1699 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1733 = new BitSet(new long[]{0x000000F1C5783830L});
    public static final BitSet FOLLOW_20_in_ruleState1754 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1788 = new BitSet(new long[]{0x000000F1C5783830L});
    public static final BitSet FOLLOW_21_in_ruleState1809 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1843 = new BitSet(new long[]{0x000000F1C5783830L});
    public static final BitSet FOLLOW_22_in_ruleState1864 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1898 = new BitSet(new long[]{0x000000F1C5783830L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState1943 = new BitSet(new long[]{0x000000F1C5783830L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState1989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleState2002 = new BitSet(new long[]{0x000000F1C4003830L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState2038 = new BitSet(new long[]{0x000000F1C5783830L});
    public static final BitSet FOLLOW_24_in_ruleState2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming2089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalRenaming2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalRenaming2146 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignalRenaming2158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalRenaming2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRegion2261 = new BitSet(new long[]{0x000000F1C0003830L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion2285 = new BitSet(new long[]{0x000000F1C0003810L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion2329 = new BitSet(new long[]{0x000000F1C0003812L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion2373 = new BitSet(new long[]{0x000000F1C0003812L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion2417 = new BitSet(new long[]{0x000000F1C0003812L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAction2512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2547 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2678 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleVariable2696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable2718 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleVariable2738 = new BitSet(new long[]{0x0001F80000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal2849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSignal2906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31_in_ruleSignal2946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleSignal2986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal3022 = new BitSet(new long[]{0x0000000220000002L});
    public static final BitSet FOLLOW_33_in_ruleSignal3040 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignal3062 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleSignal3083 = new BitSet(new long[]{0x0001F80000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSignal3176 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSignal3185 = new BitSet(new long[]{0x0001F80000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal3220 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal3252 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSignal3270 = new BitSet(new long[]{0x00000F0000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStateType3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStateType3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStateType3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStateType3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCombineOperator3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCombineOperator3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleValueType3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValueType3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleValueType3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred161424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred171455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred181486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred261943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred271989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred272002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred281989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred282002 = new BitSet(new long[]{0x000000F1C4003830L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred282038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_synpred322329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred332373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_synpred342417 = new BitSet(new long[]{0x0000000000000002L});

}