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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FULLSTATEID", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'['", "','", "']'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'||'", "'}'", "'/'", "'region'", "'#'", "';'", "'with '", "' history'", "':= '", "': '", "'local'", "'input'", "'output'", "'combine'", "'with'", "'cond'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'host'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'-->'", "'o->'", "'>->'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=5;
    public static final int RULE_FULLSTATEID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isFinal_1=null;
        Token lv_id_4=null;
        Token lv_isInitial_5=null;
        Token lv_isFinal_6=null;
        Token lv_isInitial_9=null;
        Token lv_isFinal_10=null;
        Token lv_id_12=null;
        Token lv_isInitial_13=null;
        Token lv_isFinal_14=null;
        Token lv_id_16=null;
        Token lv_isInitial_17=null;
        Token lv_isFinal_18=null;
        Token lv_isInitial_20=null;
        Token lv_isFinal_21=null;
        Token lv_isInitial_23=null;
        Token lv_isFinal_24=null;
        Token lv_id_25=null;
        Token lv_isInitial_26=null;
        Token lv_isFinal_27=null;
        Token lv_isFinal_28=null;
        Token lv_isInitial_29=null;
        Token lv_id_32=null;
        Token lv_isFinal_33=null;
        Token lv_isInitial_34=null;
        Token lv_isFinal_37=null;
        Token lv_isInitial_38=null;
        Token lv_id_40=null;
        Token lv_isFinal_41=null;
        Token lv_isInitial_42=null;
        Token lv_id_44=null;
        Token lv_isFinal_45=null;
        Token lv_isInitial_46=null;
        Token lv_isFinal_48=null;
        Token lv_isInitial_49=null;
        Token lv_isFinal_51=null;
        Token lv_isInitial_52=null;
        Token lv_id_53=null;
        Token lv_isFinal_54=null;
        Token lv_isInitial_55=null;
        Token lv_isInitial_56=null;
        Token lv_id_59=null;
        Token lv_isInitial_60=null;
        Token lv_isInitial_63=null;
        Token lv_id_65=null;
        Token lv_isInitial_66=null;
        Token lv_id_68=null;
        Token lv_isInitial_69=null;
        Token lv_isInitial_71=null;
        Token lv_isInitial_73=null;
        Token lv_id_74=null;
        Token lv_isInitial_75=null;
        Token lv_isFinal_76=null;
        Token lv_id_79=null;
        Token lv_isFinal_80=null;
        Token lv_isFinal_83=null;
        Token lv_id_85=null;
        Token lv_isFinal_86=null;
        Token lv_id_88=null;
        Token lv_isFinal_89=null;
        Token lv_isFinal_91=null;
        Token lv_id_93=null;
        Token lv_isFinal_94=null;
        Token lv_id_95=null;
        Token lv_isFinal_96=null;
        Token lv_id_99=null;
        Token lv_id_103=null;
        Token lv_id_106=null;
        Token lv_id_108=null;
        Token lv_label_109=null;
        Token lv_bodyText_115=null;
        Enumerator lv_type_2 = null;

        Enumerator lv_type_7 = null;

        Enumerator lv_type_11 = null;

        Enumerator lv_type_19 = null;

        Enumerator lv_type_30 = null;

        Enumerator lv_type_35 = null;

        Enumerator lv_type_39 = null;

        Enumerator lv_type_47 = null;

        Enumerator lv_type_57 = null;

        Enumerator lv_type_61 = null;

        Enumerator lv_type_64 = null;

        Enumerator lv_type_70 = null;

        Enumerator lv_type_77 = null;

        Enumerator lv_type_81 = null;

        Enumerator lv_type_84 = null;

        Enumerator lv_type_90 = null;

        Enumerator lv_type_97 = null;

        Enumerator lv_type_100 = null;

        Enumerator lv_type_102 = null;

        Enumerator lv_type_104 = null;

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
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) ) (lv_label_109= RULE_STRING )? ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )? (lv_bodyText_115= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )? (lv_outgoingTransitions_130= ruleTransition )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )
            int alt1=39;
            switch ( input.LA(1) ) {
            case 12:
                {
                switch ( input.LA(2) ) {
                case RULE_FULLSTATEID:
                    {
                    int LA1_8 = input.LA(3);

                    if ( (synpred23()) ) {
                        alt1=23;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==14) ) {
                        int LA1_30 = input.LA(4);

                        if ( (LA1_30==RULE_FULLSTATEID) ) {
                            int LA1_57 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred4()) ) {
                                alt1=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 57, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_30==14) ) {
                            int LA1_58 = input.LA(5);

                            if ( (LA1_58==RULE_FULLSTATEID) ) {
                                int LA1_80 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 80, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_58==EOF||LA1_58==RULE_STRING||LA1_58==RULE_ID||(LA1_58>=12 && LA1_58<=15)||(LA1_58>=18 && LA1_58<=24)||LA1_58==26||(LA1_58>=33 && LA1_58<=35)||(LA1_58>=38 && LA1_58<=40)||(LA1_58>=52 && LA1_58<=54)) ) {
                                alt1=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 58, input);

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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 30, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_9==RULE_FULLSTATEID) ) {
                        alt1=7;
                    }
                    else if ( (LA1_9==38) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_61 = input.LA(5);

                            if ( (LA1_61==RULE_FULLSTATEID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 61, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case RULE_ID:
                        case 12:
                        case 13:
                        case 15:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                        case RULE_FULLSTATEID:
                            {
                            int LA1_63 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 63, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 32, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_9==39) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_61 = input.LA(5);

                            if ( (LA1_61==RULE_FULLSTATEID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 61, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case RULE_ID:
                        case 12:
                        case 13:
                        case 15:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                        case RULE_FULLSTATEID:
                            {
                            int LA1_63 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 63, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 33, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_9==40) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_61 = input.LA(5);

                            if ( (LA1_61==RULE_FULLSTATEID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 61, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_FULLSTATEID:
                            {
                            int LA1_63 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 63, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case RULE_ID:
                        case 12:
                        case 13:
                        case 15:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 34, input);

                            throw nvae;
                        }

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==RULE_FULLSTATEID) ) {
                        int LA1_36 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt1=19;
                        }
                        else if ( (synpred20()) ) {
                            alt1=20;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 36, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_10==14) ) {
                        int LA1_37 = input.LA(4);

                        if ( (LA1_37==RULE_FULLSTATEID) ) {
                            int LA1_65 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_37==EOF||LA1_37==RULE_STRING||LA1_37==RULE_ID||(LA1_37>=12 && LA1_37<=15)||(LA1_37>=18 && LA1_37<=24)||LA1_37==26||(LA1_37>=33 && LA1_37<=35)||(LA1_37>=38 && LA1_37<=40)||(LA1_37>=52 && LA1_37<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 37, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA1_11 = input.LA(3);

                    if ( (LA1_11==RULE_FULLSTATEID) ) {
                        alt1=19;
                    }
                    else if ( (LA1_11==14) ) {
                        int LA1_37 = input.LA(4);

                        if ( (LA1_37==RULE_FULLSTATEID) ) {
                            int LA1_65 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_37==EOF||LA1_37==RULE_STRING||LA1_37==RULE_ID||(LA1_37>=12 && LA1_37<=15)||(LA1_37>=18 && LA1_37<=24)||LA1_37==26||(LA1_37>=33 && LA1_37<=35)||(LA1_37>=38 && LA1_37<=40)||(LA1_37>=52 && LA1_37<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 37, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12==RULE_FULLSTATEID) ) {
                        alt1=19;
                    }
                    else if ( (LA1_12==14) ) {
                        int LA1_37 = input.LA(4);

                        if ( (LA1_37==RULE_FULLSTATEID) ) {
                            int LA1_65 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_37==EOF||LA1_37==RULE_STRING||LA1_37==RULE_ID||(LA1_37>=12 && LA1_37<=15)||(LA1_37>=18 && LA1_37<=24)||LA1_37==26||(LA1_37>=33 && LA1_37<=35)||(LA1_37>=38 && LA1_37<=40)||(LA1_37>=52 && LA1_37<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 37, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==14) ) {
                        int LA1_37 = input.LA(4);

                        if ( (LA1_37==RULE_FULLSTATEID) ) {
                            int LA1_65 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_37==EOF||LA1_37==RULE_STRING||LA1_37==RULE_ID||(LA1_37>=12 && LA1_37<=15)||(LA1_37>=18 && LA1_37<=24)||LA1_37==26||(LA1_37>=33 && LA1_37<=35)||(LA1_37>=38 && LA1_37<=40)||(LA1_37>=52 && LA1_37<=54)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 37, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_13==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
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
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    int LA1_15 = input.LA(3);

                    if ( (LA1_15==14) ) {
                        int LA1_41 = input.LA(4);

                        if ( (LA1_41==RULE_FULLSTATEID) ) {
                            int LA1_67 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred12()) ) {
                                alt1=12;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 67, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_41==14) ) {
                            int LA1_68 = input.LA(5);

                            if ( (LA1_68==RULE_FULLSTATEID) ) {
                                int LA1_87 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 87, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_68==EOF||LA1_68==RULE_STRING||LA1_68==RULE_ID||(LA1_68>=12 && LA1_68<=15)||(LA1_68>=18 && LA1_68<=24)||LA1_68==26||(LA1_68>=33 && LA1_68<=35)||(LA1_68>=38 && LA1_68<=40)||(LA1_68>=52 && LA1_68<=54)) ) {
                                alt1=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 68, input);

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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 41, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_15==RULE_FULLSTATEID) ) {
                        alt1=15;
                    }
                    else if ( (LA1_15==38) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_71 = input.LA(5);

                            if ( (LA1_71==RULE_FULLSTATEID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 71, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_FULLSTATEID:
                            {
                            int LA1_72 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 72, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case RULE_ID:
                        case 12:
                        case 13:
                        case 15:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 43, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_15==39) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_71 = input.LA(5);

                            if ( (LA1_71==RULE_FULLSTATEID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 71, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_FULLSTATEID:
                            {
                            int LA1_72 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 72, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case RULE_ID:
                        case 12:
                        case 13:
                        case 15:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 44, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA1_15==40) ) {
                        switch ( input.LA(4) ) {
                        case RULE_FULLSTATEID:
                            {
                            int LA1_72 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 72, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                            {
                            int LA1_71 = input.LA(5);

                            if ( (LA1_71==RULE_FULLSTATEID) ) {
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
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 71, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case RULE_ID:
                        case 12:
                        case 13:
                        case 15:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 45, input);

                            throw nvae;
                        }

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==RULE_FULLSTATEID) ) {
                        int LA1_47 = input.LA(4);

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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 47, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_16==14) ) {
                        int LA1_48 = input.LA(4);

                        if ( (LA1_48==RULE_FULLSTATEID) ) {
                            int LA1_76 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 76, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_48==EOF||LA1_48==RULE_STRING||LA1_48==RULE_ID||(LA1_48>=12 && LA1_48<=15)||(LA1_48>=18 && LA1_48<=24)||LA1_48==26||(LA1_48>=33 && LA1_48<=35)||(LA1_48>=38 && LA1_48<=40)||(LA1_48>=52 && LA1_48<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 48, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_FULLSTATEID:
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA1_18 = input.LA(3);

                    if ( (LA1_18==RULE_FULLSTATEID) ) {
                        alt1=27;
                    }
                    else if ( (LA1_18==14) ) {
                        int LA1_48 = input.LA(4);

                        if ( (LA1_48==RULE_FULLSTATEID) ) {
                            int LA1_76 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 76, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_48==EOF||LA1_48==RULE_STRING||LA1_48==RULE_ID||(LA1_48>=12 && LA1_48<=15)||(LA1_48>=18 && LA1_48<=24)||LA1_48==26||(LA1_48>=33 && LA1_48<=35)||(LA1_48>=38 && LA1_48<=40)||(LA1_48>=52 && LA1_48<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 48, input);

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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==14) ) {
                        int LA1_48 = input.LA(4);

                        if ( (LA1_48==RULE_FULLSTATEID) ) {
                            int LA1_76 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 76, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_48==EOF||LA1_48==RULE_STRING||LA1_48==RULE_ID||(LA1_48>=12 && LA1_48<=15)||(LA1_48>=18 && LA1_48<=24)||LA1_48==26||(LA1_48>=33 && LA1_48<=35)||(LA1_48>=38 && LA1_48<=40)||(LA1_48>=52 && LA1_48<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 48, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_19==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==14) ) {
                        int LA1_48 = input.LA(4);

                        if ( (LA1_48==RULE_FULLSTATEID) ) {
                            int LA1_76 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 76, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_48==EOF||LA1_48==RULE_STRING||LA1_48==RULE_ID||(LA1_48>=12 && LA1_48<=15)||(LA1_48>=18 && LA1_48<=24)||LA1_48==26||(LA1_48>=33 && LA1_48<=35)||(LA1_48>=38 && LA1_48<=40)||(LA1_48>=52 && LA1_48<=54)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 48, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_20==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 13:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
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
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 22, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_3==14) ) {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==RULE_FULLSTATEID) ) {
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
                                new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 54, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_23==EOF||LA1_23==RULE_STRING||LA1_23==RULE_ID||(LA1_23>=12 && LA1_23<=15)||(LA1_23>=18 && LA1_23<=24)||LA1_23==26||(LA1_23>=33 && LA1_23<=35)||(LA1_23>=38 && LA1_23<=40)||(LA1_23>=52 && LA1_23<=54)) ) {
                        alt1=34;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 23, input);

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
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                case 13:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
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
                case RULE_FULLSTATEID:
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                case 13:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
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
                case RULE_FULLSTATEID:
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28==RULE_FULLSTATEID) ) {
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 28, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_FULLSTATEID:
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
                            new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                case 13:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
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
                        new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_FULLSTATEID:
                {
                alt1=39;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("88:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) ) | ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_id_106= RULE_FULLSTATEID ) ) | 'state' | (lv_id_108= RULE_FULLSTATEID ) )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_id_4= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: (lv_isInitial_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: lv_isInitial_0= 'init'
                    {
                    lv_isInitial_0=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState138); if (failed) return current;
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
                    match(input,13,FOLLOW_13_in_ruleState172); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState233); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:1: (lv_id_4= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:157:6: lv_id_4= RULE_FULLSTATEID
                    {
                    lv_id_4=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState255); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_0_3_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_4, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:6: ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:6: ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:7: ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:7: ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:8: (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:8: (lv_isInitial_5= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:178:6: lv_isInitial_5= 'init'
                    {
                    lv_isInitial_5=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState293); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:2: (lv_isFinal_6= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:199:6: lv_isFinal_6= 'final'
                    {
                    lv_isFinal_6=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState327); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:3: (lv_type_7= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:221:6: lv_type_7= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState375);
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

                    match(input,14,FOLLOW_14_in_ruleState388); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_id_12= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:8: (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:8: (lv_isInitial_9= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:246:6: lv_isInitial_9= 'init'
                    {
                    lv_isInitial_9=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState418); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:265:2: (lv_isFinal_10= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:267:6: lv_isFinal_10= 'final'
                    {
                    lv_isFinal_10=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState452); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:286:3: (lv_type_11= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:289:6: lv_type_11= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState500);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:307:2: (lv_id_12= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:309:6: lv_id_12= RULE_FULLSTATEID
                    {
                    lv_id_12=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState526); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_2_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_12, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_id_16= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:8: (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:8: (lv_isInitial_13= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: lv_isInitial_13= 'init'
                    {
                    lv_isInitial_13=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState564); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:349:2: (lv_isFinal_14= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:351:6: lv_isFinal_14= 'final'
                    {
                    lv_isFinal_14=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState598); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState621); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:374:1: (lv_id_16= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:376:6: lv_id_16= RULE_FULLSTATEID
                    {
                    lv_id_16=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState643); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_3_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_16, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:6: ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:6: ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:7: ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:7: ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:8: (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:8: (lv_isInitial_17= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:397:6: lv_isInitial_17= 'init'
                    {
                    lv_isInitial_17=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState681); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:416:2: (lv_isFinal_18= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:418:6: lv_isFinal_18= 'final'
                    {
                    lv_isFinal_18=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState715); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:437:3: (lv_type_19= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:440:6: lv_type_19= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState763);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:6: ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:6: ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:7: ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:7: ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:8: (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:8: (lv_isInitial_20= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:461:6: lv_isInitial_20= 'init'
                    {
                    lv_isInitial_20=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState797); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:480:2: (lv_isFinal_21= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:482:6: lv_isFinal_21= 'final'
                    {
                    lv_isFinal_21=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState831); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState854); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:506:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:506:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:506:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_id_25= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:506:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:506:8: (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:506:8: (lv_isInitial_23= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:508:6: lv_isInitial_23= 'init'
                    {
                    lv_isInitial_23=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState884); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:527:2: (lv_isFinal_24= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:529:6: lv_isFinal_24= 'final'
                    {
                    lv_isFinal_24=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState918); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:548:3: (lv_id_25= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:550:6: lv_id_25= RULE_FULLSTATEID
                    {
                    lv_id_25=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState954); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_6_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_25, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:6: ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:6: ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:7: (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:7: (lv_isInitial_26= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:571:6: lv_isInitial_26= 'init'
                    {
                    lv_isInitial_26=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState991); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:590:2: (lv_isFinal_27= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:592:6: lv_isFinal_27= 'final'
                    {
                    lv_isFinal_27=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1025); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_id_32= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:8: (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:8: (lv_isFinal_28= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:614:6: lv_isFinal_28= 'final'
                    {
                    lv_isFinal_28=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1068); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:633:2: (lv_isInitial_29= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:635:6: lv_isInitial_29= 'init'
                    {
                    lv_isInitial_29=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1102); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:654:3: (lv_type_30= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:657:6: lv_type_30= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1150);
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

                    match(input,14,FOLLOW_14_in_ruleState1163); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_8_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:679:1: (lv_id_32= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:681:6: lv_id_32= RULE_FULLSTATEID
                    {
                    lv_id_32=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState1185); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_8_3_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_32, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:6: ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:6: ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:7: ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:7: ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:8: (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:8: (lv_isFinal_33= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:702:6: lv_isFinal_33= 'final'
                    {
                    lv_isFinal_33=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1223); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:721:2: (lv_isInitial_34= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:723:6: lv_isInitial_34= 'init'
                    {
                    lv_isInitial_34=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1257); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:742:3: (lv_type_35= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:745:6: lv_type_35= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_9_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1305);
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

                    match(input,14,FOLLOW_14_in_ruleState1318); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_9_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_id_40= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:8: (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:8: (lv_isFinal_37= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:770:6: lv_isFinal_37= 'final'
                    {
                    lv_isFinal_37=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1348); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:789:2: (lv_isInitial_38= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:791:6: lv_isInitial_38= 'init'
                    {
                    lv_isInitial_38=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1382); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:810:3: (lv_type_39= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:813:6: lv_type_39= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1430);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:831:2: (lv_id_40= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:833:6: lv_id_40= RULE_FULLSTATEID
                    {
                    lv_id_40=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState1456); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_10_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_40, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_id_44= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:8: (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:8: (lv_isFinal_41= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:854:6: lv_isFinal_41= 'final'
                    {
                    lv_isFinal_41=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1494); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:873:2: (lv_isInitial_42= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:875:6: lv_isInitial_42= 'init'
                    {
                    lv_isInitial_42=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1528); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState1551); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_11_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:898:1: (lv_id_44= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:900:6: lv_id_44= RULE_FULLSTATEID
                    {
                    lv_id_44=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState1573); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_11_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_44, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:6: ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:6: ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:7: ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:7: ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:8: (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:8: (lv_isFinal_45= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:921:6: lv_isFinal_45= 'final'
                    {
                    lv_isFinal_45=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1611); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:940:2: (lv_isInitial_46= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:942:6: lv_isInitial_46= 'init'
                    {
                    lv_isInitial_46=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1645); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:961:3: (lv_type_47= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:964:6: lv_type_47= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1693);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:6: ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:6: ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:7: ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:7: ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:8: (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:8: (lv_isFinal_48= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:6: lv_isFinal_48= 'final'
                    {
                    lv_isFinal_48=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1727); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1004:2: (lv_isInitial_49= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1006:6: lv_isInitial_49= 'init'
                    {
                    lv_isInitial_49=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1761); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState1784); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_13_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1030:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1030:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1030:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_id_53= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1030:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1030:8: (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1030:8: (lv_isFinal_51= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1032:6: lv_isFinal_51= 'final'
                    {
                    lv_isFinal_51=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1814); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1051:2: (lv_isInitial_52= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1053:6: lv_isInitial_52= 'init'
                    {
                    lv_isInitial_52=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1848); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1072:3: (lv_id_53= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1074:6: lv_id_53= RULE_FULLSTATEID
                    {
                    lv_id_53=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState1884); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_14_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_53, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:6: ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:6: ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:7: (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:7: (lv_isFinal_54= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1095:6: lv_isFinal_54= 'final'
                    {
                    lv_isFinal_54=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1921); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1114:2: (lv_isInitial_55= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1116:6: lv_isInitial_55= 'init'
                    {
                    lv_isInitial_55=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1955); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:7: (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_id_59= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:7: (lv_isInitial_56= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1138:6: lv_isInitial_56= 'init'
                    {
                    lv_isInitial_56=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1997); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1157:2: (lv_type_57= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1160:6: lv_type_57= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_16_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2044);
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

                    match(input,14,FOLLOW_14_in_ruleState2057); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_16_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1182:1: (lv_id_59= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1184:6: lv_id_59= RULE_FULLSTATEID
                    {
                    lv_id_59=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState2079); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_16_3_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_59, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:6: ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:6: ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:7: (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:7: (lv_isInitial_60= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1205:6: lv_isInitial_60= 'init'
                    {
                    lv_isInitial_60=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2116); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1224:2: (lv_type_61= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1227:6: lv_type_61= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_17_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2163);
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

                    match(input,14,FOLLOW_14_in_ruleState2176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_17_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:7: (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_id_65= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:7: (lv_isInitial_63= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1252:6: lv_isInitial_63= 'init'
                    {
                    lv_isInitial_63=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2205); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1271:2: (lv_type_64= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1274:6: lv_type_64= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_18_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2252);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1292:2: (lv_id_65= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1294:6: lv_id_65= RULE_FULLSTATEID
                    {
                    lv_id_65=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState2278); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_18_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_65, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:7: (lv_isInitial_66= 'init' ) 'state' (lv_id_68= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:7: (lv_isInitial_66= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1315:6: lv_isInitial_66= 'init'
                    {
                    lv_isInitial_66=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2315); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState2337); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_19_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1338:1: (lv_id_68= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1340:6: lv_id_68= RULE_FULLSTATEID
                    {
                    lv_id_68=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState2359); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_19_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_68, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:6: ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:6: ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:7: (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:7: (lv_isInitial_69= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1361:6: lv_isInitial_69= 'init'
                    {
                    lv_isInitial_69=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2396); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1380:2: (lv_type_70= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1383:6: lv_type_70= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_20_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2443);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:6: ( (lv_isInitial_71= 'init' ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:6: ( (lv_isInitial_71= 'init' ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:7: (lv_isInitial_71= 'init' ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:7: (lv_isInitial_71= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1404:6: lv_isInitial_71= 'init'
                    {
                    lv_isInitial_71=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2476); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState2498); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_21_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:6: ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:6: ( (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:7: (lv_isInitial_73= 'init' ) (lv_id_74= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:7: (lv_isInitial_73= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1430:6: lv_isInitial_73= 'init'
                    {
                    lv_isInitial_73=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2527); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1449:2: (lv_id_74= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1451:6: lv_id_74= RULE_FULLSTATEID
                    {
                    lv_id_74=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState2562); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_22_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_74, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1470:6: (lv_isInitial_75= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1470:6: (lv_isInitial_75= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1472:6: lv_isInitial_75= 'init'
                    {
                    lv_isInitial_75=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2598); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:7: (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_id_79= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:7: (lv_isFinal_76= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1494:6: lv_isFinal_76= 'final'
                    {
                    lv_isFinal_76=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2639); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1513:2: (lv_type_77= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1516:6: lv_type_77= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_24_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2686);
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

                    match(input,14,FOLLOW_14_in_ruleState2699); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_24_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1538:1: (lv_id_79= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1540:6: lv_id_79= RULE_FULLSTATEID
                    {
                    lv_id_79=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState2721); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_24_3_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_79, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:6: ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:6: ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:7: (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:7: (lv_isFinal_80= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1561:6: lv_isFinal_80= 'final'
                    {
                    lv_isFinal_80=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2758); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1580:2: (lv_type_81= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1583:6: lv_type_81= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_25_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2805);
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

                    match(input,14,FOLLOW_14_in_ruleState2818); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_25_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:7: (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_id_85= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:7: (lv_isFinal_83= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1608:6: lv_isFinal_83= 'final'
                    {
                    lv_isFinal_83=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2847); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1627:2: (lv_type_84= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1630:6: lv_type_84= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_26_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2894);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1648:2: (lv_id_85= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1650:6: lv_id_85= RULE_FULLSTATEID
                    {
                    lv_id_85=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState2920); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_26_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_85, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 28 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:7: (lv_isFinal_86= 'final' ) 'state' (lv_id_88= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:7: (lv_isFinal_86= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1671:6: lv_isFinal_86= 'final'
                    {
                    lv_isFinal_86=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2957); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState2979); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_27_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1694:1: (lv_id_88= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1696:6: lv_id_88= RULE_FULLSTATEID
                    {
                    lv_id_88=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3001); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_27_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_88, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 29 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:6: ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:6: ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:7: (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:7: (lv_isFinal_89= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1717:6: lv_isFinal_89= 'final'
                    {
                    lv_isFinal_89=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3038); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1736:2: (lv_type_90= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1739:6: lv_type_90= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_28_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3085);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:7: (lv_isFinal_91= 'final' ) 'state' (lv_id_93= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:7: (lv_isFinal_91= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1760:6: lv_isFinal_91= 'final'
                    {
                    lv_isFinal_91=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3118); if (failed) return current;
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

                    match(input,14,FOLLOW_14_in_ruleState3140); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_29_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:1: (lv_id_93= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1785:6: lv_id_93= RULE_FULLSTATEID
                    {
                    lv_id_93=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3162); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_29_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_93, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 31 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:6: ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:6: ( (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:7: (lv_isFinal_94= 'final' ) (lv_id_95= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:7: (lv_isFinal_94= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1806:6: lv_isFinal_94= 'final'
                    {
                    lv_isFinal_94=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3199); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1825:2: (lv_id_95= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1827:6: lv_id_95= RULE_FULLSTATEID
                    {
                    lv_id_95=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3234); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_30_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_95, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 32 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1846:6: (lv_isFinal_96= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1846:6: (lv_isFinal_96= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1848:6: lv_isFinal_96= 'final'
                    {
                    lv_isFinal_96=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3270); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:6: ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:6: ( (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:7: (lv_type_97= ruleStateType ) 'state' (lv_id_99= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:7: (lv_type_97= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1871:6: lv_type_97= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_32_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3324);
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

                    match(input,14,FOLLOW_14_in_ruleState3337); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_32_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1893:1: (lv_id_99= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1895:6: lv_id_99= RULE_FULLSTATEID
                    {
                    lv_id_99=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3359); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_32_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_99, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 34 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:6: ( (lv_type_100= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:6: ( (lv_type_100= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:7: (lv_type_100= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:7: (lv_type_100= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1917:6: lv_type_100= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_33_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3409);
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

                    match(input,14,FOLLOW_14_in_ruleState3422); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_33_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:6: ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:6: ( (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:7: (lv_type_102= ruleStateType ) (lv_id_103= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:7: (lv_type_102= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1943:6: lv_type_102= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_34_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3464);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1961:2: (lv_id_103= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1963:6: lv_id_103= RULE_FULLSTATEID
                    {
                    lv_id_103=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3490); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_34_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_103, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 36 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: (lv_type_104= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: (lv_type_104= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1985:6: lv_type_104= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_35_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3539);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: ( 'state' (lv_id_106= RULE_FULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: ( 'state' (lv_id_106= RULE_FULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:7: 'state' (lv_id_106= RULE_FULLSTATEID )
                    {
                    match(input,14,FOLLOW_14_in_ruleState3559); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_36_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2008:1: (lv_id_106= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2010:6: lv_id_106= RULE_FULLSTATEID
                    {
                    lv_id_106=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3581); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_36_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_106, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 38 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2029:6: 'state'
                    {
                    match(input,14,FOLLOW_14_in_ruleState3605); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2034:6: (lv_id_108= RULE_FULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2034:6: (lv_id_108= RULE_FULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2036:6: lv_id_108= RULE_FULLSTATEID
                    {
                    lv_id_108=(Token)input.LT(1);
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleState3633); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getIdFullStateIDTerminalRuleCall_0_38_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_108, "FullStateID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2054:3: (lv_label_109= RULE_STRING )?
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2056:6: lv_label_109= RULE_STRING
                    {
                    lv_label_109=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3664); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2074:3: ( '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2074:4: '[' ( (lv_signalRenamings_111= ruleRenaming ) ',' )* (lv_signalRenamings_113= ruleRenaming ) ']'
                    {
                    match(input,15,FOLLOW_15_in_ruleState3683); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2078:1: ( (lv_signalRenamings_111= ruleRenaming ) ',' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_STRING) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==25) ) {
                                int LA3_2 = input.LA(3);

                                if ( (LA3_2==RULE_STRING) ) {
                                    int LA3_3 = input.LA(4);

                                    if ( (LA3_3==16) ) {
                                        alt3=1;
                                    }


                                }


                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2078:2: (lv_signalRenamings_111= ruleRenaming ) ','
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2078:2: (lv_signalRenamings_111= ruleRenaming )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2081:6: lv_signalRenamings_111= ruleRenaming
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalRenamingsRenamingParserRuleCall_2_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRenaming_in_ruleState3718);
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

                    	    match(input,16,FOLLOW_16_in_ruleState3731); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_2_1_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2103:3: (lv_signalRenamings_113= ruleRenaming )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2106:6: lv_signalRenamings_113= ruleRenaming
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalRenamingsRenamingParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRenaming_in_ruleState3767);
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

                    match(input,17,FOLLOW_17_in_ruleState3780); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightSquareBracketKeyword_2_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2128:3: (lv_bodyText_115= RULE_STRING )?
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2130:6: lv_bodyText_115= RULE_STRING
                    {
                    lv_bodyText_115=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState3804); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2148:3: ( '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2148:4: '{' ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+ '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleState3823); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2152:1: ( ( 'onentry' (lv_entryActions_118= ruleAction ) ) | ( 'oninner' (lv_innerActions_120= ruleAction ) ) | ( 'onexit' (lv_exitActions_122= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) ) | (lv_signals_125= ruleSignal ) | ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=7;
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
                        case RULE_ID:
                        case 33:
                        case 34:
                        case 35:
                            {
                            alt7=5;
                            }
                            break;
                        case RULE_FULLSTATEID:
                        case 12:
                        case 13:
                        case 14:
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2152:2: ( 'onentry' (lv_entryActions_118= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2152:2: ( 'onentry' (lv_entryActions_118= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2152:3: 'onentry' (lv_entryActions_118= ruleAction )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleState3834); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_4_1_0_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2156:1: (lv_entryActions_118= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2159:6: lv_entryActions_118= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_4_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState3868);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2178:6: ( 'oninner' (lv_innerActions_120= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2178:6: ( 'oninner' (lv_innerActions_120= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2178:7: 'oninner' (lv_innerActions_120= ruleAction )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleState3889); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_4_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2182:1: (lv_innerActions_120= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2185:6: lv_innerActions_120= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_4_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState3923);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2204:6: ( 'onexit' (lv_exitActions_122= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2204:6: ( 'onexit' (lv_exitActions_122= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2204:7: 'onexit' (lv_exitActions_122= ruleAction )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleState3944); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_4_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2208:1: (lv_exitActions_122= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2211:6: lv_exitActions_122= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_4_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState3978);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2230:6: ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2230:6: ( 'suspension' (lv_suspensionTrigger_124= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2230:7: 'suspension' (lv_suspensionTrigger_124= ruleAction )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleState3999); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_4_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2234:1: (lv_suspensionTrigger_124= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2237:6: lv_suspensionTrigger_124= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_4_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4033);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2256:6: (lv_signals_125= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2256:6: (lv_signals_125= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2259:6: lv_signals_125= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_4_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleState4078);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:6: ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:6: ( ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:7: ( (lv_regions_126= ruleRegion ) '||' )* (lv_regions_128= ruleRegion )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:7: ( (lv_regions_126= ruleRegion ) '||' )*
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        switch ( input.LA(1) ) {
                    	        case 12:
                    	            {
                    	            int LA6_1 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 13:
                    	            {
                    	            int LA6_2 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 14:
                    	            {
                    	            int LA6_3 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 38:
                    	            {
                    	            int LA6_4 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 39:
                    	            {
                    	            int LA6_5 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case 40:
                    	            {
                    	            int LA6_6 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_FULLSTATEID:
                    	            {
                    	            int LA6_7 = input.LA(2);

                    	            if ( (synpred48()) ) {
                    	                alt6=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:8: (lv_regions_126= ruleRegion ) '||'
                    	    	    {
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:8: (lv_regions_126= ruleRegion )
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2281:6: lv_regions_126= ruleRegion
                    	    	    {
                    	    	    if ( backtracking==0 ) {
                    	    	       
                    	    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_0_0_0(), currentNode); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4124);
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

                    	    	    match(input,23,FOLLOW_23_in_ruleState4137); if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_4_1_5_0_1(), null); 
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop6;
                    	        }
                    	    } while (true);

                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2303:3: (lv_regions_128= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2306:6: lv_regions_128= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4173);
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

                    match(input,24,FOLLOW_24_in_ruleState4189); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2328:3: (lv_outgoingTransitions_130= ruleTransition )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_FULLSTATEID) ) {
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2331:6: lv_outgoingTransitions_130= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState4225);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2356:1: entryRuleRenaming returns [EObject current=null] : iv_ruleRenaming= ruleRenaming EOF ;
    public final EObject entryRuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenaming = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2356:50: (iv_ruleRenaming= ruleRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2357:2: iv_ruleRenaming= ruleRenaming EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRenamingRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming4263);
            iv_ruleRenaming=ruleRenaming();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRenaming; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming4273); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2364:1: ruleRenaming returns [EObject current=null] : ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) ) ;
    public final EObject ruleRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_oldObject_0=null;
        Token lv_newID_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2369:6: ( ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2370:1: ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2370:1: ( (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2370:2: (lv_oldObject_0= RULE_STRING ) '/' (lv_newID_2= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2370:2: (lv_oldObject_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2372:6: lv_oldObject_0= RULE_STRING
            {
            lv_oldObject_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRenaming4320); if (failed) return current;
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

            match(input,25,FOLLOW_25_in_ruleRenaming4337); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRenamingAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2394:1: (lv_newID_2= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2396:6: lv_newID_2= RULE_STRING
            {
            lv_newID_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRenaming4359); if (failed) return current;
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


    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2421:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2421:48: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2422:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion4400);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion4410); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2429:1: ruleRegion returns [EObject current=null] : ( (lv_parentState_0= ruleState ) ( 'region' )? (lv_id_2= RULE_STRING )? ( (lv_variables_3= ruleVariable ) | (lv_signals_4= ruleSignal ) | (lv_innerStates_5= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2=null;
        EObject lv_parentState_0 = null;

        EObject lv_variables_3 = null;

        EObject lv_signals_4 = null;

        EObject lv_innerStates_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2434:6: ( ( (lv_parentState_0= ruleState ) ( 'region' )? (lv_id_2= RULE_STRING )? ( (lv_variables_3= ruleVariable ) | (lv_signals_4= ruleSignal ) | (lv_innerStates_5= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2435:1: ( (lv_parentState_0= ruleState ) ( 'region' )? (lv_id_2= RULE_STRING )? ( (lv_variables_3= ruleVariable ) | (lv_signals_4= ruleSignal ) | (lv_innerStates_5= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2435:1: ( (lv_parentState_0= ruleState ) ( 'region' )? (lv_id_2= RULE_STRING )? ( (lv_variables_3= ruleVariable ) | (lv_signals_4= ruleSignal ) | (lv_innerStates_5= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2435:2: (lv_parentState_0= ruleState ) ( 'region' )? (lv_id_2= RULE_STRING )? ( (lv_variables_3= ruleVariable ) | (lv_signals_4= ruleSignal ) | (lv_innerStates_5= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2435:2: (lv_parentState_0= ruleState )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2438:6: lv_parentState_0= ruleState
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getParentStateStateParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleState_in_ruleRegion4469);
            lv_parentState_0=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "parentState", lv_parentState_0, "State", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2456:2: ( 'region' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2456:3: 'region'
                    {
                    match(input,26,FOLLOW_26_in_ruleRegion4483); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2460:3: (lv_id_2= RULE_STRING )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2462:6: lv_id_2= RULE_STRING
                    {
                    lv_id_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegion4507); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRegionAccess().getIdSTRINGTerminalRuleCall_2_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_2, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2480:3: ( (lv_variables_3= ruleVariable ) | (lv_signals_4= ruleSignal ) | (lv_innerStates_5= ruleState ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    switch ( input.LA(2) ) {
                    case 34:
                        {
                        int LA12_3 = input.LA(3);

                        if ( (LA12_3==35) ) {
                            int LA12_4 = input.LA(4);

                            if ( (LA12_4==RULE_ID) ) {
                                int LA12_13 = input.LA(5);

                                if ( (synpred55()) ) {
                                    alt12=2;
                                }


                            }


                        }
                        else if ( (LA12_3==RULE_ID) ) {
                            int LA12_13 = input.LA(4);

                            if ( (synpred55()) ) {
                                alt12=2;
                            }


                        }


                        }
                        break;
                    case 35:
                        {
                        int LA12_4 = input.LA(3);

                        if ( (LA12_4==RULE_ID) ) {
                            int LA12_13 = input.LA(4);

                            if ( (synpred55()) ) {
                                alt12=2;
                            }


                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        int LA12_13 = input.LA(3);

                        if ( (synpred55()) ) {
                            alt12=2;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case 34:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==35) ) {
                        int LA12_4 = input.LA(3);

                        if ( (LA12_4==RULE_ID) ) {
                            int LA12_13 = input.LA(4);

                            if ( (synpred55()) ) {
                                alt12=2;
                            }


                        }


                    }
                    else if ( (LA12_3==RULE_ID) ) {
                        int LA12_13 = input.LA(3);

                        if ( (synpred55()) ) {
                            alt12=2;
                        }


                    }


                    }
                    break;
                case 35:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (LA12_4==RULE_ID) ) {
                        int LA12_13 = input.LA(3);

                        if ( (synpred55()) ) {
                            alt12=2;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred54()) ) {
                        alt12=1;
                    }
                    else if ( (synpred55()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;
                case 13:
                    {
                    int LA12_7 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA12_8 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA12_9 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA12_10 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA12_11 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;
                case RULE_FULLSTATEID:
                    {
                    int LA12_12 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt12=3;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2480:4: (lv_variables_3= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2480:4: (lv_variables_3= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2483:6: lv_variables_3= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion4551);
            	    lv_variables_3=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "variables", lv_variables_3, "Variable", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2502:6: (lv_signals_4= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2502:6: (lv_signals_4= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2505:6: lv_signals_4= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion4595);
            	    lv_signals_4=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "signals", lv_signals_4, "Signal", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2524:6: (lv_innerStates_5= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2524:6: (lv_innerStates_5= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2527:6: lv_innerStates_5= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_3_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion4639);
            	    lv_innerStates_5=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerStates", lv_innerStates_5, "State", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2552:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2552:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2553:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4678);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4688); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2560:1: ruleAction returns [EObject current=null] : ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        Token lv_triggersAndEffects_3=null;
        EObject this_Transition_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2565:6: ( ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)||LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_FULLSTATEID||(LA15_0>=52 && LA15_0<=54)) ) {
                alt15=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2566:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:3: (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2566:3: (lv_isImmediate_0= '#' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2568:6: lv_isImmediate_0= '#'
                            {
                            lv_isImmediate_0=(Token)input.LT(1);
                            match(input,27,FOLLOW_27_in_ruleAction4735); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2587:3: ( (lv_delay_1= RULE_INT ) ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2587:4: (lv_delay_1= RULE_INT ) ';'
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2587:4: (lv_delay_1= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2589:6: lv_delay_1= RULE_INT
                            {
                            lv_delay_1=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction4772); if (failed) return current;
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

                            match(input,28,FOLLOW_28_in_ruleAction4789); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_0_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2611:3: (lv_triggersAndEffects_3= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2613:6: lv_triggersAndEffects_3= RULE_STRING
                    {
                    lv_triggersAndEffects_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction4813); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2633:5: this_Transition_4= ruleTransition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getActionAccess().getTransitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleAction4850);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2648:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2648:52: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2649:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition4882);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition4892); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2656:1: ruleTransition returns [EObject current=null] : ( ( RULE_FULLSTATEID )? (lv_type_1= ruleTransitionType ) ( RULE_FULLSTATEID ) ( 'with ' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_triggersAndEffects_4=null;
        Token lv_isHistory_5=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2661:6: ( ( ( RULE_FULLSTATEID )? (lv_type_1= ruleTransitionType ) ( RULE_FULLSTATEID ) ( 'with ' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2662:1: ( ( RULE_FULLSTATEID )? (lv_type_1= ruleTransitionType ) ( RULE_FULLSTATEID ) ( 'with ' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2662:1: ( ( RULE_FULLSTATEID )? (lv_type_1= ruleTransitionType ) ( RULE_FULLSTATEID ) ( 'with ' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2662:2: ( RULE_FULLSTATEID )? (lv_type_1= ruleTransitionType ) ( RULE_FULLSTATEID ) ( 'with ' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2662:2: ( RULE_FULLSTATEID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_FULLSTATEID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2665:3: RULE_FULLSTATEID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleTransition4939); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getSourceStateStateCrossReference_0_0(), "sourceState"); 
                      	
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2678:3: (lv_type_1= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2681:6: lv_type_1= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition4977);
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2699:2: ( RULE_FULLSTATEID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2702:3: RULE_FULLSTATEID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_ruleTransition5003); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0(), "targetState"); 
              	
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2715:2: ( 'with ' (lv_triggersAndEffects_4= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2715:3: 'with ' (lv_triggersAndEffects_4= RULE_STRING )
                    {
                    match(input,29,FOLLOW_29_in_ruleTransition5016); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2719:1: (lv_triggersAndEffects_4= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2721:6: lv_triggersAndEffects_4= RULE_STRING
                    {
                    lv_triggersAndEffects_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition5038); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2739:4: (lv_isHistory_5= ' history' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2741:6: lv_isHistory_5= ' history'
                    {
                    lv_isHistory_5=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleTransition5069); if (failed) return current;
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

            match(input,28,FOLLOW_28_in_ruleTransition5092); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2773:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2773:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2774:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable5127);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable5137); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2781:1: ruleVariable returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_initialValue_2=null;
        Token lv_hostType_5=null;
        Enumerator lv_type_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2786:6: ( ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2787:1: ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2787:1: ( (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2787:2: (lv_name_0= RULE_ID ) ( ':= ' (lv_initialValue_2= RULE_INT ) )? ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2787:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2789:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable5184); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2807:2: ( ':= ' (lv_initialValue_2= RULE_INT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2807:3: ':= ' (lv_initialValue_2= RULE_INT )
                    {
                    match(input,31,FOLLOW_31_in_ruleVariable5202); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignSpaceKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2811:1: (lv_initialValue_2= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2813:6: lv_initialValue_2= RULE_INT
                    {
                    lv_initialValue_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable5224); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2831:4: ( ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2831:5: ': ' ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleVariable5244); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2835:1: ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=46 && LA20_0<=51)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_STRING) ) {
                        alt20=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2835:1: ( (lv_type_4= ruleValueType ) | (lv_hostType_5= RULE_STRING ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2835:2: (lv_type_4= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2835:2: (lv_type_4= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2838:6: lv_type_4= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleVariable5279);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2857:6: (lv_hostType_5= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2857:6: (lv_hostType_5= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2859:6: lv_hostType_5= RULE_STRING
                            {
                            lv_hostType_5=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable5311); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2884:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2884:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2885:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal5355);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal5365); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2892:1: ruleSignal returns [EObject current=null] : ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? ) ;
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
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2897:6: ( ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2898:1: ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2898:1: ( (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2898:2: (lv_isLocal_0= 'local' )? (lv_isInput_1= 'input' )? (lv_isOutput_2= 'output' )? (lv_name_3= RULE_ID ) ( ':= ' (lv_initialValue_5= RULE_INT ) )? ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2898:2: (lv_isLocal_0= 'local' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2900:6: lv_isLocal_0= 'local'
                    {
                    lv_isLocal_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSignal5411); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2919:3: (lv_isInput_1= 'input' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2921:6: lv_isInput_1= 'input'
                    {
                    lv_isInput_1=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSignal5446); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2940:3: (lv_isOutput_2= 'output' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2942:6: lv_isOutput_2= 'output'
                    {
                    lv_isOutput_2=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleSignal5481); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2961:3: (lv_name_3= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2963:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5517); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2981:2: ( ':= ' (lv_initialValue_5= RULE_INT ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2981:3: ':= ' (lv_initialValue_5= RULE_INT )
                    {
                    match(input,31,FOLLOW_31_in_ruleSignal5535); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignSpaceKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2985:1: (lv_initialValue_5= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2987:6: lv_initialValue_5= RULE_INT
                    {
                    lv_initialValue_5=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignal5557); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3005:4: ( ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) ) | ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==36) ) {
                    alt29=2;
                }
                else if ( (LA29_1==RULE_STRING||(LA29_1>=46 && LA29_1<=51)) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3005:5: ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3005:5: ( ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3005:6: ': ' ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal5578); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_5_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3009:1: ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=46 && LA26_0<=51)) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==RULE_STRING) ) {
                        alt26=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3009:1: ( (lv_type_7= ruleValueType ) | (lv_hostType_8= RULE_STRING ) )", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3009:2: (lv_type_7= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3009:2: (lv_type_7= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3012:6: lv_type_7= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal5613);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3031:6: (lv_hostType_8= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3031:6: (lv_hostType_8= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3033:6: lv_hostType_8= RULE_STRING
                            {
                            lv_hostType_8=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5645); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3052:6: ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3052:6: ( ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3052:7: ': ' 'combine' ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) ) 'with' ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal5671); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_5_1_0(), null); 
                          
                    }
                    match(input,36,FOLLOW_36_in_ruleSignal5680); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_5_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3060:1: ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) )
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
                            new NoViableAltException("3060:1: ( (lv_type_11= ruleValueType ) | (lv_hostType_12= RULE_STRING ) )", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3060:2: (lv_type_11= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3060:2: (lv_type_11= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3063:6: lv_type_11= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal5715);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3082:6: (lv_hostType_12= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3082:6: (lv_hostType_12= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3084:6: lv_hostType_12= RULE_STRING
                            {
                            lv_hostType_12=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5747); if (failed) return current;
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

                    match(input,37,FOLLOW_37_in_ruleSignal5765); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_5_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3106:1: ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=41 && LA28_0<=46)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_STRING) ) {
                        alt28=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3106:1: ( (lv_combineOperator_14= ruleCombineOperator ) | (lv_hostCombineOperator_15= RULE_STRING ) )", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3106:2: (lv_combineOperator_14= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3106:2: (lv_combineOperator_14= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3109:6: lv_combineOperator_14= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_5_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal5800);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3128:6: (lv_hostCombineOperator_15= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3128:6: (lv_hostCombineOperator_15= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3130:6: lv_hostCombineOperator_15= RULE_STRING
                            {
                            lv_hostCombineOperator_15=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5832); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3157:1: ruleStateType returns [Enumerator current=null] : ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3161:6: ( ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3162:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3162:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt30=1;
                }
                break;
            case 38:
                {
                alt30=2;
                }
                break;
            case 39:
                {
                alt30=3;
                }
                break;
            case 40:
                {
                alt30=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3162:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3162:2: ( 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3162:2: ( 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3162:4: 'state'
                    {
                    match(input,14,FOLLOW_14_in_ruleStateType5893); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3168:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3168:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3168:8: 'cond'
                    {
                    match(input,38,FOLLOW_38_in_ruleStateType5908); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3174:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3174:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3174:8: 'ref'
                    {
                    match(input,39,FOLLOW_39_in_ruleStateType5923); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3180:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3180:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3180:8: 'textual'
                    {
                    match(input,40,FOLLOW_40_in_ruleStateType5938); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3190:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3194:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3195:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3195:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt31=1;
                }
                break;
            case 42:
                {
                alt31=2;
                }
                break;
            case 43:
                {
                alt31=3;
                }
                break;
            case 44:
                {
                alt31=4;
                }
                break;
            case 45:
                {
                alt31=5;
                }
                break;
            case 46:
                {
                alt31=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3195:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'host' ) )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3195:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3195:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3195:4: 'NONE'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator5981); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3201:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3201:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3201:8: '+'
                    {
                    match(input,42,FOLLOW_42_in_ruleCombineOperator5996); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3207:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3207:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3207:8: '*'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator6011); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3213:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3213:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3213:8: 'AND'
                    {
                    match(input,44,FOLLOW_44_in_ruleCombineOperator6026); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3219:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3219:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3219:8: 'OR'
                    {
                    match(input,45,FOLLOW_45_in_ruleCombineOperator6041); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3225:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3225:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3225:8: 'host'
                    {
                    match(input,46,FOLLOW_46_in_ruleCombineOperator6056); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3235:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3239:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt32=1;
                }
                break;
            case 48:
                {
                alt32=2;
                }
                break;
            case 49:
                {
                alt32=3;
                }
                break;
            case 50:
                {
                alt32=4;
                }
                break;
            case 51:
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
                    new NoViableAltException("3240:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'host' ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3240:4: 'PURE'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType6099); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3246:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3246:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3246:8: 'boolean'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType6114); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3252:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3252:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3252:8: 'unsigned'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType6129); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3258:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3258:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3258:8: 'integer'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType6144); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3264:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3264:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3264:8: 'float'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType6159); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3270:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3270:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3270:8: 'host'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType6174); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3280:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3284:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3285:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3285:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt33=1;
                }
                break;
            case 53:
                {
                alt33=2;
                }
                break;
            case 54:
                {
                alt33=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3285:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3285:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3285:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3285:4: '-->'
                    {
                    match(input,52,FOLLOW_52_in_ruleTransitionType6217); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3291:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3291:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3291:8: 'o->'
                    {
                    match(input,53,FOLLOW_53_in_ruleTransitionType6232); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3297:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3297:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:3297:8: '>->'
                    {
                    match(input,54,FOLLOW_54_in_ruleTransitionType6247); if (failed) return current;
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
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:4: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:5: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred1138); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:109:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:111:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred1172); if (failed) return ;

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

        match(input,14,FOLLOW_14_in_synpred1233); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:157:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred1255); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:176:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:178:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred2293); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:199:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred2327); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:221:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred2375);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred2388); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:246:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred3418); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:265:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:267:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred3452); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:286:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:289:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred3500);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:307:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:309:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred3526); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:7: ( ( 'init' ) ( 'final' ) ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:330:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred4564); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:349:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:351:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred4598); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred4621); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:374:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:376:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred4643); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:395:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:397:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred5681); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:416:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:418:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred5715); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:437:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:440:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred5763);
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
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:7: ( ( 'init' ) ( 'final' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:459:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:461:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred6797); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:480:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:482:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred6831); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred6854); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:6: ( ( ( 'init' ) ( 'final' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:6: ( ( 'init' ) ( 'final' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:6: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:7: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:569:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:571:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred8991); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:590:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:592:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred81025); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:612:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:614:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred91068); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:633:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:635:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred91102); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:654:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:657:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred91150);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred91163); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:679:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:681:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred91185); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:700:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:702:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred101223); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:721:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:723:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred101257); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:742:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:745:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_9_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred101305);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred101318); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:768:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:770:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred111348); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:789:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:791:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred111382); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:810:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:813:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred111430);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:831:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:833:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred111456); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:7: ( ( 'final' ) ( 'init' ) ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:852:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:854:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred121494); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:873:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:875:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred121528); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred121551); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:898:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:900:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred121573); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:919:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:921:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred131611); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:940:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:942:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred131645); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:961:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:964:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred131693);
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
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:7: ( ( 'final' ) ( 'init' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred141727); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1004:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1006:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred141761); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred141784); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:6: ( ( ( 'final' ) ( 'init' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:6: ( ( 'final' ) ( 'init' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:6: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:7: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1093:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1095:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred161921); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1114:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1116:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred161955); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:6: ( ( 'init' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:6: ( ( 'init' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:7: ( 'init' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1136:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1138:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred171997); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1157:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1160:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_16_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred172044);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred172057); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1182:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1184:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred172079); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:7: ( 'init' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1203:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1205:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred182116); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1224:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1227:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_17_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred182163);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred182176); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:6: ( ( ( 'init' ) ( ruleStateType ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:6: ( ( 'init' ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:6: ( ( 'init' ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:7: ( 'init' ) ( ruleStateType ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1250:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1252:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred192205); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1271:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1274:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_18_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred192252);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1292:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1294:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred192278); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:6: ( ( ( 'init' ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:6: ( ( 'init' ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:6: ( ( 'init' ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:7: ( 'init' ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1313:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1315:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred202315); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred202337); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1338:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1340:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred202359); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:6: ( ( ( 'init' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:6: ( ( 'init' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:6: ( ( 'init' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:7: ( 'init' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1359:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1361:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred212396); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1380:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1383:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_20_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred212443);
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
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:6: ( ( ( 'init' ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:6: ( ( 'init' ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:6: ( ( 'init' ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:7: ( 'init' ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1402:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1404:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred222476); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred222498); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:6: ( ( ( 'init' ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:6: ( ( 'init' ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:6: ( ( 'init' ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:7: ( 'init' ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1428:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1430:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred232527); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1449:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1451:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred232562); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1470:6: ( ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1470:6: ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1470:6: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1472:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred242598); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:6: ( ( 'final' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:6: ( ( 'final' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:7: ( 'final' ) ( ruleStateType ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1492:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1494:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred252639); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1513:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1516:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_24_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred252686);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred252699); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1538:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1540:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred252721); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:7: ( 'final' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1559:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1561:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred262758); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1580:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1583:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_25_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred262805);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred262818); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:6: ( ( ( 'final' ) ( ruleStateType ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:6: ( ( 'final' ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:6: ( ( 'final' ) ( ruleStateType ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:7: ( 'final' ) ( ruleStateType ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1608:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred272847); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1627:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1630:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_26_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred272894);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1648:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1650:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred272920); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:6: ( ( ( 'final' ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:6: ( ( 'final' ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:6: ( ( 'final' ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:7: ( 'final' ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1669:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1671:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred282957); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred282979); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1694:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1696:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred283001); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:6: ( ( ( 'final' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:6: ( ( 'final' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:6: ( ( 'final' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:7: ( 'final' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1715:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1717:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred293038); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1736:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1739:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_28_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred293085);
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
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:6: ( ( ( 'final' ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:6: ( ( 'final' ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:6: ( ( 'final' ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:7: ( 'final' ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1758:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1760:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred303118); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred303140); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1783:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1785:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred303162); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:6: ( ( ( 'final' ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:6: ( ( 'final' ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:6: ( ( 'final' ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:7: ( 'final' ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1804:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1806:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred313199); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1825:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1827:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred313234); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1846:6: ( ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1846:6: ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1846:6: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1848:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred323270); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:6: ( ( ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:6: ( ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:6: ( ( ruleStateType ) 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:7: ( ruleStateType ) 'state' ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1868:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1871:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_32_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred333324);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred333337); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1893:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1895:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred333359); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:6: ( ( ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:6: ( ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:6: ( ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:7: ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1914:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1917:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_33_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred343409);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred343422); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:6: ( ( ( ruleStateType ) ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:6: ( ( ruleStateType ) ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:6: ( ( ruleStateType ) ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:7: ( ruleStateType ) ( RULE_FULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1940:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1943:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_34_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred353464);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1961:2: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1963:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred353490); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: ( ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1982:6: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1985:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_35_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred363539);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: ( ( 'state' ( RULE_FULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: ( 'state' ( RULE_FULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:6: ( 'state' ( RULE_FULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2004:7: 'state' ( RULE_FULLSTATEID )
        {
        match(input,14,FOLLOW_14_in_synpred373559); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2008:1: ( RULE_FULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2010:6: RULE_FULLSTATEID
        {
        match(input,RULE_FULLSTATEID,FOLLOW_RULE_FULLSTATEID_in_synpred373581); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2029:6: ( 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2029:6: 'state'
        {
        match(input,14,FOLLOW_14_in_synpred383605); if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2056:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2056:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred393664); if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2130:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2130:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred423804); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:8: ( ( ruleRegion ) '||' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:8: ( ruleRegion ) '||'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2278:8: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2281:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred484124);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }

        match(input,23,FOLLOW_23_in_synpred484137); if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2331:6: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2331:6: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred514225);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2480:4: ( ( ruleVariable ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2480:4: ( ruleVariable )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2480:4: ( ruleVariable )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2483:6: ruleVariable
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_3_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_in_synpred544551);
        ruleVariable();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2502:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2502:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2502:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2505:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred554595);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2524:6: ( ( ruleState ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2524:6: ( ruleState )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2524:6: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2527:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_3_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred564639);
        ruleState();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred56

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
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_12_in_ruleState138 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState172 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState255 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState327 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState375 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState388 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState418 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState452 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState526 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState598 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState643 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState681 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState715 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState763 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState831 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState854 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState884 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState954 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState991 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1025 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1068 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1102 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1150 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState1185 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1223 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1257 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1305 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1318 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1382 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState1456 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1528 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState1573 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1611 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1645 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1693 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1784 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1814 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState1884 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState1921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1955 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState1997 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2044 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState2079 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2116 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2176 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2205 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState2278 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState2359 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2396 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2443 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2476 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2498 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState2562 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_12_in_ruleState2598 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState2639 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2686 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState2721 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState2758 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2805 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2818 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState2847 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState2920 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState2957 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3001 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState3038 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3085 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState3118 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3162 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState3199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3234 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_13_in_ruleState3270 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3324 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3359 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3422 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3490 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3539 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_14_in_ruleState3559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3581 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_14_in_ruleState3605 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleState3633 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3664 = new BitSet(new long[]{0x0070000000048032L});
    public static final BitSet FOLLOW_15_in_ruleState3683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleState3718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleState3731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleState3767 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState3780 = new BitSet(new long[]{0x0070000000040032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState3804 = new BitSet(new long[]{0x0070000000040012L});
    public static final BitSet FOLLOW_18_in_ruleState3823 = new BitSet(new long[]{0x000001CE00787090L});
    public static final BitSet FOLLOW_19_in_ruleState3834 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState3868 = new BitSet(new long[]{0x000001CE01787090L});
    public static final BitSet FOLLOW_20_in_ruleState3889 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState3923 = new BitSet(new long[]{0x000001CE01787090L});
    public static final BitSet FOLLOW_21_in_ruleState3944 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState3978 = new BitSet(new long[]{0x000001CE01787090L});
    public static final BitSet FOLLOW_22_in_ruleState3999 = new BitSet(new long[]{0x0070000008000070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4033 = new BitSet(new long[]{0x000001CE01787090L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState4078 = new BitSet(new long[]{0x000001CE01787090L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4124 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleState4137 = new BitSet(new long[]{0x000001C000007010L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4173 = new BitSet(new long[]{0x000001CE01787090L});
    public static final BitSet FOLLOW_24_in_ruleState4189 = new BitSet(new long[]{0x0070000000000012L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState4225 = new BitSet(new long[]{0x0070000000000012L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRenaming4320 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRenaming4337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRenaming4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion4400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion4469 = new BitSet(new long[]{0x000001CE040070B0L});
    public static final BitSet FOLLOW_26_in_ruleRegion4483 = new BitSet(new long[]{0x000001CE000070B0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion4507 = new BitSet(new long[]{0x000001CE00007090L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion4551 = new BitSet(new long[]{0x000001CE00007092L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion4595 = new BitSet(new long[]{0x000001CE00007092L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion4639 = new BitSet(new long[]{0x000001CE00007092L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAction4735 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction4772 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAction4789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAction4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition4882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleTransition4939 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition4977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_ruleTransition5003 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_29_in_ruleTransition5016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition5038 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_ruleTransition5069 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable5184 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleVariable5202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable5224 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariable5244 = new BitSet(new long[]{0x000FC00000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignal5411 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_34_in_ruleSignal5446 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_35_in_ruleSignal5481 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5517 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleSignal5535 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignal5557 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal5578 = new BitSet(new long[]{0x000FC00000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal5671 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSignal5680 = new BitSet(new long[]{0x000FC00000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5715 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5747 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSignal5765 = new BitSet(new long[]{0x00007E0000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStateType5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStateType5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStateType5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStateType5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCombineOperator5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCombineOperator6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCombineOperator6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTransitionType6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTransitionType6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTransitionType6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred1138 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred1172 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred1220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred2293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred2327 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred2375 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred3418 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred3452 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred3500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred4564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred4598 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred4621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred5681 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred5715 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred6797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred6831 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred8991 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred81025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred91068 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred91102 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred91150 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred91163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred91185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred101223 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred101257 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred101305 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred101318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred111348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred111382 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred111430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred111456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred121494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred121528 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred121551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred121573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred131611 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred131645 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred131693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred141727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred141761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred141784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred161921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred161955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred171997 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred172044 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred172057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred172079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred182116 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred182163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred182176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred192205 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred192252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred192278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred202315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred202337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred202359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred212396 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred212443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred222476 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred222498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred232527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred232562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred242598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred252639 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred252686 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred252699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred252721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred262758 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred262805 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred262818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred272847 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred272894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred272920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred282957 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred282979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred283001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred293038 = new BitSet(new long[]{0x000001C000004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred293085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred303118 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred303140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred303162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred313199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred313234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred323270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred333324 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred333337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred333359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred343409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred343422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred353464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred353490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred363539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred373559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FULLSTATEID_in_synpred373581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred383605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred393664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred423804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred484124 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred484137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred514225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_synpred544551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred554595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_synpred564639 = new BitSet(new long[]{0x0000000000000002L});

}