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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'['", "','", "']'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'||'", "'}'", "'/'", "'@'", "'#'", "';'", "'with'", "' history'", "'var'", "': '", "':='", "'inputoutput'", "'input'", "'output'", "': combine'", "'cond'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'hostCombineOperator'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'hostType'", "'-->'", "'o->'", "'>->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRetypingSyncchartsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[107+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isFinal_1=null;
        Token lv_isInitial_5=null;
        Token lv_isFinal_6=null;
        Token lv_isInitial_9=null;
        Token lv_isFinal_10=null;
        Token lv_isInitial_13=null;
        Token lv_isFinal_14=null;
        Token lv_isInitial_17=null;
        Token lv_isFinal_18=null;
        Token lv_isInitial_20=null;
        Token lv_isFinal_21=null;
        Token lv_isInitial_23=null;
        Token lv_isFinal_24=null;
        Token lv_isInitial_26=null;
        Token lv_isFinal_27=null;
        Token lv_isFinal_28=null;
        Token lv_isInitial_29=null;
        Token lv_isFinal_33=null;
        Token lv_isInitial_34=null;
        Token lv_isFinal_37=null;
        Token lv_isInitial_38=null;
        Token lv_isFinal_41=null;
        Token lv_isInitial_42=null;
        Token lv_isFinal_45=null;
        Token lv_isInitial_46=null;
        Token lv_isFinal_48=null;
        Token lv_isInitial_49=null;
        Token lv_isFinal_51=null;
        Token lv_isInitial_52=null;
        Token lv_isFinal_54=null;
        Token lv_isInitial_55=null;
        Token lv_isInitial_56=null;
        Token lv_isInitial_60=null;
        Token lv_isInitial_63=null;
        Token lv_isInitial_66=null;
        Token lv_isInitial_69=null;
        Token lv_isInitial_71=null;
        Token lv_isInitial_73=null;
        Token lv_isInitial_75=null;
        Token lv_isFinal_76=null;
        Token lv_isFinal_80=null;
        Token lv_isFinal_83=null;
        Token lv_isFinal_86=null;
        Token lv_isFinal_89=null;
        Token lv_isFinal_91=null;
        Token lv_isFinal_94=null;
        Token lv_isFinal_96=null;
        Token lv_label_109=null;
        Token lv_bodyText_115=null;
        Enumerator lv_type_2 = null;

        AntlrDatatypeRuleToken lv_name_4 = null;

        Enumerator lv_type_7 = null;

        Enumerator lv_type_11 = null;

        AntlrDatatypeRuleToken lv_name_12 = null;

        AntlrDatatypeRuleToken lv_name_16 = null;

        Enumerator lv_type_19 = null;

        AntlrDatatypeRuleToken lv_name_25 = null;

        Enumerator lv_type_30 = null;

        AntlrDatatypeRuleToken lv_name_32 = null;

        Enumerator lv_type_35 = null;

        Enumerator lv_type_39 = null;

        AntlrDatatypeRuleToken lv_name_40 = null;

        AntlrDatatypeRuleToken lv_name_44 = null;

        Enumerator lv_type_47 = null;

        AntlrDatatypeRuleToken lv_name_53 = null;

        Enumerator lv_type_57 = null;

        AntlrDatatypeRuleToken lv_name_59 = null;

        Enumerator lv_type_61 = null;

        Enumerator lv_type_64 = null;

        AntlrDatatypeRuleToken lv_name_65 = null;

        AntlrDatatypeRuleToken lv_name_68 = null;

        Enumerator lv_type_70 = null;

        AntlrDatatypeRuleToken lv_name_74 = null;

        Enumerator lv_type_77 = null;

        AntlrDatatypeRuleToken lv_name_79 = null;

        Enumerator lv_type_81 = null;

        Enumerator lv_type_84 = null;

        AntlrDatatypeRuleToken lv_name_85 = null;

        AntlrDatatypeRuleToken lv_name_88 = null;

        Enumerator lv_type_90 = null;

        AntlrDatatypeRuleToken lv_name_93 = null;

        AntlrDatatypeRuleToken lv_name_95 = null;

        Enumerator lv_type_97 = null;

        AntlrDatatypeRuleToken lv_name_99 = null;

        Enumerator lv_type_100 = null;

        Enumerator lv_type_102 = null;

        AntlrDatatypeRuleToken lv_name_103 = null;

        Enumerator lv_type_104 = null;

        AntlrDatatypeRuleToken lv_name_106 = null;

        AntlrDatatypeRuleToken lv_name_108 = null;

        EObject lv_signalRenamings_111 = null;

        EObject lv_signalRenamings_113 = null;

        EObject lv_outgoingTransitions_116 = null;

        EObject lv_entryActions_119 = null;

        EObject lv_innerActions_121 = null;

        EObject lv_exitActions_123 = null;

        EObject lv_suspensionTrigger_125 = null;

        EObject lv_signals_126 = null;

        EObject lv_regions_127 = null;

        EObject lv_regions_129 = null;

        EObject lv_outgoingTransitions_131 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )
            int alt1=39;
            switch ( input.LA(1) ) {
            case 11:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==30||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=37 && LA1_29<=39)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_8==RULE_ID) ) {
                        int LA1_30 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt1=19;
                        }
                        else if ( (synpred20()) ) {
                            alt1=20;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 30, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred21()) ) {
                        alt1=21;
                    }
                    else if ( (synpred22()) ) {
                        alt1=22;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==13) ) {
                        int LA1_33 = input.LA(4);

                        if ( (LA1_33==13) ) {
                            int LA1_61 = input.LA(5);

                            if ( (LA1_61==EOF||LA1_61==RULE_STRING||(LA1_61>=11 && LA1_61<=14)||(LA1_61>=17 && LA1_61<=23)||LA1_61==30||(LA1_61>=33 && LA1_61<=35)||(LA1_61>=37 && LA1_61<=39)||(LA1_61>=52 && LA1_61<=54)) ) {
                                alt1=2;
                            }
                            else if ( (LA1_61==RULE_ID) ) {
                                int LA1_81 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 81, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 61, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_33==RULE_ID) ) {
                            int LA1_62 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred4()) ) {
                                alt1=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 62, input);

                                throw nvae;
                            }
                        }
                        else if ( (synpred5()) ) {
                            alt1=5;
                        }
                        else if ( (synpred6()) ) {
                            alt1=6;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 33, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_9==37) ) {
                        switch ( input.LA(4) ) {
                        case 13:
                            {
                            int LA1_65 = input.LA(5);

                            if ( (LA1_65==RULE_ID) ) {
                                alt1=1;
                            }
                            else if ( (synpred2()) ) {
                                alt1=2;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 65, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_66 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 33:
                        case 34:
                        case 35:
                        case 37:
                        case 38:
                        case 39:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 34, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_9==38) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA1_66 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                            {
                            int LA1_65 = input.LA(5);

                            if ( (LA1_65==RULE_ID) ) {
                                alt1=1;
                            }
                            else if ( (synpred2()) ) {
                                alt1=2;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 65, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 33:
                        case 34:
                        case 35:
                        case 37:
                        case 38:
                        case 39:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 35, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_9==39) ) {
                        switch ( input.LA(4) ) {
                        case 13:
                            {
                            int LA1_65 = input.LA(5);

                            if ( (LA1_65==RULE_ID) ) {
                                alt1=1;
                            }
                            else if ( (synpred2()) ) {
                                alt1=2;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 65, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_66 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 33:
                        case 34:
                        case 35:
                        case 37:
                        case 38:
                        case 39:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 36, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_9==RULE_ID) ) {
                        alt1=7;
                    }
                    else if ( (synpred8()) ) {
                        alt1=8;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==30||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=37 && LA1_29<=39)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_10==RULE_ID) ) {
                        alt1=19;
                    }
                    else if ( (synpred21()) ) {
                        alt1=21;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA1_11 = input.LA(3);

                    if ( (LA1_11==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==30||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=37 && LA1_29<=39)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_11==RULE_ID) ) {
                        alt1=19;
                    }
                    else if ( (synpred21()) ) {
                        alt1=21;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12==RULE_ID) ) {
                        alt1=19;
                    }
                    else if ( (LA1_12==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==30||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=37 && LA1_29<=39)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred21()) ) {
                        alt1=21;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (synpred23()) ) {
                        alt1=23;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 30:
                case 33:
                case 34:
                case 35:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=24;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA1_15 = input.LA(3);

                    if ( (LA1_15==RULE_ID) ) {
                        int LA1_42 = input.LA(4);

                        if ( (synpred27()) ) {
                            alt1=27;
                        }
                        else if ( (synpred28()) ) {
                            alt1=28;
                        }
                        else if ( (synpred30()) ) {
                            alt1=30;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 42, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_15==13) ) {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_70 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 70, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||(LA1_43>=11 && LA1_43<=14)||(LA1_43>=17 && LA1_43<=23)||LA1_43==30||(LA1_43>=33 && LA1_43<=35)||(LA1_43>=37 && LA1_43<=39)||(LA1_43>=52 && LA1_43<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred29()) ) {
                        alt1=29;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==13) ) {
                        int LA1_45 = input.LA(4);

                        if ( (LA1_45==RULE_ID) ) {
                            int LA1_72 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred12()) ) {
                                alt1=12;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 72, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_45==13) ) {
                            int LA1_73 = input.LA(5);

                            if ( (LA1_73==RULE_ID) ) {
                                int LA1_88 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 88, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_73==EOF||LA1_73==RULE_STRING||(LA1_73>=11 && LA1_73<=14)||(LA1_73>=17 && LA1_73<=23)||LA1_73==30||(LA1_73>=33 && LA1_73<=35)||(LA1_73>=37 && LA1_73<=39)||(LA1_73>=52 && LA1_73<=54)) ) {
                                alt1=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 73, input);

                                throw nvae;
                            }
                        }
                        else if ( (synpred13()) ) {
                            alt1=13;
                        }
                        else if ( (synpred14()) ) {
                            alt1=14;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 45, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_16==37) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA1_76 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 76, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                            {
                            int LA1_77 = input.LA(5);

                            if ( (LA1_77==RULE_ID) ) {
                                alt1=9;
                            }
                            else if ( (synpred10()) ) {
                                alt1=10;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 77, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 33:
                        case 34:
                        case 35:
                        case 37:
                        case 38:
                        case 39:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=13;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 46, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_16==38) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 33:
                        case 34:
                        case 35:
                        case 37:
                        case 38:
                        case 39:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=13;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_76 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 76, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                            {
                            int LA1_77 = input.LA(5);

                            if ( (LA1_77==RULE_ID) ) {
                                alt1=9;
                            }
                            else if ( (synpred10()) ) {
                                alt1=10;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 77, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 47, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_16==39) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 33:
                        case 34:
                        case 35:
                        case 37:
                        case 38:
                        case 39:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=13;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_76 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 76, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                            {
                            int LA1_77 = input.LA(5);

                            if ( (LA1_77==RULE_ID) ) {
                                alt1=9;
                            }
                            else if ( (synpred10()) ) {
                                alt1=10;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 77, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 48, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_16==RULE_ID) ) {
                        alt1=15;
                    }
                    else if ( (synpred16()) ) {
                        alt1=16;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_17 = input.LA(3);

                    if ( (synpred31()) ) {
                        alt1=31;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA1_18 = input.LA(3);

                    if ( (LA1_18==RULE_ID) ) {
                        alt1=27;
                    }
                    else if ( (LA1_18==13) ) {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_70 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 70, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||(LA1_43>=11 && LA1_43<=14)||(LA1_43>=17 && LA1_43<=23)||LA1_43==30||(LA1_43>=33 && LA1_43<=35)||(LA1_43>=37 && LA1_43<=39)||(LA1_43>=52 && LA1_43<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred29()) ) {
                        alt1=29;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==RULE_ID) ) {
                        alt1=27;
                    }
                    else if ( (LA1_19==13) ) {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_70 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 70, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||(LA1_43>=11 && LA1_43<=14)||(LA1_43>=17 && LA1_43<=23)||LA1_43==30||(LA1_43>=33 && LA1_43<=35)||(LA1_43>=37 && LA1_43<=39)||(LA1_43>=52 && LA1_43<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred29()) ) {
                        alt1=29;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==RULE_ID) ) {
                        alt1=27;
                    }
                    else if ( (LA1_20==13) ) {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_70 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 70, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||(LA1_43>=11 && LA1_43<=14)||(LA1_43>=17 && LA1_43<=23)||LA1_43==30||(LA1_43>=33 && LA1_43<=35)||(LA1_43>=37 && LA1_43<=39)||(LA1_43>=52 && LA1_43<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred29()) ) {
                        alt1=29;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 12:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 30:
                case 33:
                case 34:
                case 35:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=32;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==RULE_ID) ) {
                    int LA1_22 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred37()) ) {
                        alt1=37;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 22, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_3==13) ) {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==EOF||LA1_23==RULE_STRING||(LA1_23>=11 && LA1_23<=14)||(LA1_23>=17 && LA1_23<=23)||LA1_23==30||(LA1_23>=33 && LA1_23<=35)||(LA1_23>=37 && LA1_23<=39)||(LA1_23>=52 && LA1_23<=54)) ) {
                        alt1=34;
                    }
                    else if ( (LA1_23==RULE_ID) ) {
                        int LA1_56 = input.LA(4);

                        if ( (synpred33()) ) {
                            alt1=33;
                        }
                        else if ( (synpred34()) ) {
                            alt1=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 56, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 23, input);

                        throw nvae;
                    }
                }
                else if ( (synpred36()) ) {
                    alt1=36;
                }
                else if ( (synpred38()) ) {
                    alt1=38;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 30:
                case 33:
                case 34:
                case 35:
                case 37:
                case 38:
                case 39:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_27 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28==RULE_ID) ) {
                        alt1=33;
                    }
                    else if ( (synpred34()) ) {
                        alt1=34;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28==RULE_ID) ) {
                        alt1=33;
                    }
                    else if ( (synpred34()) ) {
                        alt1=34;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 30:
                case 33:
                case 34:
                case 35:
                case 37:
                case 38:
                case 39:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_27 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28==RULE_ID) ) {
                        alt1=33;
                    }
                    else if ( (synpred34()) ) {
                        alt1=34;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_27 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 30:
                case 33:
                case 34:
                case 35:
                case 37:
                case 38:
                case 39:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=36;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt1=39;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:109:2: (lv_isFinal_1= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:111:6: lv_isFinal_1= 'final'
                    {
                    lv_isFinal_1=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState172); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:130:3: (lv_type_2= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:133:6: lv_type_2= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState220);
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

                    match(input,13,FOLLOW_13_in_ruleState233); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:1: (lv_name_4= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:158:6: lv_name_4= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState267);
                    lv_name_4=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_4, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:7: ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:7: ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:8: (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:8: (lv_isInitial_5= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:179:6: lv_isInitial_5= 'init'
                    {
                    lv_isInitial_5=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState301); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:198:2: (lv_isFinal_6= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:200:6: lv_isFinal_6= 'final'
                    {
                    lv_isFinal_6=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState335); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:219:3: (lv_type_7= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:222:6: lv_type_7= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState383);
                    lv_type_7=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_7, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState396); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:8: (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:8: (lv_isInitial_9= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:247:6: lv_isInitial_9= 'init'
                    {
                    lv_isInitial_9=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState426); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:266:2: (lv_isFinal_10= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:268:6: lv_isFinal_10= 'final'
                    {
                    lv_isFinal_10=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState460); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_2_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:287:3: (lv_type_11= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:290:6: lv_type_11= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState508);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:308:2: (lv_name_12= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:311:6: lv_name_12= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState546);
                    lv_name_12=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_12, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:8: (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:8: (lv_isInitial_13= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:332:6: lv_isInitial_13= 'init'
                    {
                    lv_isInitial_13=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState580); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:351:2: (lv_isFinal_14= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:353:6: lv_isFinal_14= 'final'
                    {
                    lv_isFinal_14=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState614); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_0_1_0(), "isFinal"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState637); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:376:1: (lv_name_16= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:379:6: lv_name_16= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState671);
                    lv_name_16=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_16, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:6: ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:6: ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:7: ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:7: ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:8: (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:8: (lv_isInitial_17= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:400:6: lv_isInitial_17= 'init'
                    {
                    lv_isInitial_17=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState705); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:419:2: (lv_isFinal_18= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:421:6: lv_isFinal_18= 'final'
                    {
                    lv_isFinal_18=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState739); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_4_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:440:3: (lv_type_19= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:443:6: lv_type_19= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState787);
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


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:6: ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:6: ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:7: ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:7: ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:8: (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:8: (lv_isInitial_20= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:464:6: lv_isInitial_20= 'init'
                    {
                    lv_isInitial_20=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState821); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:483:2: (lv_isFinal_21= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:485:6: lv_isFinal_21= 'final'
                    {
                    lv_isFinal_21=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState855); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_1_0(), "isFinal"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState878); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:8: (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:8: (lv_isInitial_23= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:511:6: lv_isInitial_23= 'init'
                    {
                    lv_isInitial_23=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState908); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_6_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:530:2: (lv_isFinal_24= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:532:6: lv_isFinal_24= 'final'
                    {
                    lv_isFinal_24=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState942); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:551:3: (lv_name_25= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:554:6: lv_name_25= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState990);
                    lv_name_25=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_25, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:6: ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:6: ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:7: (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:7: (lv_isInitial_26= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:575:6: lv_isInitial_26= 'init'
                    {
                    lv_isInitial_26=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1023); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:594:2: (lv_isFinal_27= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:596:6: lv_isFinal_27= 'final'
                    {
                    lv_isFinal_27=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1057); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_1_0(), "isFinal"); 
                          
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
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:8: (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:8: (lv_isFinal_28= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:618:6: lv_isFinal_28= 'final'
                    {
                    lv_isFinal_28=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1100); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:637:2: (lv_isInitial_29= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:639:6: lv_isInitial_29= 'init'
                    {
                    lv_isInitial_29=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1134); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_8_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:658:3: (lv_type_30= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:661:6: lv_type_30= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1182);
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

                    match(input,13,FOLLOW_13_in_ruleState1195); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_8_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:683:1: (lv_name_32= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:686:6: lv_name_32= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_8_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1229);
                    lv_name_32=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_32, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:6: ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:6: ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:7: ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:7: ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:8: (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:8: (lv_isFinal_33= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:707:6: lv_isFinal_33= 'final'
                    {
                    lv_isFinal_33=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1263); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:726:2: (lv_isInitial_34= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:728:6: lv_isInitial_34= 'init'
                    {
                    lv_isInitial_34=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1297); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:747:3: (lv_type_35= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:750:6: lv_type_35= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_9_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1345);
                    lv_type_35=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_35, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState1358); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_9_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:8: (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:8: (lv_isFinal_37= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:775:6: lv_isFinal_37= 'final'
                    {
                    lv_isFinal_37=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1388); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:794:2: (lv_isInitial_38= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:796:6: lv_isInitial_38= 'init'
                    {
                    lv_isInitial_38=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1422); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:815:3: (lv_type_39= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:818:6: lv_type_39= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1470);
                    lv_type_39=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_39, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:836:2: (lv_name_40= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:839:6: lv_name_40= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1508);
                    lv_name_40=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_40, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:8: (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:8: (lv_isFinal_41= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: lv_isFinal_41= 'final'
                    {
                    lv_isFinal_41=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1542); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:879:2: (lv_isInitial_42= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:6: lv_isInitial_42= 'init'
                    {
                    lv_isInitial_42=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1576); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_1_0(), "isInitial"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState1599); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_11_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:1: (lv_name_44= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:907:6: lv_name_44= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1633);
                    lv_name_44=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_44, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:6: ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:6: ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:7: ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:7: ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:8: (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:8: (lv_isFinal_45= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:928:6: lv_isFinal_45= 'final'
                    {
                    lv_isFinal_45=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1667); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:947:2: (lv_isInitial_46= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:949:6: lv_isInitial_46= 'init'
                    {
                    lv_isInitial_46=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1701); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:968:3: (lv_type_47= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:971:6: lv_type_47= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1749);
                    lv_type_47=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_47, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:6: ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:6: ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:7: ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:7: ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:8: (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:8: (lv_isFinal_48= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:992:6: lv_isFinal_48= 'final'
                    {
                    lv_isFinal_48=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1783); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1011:2: (lv_isInitial_49= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1013:6: lv_isInitial_49= 'init'
                    {
                    lv_isInitial_49=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1817); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_0_1_0(), "isInitial"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState1840); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_13_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:8: (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:8: (lv_isFinal_51= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1039:6: lv_isFinal_51= 'final'
                    {
                    lv_isFinal_51=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1870); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1058:2: (lv_isInitial_52= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1060:6: lv_isInitial_52= 'init'
                    {
                    lv_isInitial_52=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1904); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1079:3: (lv_name_53= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1082:6: lv_name_53= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1952);
                    lv_name_53=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_53, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:6: ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:6: ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:7: (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:7: (lv_isFinal_54= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1103:6: lv_isFinal_54= 'final'
                    {
                    lv_isFinal_54=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1985); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1122:2: (lv_isInitial_55= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1124:6: lv_isInitial_55= 'init'
                    {
                    lv_isInitial_55=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2019); if (failed) return current;
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


                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:7: (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:7: (lv_isInitial_56= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1146:6: lv_isInitial_56= 'init'
                    {
                    lv_isInitial_56=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2061); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1165:2: (lv_type_57= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1168:6: lv_type_57= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_16_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2108);
                    lv_type_57=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_57, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState2121); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_16_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1190:1: (lv_name_59= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1193:6: lv_name_59= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_16_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2155);
                    lv_name_59=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_59, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:6: ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:6: ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:7: (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:7: (lv_isInitial_60= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1214:6: lv_isInitial_60= 'init'
                    {
                    lv_isInitial_60=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2188); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_17_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1233:2: (lv_type_61= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:6: lv_type_61= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_17_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2235);
                    lv_type_61=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_61, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState2248); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_17_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:7: (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:7: (lv_isInitial_63= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1261:6: lv_isInitial_63= 'init'
                    {
                    lv_isInitial_63=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2277); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_18_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:2: (lv_type_64= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1283:6: lv_type_64= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_18_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2324);
                    lv_type_64=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_64, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1301:2: (lv_name_65= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1304:6: lv_name_65= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_18_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2362);
                    lv_name_65=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_65, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:7: (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:7: (lv_isInitial_66= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1325:6: lv_isInitial_66= 'init'
                    {
                    lv_isInitial_66=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_19_0_0(), "isInitial"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState2417); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_19_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1348:1: (lv_name_68= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1351:6: lv_name_68= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_19_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2451);
                    lv_name_68=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_68, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:6: ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:6: ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:7: (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:7: (lv_isInitial_69= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1372:6: lv_isInitial_69= 'init'
                    {
                    lv_isInitial_69=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2484); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_20_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1391:2: (lv_type_70= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1394:6: lv_type_70= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_20_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2531);
                    lv_type_70=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_70, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:6: ( (lv_isInitial_71= 'init' ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:6: ( (lv_isInitial_71= 'init' ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:7: (lv_isInitial_71= 'init' ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:7: (lv_isInitial_71= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1415:6: lv_isInitial_71= 'init'
                    {
                    lv_isInitial_71=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2564); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_21_0_0(), "isInitial"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState2586); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_21_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:7: (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:7: (lv_isInitial_73= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1441:6: lv_isInitial_73= 'init'
                    {
                    lv_isInitial_73=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2615); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_22_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1460:2: (lv_name_74= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1463:6: lv_name_74= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_22_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2662);
                    lv_name_74=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_74, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1482:6: (lv_isInitial_75= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1482:6: (lv_isInitial_75= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1484:6: lv_isInitial_75= 'init'
                    {
                    lv_isInitial_75=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState2694); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_23_0(), "isInitial"); 
                          
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
                case 25 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:7: (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:7: (lv_isFinal_76= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1506:6: lv_isFinal_76= 'final'
                    {
                    lv_isFinal_76=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2735); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_24_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1525:2: (lv_type_77= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1528:6: lv_type_77= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_24_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2782);
                    lv_type_77=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_77, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState2795); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_24_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1550:1: (lv_name_79= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1553:6: lv_name_79= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_24_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2829);
                    lv_name_79=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_79, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:6: ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:6: ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:7: (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:7: (lv_isFinal_80= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1574:6: lv_isFinal_80= 'final'
                    {
                    lv_isFinal_80=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2862); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_25_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1593:2: (lv_type_81= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1596:6: lv_type_81= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_25_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2909);
                    lv_type_81=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_81, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState2922); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_25_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:7: (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:7: (lv_isFinal_83= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1621:6: lv_isFinal_83= 'final'
                    {
                    lv_isFinal_83=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2951); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_26_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1640:2: (lv_type_84= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1643:6: lv_type_84= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_26_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2998);
                    lv_type_84=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_84, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1661:2: (lv_name_85= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1664:6: lv_name_85= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_26_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3036);
                    lv_name_85=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_85, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 28 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:7: (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:7: (lv_isFinal_86= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1685:6: lv_isFinal_86= 'final'
                    {
                    lv_isFinal_86=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState3069); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_27_0_0(), "isFinal"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState3091); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_27_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1708:1: (lv_name_88= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1711:6: lv_name_88= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_27_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3125);
                    lv_name_88=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_88, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 29 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:6: ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:6: ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:7: (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:7: (lv_isFinal_89= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1732:6: lv_isFinal_89= 'final'
                    {
                    lv_isFinal_89=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState3158); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_28_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1751:2: (lv_type_90= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1754:6: lv_type_90= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_28_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3205);
                    lv_type_90=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_90, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 30 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:7: (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:7: (lv_isFinal_91= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1775:6: lv_isFinal_91= 'final'
                    {
                    lv_isFinal_91=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState3238); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_29_0_0(), "isFinal"); 
                          
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

                    match(input,13,FOLLOW_13_in_ruleState3260); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_29_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1798:1: (lv_name_93= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1801:6: lv_name_93= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_29_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3294);
                    lv_name_93=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_93, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 31 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:7: (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:7: (lv_isFinal_94= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1822:6: lv_isFinal_94= 'final'
                    {
                    lv_isFinal_94=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState3327); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_30_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1841:2: (lv_name_95= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1844:6: lv_name_95= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_30_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3374);
                    lv_name_95=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_95, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 32 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1863:6: (lv_isFinal_96= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1863:6: (lv_isFinal_96= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1865:6: lv_isFinal_96= 'final'
                    {
                    lv_isFinal_96=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState3406); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_31_0(), "isFinal"); 
                          
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
                case 33 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:7: (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:7: (lv_type_97= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1888:6: lv_type_97= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_32_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3460);
                    lv_type_97=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_97, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState3473); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_32_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1910:1: (lv_name_99= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1913:6: lv_name_99= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_32_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3507);
                    lv_name_99=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_99, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 34 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:6: ( (lv_type_100= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:6: ( (lv_type_100= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:7: (lv_type_100= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:7: (lv_type_100= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1935:6: lv_type_100= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_33_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3553);
                    lv_type_100=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_100, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleState3566); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_33_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:7: (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:7: (lv_type_102= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1961:6: lv_type_102= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_34_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3608);
                    lv_type_102=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_102, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1979:2: (lv_name_103= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: lv_name_103= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_34_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3646);
                    lv_name_103=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_103, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 36 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2001:6: (lv_type_104= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2001:6: (lv_type_104= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: lv_type_104= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_35_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3691);
                    lv_type_104=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_104, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( 'state' (lv_name_106= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( 'state' (lv_name_106= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:7: 'state' (lv_name_106= ruleFullStateID )
                    {
                    match(input,13,FOLLOW_13_in_ruleState3711); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_36_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2027:1: (lv_name_106= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2030:6: lv_name_106= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_36_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3745);
                    lv_name_106=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_106, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 38 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2049:6: 'state'
                    {
                    match(input,13,FOLLOW_13_in_ruleState3765); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2054:6: (lv_name_108= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2054:6: (lv_name_108= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2057:6: lv_name_108= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_38_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3805);
                    lv_name_108=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_108, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2075:3: (lv_label_109= RULE_STRING )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred39()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2077:6: lv_label_109= RULE_STRING
                    {
                    lv_label_109=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3832); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_0(), "label"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "label", lv_label_109, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2095:3: ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2095:4: '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']'
                    {
                    match(input,14,FOLLOW_14_in_ruleState3851); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2099:1: ( (lv_signalRenamings_111= ruleRenaming ) ',' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_STRING) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==24) ) {
                                int LA3_2 = input.LA(3);

                                if ( (LA3_2==RULE_STRING) ) {
                                    int LA3_3 = input.LA(4);

                                    if ( (LA3_3==15) ) {
                                        alt3=1;
                                    }


                                }


                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2099:2: (lv_signalRenamings_111= ruleRenaming ) ','
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2099:2: (lv_signalRenamings_111= ruleRenaming )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2102:6: lv_signalRenamings_111= ruleRenaming
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalRenamingsRenamingParserRuleCall_2_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRenaming_in_ruleState3886);
                    	    lv_signalRenamings_111=ruleRenaming();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "signalRenamings", lv_signalRenamings_111, "Renaming", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }

                    	    match(input,15,FOLLOW_15_in_ruleState3899); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_2_1_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2124:3: (lv_signalRenamings_113= ruleRenaming )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2127:6: lv_signalRenamings_113= ruleRenaming
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalRenamingsRenamingParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRenaming_in_ruleState3935);
                    lv_signalRenamings_113=ruleRenaming();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		add(current, "signalRenamings", lv_signalRenamings_113, "Renaming", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,16,FOLLOW_16_in_ruleState3948); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightSquareBracketKeyword_2_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2149:3: (lv_bodyText_115= RULE_STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2151:6: lv_bodyText_115= RULE_STRING
                    {
                    lv_bodyText_115=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3972); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_3_0(), "bodyText"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "bodyText", lv_bodyText_115, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        int LA11_34 = input.LA(4);

                        if ( (LA11_34==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 28:
                                {
                                int LA11_35 = input.LA(6);

                                if ( (LA11_35==RULE_STRING) ) {
                                    int LA11_39 = input.LA(7);

                                    if ( (LA11_39==29) ) {
                                        int LA11_36 = input.LA(8);

                                        if ( (LA11_36==27) ) {
                                            int LA11_37 = input.LA(9);

                                            if ( (synpred44()) ) {
                                                alt11=1;
                                            }
                                            else if ( (true) ) {
                                                alt11=2;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA11_39==27) ) {
                                        int LA11_37 = input.LA(8);

                                        if ( (synpred44()) ) {
                                            alt11=1;
                                        }
                                        else if ( (true) ) {
                                            alt11=2;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 39, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 35, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 29:
                                {
                                int LA11_36 = input.LA(6);

                                if ( (LA11_36==27) ) {
                                    int LA11_37 = input.LA(7);

                                    if ( (synpred44()) ) {
                                        alt11=1;
                                    }
                                    else if ( (true) ) {
                                        alt11=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 27:
                                {
                                int LA11_37 = input.LA(6);

                                if ( (synpred44()) ) {
                                    alt11=1;
                                }
                                else if ( (true) ) {
                                    alt11=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 38, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 34, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        int LA11_35 = input.LA(4);

                        if ( (LA11_35==RULE_STRING) ) {
                            int LA11_39 = input.LA(5);

                            if ( (LA11_39==29) ) {
                                int LA11_36 = input.LA(6);

                                if ( (LA11_36==27) ) {
                                    int LA11_37 = input.LA(7);

                                    if ( (synpred44()) ) {
                                        alt11=1;
                                    }
                                    else if ( (true) ) {
                                        alt11=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA11_39==27) ) {
                                int LA11_37 = input.LA(6);

                                if ( (synpred44()) ) {
                                    alt11=1;
                                }
                                else if ( (true) ) {
                                    alt11=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 39, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        int LA11_36 = input.LA(4);

                        if ( (LA11_36==27) ) {
                            int LA11_37 = input.LA(5);

                            if ( (synpred44()) ) {
                                alt11=1;
                            }
                            else if ( (true) ) {
                                alt11=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA11_37 = input.LA(4);

                        if ( (synpred44()) ) {
                            alt11=1;
                        }
                        else if ( (true) ) {
                            alt11=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 24, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        int LA11_34 = input.LA(4);

                        if ( (LA11_34==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 28:
                                {
                                int LA11_35 = input.LA(6);

                                if ( (LA11_35==RULE_STRING) ) {
                                    int LA11_39 = input.LA(7);

                                    if ( (LA11_39==29) ) {
                                        int LA11_36 = input.LA(8);

                                        if ( (LA11_36==27) ) {
                                            int LA11_37 = input.LA(9);

                                            if ( (synpred44()) ) {
                                                alt11=1;
                                            }
                                            else if ( (true) ) {
                                                alt11=2;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA11_39==27) ) {
                                        int LA11_37 = input.LA(8);

                                        if ( (synpred44()) ) {
                                            alt11=1;
                                        }
                                        else if ( (true) ) {
                                            alt11=2;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 39, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 35, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 29:
                                {
                                int LA11_36 = input.LA(6);

                                if ( (LA11_36==27) ) {
                                    int LA11_37 = input.LA(7);

                                    if ( (synpred44()) ) {
                                        alt11=1;
                                    }
                                    else if ( (true) ) {
                                        alt11=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 27:
                                {
                                int LA11_37 = input.LA(6);

                                if ( (synpred44()) ) {
                                    alt11=1;
                                }
                                else if ( (true) ) {
                                    alt11=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 38, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 34, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        int LA11_35 = input.LA(4);

                        if ( (LA11_35==RULE_STRING) ) {
                            int LA11_39 = input.LA(5);

                            if ( (LA11_39==29) ) {
                                int LA11_36 = input.LA(6);

                                if ( (LA11_36==27) ) {
                                    int LA11_37 = input.LA(7);

                                    if ( (synpred44()) ) {
                                        alt11=1;
                                    }
                                    else if ( (true) ) {
                                        alt11=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA11_39==27) ) {
                                int LA11_37 = input.LA(6);

                                if ( (synpred44()) ) {
                                    alt11=1;
                                }
                                else if ( (true) ) {
                                    alt11=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 39, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        int LA11_36 = input.LA(4);

                        if ( (LA11_36==27) ) {
                            int LA11_37 = input.LA(5);

                            if ( (synpred44()) ) {
                                alt11=1;
                            }
                            else if ( (true) ) {
                                alt11=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA11_37 = input.LA(4);

                        if ( (synpred44()) ) {
                            alt11=1;
                        }
                        else if ( (true) ) {
                            alt11=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 24, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        int LA11_34 = input.LA(4);

                        if ( (LA11_34==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 28:
                                {
                                int LA11_35 = input.LA(6);

                                if ( (LA11_35==RULE_STRING) ) {
                                    int LA11_39 = input.LA(7);

                                    if ( (LA11_39==29) ) {
                                        int LA11_36 = input.LA(8);

                                        if ( (LA11_36==27) ) {
                                            int LA11_37 = input.LA(9);

                                            if ( (synpred44()) ) {
                                                alt11=1;
                                            }
                                            else if ( (true) ) {
                                                alt11=2;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA11_39==27) ) {
                                        int LA11_37 = input.LA(8);

                                        if ( (synpred44()) ) {
                                            alt11=1;
                                        }
                                        else if ( (true) ) {
                                            alt11=2;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 39, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 35, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 29:
                                {
                                int LA11_36 = input.LA(6);

                                if ( (LA11_36==27) ) {
                                    int LA11_37 = input.LA(7);

                                    if ( (synpred44()) ) {
                                        alt11=1;
                                    }
                                    else if ( (true) ) {
                                        alt11=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 27:
                                {
                                int LA11_37 = input.LA(6);

                                if ( (synpred44()) ) {
                                    alt11=1;
                                }
                                else if ( (true) ) {
                                    alt11=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 38, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 34, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        int LA11_35 = input.LA(4);

                        if ( (LA11_35==RULE_STRING) ) {
                            int LA11_39 = input.LA(5);

                            if ( (LA11_39==29) ) {
                                int LA11_36 = input.LA(6);

                                if ( (LA11_36==27) ) {
                                    int LA11_37 = input.LA(7);

                                    if ( (synpred44()) ) {
                                        alt11=1;
                                    }
                                    else if ( (true) ) {
                                        alt11=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA11_39==27) ) {
                                int LA11_37 = input.LA(6);

                                if ( (synpred44()) ) {
                                    alt11=1;
                                }
                                else if ( (true) ) {
                                    alt11=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 39, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        int LA11_36 = input.LA(4);

                        if ( (LA11_36==27) ) {
                            int LA11_37 = input.LA(5);

                            if ( (synpred44()) ) {
                                alt11=1;
                            }
                            else if ( (true) ) {
                                alt11=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA11_37 = input.LA(4);

                        if ( (synpred44()) ) {
                            alt11=1;
                        }
                        else if ( (true) ) {
                            alt11=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 24, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA11_6 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 6, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA11_7 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 7, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA11_8 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 8, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA11_9 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 9, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA11_10 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 10, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA11_11 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 11, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA11_12 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 12, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA11_13 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 13, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA11_14 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 14, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA11_15 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 15, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                int LA11_16 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 16, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA11_17 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 17, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA11_18 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 18, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA11_19 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 19, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA11_20 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 20, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA11_21 = input.LA(2);

                if ( (synpred44()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 21, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2169:3: ( (lv_outgoingTransitions_116= ruleTransition )* | ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:4: (lv_outgoingTransitions_116= ruleTransition )*
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:4: (lv_outgoingTransitions_116= ruleTransition )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            int LA6_2 = input.LA(2);

                            if ( (synpred43()) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0>=52 && LA6_0<=54)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2172:6: lv_outgoingTransitions_116= ruleTransition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleState4016);
                    	    lv_outgoingTransitions_116=ruleTransition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "outgoingTransitions", lv_outgoingTransitions_116, "Transition", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:6: ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:6: ( ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )* )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:7: ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_131= ruleTransition )*
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:7: ( '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==17) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:8: '{' ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+ '}'
                            {
                            match(input,17,FOLLOW_17_in_ruleState4038); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2195:1: ( ( 'onentry' (lv_entryActions_119= ruleAction ) ) | ( 'oninner' (lv_innerActions_121= ruleAction ) ) | ( 'onexit' (lv_exitActions_123= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) ) | (lv_signals_126= ruleSignal ) | ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* ) )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=7;
                                switch ( input.LA(1) ) {
                                case 18:
                                    {
                                    alt8=1;
                                    }
                                    break;
                                case 19:
                                    {
                                    alt8=2;
                                    }
                                    break;
                                case 20:
                                    {
                                    alt8=3;
                                    }
                                    break;
                                case 21:
                                    {
                                    alt8=4;
                                    }
                                    break;
                                case 33:
                                    {
                                    int LA8_6 = input.LA(2);

                                    if ( (LA8_6==RULE_ID) ) {
                                        int LA8_10 = input.LA(3);

                                        if ( (synpred49()) ) {
                                            alt8=5;
                                        }
                                        else if ( (synpred51()) ) {
                                            alt8=6;
                                        }


                                    }


                                    }
                                    break;
                                case 34:
                                    {
                                    int LA8_7 = input.LA(2);

                                    if ( (LA8_7==RULE_ID) ) {
                                        int LA8_10 = input.LA(3);

                                        if ( (synpred49()) ) {
                                            alt8=5;
                                        }
                                        else if ( (synpred51()) ) {
                                            alt8=6;
                                        }


                                    }


                                    }
                                    break;
                                case 35:
                                    {
                                    int LA8_8 = input.LA(2);

                                    if ( (LA8_8==RULE_ID) ) {
                                        int LA8_10 = input.LA(3);

                                        if ( (synpred49()) ) {
                                            alt8=5;
                                        }
                                        else if ( (synpred51()) ) {
                                            alt8=6;
                                        }


                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case 11:
                                case 12:
                                case 13:
                                case 30:
                                case 37:
                                case 38:
                                case 39:
                                    {
                                    alt8=6;
                                    }
                                    break;

                                }

                                switch (alt8) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2195:2: ( 'onentry' (lv_entryActions_119= ruleAction ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2195:2: ( 'onentry' (lv_entryActions_119= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2195:3: 'onentry' (lv_entryActions_119= ruleAction )
                            	    {
                            	    match(input,18,FOLLOW_18_in_ruleState4049); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_4_1_0_1_0_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2199:1: (lv_entryActions_119= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2202:6: lv_entryActions_119= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_4_1_0_1_0_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleAction_in_ruleState4083);
                            	    lv_entryActions_119=ruleAction();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "entryActions", lv_entryActions_119, "Action", currentNode);
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
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:6: ( 'oninner' (lv_innerActions_121= ruleAction ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:6: ( 'oninner' (lv_innerActions_121= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:7: 'oninner' (lv_innerActions_121= ruleAction )
                            	    {
                            	    match(input,19,FOLLOW_19_in_ruleState4104); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_4_1_0_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2225:1: (lv_innerActions_121= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2228:6: lv_innerActions_121= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_4_1_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleAction_in_ruleState4138);
                            	    lv_innerActions_121=ruleAction();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "innerActions", lv_innerActions_121, "Action", currentNode);
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
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2247:6: ( 'onexit' (lv_exitActions_123= ruleAction ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2247:6: ( 'onexit' (lv_exitActions_123= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2247:7: 'onexit' (lv_exitActions_123= ruleAction )
                            	    {
                            	    match(input,20,FOLLOW_20_in_ruleState4159); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_4_1_0_1_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2251:1: (lv_exitActions_123= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2254:6: lv_exitActions_123= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_4_1_0_1_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleAction_in_ruleState4193);
                            	    lv_exitActions_123=ruleAction();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "exitActions", lv_exitActions_123, "Action", currentNode);
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
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2273:6: ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2273:6: ( 'suspension' (lv_suspensionTrigger_125= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2273:7: 'suspension' (lv_suspensionTrigger_125= ruleAction )
                            	    {
                            	    match(input,21,FOLLOW_21_in_ruleState4214); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_4_1_0_1_3_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2277:1: (lv_suspensionTrigger_125= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2280:6: lv_suspensionTrigger_125= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_4_1_0_1_3_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleAction_in_ruleState4248);
                            	    lv_suspensionTrigger_125=ruleAction();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		set(current, "suspensionTrigger", lv_suspensionTrigger_125, "Action", currentNode);
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
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: (lv_signals_126= ruleSignal )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: (lv_signals_126= ruleSignal )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2302:6: lv_signals_126= ruleSignal
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_0_1_4_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSignal_in_ruleState4293);
                            	    lv_signals_126=ruleSignal();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "signals", lv_signals_126, "Signal", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;
                            	case 6 :
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:6: ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:6: ( (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )* )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:7: (lv_regions_127= ruleRegion ) ( '||' (lv_regions_129= ruleRegion ) )*
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:7: (lv_regions_127= ruleRegion )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2324:6: lv_regions_127= ruleRegion
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_0_1_5_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleRegion_in_ruleState4338);
                            	    lv_regions_127=ruleRegion();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "regions", lv_regions_127, "Region", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }

                            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2342:2: ( '||' (lv_regions_129= ruleRegion ) )*
                            	    loop7:
                            	    do {
                            	        int alt7=2;
                            	        int LA7_0 = input.LA(1);

                            	        if ( (LA7_0==22) ) {
                            	            alt7=1;
                            	        }


                            	        switch (alt7) {
                            	    	case 1 :
                            	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2342:3: '||' (lv_regions_129= ruleRegion )
                            	    	    {
                            	    	    match(input,22,FOLLOW_22_in_ruleState4352); if (failed) return current;
                            	    	    if ( backtracking==0 ) {

                            	    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_4_1_0_1_5_1_0(), null); 
                            	    	          
                            	    	    }
                            	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2346:1: (lv_regions_129= ruleRegion )
                            	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2349:6: lv_regions_129= ruleRegion
                            	    	    {
                            	    	    if ( backtracking==0 ) {
                            	    	       
                            	    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_0_1_5_1_1_0(), currentNode); 
                            	    	      	    
                            	    	    }
                            	    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4386);
                            	    	    lv_regions_129=ruleRegion();
                            	    	    _fsp--;
                            	    	    if (failed) return current;
                            	    	    if ( backtracking==0 ) {

                            	    	      	        if (current==null) {
                            	    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	      	        }
                            	    	      	        
                            	    	      	        try {
                            	    	      	       		add(current, "regions", lv_regions_129, "Region", currentNode);
                            	    	      	        } catch (ValueConverterException vce) {
                            	    	      				handleValueConverterException(vce);
                            	    	      	        }
                            	    	      	        currentNode = currentNode.getParent();
                            	    	      	    
                            	    	    }

                            	    	    }


                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop7;
                            	        }
                            	    } while (true);


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                            	    if (backtracking>0) {failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);

                            match(input,23,FOLLOW_23_in_ruleState4404); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_1_0_2(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2371:3: (lv_outgoingTransitions_131= ruleTransition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            int LA10_2 = input.LA(2);

                            if ( (synpred53()) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=52 && LA10_0<=54)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2374:6: lv_outgoingTransitions_131= ruleTransition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleState4440);
                    	    lv_outgoingTransitions_131=ruleTransition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "outgoingTransitions", lv_outgoingTransitions_131, "Transition", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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


    // $ANTLR start entryRuleRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2399:1: entryRuleRenaming returns [EObject current=null] : iv_ruleRenaming= ruleRenaming EOF ;
    public final EObject entryRuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenaming = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2399:50: (iv_ruleRenaming= ruleRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2400:2: iv_ruleRenaming= ruleRenaming EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRenamingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming4480);
            iv_ruleRenaming=ruleRenaming();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRenaming; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming4490); if (failed) return current;

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
    // $ANTLR end entryRuleRenaming


    // $ANTLR start ruleRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2407:1: ruleRenaming returns [EObject current=null] : ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) ) ;
    public final EObject ruleRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_oldObject_0=null;
        Token lv_newID_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2412:6: ( ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2413:1: ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2413:1: ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2413:2: (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2413:2: (lv_oldObject_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2415:6: lv_oldObject_0= RULE_STRING
            {
            lv_oldObject_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRenaming4537); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getRenamingAccess().getOldObjectSTRINGTerminalRuleCall_0_0(), "oldObject"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "oldObject", lv_oldObject_0, "STRING", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            match(input,24,FOLLOW_24_in_ruleRenaming4554); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRenamingAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2437:1: (lv_newID_2= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2439:6: lv_newID_2= RULE_STRING
            {
            lv_newID_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRenaming4576); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getRenamingAccess().getNewIDSTRINGTerminalRuleCall_2_0(), "newID"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "newID", lv_newID_2, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleRenaming


    // $ANTLR start entryRuleFullStateID
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2464:1: entryRuleFullStateID returns [String current=null] : iv_ruleFullStateID= ruleFullStateID EOF ;
    public final String entryRuleFullStateID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullStateID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2464:52: (iv_ruleFullStateID= ruleFullStateID EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2465:2: iv_ruleFullStateID= ruleFullStateID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullStateIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullStateID_in_entryRuleFullStateID4618);
            iv_ruleFullStateID=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullStateID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullStateID4629); if (failed) return current;

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
    // $ANTLR end entryRuleFullStateID


    // $ANTLR start ruleFullStateID
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2472:1: ruleFullStateID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFullStateID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2478:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2479:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2479:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2479:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2479:2: (this_ID_0= RULE_ID kw= '@' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==25) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2479:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID4670); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleFullStateID4688); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFullStateIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID4705); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
              	    lastConsumedDatatypeToken = current;
                  
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
    // $ANTLR end ruleFullStateID


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2507:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2507:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2508:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4748);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4758); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2515:1: ruleAction returns [EObject current=null] : ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        Token lv_triggersAndEffects_3=null;
        EObject this_Transition_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2520:6: ( ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2521:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2521:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||LA15_0==RULE_INT||LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID||(LA15_0>=52 && LA15_0<=54)) ) {
                alt15=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2521:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2521:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2521:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2521:3: (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2521:3: (lv_isImmediate_0= '#' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==26) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:6: lv_isImmediate_0= '#'
                            {
                            lv_isImmediate_0=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleAction4805); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0_0(), "isImmediate"); 
                                  
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
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2542:3: ( (lv_delay_1= RULE_INT ) ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2542:4: (lv_delay_1= RULE_INT ) ';'
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2542:4: (lv_delay_1= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2544:6: lv_delay_1= RULE_INT
                            {
                            lv_delay_1=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction4842); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_0_1_0_0(), "delay"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "delay", lv_delay_1, "INT", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }

                            match(input,27,FOLLOW_27_in_ruleAction4859); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_0_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:3: (lv_triggersAndEffects_3= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2568:6: lv_triggersAndEffects_3= RULE_STRING
                    {
                    lv_triggersAndEffects_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction4883); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getActionAccess().getTriggersAndEffectsSTRINGTerminalRuleCall_0_2_0(), "triggersAndEffects"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "triggersAndEffects", lv_triggersAndEffects_3, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2588:5: this_Transition_4= ruleTransition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getActionAccess().getTransitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleAction4920);
                    this_Transition_4=ruleTransition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Transition_4; 
                              currentNode = currentNode.getParent();
                          
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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2603:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2603:48: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2604:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion4952);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion4962); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2611:1: ruleRegion returns [EObject current=null] : ( (lv_variables_0= ruleVariable ) | (lv_innerStates_1= ruleState ) | (lv_signals_2= ruleSignal ) )+ ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0 = null;

        EObject lv_innerStates_1 = null;

        EObject lv_signals_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2616:6: ( ( (lv_variables_0= ruleVariable ) | (lv_innerStates_1= ruleState ) | (lv_signals_2= ruleSignal ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:1: ( (lv_variables_0= ruleVariable ) | (lv_innerStates_1= ruleState ) | (lv_signals_2= ruleSignal ) )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:1: ( (lv_variables_0= ruleVariable ) | (lv_innerStates_1= ruleState ) | (lv_signals_2= ruleSignal ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt16=3;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt16=3;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt16=3;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred58()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 11:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA16_7 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 13:
                    {
                    int LA16_8 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA16_9 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA16_10 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA16_11 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA16_12 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:2: (lv_variables_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:2: (lv_variables_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2620:6: lv_variables_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion5021);
            	    lv_variables_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "variables", lv_variables_0, "Variable", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2639:6: (lv_innerStates_1= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2639:6: (lv_innerStates_1= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2642:6: lv_innerStates_1= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion5065);
            	    lv_innerStates_1=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerStates", lv_innerStates_1, "State", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2661:6: (lv_signals_2= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2661:6: (lv_signals_2= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2664:6: lv_signals_2= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion5109);
            	    lv_signals_2=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "signals", lv_signals_2, "Signal", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2689:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2689:52: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2690:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition5147);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition5157); if (failed) return current;

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
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2697:1: ruleTransition returns [EObject current=null] : ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_triggersAndEffects_4=null;
        Token lv_isHistory_5=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2702:6: ( ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2703:1: ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2703:1: ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2703:2: ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2703:2: ( ruleFullStateID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2706:3: ruleFullStateID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getSourceStateStateCrossReference_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition5209);
                    ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2721:3: (lv_type_1= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2724:6: lv_type_1= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition5247);
            lv_type_1=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "type", lv_type_1, "TransitionType", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2742:2: ( ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2745:3: ruleFullStateID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition5278);
            ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2760:2: ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2760:3: 'with' (lv_triggersAndEffects_4= RULE_STRING )
                    {
                    match(input,28,FOLLOW_28_in_ruleTransition5291); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2764:1: (lv_triggersAndEffects_4= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2766:6: lv_triggersAndEffects_4= RULE_STRING
                    {
                    lv_triggersAndEffects_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition5313); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getTriggersAndEffectsSTRINGTerminalRuleCall_3_1_0(), "triggersAndEffects"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "triggersAndEffects", lv_triggersAndEffects_4, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2784:4: (lv_isHistory_5= ' history' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2786:6: lv_isHistory_5= ' history'
                    {
                    lv_isHistory_5=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleTransition5344); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_4_0(), "isHistory"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isHistory", true, " history", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleTransition5367); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_5(), null); 
                  
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
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2820:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2820:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2821:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable5404);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable5414); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2828:1: ruleVariable returns [EObject current=null] : ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_initialValue_5=null;
        Enumerator lv_type_3 = null;

        Enumerator lv_type_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2833:6: ( ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2834:1: ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2834:1: ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2834:2: 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) )
            {
            match(input,30,FOLLOW_30_in_ruleVariable5448); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2838:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2840:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable5470); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:2: ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2858:2: ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:3: ( ': ' (lv_type_3= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:3: ( ': ' (lv_type_3= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:4: ': ' (lv_type_3= ruleValueType )
                    {
                    match(input,31,FOLLOW_31_in_ruleVariable5489); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2862:1: (lv_type_3= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2865:6: lv_type_3= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable5523);
                    lv_type_3=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_3, "ValueType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2884:6: ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2884:6: ( ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2884:7: ':=' (lv_initialValue_5= RULE_INT ) ': ' (lv_type_7= ruleValueType )
                    {
                    match(input,32,FOLLOW_32_in_ruleVariable5544); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2888:1: (lv_initialValue_5= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2890:6: lv_initialValue_5= RULE_INT
                    {
                    lv_initialValue_5=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable5566); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getVariableAccess().getInitialValueINTTerminalRuleCall_2_1_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_5, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,31,FOLLOW_31_in_ruleVariable5583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2912:1: (lv_type_7= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2915:6: lv_type_7= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable5617);
                    lv_type_7=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2940:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2940:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2941:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal5656);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal5666); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2948:1: ruleSignal returns [EObject current=null] : ( ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ( ': ' (lv_type_5= ruleValueType ) ) | ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) ) | ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) ) )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInputOutput_0=null;
        Token lv_isInput_1=null;
        Token lv_isOutput_2=null;
        Token lv_name_3=null;
        Token lv_hostCombineOperator_10=null;
        Token lv_initialValue_12=null;
        Token lv_initialValue_16=null;
        Token lv_hostCombineOperator_21=null;
        Enumerator lv_type_5 = null;

        Enumerator lv_type_7 = null;

        Enumerator lv_combineOperator_9 = null;

        Enumerator lv_type_14 = null;

        Enumerator lv_type_18 = null;

        Enumerator lv_combineOperator_20 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2953:6: ( ( ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ( ': ' (lv_type_5= ruleValueType ) ) | ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) ) | ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2954:1: ( ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ( ': ' (lv_type_5= ruleValueType ) ) | ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) ) | ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2954:1: ( ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ( ': ' (lv_type_5= ruleValueType ) ) | ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) ) | ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2954:2: ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) ) (lv_name_3= RULE_ID ) ( ( ': ' (lv_type_5= ruleValueType ) ) | ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) ) | ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2954:2: ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2954:2: ( (lv_isInputOutput_0= 'inputoutput' ) | (lv_isInput_1= 'input' ) | (lv_isOutput_2= 'output' ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2954:3: (lv_isInputOutput_0= 'inputoutput' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2954:3: (lv_isInputOutput_0= 'inputoutput' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2956:6: lv_isInputOutput_0= 'inputoutput'
                    {
                    lv_isInputOutput_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSignal5713); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputOutputInputoutputKeyword_0_0_0(), "isInputOutput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInputOutput", true, "inputoutput", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2976:6: (lv_isInput_1= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2976:6: (lv_isInput_1= 'input' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2978:6: lv_isInput_1= 'input'
                    {
                    lv_isInput_1=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSignal5753); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2998:6: (lv_isOutput_2= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2998:6: (lv_isOutput_2= 'output' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3000:6: lv_isOutput_2= 'output'
                    {
                    lv_isOutput_2=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleSignal5793); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3019:3: (lv_name_3= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3021:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5829); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3039:2: ( ( ': ' (lv_type_5= ruleValueType ) ) | ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) ) | ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) ) )?
            int alt24=5;
            switch ( input.LA(1) ) {
                case 31:
                    {
                    alt24=1;
                    }
                    break;
                case 36:
                    {
                    alt24=2;
                    }
                    break;
                case 32:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (LA24_3==RULE_INT) ) {
                        int LA24_5 = input.LA(3);

                        if ( (LA24_5==36) ) {
                            alt24=4;
                        }
                        else if ( (LA24_5==31) ) {
                            alt24=3;
                        }
                    }
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3039:3: ( ': ' (lv_type_5= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3039:3: ( ': ' (lv_type_5= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3039:4: ': ' (lv_type_5= ruleValueType )
                    {
                    match(input,31,FOLLOW_31_in_ruleSignal5848); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3043:1: (lv_type_5= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3046:6: lv_type_5= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5882);
                    lv_type_5=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_5, "ValueType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3065:6: ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3065:6: ( ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3065:7: ': combine' (lv_type_7= ruleValueType ) 'with' ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) )
                    {
                    match(input,36,FOLLOW_36_in_ruleSignal5903); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3069:1: (lv_type_7= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3072:6: lv_type_7= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5937);
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

                    match(input,28,FOLLOW_28_in_ruleSignal5950); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3094:1: ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=40 && LA22_0<=45)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_STRING) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3094:1: ( (lv_combineOperator_9= ruleCombineOperator ) | (lv_hostCombineOperator_10= RULE_STRING ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3094:2: (lv_combineOperator_9= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3094:2: (lv_combineOperator_9= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3097:6: lv_combineOperator_9= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal5985);
                            lv_combineOperator_9=ruleCombineOperator();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "combineOperator", lv_combineOperator_9, "CombineOperator", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3116:6: (lv_hostCombineOperator_10= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3116:6: (lv_hostCombineOperator_10= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3118:6: lv_hostCombineOperator_10= RULE_STRING
                            {
                            lv_hostCombineOperator_10=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal6017); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_2_1_3_1_0(), "hostCombineOperator"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostCombineOperator", lv_hostCombineOperator_10, "STRING", lastConsumedNode);
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
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3137:6: ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3137:6: ( ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3137:7: ':=' (lv_initialValue_12= RULE_INT ) ': ' (lv_type_14= ruleValueType )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal6043); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3141:1: (lv_initialValue_12= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3143:6: lv_initialValue_12= RULE_INT
                    {
                    lv_initialValue_12=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignal6065); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueINTTerminalRuleCall_2_2_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_12, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,31,FOLLOW_31_in_ruleSignal6082); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3165:1: (lv_type_14= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3168:6: lv_type_14= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal6116);
                    lv_type_14=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_14, "ValueType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3187:6: ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3187:6: ( ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3187:7: ':=' (lv_initialValue_16= RULE_INT ) ': combine' (lv_type_18= ruleValueType ) 'with' ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal6137); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3191:1: (lv_initialValue_16= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3193:6: lv_initialValue_16= RULE_INT
                    {
                    lv_initialValue_16=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignal6159); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueINTTerminalRuleCall_2_3_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_16, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,36,FOLLOW_36_in_ruleSignal6176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_3_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3215:1: (lv_type_18= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3218:6: lv_type_18= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_3_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal6210);
                    lv_type_18=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_18, "ValueType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,28,FOLLOW_28_in_ruleSignal6223); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_3_4(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:1: ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=40 && LA23_0<=45)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_STRING) ) {
                        alt23=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3240:1: ( (lv_combineOperator_20= ruleCombineOperator ) | (lv_hostCombineOperator_21= RULE_STRING ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:2: (lv_combineOperator_20= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:2: (lv_combineOperator_20= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3243:6: lv_combineOperator_20= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_3_5_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal6258);
                            lv_combineOperator_20=ruleCombineOperator();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "combineOperator", lv_combineOperator_20, "CombineOperator", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3262:6: (lv_hostCombineOperator_21= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3262:6: (lv_hostCombineOperator_21= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3264:6: lv_hostCombineOperator_21= RULE_STRING
                            {
                            lv_hostCombineOperator_21=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal6290); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_2_3_5_1_0(), "hostCombineOperator"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostCombineOperator", lv_hostCombineOperator_21, "STRING", lastConsumedNode);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3289:1: ruleStateType returns [Enumerator current=null] : ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3293:6: ( ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3294:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3294:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            case 39:
                {
                alt25=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3294:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3294:2: ( 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3294:2: ( 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3294:4: 'state'
                    {
                    match(input,13,FOLLOW_13_in_ruleStateType6349); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3300:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3300:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3300:8: 'cond'
                    {
                    match(input,37,FOLLOW_37_in_ruleStateType6364); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3306:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3306:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3306:8: 'ref'
                    {
                    match(input,38,FOLLOW_38_in_ruleStateType6379); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3312:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3312:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3312:8: 'textual'
                    {
                    match(input,39,FOLLOW_39_in_ruleStateType6394); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3322:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3326:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3327:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3327:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            case 43:
                {
                alt26=4;
                }
                break;
            case 44:
                {
                alt26=5;
                }
                break;
            case 45:
                {
                alt26=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3327:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3327:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3327:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3327:4: 'NONE'
                    {
                    match(input,40,FOLLOW_40_in_ruleCombineOperator6437); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3333:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3333:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3333:8: '+'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator6452); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3339:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3339:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3339:8: '*'
                    {
                    match(input,42,FOLLOW_42_in_ruleCombineOperator6467); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3345:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3345:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3345:8: 'AND'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator6482); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3351:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3351:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3351:8: 'OR'
                    {
                    match(input,44,FOLLOW_44_in_ruleCombineOperator6497); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3357:6: ( 'hostCombineOperator' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3357:6: ( 'hostCombineOperator' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3357:8: 'hostCombineOperator'
                    {
                    match(input,45,FOLLOW_45_in_ruleCombineOperator6512); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_5(), null); 
                          
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3367:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3371:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3372:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3372:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt27=1;
                }
                break;
            case 47:
                {
                alt27=2;
                }
                break;
            case 48:
                {
                alt27=3;
                }
                break;
            case 49:
                {
                alt27=4;
                }
                break;
            case 50:
                {
                alt27=5;
                }
                break;
            case 51:
                {
                alt27=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3372:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3372:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3372:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3372:4: 'PURE'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType6555); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3378:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3378:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3378:8: 'boolean'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType6570); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3384:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3384:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3384:8: 'unsigned'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType6585); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3390:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3390:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3390:8: 'integer'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType6600); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3396:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3396:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3396:8: 'float'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType6615); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3402:6: ( 'hostType' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3402:6: ( 'hostType' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3402:8: 'hostType'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType6630); if (failed) return current;
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


    // $ANTLR start ruleTransitionType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3412:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3416:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3417:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3417:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt28=1;
                }
                break;
            case 53:
                {
                alt28=2;
                }
                break;
            case 54:
                {
                alt28=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3417:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3417:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3417:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3417:4: '-->'
                    {
                    match(input,52,FOLLOW_52_in_ruleTransitionType6673); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3423:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3423:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3423:8: 'o->'
                    {
                    match(input,53,FOLLOW_53_in_ruleTransitionType6688); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3429:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3429:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3429:8: '>->'
                    {
                    match(input,54,FOLLOW_54_in_ruleTransitionType6703); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2(), null); 
                          
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
    // $ANTLR end ruleTransitionType

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred1138); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:109:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:111:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred1172); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:130:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:133:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred1220);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred1233); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:158:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_0_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred1267);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:179:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred2301); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:198:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:200:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred2335); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:219:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:222:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred2383);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred2396); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:247:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred3426); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:266:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:268:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred3460); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:287:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:290:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred3508);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:308:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:311:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred3546);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:7: ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:332:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred4580); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:351:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:353:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred4614); if (failed) return ;

        }


        }

        match(input,13,FOLLOW_13_in_synpred4637); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:376:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:379:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_3_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred4671);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:398:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:400:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred5705); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:419:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:421:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred5739); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:440:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:443:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred5787);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:7: ( ( 'init' ) ( 'final' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:462:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:464:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred6821); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:483:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:485:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred6855); if (failed) return ;

        }


        }

        match(input,13,FOLLOW_13_in_synpred6878); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:6: ( ( ( 'init' ) ( 'final' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:6: ( ( 'init' ) ( 'final' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:6: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:7: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:573:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:575:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred81023); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:594:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:596:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred81057); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:618:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred91100); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:637:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:639:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred91134); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:658:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:661:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred91182);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred91195); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:683:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:686:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_8_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred91229);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:705:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:707:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred101263); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:726:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:728:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred101297); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:747:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:750:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_9_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred101345);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred101358); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:775:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred111388); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:794:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:796:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred111422); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:815:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:818:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred111470);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:836:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:839:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_10_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred111508);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:7: ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred121542); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:879:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred121576); if (failed) return ;

        }


        }

        match(input,13,FOLLOW_13_in_synpred121599); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:907:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_11_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred121633);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:926:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:928:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred131667); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:947:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:949:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred131701); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:968:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:971:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred131749);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:7: ( ( 'final' ) ( 'init' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:990:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:992:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred141783); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1011:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1013:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred141817); if (failed) return ;

        }


        }

        match(input,13,FOLLOW_13_in_synpred141840); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:6: ( ( ( 'final' ) ( 'init' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:6: ( ( 'final' ) ( 'init' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:6: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:7: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1103:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred161985); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1122:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1124:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred162019); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:7: ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1146:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred172061); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1165:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1168:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_16_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred172108);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred172121); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1190:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1193:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_16_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred172155);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:7: ( 'init' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1212:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1214:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred182188); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1233:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1236:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_17_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred182235);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred182248); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:7: ( 'init' ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1261:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred192277); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1280:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1283:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_18_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred192324);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1301:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1304:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_18_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred192362);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( ( ( 'init' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( ( 'init' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( ( 'init' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:7: ( 'init' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1325:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred202395); if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred202417); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1348:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1351:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_19_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred202451);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:6: ( ( ( 'init' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:6: ( ( 'init' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:6: ( ( 'init' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:7: ( 'init' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1370:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1372:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred212484); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1391:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1394:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_20_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred212531);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:6: ( ( ( 'init' ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:6: ( ( 'init' ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:6: ( ( 'init' ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:7: ( 'init' ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1413:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1415:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred222564); if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred222586); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( ( ( 'init' ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( ( 'init' ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( ( 'init' ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:7: ( 'init' ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1441:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred232615); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1460:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1463:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_22_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred232662);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1482:6: ( ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1482:6: ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1482:6: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1484:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred242694); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:7: ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1506:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred252735); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1525:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1528:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_24_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred252782);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred252795); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1550:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1553:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_24_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred252829);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:7: ( 'final' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1572:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1574:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred262862); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1593:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1596:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_25_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred262909);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred262922); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:7: ( 'final' ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1621:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred272951); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1640:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1643:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_26_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred272998);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1661:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1664:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_26_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred273036);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( ( ( 'final' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:7: ( 'final' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1685:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred283069); if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred283091); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1708:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1711:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_27_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred283125);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:6: ( ( ( 'final' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:6: ( ( 'final' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:6: ( ( 'final' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:7: ( 'final' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1730:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1732:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred293158); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1751:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1754:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_28_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred293205);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( ( ( 'final' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:7: ( 'final' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1775:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred303238); if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred303260); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1798:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1801:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_29_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred303294);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( ( ( 'final' ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( ( 'final' ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( ( 'final' ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:7: ( 'final' ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1822:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred313327); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1841:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1844:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_30_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred313374);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1863:6: ( ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1863:6: ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1863:6: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1865:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred323406); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( ( ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:7: ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1888:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_32_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred333460);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred333473); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1910:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1913:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_32_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred333507);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:6: ( ( ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:6: ( ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:6: ( ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:7: ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1932:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1935:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_33_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred343553);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,13,FOLLOW_13_in_synpred343566); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( ( ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:7: ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1961:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_34_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred353608);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1979:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_34_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred353646);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2001:6: ( ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2001:6: ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2001:6: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_35_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred363691);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( ( 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:7: 'state' ( ruleFullStateID )
        {
        match(input,13,FOLLOW_13_in_synpred373711); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2027:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2030:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_36_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred373745);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2049:6: ( 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2049:6: 'state'
        {
        match(input,13,FOLLOW_13_in_synpred383765); if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2077:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2077:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred393832); if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2172:6: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2172:6: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred434016);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:4: ( ( ruleTransition )* )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:4: ( ruleTransition )*
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:4: ( ruleTransition )*
        loop30:
        do {
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=52 && LA30_0<=54)) ) {
                alt30=1;
            }


            switch (alt30) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2172:6: ruleTransition
        	    {
        	    pushFollow(FOLLOW_ruleTransition_in_synpred444016);
        	    ruleTransition();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop30;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2302:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_0_1_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred494293);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:6: ( ( ( ruleRegion ) ( '||' ( ruleRegion ) )* ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:6: ( ( ruleRegion ) ( '||' ( ruleRegion ) )* )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:6: ( ( ruleRegion ) ( '||' ( ruleRegion ) )* )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:7: ( ruleRegion ) ( '||' ( ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2321:7: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2324:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_0_1_5_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred514338);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2342:2: ( '||' ( ruleRegion ) )*
        loop31:
        do {
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }


            switch (alt31) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2342:3: '||' ( ruleRegion )
        	    {
        	    match(input,22,FOLLOW_22_in_synpred514352); if (failed) return ;
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2346:1: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2349:6: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_0_1_5_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleRegion_in_synpred514386);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop31;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2374:6: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2374:6: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred534440);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:2: ( ( ruleVariable ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:2: ( ruleVariable )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2617:2: ( ruleVariable )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2620:6: ruleVariable
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_in_synpred585021);
        ruleVariable();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2639:6: ( ( ruleState ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2639:6: ( ruleState )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2639:6: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2642:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred595065);
        ruleState();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2661:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2661:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2661:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2664:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred605109);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred60

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred60() {
        backtracking++;
        int start = input.mark();
        try {
            synpred60_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred20() {
        backtracking++;
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
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
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
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
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
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
    public final boolean synpred58() {
        backtracking++;
        int start = input.mark();
        try {
            synpred58_fragment(); // can never throw exception
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
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
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
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred31() {
        backtracking++;
        int start = input.mark();
        try {
            synpred31_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred30() {
        backtracking++;
        int start = input.mark();
        try {
            synpred30_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
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
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_11_in_ruleState138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState172 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState267 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState335 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState396 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState426 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState460 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState546 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState671 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState739 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState787 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState821 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState878 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState908 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState942 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState990 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState1023 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1057 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1100 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1134 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1229 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1297 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1358 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1388 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1422 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1508 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1633 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1701 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1749 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1783 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1817 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1840 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1870 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1952 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState2019 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2061 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2108 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2155 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2188 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2248 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2277 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2362 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2451 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2484 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2531 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2586 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2662 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2694 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState2735 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2829 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState2862 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2922 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState2951 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3036 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState3091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3125 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3158 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3205 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState3260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3294 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3374 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3406 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState3473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3507 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3553 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState3566 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3646 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3691 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_13_in_ruleState3711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3745 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_13_in_ruleState3765 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3805 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3832 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_14_in_ruleState3851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleState3886 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleState3899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleState3935 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleState3948 = new BitSet(new long[]{0x0070000000020032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3972 = new BitSet(new long[]{0x0070000000020022L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState4016 = new BitSet(new long[]{0x0070000000000022L});
    public static final BitSet FOLLOW_17_in_ruleState4038 = new BitSet(new long[]{0x000000EE403C3820L});
    public static final BitSet FOLLOW_18_in_ruleState4049 = new BitSet(new long[]{0x0070000004000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4083 = new BitSet(new long[]{0x000000EE40BC3820L});
    public static final BitSet FOLLOW_19_in_ruleState4104 = new BitSet(new long[]{0x0070000004000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4138 = new BitSet(new long[]{0x000000EE40BC3820L});
    public static final BitSet FOLLOW_20_in_ruleState4159 = new BitSet(new long[]{0x0070000004000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4193 = new BitSet(new long[]{0x000000EE40BC3820L});
    public static final BitSet FOLLOW_21_in_ruleState4214 = new BitSet(new long[]{0x0070000004000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4248 = new BitSet(new long[]{0x000000EE40BC3820L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState4293 = new BitSet(new long[]{0x000000EE40BC3820L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4338 = new BitSet(new long[]{0x000000EE40FC3820L});
    public static final BitSet FOLLOW_22_in_ruleState4352 = new BitSet(new long[]{0x000000EE40003820L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4386 = new BitSet(new long[]{0x000000EE40FC3820L});
    public static final BitSet FOLLOW_23_in_ruleState4404 = new BitSet(new long[]{0x0070000000000022L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState4440 = new BitSet(new long[]{0x0070000000000022L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRenaming4537 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRenaming4554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRenaming4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_entryRuleFullStateID4618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullStateID4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID4670 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFullStateID4688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAction4805 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction4842 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAction4859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAction4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion4952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion5021 = new BitSet(new long[]{0x000000EE40003822L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion5065 = new BitSet(new long[]{0x000000EE40003822L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion5109 = new BitSet(new long[]{0x000000EE40003822L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition5147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition5209 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition5247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition5278 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition5291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition5313 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleTransition5344 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTransition5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable5404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVariable5448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable5470 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleVariable5489 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVariable5544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable5566 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariable5583 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal5656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignal5713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34_in_ruleSignal5753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_ruleSignal5793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5829 = new BitSet(new long[]{0x0000001180000002L});
    public static final BitSet FOLLOW_31_in_ruleSignal5848 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSignal5903 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5937 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSignal5950 = new BitSet(new long[]{0x00003F0000000010L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal6043 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignal6065 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSignal6082 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal6137 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignal6159 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSignal6176 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal6210 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSignal6223 = new BitSet(new long[]{0x00003F0000000010L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStateType6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStateType6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStateType6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStateType6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCombineOperator6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCombineOperator6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCombineOperator6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTransitionType6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTransitionType6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTransitionType6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred1138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred1172 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred1220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred1233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred2301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred2335 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred2383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred3426 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred3460 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred3508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred4580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred4614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred4637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred5705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred5739 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred6821 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred6855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred81023 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred81057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred91100 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred91134 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred91182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred91195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred91229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred101263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred101297 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred101345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred101358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred111388 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred111422 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred111470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred111508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred121542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred121576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred121599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred121633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred131667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred131701 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred131749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred141783 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred141817 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred141840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred161985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred162019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred172061 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred172108 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred172121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred172155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred182188 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred182235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred182248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred192277 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred192324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred192362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred202395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred202417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred202451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred212484 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred212531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred222564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred222586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred232615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred232662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred242694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred252735 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred252782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred252795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred252829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred262862 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred262909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred262922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred272951 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred272998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred273036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred283069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred283091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred283125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred293158 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred293205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred303238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred303260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred303294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred313327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred313374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred323406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred333460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred333473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred333507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred343553 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred343566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred353608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred353646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred363691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred373711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred373745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred383765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred393832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred434016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred444016 = new BitSet(new long[]{0x0070000000000022L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred494293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred514338 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_synpred514352 = new BitSet(new long[]{0x000000EE40003820L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred514386 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred534440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_synpred585021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_synpred595065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred605109 = new BitSet(new long[]{0x0000000000000002L});

}