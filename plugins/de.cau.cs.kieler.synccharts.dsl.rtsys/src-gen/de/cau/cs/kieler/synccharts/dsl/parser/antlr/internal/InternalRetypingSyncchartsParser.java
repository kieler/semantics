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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'['", "','", "']'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'||'", "'}'", "'/'", "'@'", "'region'", "'#'", "';'", "'with '", "' history'", "':= '", "': '", "'local'", "'input'", "'output'", "'combine'", "'with'", "'cond'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'host'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'-->'", "'o->'", "'>->'"
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
            ruleMemo = new HashMap[110+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* ) ;
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

        AntlrDatatypeRuleToken lv_id_4 = null;

        Enumerator lv_type_7 = null;

        Enumerator lv_type_11 = null;

        AntlrDatatypeRuleToken lv_id_12 = null;

        AntlrDatatypeRuleToken lv_id_16 = null;

        Enumerator lv_type_19 = null;

        AntlrDatatypeRuleToken lv_id_25 = null;

        Enumerator lv_type_30 = null;

        AntlrDatatypeRuleToken lv_id_32 = null;

        Enumerator lv_type_35 = null;

        Enumerator lv_type_39 = null;

        AntlrDatatypeRuleToken lv_id_40 = null;

        AntlrDatatypeRuleToken lv_id_44 = null;

        Enumerator lv_type_47 = null;

        AntlrDatatypeRuleToken lv_id_53 = null;

        Enumerator lv_type_57 = null;

        AntlrDatatypeRuleToken lv_id_59 = null;

        Enumerator lv_type_61 = null;

        Enumerator lv_type_64 = null;

        AntlrDatatypeRuleToken lv_id_65 = null;

        AntlrDatatypeRuleToken lv_id_68 = null;

        Enumerator lv_type_70 = null;

        AntlrDatatypeRuleToken lv_id_74 = null;

        Enumerator lv_type_77 = null;

        AntlrDatatypeRuleToken lv_id_79 = null;

        Enumerator lv_type_81 = null;

        Enumerator lv_type_84 = null;

        AntlrDatatypeRuleToken lv_id_85 = null;

        AntlrDatatypeRuleToken lv_id_88 = null;

        Enumerator lv_type_90 = null;

        AntlrDatatypeRuleToken lv_id_93 = null;

        AntlrDatatypeRuleToken lv_id_95 = null;

        Enumerator lv_type_97 = null;

        AntlrDatatypeRuleToken lv_id_99 = null;

        Enumerator lv_type_100 = null;

        Enumerator lv_type_102 = null;

        AntlrDatatypeRuleToken lv_id_103 = null;

        Enumerator lv_type_104 = null;

        AntlrDatatypeRuleToken lv_id_106 = null;

        AntlrDatatypeRuleToken lv_id_108 = null;

        EObject lv_signalRenamings_111 = null;

        EObject lv_signalRenamings_113 = null;

        EObject lv_entryActions_118 = null;

        EObject lv_innerActions_120 = null;

        EObject lv_exitActions_122 = null;

        EObject lv_suspensionTrigger_124 = null;

        EObject lv_signals_125 = null;

        EObject lv_regions_126 = null;

        EObject lv_regions_128 = null;

        EObject lv_outgoingTransitions_130 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )
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

                        if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==26||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=38 && LA1_29<=40)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else if ( (LA1_29==RULE_ID) ) {
                            int LA1_59 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 59, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 29, input);

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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 30, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==13) ) {
                        int LA1_33 = input.LA(4);

                        if ( (LA1_33==RULE_ID) ) {
                            int LA1_61 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred4()) ) {
                                alt1=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 61, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_33==13) ) {
                            int LA1_62 = input.LA(5);

                            if ( (LA1_62==RULE_ID) ) {
                                int LA1_82 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 82, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_62==EOF||LA1_62==RULE_STRING||(LA1_62>=11 && LA1_62<=14)||(LA1_62>=17 && LA1_62<=23)||LA1_62==26||(LA1_62>=33 && LA1_62<=35)||(LA1_62>=38 && LA1_62<=40)||(LA1_62>=52 && LA1_62<=54)) ) {
                                alt1=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 62, input);

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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 33, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_9==38) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 65, input);

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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 66, input);

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
                        case 26:
                        case 33:
                        case 34:
                        case 35:
                        case 38:
                        case 39:
                        case 40:
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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 34, input);

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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 65, input);

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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 66, input);

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
                        case 26:
                        case 33:
                        case 34:
                        case 35:
                        case 38:
                        case 39:
                        case 40:
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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 35, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_9==40) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 65, input);

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
                        case 26:
                        case 33:
                        case 34:
                        case 35:
                        case 38:
                        case 39:
                        case 40:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=5;
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 36, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==RULE_ID) ) {
                        alt1=19;
                    }
                    else if ( (LA1_10==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==26||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=38 && LA1_29<=40)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else if ( (LA1_29==RULE_ID) ) {
                            int LA1_59 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 59, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 29, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA1_11 = input.LA(3);

                    if ( (LA1_11==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==26||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=38 && LA1_29<=40)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else if ( (LA1_29==RULE_ID) ) {
                            int LA1_59 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 59, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 29, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12==13) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==EOF||LA1_29==RULE_STRING||(LA1_29>=11 && LA1_29<=14)||(LA1_29>=17 && LA1_29<=23)||LA1_29==26||(LA1_29>=33 && LA1_29<=35)||(LA1_29>=38 && LA1_29<=40)||(LA1_29>=52 && LA1_29<=54)) ) {
                            alt1=18;
                        }
                        else if ( (LA1_29==RULE_ID) ) {
                            int LA1_59 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 59, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_12==RULE_ID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 12, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 13, input);

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
                case 26:
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
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 1, input);

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

                    if ( (LA1_15==13) ) {
                        int LA1_41 = input.LA(4);

                        if ( (LA1_41==RULE_ID) ) {
                            int LA1_68 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 68, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_41==EOF||LA1_41==RULE_STRING||(LA1_41>=11 && LA1_41<=14)||(LA1_41>=17 && LA1_41<=23)||LA1_41==26||(LA1_41>=33 && LA1_41<=35)||(LA1_41>=38 && LA1_41<=40)||(LA1_41>=52 && LA1_41<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 41, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_15==RULE_ID) ) {
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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 42, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==13) ) {
                        int LA1_44 = input.LA(4);

                        if ( (LA1_44==RULE_ID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 72, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_44==13) ) {
                            int LA1_73 = input.LA(5);

                            if ( (LA1_73==EOF||LA1_73==RULE_STRING||(LA1_73>=11 && LA1_73<=14)||(LA1_73>=17 && LA1_73<=23)||LA1_73==26||(LA1_73>=33 && LA1_73<=35)||(LA1_73>=38 && LA1_73<=40)||(LA1_73>=52 && LA1_73<=54)) ) {
                                alt1=10;
                            }
                            else if ( (LA1_73==RULE_ID) ) {
                                int LA1_89 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 89, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 73, input);

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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 44, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_16==38) ) {
                        switch ( input.LA(4) ) {
                        case 13:
                            {
                            int LA1_76 = input.LA(5);

                            if ( (LA1_76==RULE_ID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 76, input);

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
                        case 26:
                        case 33:
                        case 34:
                        case 35:
                        case 38:
                        case 39:
                        case 40:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=13;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_78 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 78, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 45, input);

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
                        case 26:
                        case 33:
                        case 34:
                        case 35:
                        case 38:
                        case 39:
                        case 40:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=13;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_78 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 78, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                            {
                            int LA1_76 = input.LA(5);

                            if ( (LA1_76==RULE_ID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 76, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 46, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_16==40) ) {
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
                        case 26:
                        case 33:
                        case 34:
                        case 35:
                        case 38:
                        case 39:
                        case 40:
                        case 52:
                        case 53:
                        case 54:
                            {
                            alt1=13;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_78 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 78, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                            {
                            int LA1_76 = input.LA(5);

                            if ( (LA1_76==RULE_ID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 76, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 47, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA1_17 = input.LA(3);

                    if ( (LA1_17==13) ) {
                        int LA1_41 = input.LA(4);

                        if ( (LA1_41==RULE_ID) ) {
                            int LA1_68 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 68, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_41==EOF||LA1_41==RULE_STRING||(LA1_41>=11 && LA1_41<=14)||(LA1_41>=17 && LA1_41<=23)||LA1_41==26||(LA1_41>=33 && LA1_41<=35)||(LA1_41>=38 && LA1_41<=40)||(LA1_41>=52 && LA1_41<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 41, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_17==RULE_ID) ) {
                        alt1=27;
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA1_18 = input.LA(3);

                    if ( (LA1_18==RULE_ID) ) {
                        alt1=27;
                    }
                    else if ( (LA1_18==13) ) {
                        int LA1_41 = input.LA(4);

                        if ( (LA1_41==RULE_ID) ) {
                            int LA1_68 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 68, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_41==EOF||LA1_41==RULE_STRING||(LA1_41>=11 && LA1_41<=14)||(LA1_41>=17 && LA1_41<=23)||LA1_41==26||(LA1_41>=33 && LA1_41<=35)||(LA1_41>=38 && LA1_41<=40)||(LA1_41>=52 && LA1_41<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 41, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==13) ) {
                        int LA1_41 = input.LA(4);

                        if ( (LA1_41==RULE_ID) ) {
                            int LA1_68 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 68, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_41==EOF||LA1_41==RULE_STRING||(LA1_41>=11 && LA1_41<=14)||(LA1_41>=17 && LA1_41<=23)||LA1_41==26||(LA1_41>=33 && LA1_41<=35)||(LA1_41>=38 && LA1_41<=40)||(LA1_41>=52 && LA1_41<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 41, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_19==RULE_ID) ) {
                        alt1=27;
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 19, input);

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
                case 26:
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
                case RULE_ID:
                    {
                    int LA1_21 = input.LA(3);

                    if ( (synpred31()) ) {
                        alt1=31;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 21, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 2, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 22, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_3==13) ) {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==RULE_ID) ) {
                        int LA1_54 = input.LA(4);

                        if ( (synpred33()) ) {
                            alt1=33;
                        }
                        else if ( (synpred34()) ) {
                            alt1=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 54, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_23==EOF||LA1_23==RULE_STRING||(LA1_23>=11 && LA1_23<=14)||(LA1_23>=17 && LA1_23<=23)||LA1_23==26||(LA1_23>=33 && LA1_23<=35)||(LA1_23>=38 && LA1_23<=40)||(LA1_23>=52 && LA1_23<=54)) ) {
                        alt1=34;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 23, input);

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
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA1_26 = input.LA(3);

                    if ( (LA1_26==RULE_ID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 26, input);

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
                case 26:
                case 33:
                case 34:
                case 35:
                case 38:
                case 39:
                case 40:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 28, input);

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
                case 26:
                case 33:
                case 34:
                case 35:
                case 38:
                case 39:
                case 40:
                case 52:
                case 53:
                case 54:
                    {
                    alt1=36;
                    }
                    break;
                case 13:
                    {
                    int LA1_26 = input.LA(3);

                    if ( (LA1_26==RULE_ID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_26 = input.LA(3);

                    if ( (LA1_26==RULE_ID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 26, input);

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
                case 26:
                case 33:
                case 34:
                case 35:
                case 38:
                case 39:
                case 40:
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
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 6, input);

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
                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= ruleFullStateID ) ) | 'state' | (lv_id_108= ruleFullStateID ) )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:1: (lv_id_4= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:158:6: lv_id_4= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState267);
                    lv_id_4=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_4, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:308:2: (lv_id_12= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:311:6: lv_id_12= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState546);
                    lv_id_12=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_12, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:376:1: (lv_id_16= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:379:6: lv_id_16= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState671);
                    lv_id_16=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_16, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:509:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:551:3: (lv_id_25= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:554:6: lv_id_25= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState990);
                    lv_id_25=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_25, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:616:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:683:1: (lv_id_32= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:686:6: lv_id_32= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_8_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1229);
                    lv_id_32=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_32, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:773:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:836:2: (lv_id_40= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:839:6: lv_id_40= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1508);
                    lv_id_40=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_40, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:858:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:1: (lv_id_44= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:907:6: lv_id_44= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1633);
                    lv_id_44=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_44, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1037:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1079:3: (lv_id_53= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1082:6: lv_id_53= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1952);
                    lv_id_53=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_53, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1144:7: (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1190:1: (lv_id_59= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1193:6: lv_id_59= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_16_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2155);
                    lv_id_59=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_59, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1259:7: (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1301:2: (lv_id_65= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1304:6: lv_id_65= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_18_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2362);
                    lv_id_65=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_65, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1323:7: (lv_isInitial_66= 'init' ) 'state' (lv_id_68= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1348:1: (lv_id_68= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1351:6: lv_id_68= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_19_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2451);
                    lv_id_68=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_68, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:6: ( (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1439:7: (lv_isInitial_73= 'init' ) (lv_id_74= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1460:2: (lv_id_74= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1463:6: lv_id_74= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_22_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2662);
                    lv_id_74=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_74, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1504:7: (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1550:1: (lv_id_79= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1553:6: lv_id_79= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_24_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2829);
                    lv_id_79=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_79, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1619:7: (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1661:2: (lv_id_85= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1664:6: lv_id_85= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_26_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3036);
                    lv_id_85=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_85, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1683:7: (lv_isFinal_86= 'final' ) 'state' (lv_id_88= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1708:1: (lv_id_88= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1711:6: lv_id_88= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_27_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3125);
                    lv_id_88=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_88, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1773:7: (lv_isFinal_91= 'final' ) 'state' (lv_id_93= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1798:1: (lv_id_93= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1801:6: lv_id_93= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_29_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3294);
                    lv_id_93=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_93, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:6: ( (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1820:7: (lv_isFinal_94= 'final' ) (lv_id_95= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1841:2: (lv_id_95= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1844:6: lv_id_95= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_30_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3374);
                    lv_id_95=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_95, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:6: ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:7: (lv_type_97= ruleStateType ) 'state' (lv_id_99= ruleFullStateID )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1910:1: (lv_id_99= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1913:6: lv_id_99= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_32_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3507);
                    lv_id_99=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_99, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:6: ( (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:7: (lv_type_102= ruleStateType ) (lv_id_103= ruleFullStateID )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1979:2: (lv_id_103= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: lv_id_103= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_34_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3646);
                    lv_id_103=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_103, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( 'state' (lv_id_106= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:6: ( 'state' (lv_id_106= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2023:7: 'state' (lv_id_106= ruleFullStateID )
                    {
                    match(input,13,FOLLOW_13_in_ruleState3711); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_36_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2027:1: (lv_id_106= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2030:6: lv_id_106= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_36_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3745);
                    lv_id_106=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_106, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2054:6: (lv_id_108= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2054:6: (lv_id_108= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2057:6: lv_id_108= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_38_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3805);
                    lv_id_108=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_108, "FullStateID", currentNode);
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
                int LA5_1 = input.LA(2);

                if ( (synpred42()) ) {
                    alt5=1;
                }
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:3: ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2169:4: '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleState3991); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:1: ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=7;
                        switch ( input.LA(1) ) {
                        case 18:
                            {
                            alt7=1;
                            }
                            break;
                        case 19:
                            {
                            alt7=2;
                            }
                            break;
                        case 20:
                            {
                            alt7=3;
                            }
                            break;
                        case 21:
                            {
                            alt7=4;
                            }
                            break;
                        case 33:
                            {
                            switch ( input.LA(2) ) {
                            case 34:
                                {
                                int LA7_7 = input.LA(3);

                                if ( (LA7_7==35) ) {
                                    int LA7_8 = input.LA(4);

                                    if ( (LA7_8==RULE_ID) ) {
                                        int LA7_11 = input.LA(5);

                                        if ( (synpred47()) ) {
                                            alt7=5;
                                        }
                                        else if ( (synpred49()) ) {
                                            alt7=6;
                                        }


                                    }


                                }
                                else if ( (LA7_7==RULE_ID) ) {
                                    int LA7_11 = input.LA(4);

                                    if ( (synpred47()) ) {
                                        alt7=5;
                                    }
                                    else if ( (synpred49()) ) {
                                        alt7=6;
                                    }


                                }


                                }
                                break;
                            case 35:
                                {
                                int LA7_8 = input.LA(3);

                                if ( (LA7_8==RULE_ID) ) {
                                    int LA7_11 = input.LA(4);

                                    if ( (synpred47()) ) {
                                        alt7=5;
                                    }
                                    else if ( (synpred49()) ) {
                                        alt7=6;
                                    }


                                }


                                }
                                break;
                            case RULE_ID:
                                {
                                int LA7_11 = input.LA(3);

                                if ( (synpred47()) ) {
                                    alt7=5;
                                }
                                else if ( (synpred49()) ) {
                                    alt7=6;
                                }


                                }
                                break;

                            }

                            }
                            break;
                        case 34:
                            {
                            int LA7_7 = input.LA(2);

                            if ( (LA7_7==35) ) {
                                int LA7_8 = input.LA(3);

                                if ( (LA7_8==RULE_ID) ) {
                                    int LA7_11 = input.LA(4);

                                    if ( (synpred47()) ) {
                                        alt7=5;
                                    }
                                    else if ( (synpred49()) ) {
                                        alt7=6;
                                    }


                                }


                            }
                            else if ( (LA7_7==RULE_ID) ) {
                                int LA7_11 = input.LA(3);

                                if ( (synpred47()) ) {
                                    alt7=5;
                                }
                                else if ( (synpred49()) ) {
                                    alt7=6;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA7_8 = input.LA(2);

                            if ( (LA7_8==RULE_ID) ) {
                                int LA7_11 = input.LA(3);

                                if ( (synpred47()) ) {
                                    alt7=5;
                                }
                                else if ( (synpred49()) ) {
                                    alt7=6;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA7_9 = input.LA(2);

                            if ( (synpred47()) ) {
                                alt7=5;
                            }
                            else if ( (synpred49()) ) {
                                alt7=6;
                            }


                            }
                            break;
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 26:
                        case 38:
                        case 39:
                        case 40:
                            {
                            alt7=6;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:2: ( 'onentry' (lv_entryActions_118= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:2: ( 'onentry' (lv_entryActions_118= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:3: 'onentry' (lv_entryActions_118= ruleAction )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleState4002); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_4_1_0_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2177:1: (lv_entryActions_118= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2180:6: lv_entryActions_118= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_4_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4036);
                    	    lv_entryActions_118=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "entryActions", lv_entryActions_118, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2199:6: ( 'oninner' (lv_innerActions_120= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2199:6: ( 'oninner' (lv_innerActions_120= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2199:7: 'oninner' (lv_innerActions_120= ruleAction )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleState4057); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_4_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2203:1: (lv_innerActions_120= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2206:6: lv_innerActions_120= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_4_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4091);
                    	    lv_innerActions_120=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "innerActions", lv_innerActions_120, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2225:6: ( 'onexit' (lv_exitActions_122= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2225:6: ( 'onexit' (lv_exitActions_122= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2225:7: 'onexit' (lv_exitActions_122= ruleAction )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleState4112); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_4_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2229:1: (lv_exitActions_122= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2232:6: lv_exitActions_122= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_4_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4146);
                    	    lv_exitActions_122=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "exitActions", lv_exitActions_122, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2251:6: ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2251:6: ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2251:7: 'suspension' (lv_suspensionTrigger_124= ruleAction )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleState4167); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_4_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2255:1: (lv_suspensionTrigger_124= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2258:6: lv_suspensionTrigger_124= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_4_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4201);
                    	    lv_suspensionTrigger_124=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		set(current, "suspensionTrigger", lv_suspensionTrigger_124, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2277:6: (lv_signals_125= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2277:6: (lv_signals_125= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2280:6: lv_signals_125= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_4_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleState4246);
                    	    lv_signals_125=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "signals", lv_signals_125, "Signal", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:7: ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:7: ( (lv_regions_126= ruleRegion ) '||' )*
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        switch ( input.LA(1) ) {
                    	        case 26:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case RULE_STRING:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case RULE_ID:
                    	                    {
                    	                    int LA6_3 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 33:
                    	                    {
                    	                    switch ( input.LA(4) ) {
                    	                    case 34:
                    	                        {
                    	                        int LA6_5 = input.LA(5);

                    	                        if ( (LA6_5==35) ) {
                    	                            int LA6_6 = input.LA(6);

                    	                            if ( (LA6_6==RULE_ID) ) {
                    	                                int LA6_15 = input.LA(7);

                    	                                if ( (synpred48()) ) {
                    	                                    alt6=1;
                    	                                }


                    	                            }


                    	                        }
                    	                        else if ( (LA6_5==RULE_ID) ) {
                    	                            int LA6_15 = input.LA(6);

                    	                            if ( (synpred48()) ) {
                    	                                alt6=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case 35:
                    	                        {
                    	                        int LA6_6 = input.LA(5);

                    	                        if ( (LA6_6==RULE_ID) ) {
                    	                            int LA6_15 = input.LA(6);

                    	                            if ( (synpred48()) ) {
                    	                                alt6=1;
                    	                            }


                    	                        }


                    	                        }
                    	                        break;
                    	                    case RULE_ID:
                    	                        {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                        }
                    	                        break;

                    	                    }

                    	                    }
                    	                    break;
                    	                case 34:
                    	                    {
                    	                    int LA6_5 = input.LA(4);

                    	                    if ( (LA6_5==35) ) {
                    	                        int LA6_6 = input.LA(5);

                    	                        if ( (LA6_6==RULE_ID) ) {
                    	                            int LA6_15 = input.LA(6);

                    	                            if ( (synpred48()) ) {
                    	                                alt6=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA6_5==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 35:
                    	                    {
                    	                    int LA6_6 = input.LA(4);

                    	                    if ( (LA6_6==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 11:
                    	                    {
                    	                    int LA6_7 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 12:
                    	                    {
                    	                    int LA6_8 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 13:
                    	                    {
                    	                    int LA6_9 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 38:
                    	                    {
                    	                    int LA6_10 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 39:
                    	                    {
                    	                    int LA6_11 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;
                    	                case 40:
                    	                    {
                    	                    int LA6_12 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case RULE_ID:
                    	                {
                    	                int LA6_3 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 33:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 34:
                    	                    {
                    	                    int LA6_5 = input.LA(4);

                    	                    if ( (LA6_5==35) ) {
                    	                        int LA6_6 = input.LA(5);

                    	                        if ( (LA6_6==RULE_ID) ) {
                    	                            int LA6_15 = input.LA(6);

                    	                            if ( (synpred48()) ) {
                    	                                alt6=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA6_5==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 35:
                    	                    {
                    	                    int LA6_6 = input.LA(4);

                    	                    if ( (LA6_6==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case RULE_ID:
                    	                    {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 34:
                    	                {
                    	                int LA6_5 = input.LA(3);

                    	                if ( (LA6_5==35) ) {
                    	                    int LA6_6 = input.LA(4);

                    	                    if ( (LA6_6==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA6_5==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 35:
                    	                {
                    	                int LA6_6 = input.LA(3);

                    	                if ( (LA6_6==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 11:
                    	                {
                    	                int LA6_7 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                int LA6_8 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA6_9 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 38:
                    	                {
                    	                int LA6_10 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 39:
                    	                {
                    	                int LA6_11 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 40:
                    	                {
                    	                int LA6_12 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
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
                    	                int LA6_3 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 33:
                    	                {
                    	                switch ( input.LA(3) ) {
                    	                case 34:
                    	                    {
                    	                    int LA6_5 = input.LA(4);

                    	                    if ( (LA6_5==35) ) {
                    	                        int LA6_6 = input.LA(5);

                    	                        if ( (LA6_6==RULE_ID) ) {
                    	                            int LA6_15 = input.LA(6);

                    	                            if ( (synpred48()) ) {
                    	                                alt6=1;
                    	                            }


                    	                        }


                    	                    }
                    	                    else if ( (LA6_5==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case 35:
                    	                    {
                    	                    int LA6_6 = input.LA(4);

                    	                    if ( (LA6_6==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                    }
                    	                    break;
                    	                case RULE_ID:
                    	                    {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                    }
                    	                    break;

                    	                }

                    	                }
                    	                break;
                    	            case 34:
                    	                {
                    	                int LA6_5 = input.LA(3);

                    	                if ( (LA6_5==35) ) {
                    	                    int LA6_6 = input.LA(4);

                    	                    if ( (LA6_6==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA6_5==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 35:
                    	                {
                    	                int LA6_6 = input.LA(3);

                    	                if ( (LA6_6==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 11:
                    	                {
                    	                int LA6_7 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 12:
                    	                {
                    	                int LA6_8 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 13:
                    	                {
                    	                int LA6_9 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 38:
                    	                {
                    	                int LA6_10 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 39:
                    	                {
                    	                int LA6_11 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;
                    	            case 40:
                    	                {
                    	                int LA6_12 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA6_3 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 33:
                    	            {
                    	            switch ( input.LA(2) ) {
                    	            case 34:
                    	                {
                    	                int LA6_5 = input.LA(3);

                    	                if ( (LA6_5==35) ) {
                    	                    int LA6_6 = input.LA(4);

                    	                    if ( (LA6_6==RULE_ID) ) {
                    	                        int LA6_15 = input.LA(5);

                    	                        if ( (synpred48()) ) {
                    	                            alt6=1;
                    	                        }


                    	                    }


                    	                }
                    	                else if ( (LA6_5==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case 35:
                    	                {
                    	                int LA6_6 = input.LA(3);

                    	                if ( (LA6_6==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	                }
                    	                break;
                    	            case RULE_ID:
                    	                {
                    	                int LA6_15 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	                }
                    	                break;

                    	            }

                    	            }
                    	            break;
                    	        case 34:
                    	            {
                    	            int LA6_5 = input.LA(2);

                    	            if ( (LA6_5==35) ) {
                    	                int LA6_6 = input.LA(3);

                    	                if ( (LA6_6==RULE_ID) ) {
                    	                    int LA6_15 = input.LA(4);

                    	                    if ( (synpred48()) ) {
                    	                        alt6=1;
                    	                    }


                    	                }


                    	            }
                    	            else if ( (LA6_5==RULE_ID) ) {
                    	                int LA6_15 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	            }


                    	            }
                    	            break;
                    	        case 35:
                    	            {
                    	            int LA6_6 = input.LA(2);

                    	            if ( (LA6_6==RULE_ID) ) {
                    	                int LA6_15 = input.LA(3);

                    	                if ( (synpred48()) ) {
                    	                    alt6=1;
                    	                }


                    	            }


                    	            }
                    	            break;
                    	        case 11:
                    	            {
                    	            int LA6_7 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 12:
                    	            {
                    	            int LA6_8 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 13:
                    	            {
                    	            int LA6_9 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 38:
                    	            {
                    	            int LA6_10 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 39:
                    	            {
                    	            int LA6_11 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 40:
                    	            {
                    	            int LA6_12 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: (lv_regions_126= ruleRegion ) '||'
                    	    	    {
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: (lv_regions_126= ruleRegion )
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2302:6: lv_regions_126= ruleRegion
                    	    	    {
                    	    	    if ( backtracking==0 ) {
                    	    	       
                    	    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_0_0_0(), currentNode); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4292);
                    	    	    lv_regions_126=ruleRegion();
                    	    	    _fsp--;
                    	    	    if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	      	        }
                    	    	      	        
                    	    	      	        try {
                    	    	      	       		add(current, "regions", lv_regions_126, "Region", currentNode);
                    	    	      	        } catch (ValueConverterException vce) {
                    	    	      				handleValueConverterException(vce);
                    	    	      	        }
                    	    	      	        currentNode = currentNode.getParent();
                    	    	      	    
                    	    	    }

                    	    	    }

                    	    	    match(input,22,FOLLOW_22_in_ruleState4305); if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_4_1_5_0_1(), null); 
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop6;
                    	        }
                    	    } while (true);

                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2324:3: (lv_regions_128= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2327:6: lv_regions_128= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4341);
                    	    lv_regions_128=ruleRegion();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "regions", lv_regions_128, "Region", currentNode);
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
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleState4357); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2349:3: (lv_outgoingTransitions_130= ruleTransition )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred51()) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>=52 && LA9_0<=54)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2352:6: lv_outgoingTransitions_130= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState4393);
            	    lv_outgoingTransitions_130=ruleTransition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "outgoingTransitions", lv_outgoingTransitions_130, "Transition", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2377:1: entryRuleRenaming returns [EObject current=null] : iv_ruleRenaming= ruleRenaming EOF ;
    public final EObject entryRuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenaming = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2377:50: (iv_ruleRenaming= ruleRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2378:2: iv_ruleRenaming= ruleRenaming EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRenamingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming4431);
            iv_ruleRenaming=ruleRenaming();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRenaming; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming4441); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2385:1: ruleRenaming returns [EObject current=null] : ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) ) ;
    public final EObject ruleRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_oldObject_0=null;
        Token lv_newID_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2390:6: ( ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2391:1: ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2391:1: ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2391:2: (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2391:2: (lv_oldObject_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2393:6: lv_oldObject_0= RULE_STRING
            {
            lv_oldObject_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRenaming4488); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleRenaming4505); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRenamingAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2415:1: (lv_newID_2= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2417:6: lv_newID_2= RULE_STRING
            {
            lv_newID_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRenaming4527); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2442:1: entryRuleFullStateID returns [String current=null] : iv_ruleFullStateID= ruleFullStateID EOF ;
    public final String entryRuleFullStateID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullStateID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2442:52: (iv_ruleFullStateID= ruleFullStateID EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2443:2: iv_ruleFullStateID= ruleFullStateID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullStateIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullStateID_in_entryRuleFullStateID4569);
            iv_ruleFullStateID=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullStateID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullStateID4580); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2450:1: ruleFullStateID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFullStateID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2456:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2457:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2457:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2457:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2457:2: (this_ID_0= RULE_ID kw= '@' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==25) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2457:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID4621); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleFullStateID4639); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFullStateIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID4656); if (failed) return current;
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


    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2485:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2485:48: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2486:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion4699);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion4709); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2493:1: ruleRegion returns [EObject current=null] : ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_1=null;
        EObject lv_variables_2 = null;

        EObject lv_signals_3 = null;

        EObject lv_innerStates_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2498:6: ( ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2499:1: ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2499:1: ( ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2499:2: ( 'region' )? (lv_id_1= RULE_STRING )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2499:2: ( 'region' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2499:3: 'region'
                    {
                    match(input,26,FOLLOW_26_in_ruleRegion4744); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2503:3: (lv_id_1= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2505:6: lv_id_1= RULE_STRING
                    {
                    lv_id_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegion4768); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:3: ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt13=1;
                    }
                    else if ( (synpred56()) ) {
                        alt13=2;
                    }
                    else if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 11:
                    {
                    int LA13_6 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA13_7 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 13:
                    {
                    int LA13_8 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA13_9 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA13_10 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA13_11 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt13=3;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:4: (lv_variables_2= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:4: (lv_variables_2= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2526:6: lv_variables_2= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_2_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion4812);
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2545:6: (lv_signals_3= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2545:6: (lv_signals_3= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2548:6: lv_signals_3= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion4856);
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2567:6: (lv_innerStates_4= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2567:6: (lv_innerStates_4= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2570:6: lv_innerStates_4= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_2_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion4900);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2595:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2595:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2596:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4939);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4949); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2603:1: ruleAction returns [EObject current=null] : ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        Token lv_triggersAndEffects_3=null;
        EObject this_Transition_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2608:6: ( ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2609:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2609:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==RULE_INT||LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=52 && LA16_0<=54)) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2609:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2609:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2609:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2609:3: (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2609:3: (lv_isImmediate_0= '#' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2611:6: lv_isImmediate_0= '#'
                            {
                            lv_isImmediate_0=(Token)input.LT(1);
                            match(input,27,FOLLOW_27_in_ruleAction4996); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2630:3: ( (lv_delay_1= RULE_INT ) ';' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2630:4: (lv_delay_1= RULE_INT ) ';'
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2630:4: (lv_delay_1= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2632:6: lv_delay_1= RULE_INT
                            {
                            lv_delay_1=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction5033); if (failed) return current;
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

                            match(input,28,FOLLOW_28_in_ruleAction5050); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_0_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2654:3: (lv_triggersAndEffects_3= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2656:6: lv_triggersAndEffects_3= RULE_STRING
                    {
                    lv_triggersAndEffects_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction5074); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2676:5: this_Transition_4= ruleTransition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getActionAccess().getTransitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleAction5111);
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


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2691:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2691:52: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2692:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition5143);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition5153); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2699:1: ruleTransition returns [EObject current=null] : ( (lv_sourceState_0= RULE_ID )? (lv_type_1= ruleTransitionType ) (lv_priority_2= RULE_INT ) (lv_targetState_3= RULE_ID ) ( 'with ' (lv_triggersAndEffects_5= RULE_STRING ) )? (lv_isHistory_6= ' history' )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_sourceState_0=null;
        Token lv_priority_2=null;
        Token lv_targetState_3=null;
        Token lv_triggersAndEffects_5=null;
        Token lv_isHistory_6=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2704:6: ( ( (lv_sourceState_0= RULE_ID )? (lv_type_1= ruleTransitionType ) (lv_priority_2= RULE_INT ) (lv_targetState_3= RULE_ID ) ( 'with ' (lv_triggersAndEffects_5= RULE_STRING ) )? (lv_isHistory_6= ' history' )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2705:1: ( (lv_sourceState_0= RULE_ID )? (lv_type_1= ruleTransitionType ) (lv_priority_2= RULE_INT ) (lv_targetState_3= RULE_ID ) ( 'with ' (lv_triggersAndEffects_5= RULE_STRING ) )? (lv_isHistory_6= ' history' )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2705:1: ( (lv_sourceState_0= RULE_ID )? (lv_type_1= ruleTransitionType ) (lv_priority_2= RULE_INT ) (lv_targetState_3= RULE_ID ) ( 'with ' (lv_triggersAndEffects_5= RULE_STRING ) )? (lv_isHistory_6= ' history' )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2705:2: (lv_sourceState_0= RULE_ID )? (lv_type_1= ruleTransitionType ) (lv_priority_2= RULE_INT ) (lv_targetState_3= RULE_ID ) ( 'with ' (lv_triggersAndEffects_5= RULE_STRING ) )? (lv_isHistory_6= ' history' )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2705:2: (lv_sourceState_0= RULE_ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2707:6: lv_sourceState_0= RULE_ID
                    {
                    lv_sourceState_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition5200); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_0_0(), "sourceState"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sourceState", lv_sourceState_0, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2725:3: (lv_type_1= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2728:6: lv_type_1= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition5243);
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2746:2: (lv_priority_2= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2748:6: lv_priority_2= RULE_INT
            {
            lv_priority_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition5269); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTransitionAccess().getPriorityINTTerminalRuleCall_2_0(), "priority"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "priority", lv_priority_2, "INT", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2766:2: (lv_targetState_3= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2768:6: lv_targetState_3= RULE_ID
            {
            lv_targetState_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition5299); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_3_0(), "targetState"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "targetState", lv_targetState_3, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2786:2: ( 'with ' (lv_triggersAndEffects_5= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2786:3: 'with ' (lv_triggersAndEffects_5= RULE_STRING )
                    {
                    match(input,29,FOLLOW_29_in_ruleTransition5317); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2790:1: (lv_triggersAndEffects_5= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2792:6: lv_triggersAndEffects_5= RULE_STRING
                    {
                    lv_triggersAndEffects_5=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition5339); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getTriggersAndEffectsSTRINGTerminalRuleCall_4_1_0(), "triggersAndEffects"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "triggersAndEffects", lv_triggersAndEffects_5, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2810:4: (lv_isHistory_6= ' history' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2812:6: lv_isHistory_6= ' history'
                    {
                    lv_isHistory_6=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleTransition5370); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_5_0(), "isHistory"); 
                          
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

            match(input,28,FOLLOW_28_in_ruleTransition5393); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_6(), null); 
                  
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2844:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2844:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2845:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable5428);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable5438); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2852:1: ruleVariable returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_initialValue_2=null;
        Token lv_hostType_5=null;
        Enumerator lv_type_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2857:6: ( ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:1: ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:1: ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:2: (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2858:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2860:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable5485); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2878:2: ( ':= ' (lv_initialValue_2= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2878:3: ':= ' (lv_initialValue_2= RULE_INT )
                    {
                    match(input,31,FOLLOW_31_in_ruleVariable5503); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignSpaceKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2882:1: (lv_initialValue_2= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2884:6: lv_initialValue_2= RULE_INT
                    {
                    lv_initialValue_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable5525); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2902:4: ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2902:5: ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleVariable5545); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2906:1: ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=46 && LA21_0<=51)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_STRING) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2906:1: ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2906:2: (lv_type_4= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2906:2: (lv_type_4= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2909:6: lv_type_4= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleVariable5580);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2928:6: (lv_hostType_5= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2928:6: (lv_hostType_5= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2930:6: lv_hostType_5= RULE_STRING
                            {
                            lv_hostType_5=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable5612); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2955:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2955:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2956:2: iv_ruleSignal= ruleSignal EOF
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2963:1: ruleSignal returns [EObject current=null] : ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? ) ;
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
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2968:6: ( ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2969:1: ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2969:1: ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2969:2: (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2969:2: (lv_isLocal_0= 'local' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2971:6: lv_isLocal_0= 'local'
                    {
                    lv_isLocal_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSignal5712); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsLocalLocalKeyword_0_0(), "isLocal"); 
                          
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
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2990:3: (lv_isInput_1= 'input' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2992:6: lv_isInput_1= 'input'
                    {
                    lv_isInput_1=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSignal5747); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_1_0(), "isInput"); 
                          
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
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3011:3: (lv_isOutput_2= 'output' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3013:6: lv_isOutput_2= 'output'
                    {
                    lv_isOutput_2=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleSignal5782); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_2_0(), "isOutput"); 
                          
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
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3032:3: (lv_name_3= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3034:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5818); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              	
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3052:2: ( ':= ' (lv_initialValue_5= RULE_INT ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3052:3: ':= ' (lv_initialValue_5= RULE_INT )
                    {
                    match(input,31,FOLLOW_31_in_ruleSignal5836); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignSpaceKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3056:1: (lv_initialValue_5= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3058:6: lv_initialValue_5= RULE_INT
                    {
                    lv_initialValue_5=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignal5858); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueINTTerminalRuleCall_4_1_0(), "initialValue"); 
                      	
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3076:4: ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==36) ) {
                    alt30=2;
                }
                else if ( (LA30_1==RULE_STRING||(LA30_1>=46 && LA30_1<=51)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3076:5: ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3076:5: ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3076:6: ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal5879); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_5_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3080:1: ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=46 && LA27_0<=51)) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==RULE_STRING) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3080:1: ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3080:2: (lv_type_7= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3080:2: (lv_type_7= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3083:6: lv_type_7= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal5914);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3102:6: (lv_hostType_8= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3102:6: (lv_hostType_8= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3104:6: lv_hostType_8= RULE_STRING
                            {
                            lv_hostType_8=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5946); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_0_1_1_0(), "hostType"); 
                              	
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3123:6: ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3123:6: ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3123:7: ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal5972); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_5_1_0(), null); 
                          
                    }
                    match(input,36,FOLLOW_36_in_ruleSignal5981); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_5_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3131:1: ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=46 && LA28_0<=51)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_STRING) ) {
                        alt28=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3131:1: ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) )", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3131:2: (lv_type_11= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3131:2: (lv_type_11= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3134:6: lv_type_11= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal6016);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3153:6: (lv_hostType_12= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3153:6: (lv_hostType_12= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3155:6: lv_hostType_12= RULE_STRING
                            {
                            lv_hostType_12=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal6048); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_1_2_1_0(), "hostType"); 
                              	
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

                    match(input,37,FOLLOW_37_in_ruleSignal6066); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_5_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3177:1: ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=41 && LA29_0<=46)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==RULE_STRING) ) {
                        alt29=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3177:1: ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3177:2: (lv_combineOperator_14= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3177:2: (lv_combineOperator_14= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3180:6: lv_combineOperator_14= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_5_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal6101);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3199:6: (lv_hostCombineOperator_15= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3199:6: (lv_hostCombineOperator_15= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3201:6: lv_hostCombineOperator_15= RULE_STRING
                            {
                            lv_hostCombineOperator_15=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal6133); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_5_1_4_1_0(), "hostCombineOperator"); 
                              	
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3228:1: ruleStateType returns [Enumerator current=null] : ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3232:6: ( ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3233:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3233:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt31=1;
                }
                break;
            case 38:
                {
                alt31=2;
                }
                break;
            case 39:
                {
                alt31=3;
                }
                break;
            case 40:
                {
                alt31=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3233:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3233:2: ( 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3233:2: ( 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3233:4: 'state'
                    {
                    match(input,13,FOLLOW_13_in_ruleStateType6194); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3239:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3239:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3239:8: 'cond'
                    {
                    match(input,38,FOLLOW_38_in_ruleStateType6209); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3245:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3245:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3245:8: 'ref'
                    {
                    match(input,39,FOLLOW_39_in_ruleStateType6224); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3251:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3251:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3251:8: 'textual'
                    {
                    match(input,40,FOLLOW_40_in_ruleStateType6239); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3261:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3265:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3266:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3266:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt32=1;
                }
                break;
            case 42:
                {
                alt32=2;
                }
                break;
            case 43:
                {
                alt32=3;
                }
                break;
            case 44:
                {
                alt32=4;
                }
                break;
            case 45:
                {
                alt32=5;
                }
                break;
            case 46:
                {
                alt32=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3266:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3266:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3266:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3266:4: 'NONE'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator6282); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3272:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3272:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3272:8: '+'
                    {
                    match(input,42,FOLLOW_42_in_ruleCombineOperator6297); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3278:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3278:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3278:8: '*'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator6312); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3284:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3284:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3284:8: 'AND'
                    {
                    match(input,44,FOLLOW_44_in_ruleCombineOperator6327); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3290:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3290:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3290:8: 'OR'
                    {
                    match(input,45,FOLLOW_45_in_ruleCombineOperator6342); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3296:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3296:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3296:8: 'host'
                    {
                    match(input,46,FOLLOW_46_in_ruleCombineOperator6357); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3306:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3310:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3311:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3311:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt33=1;
                }
                break;
            case 48:
                {
                alt33=2;
                }
                break;
            case 49:
                {
                alt33=3;
                }
                break;
            case 50:
                {
                alt33=4;
                }
                break;
            case 51:
                {
                alt33=5;
                }
                break;
            case 46:
                {
                alt33=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3311:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3311:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3311:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3311:4: 'PURE'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType6400); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3317:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3317:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3317:8: 'boolean'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType6415); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3323:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3323:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3323:8: 'unsigned'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType6430); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3329:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3329:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3329:8: 'integer'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType6445); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3335:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3335:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3335:8: 'float'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType6460); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3341:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3341:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3341:8: 'host'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType6475); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3351:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3355:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3356:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3356:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt34=1;
                }
                break;
            case 53:
                {
                alt34=2;
                }
                break;
            case 54:
                {
                alt34=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3356:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3356:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3356:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3356:4: '-->'
                    {
                    match(input,52,FOLLOW_52_in_ruleTransitionType6518); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3362:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3362:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3362:8: 'o->'
                    {
                    match(input,53,FOLLOW_53_in_ruleTransitionType6533); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3368:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3368:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3368:8: '>->'
                    {
                    match(input,54,FOLLOW_54_in_ruleTransitionType6548); if (failed) return current;
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_0_3_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_2_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_3_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_8_3_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_10_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_11_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_16_3_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_18_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_19_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_22_1_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_24_3_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_26_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_27_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_29_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_30_1_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_32_2_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_34_1_0(), currentNode); 
          	    
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
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_0_36_1_0(), currentNode); 
          	    
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

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2151:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2151:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred423972); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2277:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2277:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2277:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2280:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred474246);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: ( ( ruleRegion ) '||' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: ( ruleRegion ) '||'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2302:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred484292);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }

        match(input,22,FOLLOW_22_in_synpred484305); if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ( ( ( ruleRegion ) '||' )* ( ruleRegion ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ( ( ruleRegion ) '||' )* ( ruleRegion ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:6: ( ( ( ruleRegion ) '||' )* ( ruleRegion ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:7: ( ( ruleRegion ) '||' )* ( ruleRegion )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:7: ( ( ruleRegion ) '||' )*
        loop36:
        do {
            int alt36=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA36_1 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case RULE_STRING:
                {
                int LA36_2 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case RULE_ID:
                {
                int LA36_3 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 33:
                {
                int LA36_4 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 34:
                {
                int LA36_5 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 35:
                {
                int LA36_6 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 11:
                {
                int LA36_7 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 12:
                {
                int LA36_8 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 13:
                {
                int LA36_9 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 38:
                {
                int LA36_10 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 39:
                {
                int LA36_11 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;
            case 40:
                {
                int LA36_12 = input.LA(2);

                if ( (synpred48()) ) {
                    alt36=1;
                }


                }
                break;

            }

            switch (alt36) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: ( ruleRegion ) '||'
        	    {
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2299:8: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2302:6: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_0_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleRegion_in_synpred494292);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }

        	    match(input,22,FOLLOW_22_in_synpred494305); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop36;
            }
        } while (true);

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2324:3: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2327:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred494341);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2352:6: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2352:6: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred514393);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:4: ( ( ruleVariable ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:4: ( ruleVariable )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2523:4: ( ruleVariable )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2526:6: ruleVariable
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_in_synpred554812);
        ruleVariable();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2545:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2545:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2545:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2548:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred564856);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2567:6: ( ( ruleState ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2567:6: ( ruleState )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2567:6: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2570:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred574900);
        ruleState();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred57

    public final boolean synpred48() {
        backtracking++;
        int start = input.mark();
        try {
            synpred48_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
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
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
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
    public final boolean synpred57() {
        backtracking++;
        int start = input.mark();
        try {
            synpred57_fragment(); // can never throw exception
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
    public final boolean synpred56() {
        backtracking++;
        int start = input.mark();
        try {
            synpred56_fragment(); // can never throw exception
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
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_12_in_ruleState172 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState267 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState335 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState396 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState426 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState460 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState546 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState671 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState739 = new BitSet(new long[]{0x000001C000002000L});
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
    public static final BitSet FOLLOW_11_in_ruleState1134 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1229 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1297 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1358 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1388 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1422 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1508 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1633 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1701 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1749 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1783 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1817 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1840 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1870 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1952 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState1985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState2019 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2061 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2108 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2155 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2188 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2248 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2277 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2362 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2451 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2484 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2531 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2586 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2662 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_11_in_ruleState2694 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState2735 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2829 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState2862 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState2922 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState2951 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3036 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState3091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3125 = new BitSet(new long[]{0x0070000000024032L});
    public static final BitSet FOLLOW_12_in_ruleState3158 = new BitSet(new long[]{0x000001C000002000L});
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
    public static final BitSet FOLLOW_17_in_ruleState3991 = new BitSet(new long[]{0x000001CE043C3830L});
    public static final BitSet FOLLOW_18_in_ruleState4002 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4036 = new BitSet(new long[]{0x000001CE04BC3830L});
    public static final BitSet FOLLOW_19_in_ruleState4057 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4091 = new BitSet(new long[]{0x000001CE04BC3830L});
    public static final BitSet FOLLOW_20_in_ruleState4112 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4146 = new BitSet(new long[]{0x000001CE04BC3830L});
    public static final BitSet FOLLOW_21_in_ruleState4167 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4201 = new BitSet(new long[]{0x000001CE04BC3830L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState4246 = new BitSet(new long[]{0x000001CE04BC3830L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4292 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleState4305 = new BitSet(new long[]{0x000001CE04003830L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4341 = new BitSet(new long[]{0x000001CE04BC3830L});
    public static final BitSet FOLLOW_23_in_ruleState4357 = new BitSet(new long[]{0x0070000000000022L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState4393 = new BitSet(new long[]{0x0070000000000022L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming4431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRenaming4488 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRenaming4505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRenaming4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_entryRuleFullStateID4569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullStateID4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID4621 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFullStateID4639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion4699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRegion4744 = new BitSet(new long[]{0x000001CE00003830L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion4768 = new BitSet(new long[]{0x000001CE00003820L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion4812 = new BitSet(new long[]{0x000001CE00003822L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion4856 = new BitSet(new long[]{0x000001CE00003822L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion4900 = new BitSet(new long[]{0x000001CE00003822L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAction4996 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction5033 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAction5050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAction5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition5143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition5200 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition5243 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition5269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition5299 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_29_in_ruleTransition5317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition5339 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_ruleTransition5370 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable5428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable5485 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleVariable5503 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable5525 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariable5545 = new BitSet(new long[]{0x000FC00000000010L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal5656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignal5712 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_34_in_ruleSignal5747 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_35_in_ruleSignal5782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5818 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleSignal5836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignal5858 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal5879 = new BitSet(new long[]{0x000FC00000000010L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal5972 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSignal5981 = new BitSet(new long[]{0x000FC00000000010L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal6016 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal6048 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSignal6066 = new BitSet(new long[]{0x00007E0000000010L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStateType6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStateType6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStateType6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStateType6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCombineOperator6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCombineOperator6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCombineOperator6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTransitionType6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTransitionType6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTransitionType6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred1138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred1172 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred1220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred1233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred2301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred2335 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred2383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred3426 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred3460 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred3508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred4580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred4614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred4637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred5705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred5739 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred6821 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred6855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred81023 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred81057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred91100 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred91134 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred91182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred91195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred91229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred101263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred101297 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred101345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred101358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred111388 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred111422 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred111470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred111508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred121542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred121576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred121599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred121633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred131667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred131701 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred131749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred141783 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred141817 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred141840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred161985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred162019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred172061 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred172108 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred172121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred172155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred182188 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred182235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred182248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred192277 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred192324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred192362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred202395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred202417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred202451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred212484 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred212531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred222564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred222586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred232615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred232662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred242694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred252735 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred252782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred252795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred252829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred262862 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred262909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred262922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred272951 = new BitSet(new long[]{0x000001C000002000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred272998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred273036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred283069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred283091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred283125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred293158 = new BitSet(new long[]{0x000001C000002000L});
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
    public static final BitSet FOLLOW_RULE_STRING_in_synpred423972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred474246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred484292 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_synpred484305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred494292 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_synpred494305 = new BitSet(new long[]{0x000001CE04003830L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred494341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred514393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_synpred554812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred564856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_synpred574900 = new BitSet(new long[]{0x0000000000000002L});

}