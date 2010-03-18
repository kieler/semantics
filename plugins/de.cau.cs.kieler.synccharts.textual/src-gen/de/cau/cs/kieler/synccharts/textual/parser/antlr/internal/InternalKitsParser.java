package de.cau.cs.kieler.synccharts.textual.parser.antlr.internal; 

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

import de.cau.cs.kieler.synccharts.textual.services.KitsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalKitsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "'init'", "'final'", "'interface: '", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "';'", "'{'", "'||'", "'}'", "'with'", "'#'", "'delay:='", "'/'", "','", "' history'", "'state'", "'cond'", "'conditional'", "'var'", "':='", "': '", "'input'", "'output'", "'signal'", "': combine'", "'@'", "'.'", "'('", "')'", "'NORMAL'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'hostCombineOperator'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'hostType'", "'-->'", "'o->'", "'>->'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'not'", "'pre'", "'or'", "'and'", "'-'", "'mod'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalKitsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[207+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KitsGrammarAccess grammarAccess;
     	
        public InternalKitsParser(TokenStream input, IAstFactory factory, KitsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Region";	
       	} 



    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:79:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:80:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:81:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion81);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion91); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ruleRegion returns [EObject current=null] : ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token lv_id_8_0=null;
        EObject lv_variables_4_0 = null;

        EObject lv_signals_5_0 = null;

        EObject lv_innerStates_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:93:6: ( ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:1: ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:1: ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA5_3 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt5=1;
                    }
                    else if ( (true) ) {
                        alt5=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("94:1: ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) )", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 23:
                case 24:
                    {
                    alt5=2;
                    }
                    break;
                case RULE_STRING:
                case 14:
                case 15:
                case 32:
                case 34:
                case 37:
                case 38:
                case 39:
                case 45:
                case 46:
                case 47:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) )", 5, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=14 && LA5_0<=15)||LA5_0==32||LA5_0==34||(LA5_0>=37 && LA5_0<=39)||(LA5_0>=45 && LA5_0<=47)) ) {
                alt5=1;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("94:1: ( ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ) | ( 'region' ( (lv_id_8_0= RULE_ID ) )? ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: ( () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:3: () ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:3: ()
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:95:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRegionAccess().getRegionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRegionAccess().getRegionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:2: ( ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )?
                    int alt1=3;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        int LA1_1 = input.LA(2);

                        if ( (LA1_1==RULE_ID) ) {
                            int LA1_3 = input.LA(3);

                            if ( (synpred1()) ) {
                                alt1=1;
                            }
                            else if ( (synpred2()) ) {
                                alt1=2;
                            }
                        }
                        else if ( (LA1_1==RULE_STRING||(LA1_1>=14 && LA1_1<=15)||LA1_1==32||LA1_1==34||(LA1_1>=37 && LA1_1<=39)||(LA1_1>=45 && LA1_1<=47)) ) {
                            alt1=2;
                        }
                    }
                    switch (alt1) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( 'region' ( (lv_id_2_0= RULE_ID ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( 'region' ( (lv_id_2_0= RULE_ID ) ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:6: 'region' ( (lv_id_2_0= RULE_ID ) )
                            {
                            match(input,13,FOLLOW_13_in_ruleRegion142); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_0_1_0_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:1: ( (lv_id_2_0= RULE_ID ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: (lv_id_2_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: (lv_id_2_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: lv_id_2_0= RULE_ID
                            {
                            lv_id_2_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegion159); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_0_1_0_0_1_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_2_0, 
                              	        		"ID", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: 'region'
                            {
                            match(input,13,FOLLOW_13_in_ruleRegion181); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_0_1_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:3: ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==34) ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>=37 && LA2_0<=39)) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:4: ( (lv_variables_4_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:4: ( (lv_variables_4_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:142:1: (lv_variables_4_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:142:1: (lv_variables_4_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:143:3: lv_variables_4_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_0_1_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion205);
                    	    lv_variables_4_0=ruleVariable();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"variables",
                    	      	        		lv_variables_4_0, 
                    	      	        		"Variable", 
                    	      	        		currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:166:6: ( (lv_signals_5_0= ruleSignal ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:166:6: ( (lv_signals_5_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:167:1: (lv_signals_5_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:167:1: (lv_signals_5_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:168:3: lv_signals_5_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_0_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion232);
                    	    lv_signals_5_0=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_5_0, 
                    	      	        		"Signal", 
                    	      	        		currentNode);
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
                    	    break loop2;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:190:4: ( (lv_innerStates_6_0= ruleState ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||(LA3_0>=14 && LA3_0<=15)||LA3_0==32||(LA3_0>=45 && LA3_0<=47)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:191:1: (lv_innerStates_6_0= ruleState )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:191:1: (lv_innerStates_6_0= ruleState )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:192:3: lv_innerStates_6_0= ruleState
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_0_1_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleState_in_ruleRegion255);
                    	    lv_innerStates_6_0=ruleState();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"innerStates",
                    	      	        		lv_innerStates_6_0, 
                    	      	        		"State", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:215:6: ( 'region' ( (lv_id_8_0= RULE_ID ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:215:6: ( 'region' ( (lv_id_8_0= RULE_ID ) )? )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:215:8: 'region' ( (lv_id_8_0= RULE_ID ) )?
                    {
                    match(input,13,FOLLOW_13_in_ruleRegion275); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:219:1: ( (lv_id_8_0= RULE_ID ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:220:1: (lv_id_8_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:220:1: (lv_id_8_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:221:3: lv_id_8_0= RULE_ID
                            {
                            lv_id_8_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegion292); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_1_1_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_8_0, 
                              	        		"ID", 
                              	        		lastConsumedNode);
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


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:251:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:252:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:253:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState335);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState345); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:260:1: ruleState returns [EObject current=null] : ( () ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) ) ( (lv_signals_23_0= ruleSignal ) )* ( 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) ) )? ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )? ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_label_4_0=null;
        Token lv_label_6_0=null;
        Token lv_isFinal_7_0=null;
        Token lv_isInitial_8_0=null;
        Token lv_label_10_0=null;
        Token lv_label_12_0=null;
        Token lv_label_16_0=null;
        Token lv_label_19_0=null;
        Token lv_isInitial_20_0=null;
        Token lv_isFinal_21_0=null;
        Token lv_interfaceDeclaration_25_0=null;
        Token lv_bodyText_41_0=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_id_11_0 = null;

        Enumerator lv_type_13_0 = null;

        AntlrDatatypeRuleToken lv_id_14_0 = null;

        Enumerator lv_type_15_0 = null;

        Enumerator lv_type_17_0 = null;

        AntlrDatatypeRuleToken lv_id_18_0 = null;

        Enumerator lv_type_22_0 = null;

        EObject lv_signals_23_0 = null;

        EObject lv_entryActions_27_0 = null;

        EObject lv_innerActions_29_0 = null;

        EObject lv_exitActions_31_0 = null;

        EObject lv_suspensionTrigger_33_0 = null;

        EObject lv_regions_36_0 = null;

        EObject lv_regions_38_0 = null;

        EObject lv_outgoingTransitions_43_1 = null;

        EObject lv_outgoingTransitions_43_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:265:6: ( ( () ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) ) ( (lv_signals_23_0= ruleSignal ) )* ( 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) ) )? ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )? ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:266:1: ( () ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) ) ( (lv_signals_23_0= ruleSignal ) )* ( 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) ) )? ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )? ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:266:1: ( () ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) ) ( (lv_signals_23_0= ruleSignal ) )* ( 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) ) )? ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )? ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:266:2: () ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) ) ( (lv_signals_23_0= ruleSignal ) )* ( 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) ) )? ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )? ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:266:2: ()
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:267:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getStateAccess().getStateAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getStateAccess().getStateAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred12()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred17()) ) {
                    alt15=2;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred19()) ) {
                    alt15=3;
                }
                else if ( (synpred21()) ) {
                    alt15=4;
                }
                else if ( (synpred23()) ) {
                    alt15=5;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred19()) ) {
                    alt15=3;
                }
                else if ( (synpred21()) ) {
                    alt15=4;
                }
                else if ( (synpred23()) ) {
                    alt15=5;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA15_5 = input.LA(2);

                if ( (synpred19()) ) {
                    alt15=3;
                }
                else if ( (synpred21()) ) {
                    alt15=4;
                }
                else if ( (synpred23()) ) {
                    alt15=5;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA15_6 = input.LA(2);

                if ( (synpred19()) ) {
                    alt15=3;
                }
                else if ( (synpred21()) ) {
                    alt15=4;
                }
                else if ( (synpred23()) ) {
                    alt15=5;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    int LA15_19 = input.LA(3);

                    if ( (LA15_19==RULE_ID) ) {
                        int LA15_22 = input.LA(4);

                        if ( (LA15_22==RULE_STRING) ) {
                            int LA15_20 = input.LA(5);

                            if ( (synpred19()) ) {
                                alt15=3;
                            }
                            else if ( (synpred23()) ) {
                                alt15=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 20, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA15_22==EOF||LA15_22==RULE_ID||(LA15_22>=14 && LA15_22<=24)||LA15_22==32||(LA15_22>=37 && LA15_22<=39)||(LA15_22>=45 && LA15_22<=47)||(LA15_22>=60 && LA15_22<=62)) ) {
                            alt15=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 22, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA15_20 = input.LA(3);

                    if ( (synpred19()) ) {
                        alt15=3;
                    }
                    else if ( (synpred23()) ) {
                        alt15=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 32:
                case 37:
                case 38:
                case 39:
                case 45:
                case 46:
                case 47:
                case 60:
                case 61:
                case 62:
                    {
                    alt15=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 7, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt15=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("280:2: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? ) | ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? ) | ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) ) | ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) ) | ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) ) | ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:3: ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:3: ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )? )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:4: ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:4: ( (lv_isInitial_1_0= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:281:1: (lv_isInitial_1_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:281:1: (lv_isInitial_1_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:282:3: lv_isInitial_1_0= 'init'
                    {
                    lv_isInitial_1_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleState402); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:301:2: ( (lv_isFinal_2_0= 'final' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        int LA6_1 = input.LA(2);

                        if ( (synpred8()) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: (lv_isFinal_2_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: (lv_isFinal_2_0= 'final' )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:303:3: lv_isFinal_2_0= 'final'
                            {
                            lv_isFinal_2_0=(Token)input.LT(1);
                            match(input,15,FOLLOW_15_in_ruleState433); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0_1_0(), "isFinal"); 
                                  
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

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:3: ( ( (lv_id_3_0= ruleFULLSTATEID ) ) | ( (lv_label_4_0= RULE_STRING ) ) | ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) ) )?
                    int alt7=4;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==RULE_STRING||LA7_1==41) ) {
                            alt7=3;
                        }
                        else if ( (synpred9()) ) {
                            alt7=1;
                        }
                    }
                    else if ( (LA7_0==RULE_STRING) ) {
                        int LA7_2 = input.LA(2);

                        if ( (synpred10()) ) {
                            alt7=2;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( (lv_id_3_0= ruleFULLSTATEID ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( (lv_id_3_0= ruleFULLSTATEID ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:1: (lv_id_3_0= ruleFULLSTATEID )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:1: (lv_id_3_0= ruleFULLSTATEID )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:324:3: lv_id_3_0= ruleFULLSTATEID
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_0_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleState469);
                            lv_id_3_0=ruleFULLSTATEID();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_3_0, 
                              	        		"FULLSTATEID", 
                              	        		currentNode);
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
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( (lv_label_4_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( (lv_label_4_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:348:1: (lv_label_4_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:348:1: (lv_label_4_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:349:3: lv_label_4_0= RULE_STRING
                            {
                            lv_label_4_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState492); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_0_2_1_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_4_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:6: ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:6: ( ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:7: ( (lv_id_5_0= ruleFULLSTATEID ) ) ( (lv_label_6_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:7: ( (lv_id_5_0= ruleFULLSTATEID ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:373:1: (lv_id_5_0= ruleFULLSTATEID )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:373:1: (lv_id_5_0= ruleFULLSTATEID )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:374:3: lv_id_5_0= ruleFULLSTATEID
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_0_2_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleState525);
                            lv_id_5_0=ruleFULLSTATEID();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_5_0, 
                              	        		"FULLSTATEID", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:396:2: ( (lv_label_6_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:1: (lv_label_6_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:1: (lv_label_6_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:398:3: lv_label_6_0= RULE_STRING
                            {
                            lv_label_6_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState542); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_0_2_2_1_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_6_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

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
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: ( ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )? )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:7: ( (lv_isFinal_7_0= 'final' ) ) ( (lv_isInitial_8_0= 'init' ) )? ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:7: ( (lv_isFinal_7_0= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:422:1: (lv_isFinal_7_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:422:1: (lv_isFinal_7_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:423:3: lv_isFinal_7_0= 'final'
                    {
                    lv_isFinal_7_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleState576); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_1_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:442:2: ( (lv_isInitial_8_0= 'init' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==14) ) {
                        int LA8_1 = input.LA(2);

                        if ( (synpred13()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: (lv_isInitial_8_0= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: (lv_isInitial_8_0= 'init' )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:444:3: lv_isInitial_8_0= 'init'
                            {
                            lv_isInitial_8_0=(Token)input.LT(1);
                            match(input,14,FOLLOW_14_in_ruleState607); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_1_1_0(), "isInitial"); 
                                  
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

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:3: ( ( (lv_id_9_0= ruleFULLSTATEID ) ) | ( (lv_label_10_0= RULE_STRING ) ) | ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) ) )?
                    int alt9=4;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==RULE_STRING||LA9_1==41) ) {
                            alt9=3;
                        }
                        else if ( (synpred14()) ) {
                            alt9=1;
                        }
                    }
                    else if ( (LA9_0==RULE_STRING) ) {
                        int LA9_2 = input.LA(2);

                        if ( (synpred15()) ) {
                            alt9=2;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( (lv_id_9_0= ruleFULLSTATEID ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( (lv_id_9_0= ruleFULLSTATEID ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:464:1: (lv_id_9_0= ruleFULLSTATEID )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:464:1: (lv_id_9_0= ruleFULLSTATEID )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:465:3: lv_id_9_0= ruleFULLSTATEID
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleState643);
                            lv_id_9_0=ruleFULLSTATEID();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_9_0, 
                              	        		"FULLSTATEID", 
                              	        		currentNode);
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
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( (lv_label_10_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( (lv_label_10_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:1: (lv_label_10_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:1: (lv_label_10_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:490:3: lv_label_10_0= RULE_STRING
                            {
                            lv_label_10_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState666); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_1_2_1_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_10_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:6: ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:6: ( ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:7: ( (lv_id_11_0= ruleFULLSTATEID ) ) ( (lv_label_12_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:7: ( (lv_id_11_0= ruleFULLSTATEID ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:514:1: (lv_id_11_0= ruleFULLSTATEID )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:514:1: (lv_id_11_0= ruleFULLSTATEID )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:515:3: lv_id_11_0= ruleFULLSTATEID
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_1_2_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleState699);
                            lv_id_11_0=ruleFULLSTATEID();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_11_0, 
                              	        		"FULLSTATEID", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:537:2: ( (lv_label_12_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:538:1: (lv_label_12_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:538:1: (lv_label_12_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:539:3: lv_label_12_0= RULE_STRING
                            {
                            lv_label_12_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState716); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_1_2_2_1_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_12_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

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
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:6: ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:6: ( ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:7: ( (lv_type_13_0= ruleStateType ) )? ( (lv_id_14_0= ruleFULLSTATEID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:7: ( (lv_type_13_0= ruleStateType ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==32||(LA10_0>=45 && LA10_0<=47)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:563:1: (lv_type_13_0= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:563:1: (lv_type_13_0= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:564:3: lv_type_13_0= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState753);
                            lv_type_13_0=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_13_0, 
                              	        		"StateType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:586:3: ( (lv_id_14_0= ruleFULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:587:1: (lv_id_14_0= ruleFULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:587:1: (lv_id_14_0= ruleFULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:588:3: lv_id_14_0= ruleFULLSTATEID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleState775);
                    lv_id_14_0=ruleFULLSTATEID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_14_0, 
                      	        		"FULLSTATEID", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:6: ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:6: ( ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:7: ( (lv_type_15_0= ruleStateType ) )? ( (lv_label_16_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:7: ( (lv_type_15_0= ruleStateType ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==32||(LA11_0>=45 && LA11_0<=47)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:612:1: (lv_type_15_0= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:612:1: (lv_type_15_0= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:613:3: lv_type_15_0= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState804);
                            lv_type_15_0=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_15_0, 
                              	        		"StateType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:635:3: ( (lv_label_16_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:636:1: (lv_label_16_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:636:1: (lv_label_16_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:637:3: lv_label_16_0= RULE_STRING
                    {
                    lv_label_16_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState822); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_3_1_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_16_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:6: ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:6: ( ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:7: ( (lv_type_17_0= ruleStateType ) )? ( (lv_id_18_0= ruleFULLSTATEID ) ) ( (lv_label_19_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:7: ( (lv_type_17_0= ruleStateType ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==32||(LA12_0>=45 && LA12_0<=47)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:1: (lv_type_17_0= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:1: (lv_type_17_0= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:3: lv_type_17_0= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStateType_in_ruleState856);
                            lv_type_17_0=ruleStateType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_17_0, 
                              	        		"StateType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:684:3: ( (lv_id_18_0= ruleFULLSTATEID ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:685:1: (lv_id_18_0= ruleFULLSTATEID )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:685:1: (lv_id_18_0= ruleFULLSTATEID )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:686:3: lv_id_18_0= ruleFULLSTATEID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleState878);
                    lv_id_18_0=ruleFULLSTATEID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_18_0, 
                      	        		"FULLSTATEID", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:708:2: ( (lv_label_19_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:709:1: (lv_label_19_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:709:1: (lv_label_19_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:710:3: lv_label_19_0= RULE_STRING
                    {
                    lv_label_19_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState895); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_4_2_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_19_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:733:6: ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:733:6: ( ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:733:7: ( (lv_isInitial_20_0= 'init' ) )? ( (lv_isFinal_21_0= 'final' ) )? ( (lv_type_22_0= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:733:7: ( (lv_isInitial_20_0= 'init' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==14) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:734:1: (lv_isInitial_20_0= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:734:1: (lv_isInitial_20_0= 'init' )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:735:3: lv_isInitial_20_0= 'init'
                            {
                            lv_isInitial_20_0=(Token)input.LT(1);
                            match(input,14,FOLLOW_14_in_ruleState926); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_5_0_0(), "isInitial"); 
                                  
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

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:754:3: ( (lv_isFinal_21_0= 'final' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==15) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:755:1: (lv_isFinal_21_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:755:1: (lv_isFinal_21_0= 'final' )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:756:3: lv_isFinal_21_0= 'final'
                            {
                            lv_isFinal_21_0=(Token)input.LT(1);
                            match(input,15,FOLLOW_15_in_ruleState958); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_5_1_0(), "isFinal"); 
                                  
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

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:775:3: ( (lv_type_22_0= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:776:1: (lv_type_22_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:776:1: (lv_type_22_0= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:777:3: lv_type_22_0= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_5_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState993);
                    lv_type_22_0=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_22_0, 
                      	        		"StateType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:799:4: ( (lv_signals_23_0= ruleSignal ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=37 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:800:1: (lv_signals_23_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:800:1: (lv_signals_23_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:801:3: lv_signals_23_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleState1016);
            	    lv_signals_23_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_23_0, 
            	      	        		"Signal", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:823:3: ( 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:823:5: 'interface: ' ( (lv_interfaceDeclaration_25_0= RULE_STRING ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleState1028); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getInterfaceKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:827:1: ( (lv_interfaceDeclaration_25_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:828:1: (lv_interfaceDeclaration_25_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:828:1: (lv_interfaceDeclaration_25_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:829:3: lv_interfaceDeclaration_25_0= RULE_STRING
                    {
                    lv_interfaceDeclaration_25_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState1045); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getInterfaceDeclarationSTRINGTerminalRuleCall_3_1_0(), "interfaceDeclaration"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"interfaceDeclaration",
                      	        		lv_interfaceDeclaration_25_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:851:4: ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:851:6: 'onentry' ( (lv_entryActions_27_0= ruleAction ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleState1063); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_4_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:855:1: ( (lv_entryActions_27_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:856:1: (lv_entryActions_27_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:856:1: (lv_entryActions_27_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:857:3: lv_entryActions_27_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_4_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState1084);
            	    lv_entryActions_27_0=ruleAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"entryActions",
            	      	        		lv_entryActions_27_0, 
            	      	        		"Action", 
            	      	        		currentNode);
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
            	    break loop18;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:879:4: ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:879:6: 'oninner' ( (lv_innerActions_29_0= ruleAction ) )
            	    {
            	    match(input,18,FOLLOW_18_in_ruleState1097); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_5_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:1: ( (lv_innerActions_29_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:884:1: (lv_innerActions_29_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:884:1: (lv_innerActions_29_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:885:3: lv_innerActions_29_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState1118);
            	    lv_innerActions_29_0=ruleAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"innerActions",
            	      	        		lv_innerActions_29_0, 
            	      	        		"Action", 
            	      	        		currentNode);
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
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:907:4: ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:907:6: 'onexit' ( (lv_exitActions_31_0= ruleAction ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleState1131); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_6_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:911:1: ( (lv_exitActions_31_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:912:1: (lv_exitActions_31_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:912:1: (lv_exitActions_31_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:913:3: lv_exitActions_31_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_6_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState1152);
            	    lv_exitActions_31_0=ruleAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"exitActions",
            	      	        		lv_exitActions_31_0, 
            	      	        		"Action", 
            	      	        		currentNode);
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:935:4: ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:935:6: 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleState1165); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_7_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:939:1: ( (lv_suspensionTrigger_33_0= ruleAction ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:940:1: (lv_suspensionTrigger_33_0= ruleAction )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:940:1: (lv_suspensionTrigger_33_0= ruleAction )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:941:3: lv_suspensionTrigger_33_0= ruleAction
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_7_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleState1186);
                    lv_suspensionTrigger_33_0=ruleAction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"suspensionTrigger",
                      	        		lv_suspensionTrigger_33_0, 
                      	        		"Action", 
                      	        		currentNode);
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

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:963:4: ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            else if ( (LA27_0==EOF||(LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=14 && LA27_0<=15)||(LA27_0>=22 && LA27_0<=24)||LA27_0==32||(LA27_0>=45 && LA27_0<=47)||(LA27_0>=60 && LA27_0<=62)) ) {
                alt27=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("963:4: ( ';' | ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* ) )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:963:6: ';'
                    {
                    match(input,21,FOLLOW_21_in_ruleState1199); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getSemicolonKeyword_8_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:7: ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )? ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )? ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )*
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:7: ( '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==22) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==RULE_STRING) ) {
                            int LA23_3 = input.LA(3);

                            if ( (LA23_3==24) ) {
                                int LA23_5 = input.LA(4);

                                if ( (synpred34()) ) {
                                    alt23=1;
                                }
                            }
                            else if ( ((LA23_3>=RULE_ID && LA23_3<=RULE_STRING)||(LA23_3>=14 && LA23_3<=23)||LA23_3==32||(LA23_3>=37 && LA23_3<=39)||(LA23_3>=45 && LA23_3<=47)||(LA23_3>=60 && LA23_3<=62)) ) {
                                alt23=1;
                            }
                        }
                        else if ( (LA23_1==RULE_ID||(LA23_1>=13 && LA23_1<=15)||LA23_1==32||LA23_1==34||(LA23_1>=37 && LA23_1<=39)||(LA23_1>=45 && LA23_1<=47)) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:9: '{' ( (lv_regions_36_0= ruleRegion ) ) ( '||' ( (lv_regions_38_0= ruleRegion ) ) )* '}'
                            {
                            match(input,22,FOLLOW_22_in_ruleState1217); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:972:1: ( (lv_regions_36_0= ruleRegion ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:973:1: (lv_regions_36_0= ruleRegion )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:973:1: (lv_regions_36_0= ruleRegion )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:974:3: lv_regions_36_0= ruleRegion
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_8_1_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRegion_in_ruleState1238);
                            lv_regions_36_0=ruleRegion();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"regions",
                              	        		lv_regions_36_0, 
                              	        		"Region", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:996:2: ( '||' ( (lv_regions_38_0= ruleRegion ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==23) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:996:4: '||' ( (lv_regions_38_0= ruleRegion ) )
                            	    {
                            	    match(input,23,FOLLOW_23_in_ruleState1249); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_8_1_0_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1000:1: ( (lv_regions_38_0= ruleRegion ) )
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1001:1: (lv_regions_38_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1001:1: (lv_regions_38_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1002:3: lv_regions_38_0= ruleRegion
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_8_1_0_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleRegion_in_ruleState1270);
                            	    lv_regions_38_0=ruleRegion();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"regions",
                            	      	        		lv_regions_38_0, 
                            	      	        		"Region", 
                            	      	        		currentNode);
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
                            	    break loop22;
                                }
                            } while (true);

                            match(input,24,FOLLOW_24_in_ruleState1282); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_1_0_3(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1028:3: ( '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==22) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1028:5: '{' ( (lv_bodyText_41_0= RULE_STRING ) ) '}'
                            {
                            match(input,22,FOLLOW_22_in_ruleState1295); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1032:1: ( (lv_bodyText_41_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1033:1: (lv_bodyText_41_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1033:1: (lv_bodyText_41_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1034:3: lv_bodyText_41_0= RULE_STRING
                            {
                            lv_bodyText_41_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState1312); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_8_1_1_1_0(), "bodyText"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"bodyText",
                              	        		lv_bodyText_41_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }

                            match(input,24,FOLLOW_24_in_ruleState1327); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_1_1_2(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1060:3: ( ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=60 && LA26_0<=62)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1061:1: ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1061:1: ( (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition ) )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1062:1: (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1062:1: (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition )
                    	    int alt25=2;
                    	    switch ( input.LA(1) ) {
                    	    case 60:
                    	        {
                    	        int LA25_1 = input.LA(2);

                    	        if ( (LA25_1==RULE_ID) ) {
                    	            alt25=1;
                    	        }
                    	        else if ( (LA25_1==15||(LA25_1>=31 && LA25_1<=33)) ) {
                    	            alt25=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("1062:1: (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition )", 25, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 61:
                    	        {
                    	        int LA25_2 = input.LA(2);

                    	        if ( (LA25_2==RULE_ID) ) {
                    	            alt25=1;
                    	        }
                    	        else if ( (LA25_2==15||(LA25_2>=31 && LA25_2<=33)) ) {
                    	            alt25=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("1062:1: (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition )", 25, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 62:
                    	        {
                    	        int LA25_3 = input.LA(2);

                    	        if ( (LA25_3==RULE_ID) ) {
                    	            alt25=1;
                    	        }
                    	        else if ( (LA25_3==15||(LA25_3>=31 && LA25_3<=33)) ) {
                    	            alt25=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("1062:1: (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition )", 25, 3, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1062:1: (lv_outgoingTransitions_43_1= ruleTransition | lv_outgoingTransitions_43_2= ruleTextualTransition )", 25, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1063:3: lv_outgoingTransitions_43_1= ruleTransition
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_8_1_2_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleTransition_in_ruleState1352);
                    	            lv_outgoingTransitions_43_1=ruleTransition();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"outgoingTransitions",
                    	              	        		lv_outgoingTransitions_43_1, 
                    	              	        		"Transition", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1084:8: lv_outgoingTransitions_43_2= ruleTextualTransition
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTextualTransitionParserRuleCall_8_1_2_0_1(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleTextualTransition_in_ruleState1371);
                    	            lv_outgoingTransitions_43_2=ruleTextualTransition();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"outgoingTransitions",
                    	              	        		lv_outgoingTransitions_43_2, 
                    	              	        		"TextualTransition", 
                    	              	        		currentNode);
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
                    	    break;

                    	default :
                    	    break loop26;
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


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1116:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1117:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1118:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1413);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1423); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1125:1: ruleTransition returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ) )? ( (lv_isHistory_11_0= ' history' ) )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_3_0=null;
        Token lv_delay_5_0=null;
        Token lv_isHistory_11_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_trigger_6_0 = null;

        EObject lv_effects_8_0 = null;

        EObject lv_effects_10_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1130:6: ( ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ) )? ( (lv_isHistory_11_0= ' history' ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1131:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ) )? ( (lv_isHistory_11_0= ' history' ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1131:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ) )? ( (lv_isHistory_11_0= ' history' ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1131:2: ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ) )? ( (lv_isHistory_11_0= ' history' ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1131:2: ( (lv_type_0_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1132:1: (lv_type_0_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1132:1: (lv_type_0_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1133:3: lv_type_0_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition1469);
            lv_type_0_0=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"TransitionType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1155:2: ( ( ruleFULLSTATEID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1156:1: ( ruleFULLSTATEID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1156:1: ( ruleFULLSTATEID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1157:3: ruleFULLSTATEID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleTransition1496);
            ruleFULLSTATEID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1174:2: ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1174:4: 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleTransition1507); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1178:1: ( (lv_isImmediate_3_0= '#' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==26) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1179:1: (lv_isImmediate_3_0= '#' )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1179:1: (lv_isImmediate_3_0= '#' )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1180:3: lv_isImmediate_3_0= '#'
                            {
                            lv_isImmediate_3_0=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleTransition1525); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_2_1_0(), "isImmediate"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isImmediate", true, "#", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1199:3: ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==27) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1199:5: 'delay:=' ( (lv_delay_5_0= RULE_INT ) )
                            {
                            match(input,27,FOLLOW_27_in_ruleTransition1550); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getDelayKeyword_2_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1203:1: ( (lv_delay_5_0= RULE_INT ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1204:1: (lv_delay_5_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1204:1: (lv_delay_5_0= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1205:3: lv_delay_5_0= RULE_INT
                            {
                            lv_delay_5_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition1567); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_2_1_0(), "delay"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"delay",
                              	        		lv_delay_5_0, 
                              	        		"INT", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1227:4: ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1227:5: ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1227:5: ( (lv_trigger_6_0= ruleBooleanExpression ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_FLOAT)||LA30_0==43||LA30_0==63||(LA30_0>=70 && LA30_0<=71)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1228:1: (lv_trigger_6_0= ruleBooleanExpression )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1228:1: (lv_trigger_6_0= ruleBooleanExpression )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1229:3: lv_trigger_6_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_2_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleTransition1596);
                            lv_trigger_6_0=ruleBooleanExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"trigger",
                              	        		lv_trigger_6_0, 
                              	        		"BooleanExpression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1251:3: ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )? )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1251:5: '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )?
                    {
                    match(input,28,FOLLOW_28_in_ruleTransition1608); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getSolidusKeyword_2_3_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1255:1: ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_STRING)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1255:2: ( (lv_effects_8_0= ruleEffect ) ) ( ',' ( (lv_effects_10_0= ruleEffect ) ) )*
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1255:2: ( (lv_effects_8_0= ruleEffect ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1256:1: (lv_effects_8_0= ruleEffect )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1256:1: (lv_effects_8_0= ruleEffect )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1257:3: lv_effects_8_0= ruleEffect
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_2_3_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEffect_in_ruleTransition1630);
                            lv_effects_8_0=ruleEffect();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"effects",
                              	        		lv_effects_8_0, 
                              	        		"Effect", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1279:2: ( ',' ( (lv_effects_10_0= ruleEffect ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==29) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1279:4: ',' ( (lv_effects_10_0= ruleEffect ) )
                            	    {
                            	    match(input,29,FOLLOW_29_in_ruleTransition1641); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_2_3_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1283:1: ( (lv_effects_10_0= ruleEffect ) )
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1284:1: (lv_effects_10_0= ruleEffect )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1284:1: (lv_effects_10_0= ruleEffect )
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1285:3: lv_effects_10_0= ruleEffect
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_2_3_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEffect_in_ruleTransition1662);
                            	    lv_effects_10_0=ruleEffect();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"effects",
                            	      	        		lv_effects_10_0, 
                            	      	        		"Effect", 
                            	      	        		currentNode);
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1307:10: ( (lv_isHistory_11_0= ' history' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1308:1: (lv_isHistory_11_0= ' history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1308:1: (lv_isHistory_11_0= ' history' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1309:3: lv_isHistory_11_0= ' history'
                    {
                    lv_isHistory_11_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleTransition1688); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_3_0(), "isHistory"); 
                          
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


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleTransition1712); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_4(), null); 
                  
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


    // $ANTLR start entryRuleTextualTransition
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1340:1: entryRuleTextualTransition returns [EObject current=null] : iv_ruleTextualTransition= ruleTextualTransition EOF ;
    public final EObject entryRuleTextualTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1341:2: (iv_ruleTextualTransition= ruleTextualTransition EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1342:2: iv_ruleTextualTransition= ruleTextualTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextualTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextualTransition_in_entryRuleTextualTransition1748);
            iv_ruleTextualTransition=ruleTextualTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextualTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextualTransition1758); if (failed) return current;

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
    // $ANTLR end entryRuleTextualTransition


    // $ANTLR start ruleTextualTransition
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1349:1: ruleTextualTransition returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransitionType ) ) ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) ) ( (lv_targetStateProxy_4_0= ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_13_0= ' history' ) )? ';' ) ;
    public final EObject ruleTextualTransition() throws RecognitionException {
        EObject current = null;

        Token lv_makeConditional_2_1=null;
        Token lv_makeConditional_2_2=null;
        Token lv_makeFinal_3_0=null;
        Token lv_isImmediate_6_0=null;
        Token lv_delay_8_0=null;
        Token lv_isHistory_13_0=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_targetStateProxy_4_0 = null;

        EObject lv_trigger_9_0 = null;

        EObject lv_effects_11_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1354:6: ( ( ( (lv_type_0_0= ruleTransitionType ) ) ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) ) ( (lv_targetStateProxy_4_0= ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_13_0= ' history' ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1355:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) ) ( (lv_targetStateProxy_4_0= ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_13_0= ' history' ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1355:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) ) ( (lv_targetStateProxy_4_0= ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_13_0= ' history' ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1355:2: ( (lv_type_0_0= ruleTransitionType ) ) ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) ) ( (lv_targetStateProxy_4_0= ruleFULLSTATEID ) ) ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_13_0= ' history' ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1355:2: ( (lv_type_0_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1356:1: (lv_type_0_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1356:1: (lv_type_0_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1357:3: lv_type_0_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTypeTransitionTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTextualTransition1804);
            lv_type_0_0=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"TransitionType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1379:2: ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt36=1;
                }
                break;
            case 32:
            case 33:
                {
                alt36=2;
                }
                break;
            case 15:
                {
                alt36=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1379:2: ( 'state' | ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) ) | ( (lv_makeFinal_3_0= 'final' ) ) )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1379:4: 'state'
                    {
                    match(input,31,FOLLOW_31_in_ruleTextualTransition1815); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getStateKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1384:6: ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1384:6: ( ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1385:1: ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1385:1: ( (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1386:1: (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1386:1: (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==32) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==33) ) {
                        alt35=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1386:1: (lv_makeConditional_2_1= 'cond' | lv_makeConditional_2_2= 'conditional' )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:3: lv_makeConditional_2_1= 'cond'
                            {
                            lv_makeConditional_2_1=(Token)input.LT(1);
                            match(input,32,FOLLOW_32_in_ruleTextualTransition1841); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getMakeConditionalCondKeyword_1_1_0_0(), "makeConditional"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "makeConditional", true, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1405:8: lv_makeConditional_2_2= 'conditional'
                            {
                            lv_makeConditional_2_2=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleTextualTransition1870); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getMakeConditionalConditionalKeyword_1_1_0_1(), "makeConditional"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "makeConditional", true, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1427:6: ( (lv_makeFinal_3_0= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1427:6: ( (lv_makeFinal_3_0= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1428:1: (lv_makeFinal_3_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1428:1: (lv_makeFinal_3_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1429:3: lv_makeFinal_3_0= 'final'
                    {
                    lv_makeFinal_3_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleTextualTransition1910); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getMakeFinalFinalKeyword_1_2_0(), "makeFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "makeFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1448:3: ( (lv_targetStateProxy_4_0= ruleFULLSTATEID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1449:1: (lv_targetStateProxy_4_0= ruleFULLSTATEID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1449:1: (lv_targetStateProxy_4_0= ruleFULLSTATEID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1450:3: lv_targetStateProxy_4_0= ruleFULLSTATEID
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTargetStateProxyFULLSTATEIDParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFULLSTATEID_in_ruleTextualTransition1945);
            lv_targetStateProxy_4_0=ruleFULLSTATEID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"targetStateProxy",
              	        		lv_targetStateProxy_4_0, 
              	        		"FULLSTATEID", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1472:2: ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1472:4: 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? )
                    {
                    match(input,25,FOLLOW_25_in_ruleTextualTransition1956); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1476:1: ( (lv_isImmediate_6_0= '#' ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==26) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1477:1: (lv_isImmediate_6_0= '#' )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1477:1: (lv_isImmediate_6_0= '#' )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1478:3: lv_isImmediate_6_0= '#'
                            {
                            lv_isImmediate_6_0=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleTextualTransition1974); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getIsImmediateNumberSignKeyword_3_1_0(), "isImmediate"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isImmediate", true, "#", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1497:3: ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==27) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1497:5: 'delay:=' ( (lv_delay_8_0= RULE_INT ) )
                            {
                            match(input,27,FOLLOW_27_in_ruleTextualTransition1999); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getDelayKeyword_3_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1501:1: ( (lv_delay_8_0= RULE_INT ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1502:1: (lv_delay_8_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1502:1: (lv_delay_8_0= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1503:3: lv_delay_8_0= RULE_INT
                            {
                            lv_delay_8_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextualTransition2016); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTextualTransitionAccess().getDelayINTTerminalRuleCall_3_2_1_0(), "delay"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"delay",
                              	        		lv_delay_8_0, 
                              	        		"INT", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:4: ( ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )? )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:5: ( (lv_trigger_9_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )?
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:5: ( (lv_trigger_9_0= ruleBooleanExpression ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_FLOAT)||LA39_0==43||LA39_0==63||(LA39_0>=70 && LA39_0<=71)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1526:1: (lv_trigger_9_0= ruleBooleanExpression )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1526:1: (lv_trigger_9_0= ruleBooleanExpression )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1527:3: lv_trigger_9_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleTextualTransition2045);
                            lv_trigger_9_0=ruleBooleanExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"trigger",
                              	        		lv_trigger_9_0, 
                              	        		"BooleanExpression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:3: ( '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==28) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:5: '/' ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )*
                            {
                            match(input,28,FOLLOW_28_in_ruleTextualTransition2057); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getSolidusKeyword_3_3_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1553:1: ( ( (lv_effects_11_0= ruleEffect ) ) ( ',' )? )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1553:2: ( (lv_effects_11_0= ruleEffect ) ) ( ',' )?
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1553:2: ( (lv_effects_11_0= ruleEffect ) )
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1554:1: (lv_effects_11_0= ruleEffect )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1554:1: (lv_effects_11_0= ruleEffect )
                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1555:3: lv_effects_11_0= ruleEffect
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getEffectsEffectParserRuleCall_3_3_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEffect_in_ruleTextualTransition2079);
                            	    lv_effects_11_0=ruleEffect();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"effects",
                            	      	        		lv_effects_11_0, 
                            	      	        		"Effect", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1577:2: ( ',' )?
                            	    int alt40=2;
                            	    int LA40_0 = input.LA(1);

                            	    if ( (LA40_0==29) ) {
                            	        alt40=1;
                            	    }
                            	    switch (alt40) {
                            	        case 1 :
                            	            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1577:4: ','
                            	            {
                            	            match(input,29,FOLLOW_29_in_ruleTextualTransition2090); if (failed) return current;
                            	            if ( backtracking==0 ) {

                            	                      createLeafNode(grammarAccess.getTextualTransitionAccess().getCommaKeyword_3_3_1_1_1(), null); 
                            	                  
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1581:10: ( (lv_isHistory_13_0= ' history' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==30) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1582:1: (lv_isHistory_13_0= ' history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1582:1: (lv_isHistory_13_0= ' history' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1583:3: lv_isHistory_13_0= ' history'
                    {
                    lv_isHistory_13_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleTextualTransition2117); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getIsHistoryHistoryKeyword_4_0(), "isHistory"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isHistory", true, " history", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleTextualTransition2141); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTextualTransitionAccess().getSemicolonKeyword_5(), null); 
                  
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
    // $ANTLR end ruleTextualTransition


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1616:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1617:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1618:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2179);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2189); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1625:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;

        Enumerator lv_type_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1630:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1631:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1631:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1631:3: 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';'
            {
            match(input,34,FOLLOW_34_in_ruleVariable2224); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1635:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1636:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1636:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1637:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2241); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1659:2: ( ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1659:3: ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1659:3: ( ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1659:5: ':=' ( (lv_initialValue_3_0= ruleVARSIGVALUE ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleVariable2258); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1663:1: ( (lv_initialValue_3_0= ruleVARSIGVALUE ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1664:1: (lv_initialValue_3_0= ruleVARSIGVALUE )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1664:1: (lv_initialValue_3_0= ruleVARSIGVALUE )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1665:3: lv_initialValue_3_0= ruleVARSIGVALUE
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getInitialValueVARSIGVALUEParserRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVARSIGVALUE_in_ruleVariable2279);
                    lv_initialValue_3_0=ruleVARSIGVALUE();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_3_0, 
                      	        		"VARSIGVALUE", 
                      	        		currentNode);
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

            match(input,36,FOLLOW_36_in_ruleVariable2291); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1691:1: ( (lv_type_5_0= ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1692:1: (lv_type_5_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1692:1: (lv_type_5_0= ruleValueType )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1693:3: lv_type_5_0= ruleValueType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueType_in_ruleVariable2312);
            lv_type_5_0=ruleValueType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_5_0, 
              	        		"ValueType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            match(input,21,FOLLOW_21_in_ruleVariable2323); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getSemicolonKeyword_3(), null); 
                  
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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1727:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1728:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal2359);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal2369); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1736:1: ruleSignal returns [EObject current=null] : ( ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' ) ( (lv_name_3_0= ruleQUALIFIEDNAME ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_0_0=null;
        Token lv_isOutput_1_0=null;
        Token lv_hostCombineOperator_12_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_5_0 = null;

        Enumerator lv_type_7_0 = null;

        Enumerator lv_type_9_0 = null;

        Enumerator lv_combineOperator_11_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1741:6: ( ( ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' ) ( (lv_name_3_0= ruleQUALIFIEDNAME ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1742:1: ( ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' ) ( (lv_name_3_0= ruleQUALIFIEDNAME ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1742:1: ( ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' ) ( (lv_name_3_0= ruleQUALIFIEDNAME ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1742:2: ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' ) ( (lv_name_3_0= ruleQUALIFIEDNAME ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1742:2: ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt46=1;
                }
                break;
            case 38:
                {
                alt46=2;
                }
                break;
            case 39:
                {
                alt46=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1742:2: ( ( (lv_isInput_0_0= 'input' ) ) | ( (lv_isOutput_1_0= 'output' ) ) | 'signal' )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1742:3: ( (lv_isInput_0_0= 'input' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1742:3: ( (lv_isInput_0_0= 'input' ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1743:1: (lv_isInput_0_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1743:1: (lv_isInput_0_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1744:3: lv_isInput_0_0= 'input'
                    {
                    lv_isInput_0_0=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleSignal2413); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_0_0(), "isInput"); 
                          
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


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1764:6: ( (lv_isOutput_1_0= 'output' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1764:6: ( (lv_isOutput_1_0= 'output' ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1765:1: (lv_isOutput_1_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1765:1: (lv_isOutput_1_0= 'output' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1766:3: lv_isOutput_1_0= 'output'
                    {
                    lv_isOutput_1_0=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleSignal2450); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_0_1_0(), "isOutput"); 
                          
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


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1786:7: 'signal'
                    {
                    match(input,39,FOLLOW_39_in_ruleSignal2479); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getSignalKeyword_0_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1790:2: ( (lv_name_3_0= ruleQUALIFIEDNAME ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1791:1: (lv_name_3_0= ruleQUALIFIEDNAME )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1791:1: (lv_name_3_0= ruleQUALIFIEDNAME )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1792:3: lv_name_3_0= ruleQUALIFIEDNAME
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getNameQUALIFIEDNAMEParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleSignal2501);
            lv_name_3_0=ruleQUALIFIEDNAME();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"QUALIFIEDNAME", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1814:2: ( ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=35 && LA50_0<=36)||LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1814:3: ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )? ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1814:3: ( ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==35) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1814:5: ':=' ( (lv_initialValue_5_0= ruleVARSIGVALUE ) )
                            {
                            match(input,35,FOLLOW_35_in_ruleSignal2513); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1818:1: ( (lv_initialValue_5_0= ruleVARSIGVALUE ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1819:1: (lv_initialValue_5_0= ruleVARSIGVALUE )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1819:1: (lv_initialValue_5_0= ruleVARSIGVALUE )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1820:3: lv_initialValue_5_0= ruleVARSIGVALUE
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getInitialValueVARSIGVALUEParserRuleCall_2_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVARSIGVALUE_in_ruleSignal2534);
                            lv_initialValue_5_0=ruleVARSIGVALUE();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"initialValue",
                              	        		lv_initialValue_5_0, 
                              	        		"VARSIGVALUE", 
                              	        		currentNode);
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

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:4: ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==40) ) {
                        alt49=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1842:4: ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) )", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:5: ( ': ' ( (lv_type_7_0= ruleValueType ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:5: ( ': ' ( (lv_type_7_0= ruleValueType ) ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:7: ': ' ( (lv_type_7_0= ruleValueType ) )
                            {
                            match(input,36,FOLLOW_36_in_ruleSignal2548); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_1_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1846:1: ( (lv_type_7_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1847:1: (lv_type_7_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1847:1: (lv_type_7_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1848:3: lv_type_7_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal2569);
                            lv_type_7_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_7_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1871:6: ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1871:6: ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1871:8: ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) )
                            {
                            match(input,40,FOLLOW_40_in_ruleSignal2587); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_1_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1875:1: ( (lv_type_9_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1876:1: (lv_type_9_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1876:1: (lv_type_9_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1877:3: lv_type_9_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal2608);
                            lv_type_9_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_9_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            match(input,25,FOLLOW_25_in_ruleSignal2618); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_1_1_2(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1903:1: ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) )
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( ((LA48_0>=48 && LA48_0<=53)) ) {
                                alt48=1;
                            }
                            else if ( (LA48_0==RULE_STRING) ) {
                                alt48=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1903:1: ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) )", 48, 0, input);

                                throw nvae;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1903:2: ( (lv_combineOperator_11_0= ruleCombineOperator ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1903:2: ( (lv_combineOperator_11_0= ruleCombineOperator ) )
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1904:1: (lv_combineOperator_11_0= ruleCombineOperator )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1904:1: (lv_combineOperator_11_0= ruleCombineOperator )
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1905:3: lv_combineOperator_11_0= ruleCombineOperator
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_1_3_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal2640);
                                    lv_combineOperator_11_0=ruleCombineOperator();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"combineOperator",
                                      	        		lv_combineOperator_11_0, 
                                      	        		"CombineOperator", 
                                      	        		currentNode);
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
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1928:6: ( (lv_hostCombineOperator_12_0= RULE_STRING ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1928:6: ( (lv_hostCombineOperator_12_0= RULE_STRING ) )
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1929:1: (lv_hostCombineOperator_12_0= RULE_STRING )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1929:1: (lv_hostCombineOperator_12_0= RULE_STRING )
                                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:3: lv_hostCombineOperator_12_0= RULE_STRING
                                    {
                                    lv_hostCombineOperator_12_0=(Token)input.LT(1);
                                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2663); if (failed) return current;
                                    if ( backtracking==0 ) {

                                      			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_2_1_1_3_1_0(), "hostCombineOperator"); 
                                      		
                                    }
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode, current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"hostCombineOperator",
                                      	        		lv_hostCombineOperator_12_0, 
                                      	        		"STRING", 
                                      	        		lastConsumedNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	    
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
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleSignal2683); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getSemicolonKeyword_3(), null); 
                  
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


    // $ANTLR start entryRuleFULLSTATEID
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1964:1: entryRuleFULLSTATEID returns [String current=null] : iv_ruleFULLSTATEID= ruleFULLSTATEID EOF ;
    public final String entryRuleFULLSTATEID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULLSTATEID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1965:2: (iv_ruleFULLSTATEID= ruleFULLSTATEID EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1966:2: iv_ruleFULLSTATEID= ruleFULLSTATEID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFULLSTATEIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFULLSTATEID_in_entryRuleFULLSTATEID2720);
            iv_ruleFULLSTATEID=ruleFULLSTATEID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFULLSTATEID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULLSTATEID2731); if (failed) return current;

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
    // $ANTLR end entryRuleFULLSTATEID


    // $ANTLR start ruleFULLSTATEID
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:1: ruleFULLSTATEID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFULLSTATEID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1978:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1979:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1979:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1979:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1979:2: (this_ID_0= RULE_ID kw= '@' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==41) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1979:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULLSTATEID2772); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFULLSTATEIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleFULLSTATEID2790); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFULLSTATEIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFULLSTATEID2807); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFULLSTATEIDAccess().getIDTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleFULLSTATEID


    // $ANTLR start entryRuleVARSIGVALUE
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2007:1: entryRuleVARSIGVALUE returns [String current=null] : iv_ruleVARSIGVALUE= ruleVARSIGVALUE EOF ;
    public final String entryRuleVARSIGVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVARSIGVALUE = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2008:2: (iv_ruleVARSIGVALUE= ruleVARSIGVALUE EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2009:2: iv_ruleVARSIGVALUE= ruleVARSIGVALUE EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVARSIGVALUERule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVARSIGVALUE_in_entryRuleVARSIGVALUE2853);
            iv_ruleVARSIGVALUE=ruleVARSIGVALUE();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVARSIGVALUE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARSIGVALUE2864); if (failed) return current;

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
    // $ANTLR end entryRuleVARSIGVALUE


    // $ANTLR start ruleVARSIGVALUE
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2016:1: ruleVARSIGVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING | this_FLOAT_4= RULE_FLOAT )+ ;
    public final AntlrDatatypeRuleToken ruleVARSIGVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_BOOLEAN_2=null;
        Token this_STRING_3=null;
        Token this_FLOAT_4=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2021:6: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING | this_FLOAT_4= RULE_FLOAT )+ )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2022:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING | this_FLOAT_4= RULE_FLOAT )+
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2022:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_BOOLEAN_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING | this_FLOAT_4= RULE_FLOAT )+
            int cnt52=0;
            loop52:
            do {
                int alt52=6;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt52=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt52=2;
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    alt52=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt52=4;
                    }
                    break;
                case RULE_FLOAT:
                    {
                    alt52=5;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2022:6: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVARSIGVALUE2904); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_INT_0);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVARSIGVALUEAccess().getINTTerminalRuleCall_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2030:10: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARSIGVALUE2930); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVARSIGVALUEAccess().getIDTerminalRuleCall_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2038:10: this_BOOLEAN_2= RULE_BOOLEAN
            	    {
            	    this_BOOLEAN_2=(Token)input.LT(1);
            	    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleVARSIGVALUE2956); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_BOOLEAN_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVARSIGVALUEAccess().getBOOLEANTerminalRuleCall_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2046:10: this_STRING_3= RULE_STRING
            	    {
            	    this_STRING_3=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVARSIGVALUE2982); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_STRING_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVARSIGVALUEAccess().getSTRINGTerminalRuleCall_3(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2054:10: this_FLOAT_4= RULE_FLOAT
            	    {
            	    this_FLOAT_4=(Token)input.LT(1);
            	    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleVARSIGVALUE3008); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_FLOAT_4);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVARSIGVALUEAccess().getFLOATTerminalRuleCall_4(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
    // $ANTLR end ruleVARSIGVALUE


    // $ANTLR start entryRuleQUALIFIEDNAME
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2069:1: entryRuleQUALIFIEDNAME returns [String current=null] : iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF ;
    public final String entryRuleQUALIFIEDNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIEDNAME = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2070:2: (iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2071:2: iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQUALIFIEDNAMERule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME3055);
            iv_ruleQUALIFIEDNAME=ruleQUALIFIEDNAME();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQUALIFIEDNAME.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDNAME3066); if (failed) return current;

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
    // $ANTLR end entryRuleQUALIFIEDNAME


    // $ANTLR start ruleQUALIFIEDNAME
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2078:1: ruleQUALIFIEDNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIEDNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2083:6: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2084:1: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2084:1: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2084:2: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2084:2: (this_ID_0= RULE_ID kw= '.' )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==42) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2084:7: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME3107); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0_0(), null); 
            	          
            	    }
            	    kw=(Token)input.LT(1);
            	    match(input,42,FOLLOW_42_in_ruleQUALIFIEDNAME3125); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_0_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME3142); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleQUALIFIEDNAME


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2112:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2113:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2114:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction3187);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction3197); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2121:1: ruleAction returns [EObject current=null] : ( ( (lv_isImmediate_0_0= '#' ) )? ( (lv_delay_1_0= RULE_INT ) )? ( (lv_trigger_2_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )? ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0_0=null;
        Token lv_delay_1_0=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_effects_4_0 = null;

        EObject lv_effects_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2126:6: ( ( ( (lv_isImmediate_0_0= '#' ) )? ( (lv_delay_1_0= RULE_INT ) )? ( (lv_trigger_2_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )? ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2127:1: ( ( (lv_isImmediate_0_0= '#' ) )? ( (lv_delay_1_0= RULE_INT ) )? ( (lv_trigger_2_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )? ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2127:1: ( ( (lv_isImmediate_0_0= '#' ) )? ( (lv_delay_1_0= RULE_INT ) )? ( (lv_trigger_2_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )? ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2127:2: ( (lv_isImmediate_0_0= '#' ) )? ( (lv_delay_1_0= RULE_INT ) )? ( (lv_trigger_2_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2127:2: ( (lv_isImmediate_0_0= '#' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2128:1: (lv_isImmediate_0_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2128:1: (lv_isImmediate_0_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2129:3: lv_isImmediate_0_0= '#'
                    {
                    lv_isImmediate_0_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleAction3240); if (failed) return current;
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


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2148:3: ( (lv_delay_1_0= RULE_INT ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=RULE_ID && LA55_1<=RULE_FLOAT)||LA55_1==28||LA55_1==43||LA55_1==63||(LA55_1>=70 && LA55_1<=71)) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2149:1: (lv_delay_1_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2149:1: (lv_delay_1_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2150:3: lv_delay_1_0= RULE_INT
                    {
                    lv_delay_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction3271); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0(), "delay"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"delay",
                      	        		lv_delay_1_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2172:3: ( (lv_trigger_2_0= ruleBooleanExpression ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_FLOAT)||LA56_0==43||LA56_0==63||(LA56_0>=70 && LA56_0<=71)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2173:1: (lv_trigger_2_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2173:1: (lv_trigger_2_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2174:3: lv_trigger_2_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction3298);
                    lv_trigger_2_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"trigger",
                      	        		lv_trigger_2_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2196:3: ( '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )? )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2196:5: '/' ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            {
            match(input,28,FOLLOW_28_in_ruleAction3310); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_3_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2200:1: ( ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==35||LA58_1==43) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==RULE_STRING) ) {
                int LA58_2 = input.LA(2);

                if ( (synpred74()) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2200:2: ( (lv_effects_4_0= ruleEffect ) ) ( ',' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2200:2: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2201:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2201:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2202:3: lv_effects_4_0= ruleEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEffect_in_ruleAction3332);
                    lv_effects_4_0=ruleEffect();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"effects",
                      	        		lv_effects_4_0, 
                      	        		"Effect", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2224:2: ( ',' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==29) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2224:4: ',' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    match(input,29,FOLLOW_29_in_ruleAction3343); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_3_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2228:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2230:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction3364);
                    	    lv_effects_6_0=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"effects",
                    	      	        		lv_effects_6_0, 
                    	      	        		"Effect", 
                    	      	        		currentNode);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2260:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2261:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2262:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect3405);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect3415); if (failed) return current;

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
    // $ANTLR end entryRuleEffect


    // $ANTLR start ruleEffect
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2269:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2274:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2275:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2275:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==35) ) {
                    alt59=2;
                }
                else if ( (LA59_1==43) ) {
                    alt59=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2275:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==RULE_STRING) ) {
                alt59=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2275:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2276:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect3465);
                    this_Emission_0=ruleEmission();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Emission_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2289:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect3495);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2302:2: this_HostCode_2= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect3525);
                    this_HostCode_2=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_2; 
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
    // $ANTLR end ruleEffect


    // $ANTLR start entryRuleEmission
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2321:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2322:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2323:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission3560);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission3570); if (failed) return current;

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
    // $ANTLR end entryRuleEmission


    // $ANTLR start ruleEmission
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2330:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) ) ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;

        EObject lv_newValue_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2335:6: ( ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:2: ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2337:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2337:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2338:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission3617); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:2: ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred77()) ) {
                    alt60=1;
                }
                else if ( (true) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2353:2: ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2353:2: ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:3: ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:3: ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:5: '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleEmission3629); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2357:1: ( (lv_newValue_2_0= ruleValueExpression ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2358:1: (lv_newValue_2_0= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2358:1: (lv_newValue_2_0= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2359:3: lv_newValue_2_0= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleEmission3650);
                    lv_newValue_2_0=ruleValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newValue",
                      	        		lv_newValue_2_0, 
                      	        		"ValueExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,44,FOLLOW_44_in_ruleEmission3660); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2386:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2386:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2386:8: '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleEmission3678); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2390:1: ( (lv_newValue_5_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2391:1: (lv_newValue_5_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2391:1: (lv_newValue_5_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2392:3: lv_newValue_5_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleEmission3699);
                    lv_newValue_5_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newValue",
                      	        		lv_newValue_5_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,44,FOLLOW_44_in_ruleEmission3709); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2(), null); 
                          
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
    // $ANTLR end ruleEmission


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2426:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2427:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2428:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3747);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3757); if (failed) return current;

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2435:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2440:6: ( ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2441:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2441:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2441:2: ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2441:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2442:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2442:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2443:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment3804); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,35,FOLLOW_35_in_ruleAssignment3814); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt61=2;
            switch ( input.LA(1) ) {
            case 71:
                {
                int LA61_1 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA61_2 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA61_3 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 3, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA61_4 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA61_5 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA61_6 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 6, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA61_7 = input.LA(2);

                if ( (synpred78()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 70:
                {
                alt61=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2462:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:2: ( (lv_expression_2_0= ruleValueExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:2: ( (lv_expression_2_0= ruleValueExpression ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: (lv_expression_2_0= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: (lv_expression_2_0= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2464:3: lv_expression_2_0= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleAssignment3836);
                    lv_expression_2_0=ruleValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_2_0, 
                      	        		"ValueExpression", 
                      	        		currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2487:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2487:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2488:1: (lv_expression_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2488:1: (lv_expression_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2489:3: lv_expression_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAssignment3863);
                    lv_expression_3_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_3_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2519:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2520:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2521:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference3900);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference3910); if (failed) return current;

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
    // $ANTLR end entryRuleSignalReference


    // $ANTLR start ruleSignalReference
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2528:1: ruleSignalReference returns [EObject current=null] : ( '(' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2533:6: ( ( '(' ( ( RULE_ID ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:1: ( '(' ( ( RULE_ID ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:1: ( '(' ( ( RULE_ID ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:3: '(' ( ( RULE_ID ) ) ')'
            {
            match(input,43,FOLLOW_43_in_ruleSignalReference3945); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2538:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2539:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2539:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2540:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference3967); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_1_0(), "signal"); 
              	
            }

            }


            }

            match(input,44,FOLLOW_44_in_ruleSignalReference3977); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_2(), null); 
                  
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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2567:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2568:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2569:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference4013);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference4023); if (failed) return current;

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
    // $ANTLR end entryRuleVariableReference


    // $ANTLR start ruleVariableReference
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2576:1: ruleVariableReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2581:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2582:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2582:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2583:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2583:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2584:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference4069); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0(), "variable"); 
              	
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
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2607:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2608:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2609:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue4104);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue4114); if (failed) return current;

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
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2616:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2621:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2622:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2622:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2623:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2623:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2624:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue4155); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2654:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2655:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2656:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue4195);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue4205); if (failed) return current;

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
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2663:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2668:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2669:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2669:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2670:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2670:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2671:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue4246); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"FLOAT", 
              	        		lastConsumedNode);
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
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2701:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2702:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2703:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4286);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue4296); if (failed) return current;

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
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2710:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2715:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2716:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2716:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2717:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2717:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2718:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue4337); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"BOOLEAN", 
              	        		lastConsumedNode);
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
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2750:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2751:2: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2752:2: iv_ruleValOperation= ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation4379);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation4389); if (failed) return current;

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
    // $ANTLR end entryRuleValOperation


    // $ANTLR start ruleValOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2759:1: ruleValOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2764:6: ( ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2765:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2765:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2765:2: ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2765:2: ( (lv_operator_0_0= ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2766:1: (lv_operator_0_0= ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2766:1: (lv_operator_0_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2767:3: lv_operator_0_0= ruleValOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation4435);
            lv_operator_0_0=ruleValOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"ValOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2789:2: ( (lv_subExpressions_1_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2790:1: (lv_subExpressions_1_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2790:1: (lv_subExpressions_1_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2791:3: lv_subExpressions_1_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation4456);
            lv_subExpressions_1_0=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_1_0, 
              	        		"SignalReference", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end ruleValOperation


    // $ANTLR start entryRuleValueExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2821:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2822:2: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2823:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression4492);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression4502); if (failed) return current;

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
    // $ANTLR end entryRuleValueExpression


    // $ANTLR start ruleValueExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2830:1: ruleValueExpression returns [EObject current=null] : this_PlusOperation_0= rulePlusOperation ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOperation_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2835:6: (this_PlusOperation_0= rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2837:2: this_PlusOperation_0= rulePlusOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValueExpression4551);
            this_PlusOperation_0=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PlusOperation_0; 
                      currentNode = currentNode.getParent();
                  
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
    // $ANTLR end ruleValueExpression


    // $ANTLR start entryRuleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2856:1: entryRuleParanthesedValueExpression returns [EObject current=null] : iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF ;
    public final EObject entryRuleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2857:2: (iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2858:2: iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression4585);
            iv_ruleParanthesedValueExpression=ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValueExpression4595); if (failed) return current;

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
    // $ANTLR end entryRuleParanthesedValueExpression


    // $ANTLR start ruleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2865:1: ruleParanthesedValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) ;
    public final EObject ruleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_HostCode_4 = null;

        EObject this_PlusOperation_6 = null;

        EObject this_DivOperation_9 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2870:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            int alt62=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt62=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt62=2;
                }
                break;
            case 63:
                {
                alt62=3;
                }
                break;
            case RULE_ID:
                {
                alt62=4;
                }
                break;
            case RULE_STRING:
                {
                alt62=5;
                }
                break;
            case 43:
                {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    int LA62_7 = input.LA(3);

                    if ( (LA62_7==43) ) {
                        int LA62_14 = input.LA(4);

                        if ( (LA62_14==63) ) {
                            int LA62_20 = input.LA(5);

                            if ( (LA62_20==43) ) {
                                int LA62_23 = input.LA(6);

                                if ( (LA62_23==RULE_ID) ) {
                                    int LA62_26 = input.LA(7);

                                    if ( (LA62_26==44) ) {
                                        int LA62_27 = input.LA(8);

                                        if ( (LA62_27==44) ) {
                                            switch ( input.LA(9) ) {
                                            case 28:
                                                {
                                                alt62=7;
                                                }
                                                break;
                                            case 44:
                                                {
                                                int LA62_16 = input.LA(10);

                                                if ( (synpred84()) ) {
                                                    alt62=6;
                                                }
                                                else if ( (true) ) {
                                                    alt62=7;
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return current;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                                                    throw nvae;
                                                }
                                                }
                                                break;
                                            case 49:
                                            case 50:
                                            case 74:
                                            case 75:
                                                {
                                                alt62=6;
                                                }
                                                break;
                                            default:
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 28, input);

                                                throw nvae;
                                            }

                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 27, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 26, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 23, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 20, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt62=7;
                        }
                        break;
                    case 44:
                        {
                        int LA62_16 = input.LA(4);

                        if ( (synpred84()) ) {
                            alt62=6;
                        }
                        else if ( (true) ) {
                            alt62=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 49:
                    case 50:
                    case 74:
                    case 75:
                        {
                        alt62=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 8, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_FLOAT:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt62=7;
                        }
                        break;
                    case 44:
                        {
                        int LA62_16 = input.LA(4);

                        if ( (synpred84()) ) {
                            alt62=6;
                        }
                        else if ( (true) ) {
                            alt62=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 49:
                    case 50:
                    case 74:
                    case 75:
                        {
                        alt62=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 9, input);

                        throw nvae;
                    }

                    }
                    break;
                case 63:
                    {
                    int LA62_10 = input.LA(3);

                    if ( (LA62_10==43) ) {
                        int LA62_18 = input.LA(4);

                        if ( (LA62_18==RULE_ID) ) {
                            int LA62_21 = input.LA(5);

                            if ( (LA62_21==44) ) {
                                switch ( input.LA(6) ) {
                                case 28:
                                    {
                                    alt62=7;
                                    }
                                    break;
                                case 44:
                                    {
                                    int LA62_16 = input.LA(7);

                                    if ( (synpred84()) ) {
                                        alt62=6;
                                    }
                                    else if ( (true) ) {
                                        alt62=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 49:
                                case 50:
                                case 74:
                                case 75:
                                    {
                                    alt62=6;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 24, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 21, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 18, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case 49:
                    case 50:
                    case 74:
                    case 75:
                        {
                        alt62=6;
                        }
                        break;
                    case 44:
                        {
                        int LA62_16 = input.LA(4);

                        if ( (synpred84()) ) {
                            alt62=6;
                        }
                        else if ( (true) ) {
                            alt62=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        alt62=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        int LA62_19 = input.LA(4);

                        if ( (LA62_19==RULE_ID) ) {
                            int LA62_22 = input.LA(5);

                            if ( (LA62_22==44) ) {
                                switch ( input.LA(6) ) {
                                case 49:
                                case 50:
                                case 74:
                                case 75:
                                    {
                                    alt62=6;
                                    }
                                    break;
                                case 44:
                                    {
                                    int LA62_16 = input.LA(7);

                                    if ( (synpred84()) ) {
                                        alt62=6;
                                    }
                                    else if ( (true) ) {
                                        alt62=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 28:
                                    {
                                    alt62=7;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 25, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 22, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 19, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        alt62=7;
                        }
                        break;
                    case 44:
                        {
                        int LA62_16 = input.LA(4);

                        if ( (synpred84()) ) {
                            alt62=6;
                        }
                        else if ( (true) ) {
                            alt62=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 49:
                    case 50:
                    case 74:
                    case 75:
                        {
                        alt62=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 12, input);

                        throw nvae;
                    }

                    }
                    break;
                case 43:
                    {
                    int LA62_13 = input.LA(3);

                    if ( (synpred84()) ) {
                        alt62=6;
                    }
                    else if ( (true) ) {
                        alt62=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2871:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2872:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression4645);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2885:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression4675);
                    this_FloatValue_1=ruleFloatValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2898:2: this_ValOperation_2= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression4705);
                    this_ValOperation_2=ruleValOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2911:2: this_VariableReference_3= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression4735);
                    this_VariableReference_3=ruleVariableReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_VariableReference_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2924:2: this_HostCode_4= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getHostCodeParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleParanthesedValueExpression4765);
                    this_HostCode_4=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:8: '(' this_PlusOperation_6= rulePlusOperation ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleParanthesedValueExpression4781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression4806);
                    this_PlusOperation_6=rulePlusOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PlusOperation_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,44,FOLLOW_44_in_ruleParanthesedValueExpression4815); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2957:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2957:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2957:8: '(' this_DivOperation_9= ruleDivOperation ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleParanthesedValueExpression4833); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleParanthesedValueExpression4858);
                    this_DivOperation_9=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,44,FOLLOW_44_in_ruleParanthesedValueExpression4867); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_6_2(), null); 
                          
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
    // $ANTLR end ruleParanthesedValueExpression


    // $ANTLR start entryRulePlusOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2985:1: entryRulePlusOperation returns [EObject current=null] : iv_rulePlusOperation= rulePlusOperation EOF ;
    public final EObject entryRulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2986:2: (iv_rulePlusOperation= rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2987:2: iv_rulePlusOperation= rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPlusOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation4904);
            iv_rulePlusOperation=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePlusOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation4914); if (failed) return current;

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
    // $ANTLR end entryRulePlusOperation


    // $ANTLR start rulePlusOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2994:1: rulePlusOperation returns [EObject current=null] : (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) ;
    public final EObject rulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOrDivOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2999:6: ( (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3000:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3000:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3001:2: this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4964);
            this_MultOrDivOperation_0=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultOrDivOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3012:1: ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==49||LA63_0==74) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3012:2: () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3012:2: ()
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3013:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3031:2: ( (lv_operator_2_0= rulePlusOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3032:1: (lv_operator_2_0= rulePlusOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3032:1: (lv_operator_2_0= rulePlusOperator )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3033:3: lv_operator_2_0= rulePlusOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOperator_in_rulePlusOperation4997);
            	    lv_operator_2_0=rulePlusOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPlusOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"PlusOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3055:2: ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3056:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3056:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3057:3: lv_subExpressions_3_0= ruleMultOrDivOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation5018);
            	    lv_subExpressions_3_0=ruleMultOrDivOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPlusOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"MultOrDivOperation", 
            	      	        		currentNode);
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
            	    break loop63;
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
    // $ANTLR end rulePlusOperation


    // $ANTLR start entryRuleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3087:1: entryRuleMultOrDivOperation returns [EObject current=null] : iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF ;
    public final EObject entryRuleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3088:2: (iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3089:2: iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOrDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation5056);
            iv_ruleMultOrDivOperation=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOrDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation5066); if (failed) return current;

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
    // $ANTLR end entryRuleMultOrDivOperation


    // $ANTLR start ruleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3096:1: ruleMultOrDivOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) ;
    public final EObject ruleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOperation_0 = null;

        EObject this_DivOperation_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3101:6: ( (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3102:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3102:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_INT)||LA64_0==RULE_FLOAT||LA64_0==63||LA64_0==71) ) {
                alt64=1;
            }
            else if ( (LA64_0==43) ) {
                int LA64_7 = input.LA(2);

                if ( (synpred86()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3102:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 64, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3102:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3103:2: this_MultOperation_0= ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation5116);
                    this_MultOperation_0=ruleMultOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_MultOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3115:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3115:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3115:8: '(' this_DivOperation_2= ruleDivOperation ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleMultOrDivOperation5132); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation5157);
                    this_DivOperation_2=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,44,FOLLOW_44_in_ruleMultOrDivOperation5166); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleMultOrDivOperation


    // $ANTLR start entryRuleMultOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3143:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3144:2: (iv_ruleMultOperation= ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3145:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation5203);
            iv_ruleMultOperation=ruleMultOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation5213); if (failed) return current;

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
    // $ANTLR end entryRuleMultOperation


    // $ANTLR start ruleMultOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3152:1: ruleMultOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3157:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3158:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3158:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3159:2: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation5263);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3170:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==50||LA65_0==75) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3170:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3170:2: ()
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3171:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3189:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3190:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3190:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3191:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultOperation5296);
            	    lv_operator_2_0=ruleMultOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"MultOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3213:2: ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3214:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3214:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3215:3: lv_subExpressions_3_0= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation5317);
            	    lv_subExpressions_3_0=rulePreOrNormalValueExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"PreOrNormalValueExpression", 
            	      	        		currentNode);
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
            	    break loop65;
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
    // $ANTLR end ruleMultOperation


    // $ANTLR start entryRuleDivOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3245:1: entryRuleDivOperation returns [EObject current=null] : iv_ruleDivOperation= ruleDivOperation EOF ;
    public final EObject entryRuleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3246:2: (iv_ruleDivOperation= ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3247:2: iv_ruleDivOperation= ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation5355);
            iv_ruleDivOperation=ruleDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation5365); if (failed) return current;

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
    // $ANTLR end entryRuleDivOperation


    // $ANTLR start ruleDivOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3254:1: ruleDivOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) ;
    public final EObject ruleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3259:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3260:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3260:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3261:2: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation5415);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3272:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==28) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3272:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3272:2: ()
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3273:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3291:2: ( (lv_operator_2_0= ruleDivOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3292:1: (lv_operator_2_0= ruleDivOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3292:1: (lv_operator_2_0= ruleDivOperator )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3293:3: lv_operator_2_0= ruleDivOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivOperation5448);
            	    lv_operator_2_0=ruleDivOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDivOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"DivOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3315:2: ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3316:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3316:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3317:3: lv_subExpressions_3_0= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation5469);
            	    lv_subExpressions_3_0=rulePreOrNormalValueExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDivOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"PreOrNormalValueExpression", 
            	      	        		currentNode);
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
            	    break loop66;
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
    // $ANTLR end ruleDivOperation


    // $ANTLR start entryRulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3347:1: entryRulePreArithmOperation returns [EObject current=null] : iv_rulePreArithmOperation= rulePreArithmOperation EOF ;
    public final EObject entryRulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreArithmOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3348:2: (iv_rulePreArithmOperation= rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3349:2: iv_rulePreArithmOperation= rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreArithmOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation5507);
            iv_rulePreArithmOperation=rulePreArithmOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreArithmOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation5517); if (failed) return current;

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
    // $ANTLR end entryRulePreArithmOperation


    // $ANTLR start rulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3356:1: rulePreArithmOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) ;
    public final EObject rulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3361:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3362:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3362:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3362:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3362:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3363:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3363:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3364:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation5563);
            lv_operator_0_0=ruleUnaryParanthesedOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreArithmOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"UnaryParanthesedOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,43,FOLLOW_43_in_rulePreArithmOperation5573); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3390:1: ( (lv_subExpressions_2_0= ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3391:1: (lv_subExpressions_2_0= ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3391:1: (lv_subExpressions_2_0= ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3392:3: lv_subExpressions_2_0= ruleValOperation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperation_in_rulePreArithmOperation5594);
            lv_subExpressions_2_0=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreArithmOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"ValOperation", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,44,FOLLOW_44_in_rulePreArithmOperation5604); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end rulePreArithmOperation


    // $ANTLR start entryRulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3426:1: entryRulePreOrNormalValueExpression returns [EObject current=null] : iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF ;
    public final EObject entryRulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreOrNormalValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3427:2: (iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3428:2: iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreOrNormalValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression5640);
            iv_rulePreOrNormalValueExpression=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreOrNormalValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValueExpression5650); if (failed) return current;

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
    // $ANTLR end entryRulePreOrNormalValueExpression


    // $ANTLR start rulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3435:1: rulePreOrNormalValueExpression returns [EObject current=null] : (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) ;
    public final EObject rulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PreArithmOperation_0 = null;

        EObject this_ParanthesedValueExpression_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3440:6: ( (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3441:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3441:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==71) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_INT)||LA67_0==RULE_FLOAT||LA67_0==43||LA67_0==63) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3441:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3442:2: this_PreArithmOperation_0= rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression5700);
                    this_PreArithmOperation_0=rulePreArithmOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PreArithmOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3455:2: this_ParanthesedValueExpression_1= ruleParanthesedValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression5730);
                    this_ParanthesedValueExpression_1=ruleParanthesedValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedValueExpression_1; 
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
    // $ANTLR end rulePreOrNormalValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3474:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3475:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3476:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5765);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation5775); if (failed) return current;

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
    // $ANTLR end entryRuleCompareOperation


    // $ANTLR start ruleCompareOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3483:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3488:6: ( (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3489:1: (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3489:1: (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3490:2: this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation5825);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3501:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3501:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3501:2: ()
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3502:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3520:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3521:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3521:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3522:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation5858);
            lv_operator_2_0=ruleCompareOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_2_0, 
              	        		"CompareOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3544:2: ( (lv_subExpressions_3_0= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3545:1: (lv_subExpressions_3_0= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3545:1: (lv_subExpressions_3_0= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3546:3: lv_subExpressions_3_0= ruleValueExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation5879);
            lv_subExpressions_3_0=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_3_0, 
              	        		"ValueExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

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
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3576:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3577:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3578:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation5916);
            iv_ruleUnaryOperation=ruleUnaryOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation5926); if (failed) return current;

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
    // $ANTLR end entryRuleUnaryOperation


    // $ANTLR start ruleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3585:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_1 = null;

        EObject lv_subExpressions_1_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3590:6: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3591:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3591:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3591:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3591:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3592:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3592:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3593:3: lv_operator_0_0= ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation5972);
            lv_operator_0_0=ruleUnaryOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"UnaryOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3615:2: ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3616:1: ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3616:1: ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_FLOAT)||LA68_0==43||LA68_0==63) ) {
                alt68=1;
            }
            else if ( (LA68_0==71) ) {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==43) ) {
                    int LA68_3 = input.LA(3);

                    if ( ((LA68_3>=RULE_ID && LA68_3<=RULE_FLOAT)||LA68_3==43||(LA68_3>=70 && LA68_3<=71)) ) {
                        alt68=2;
                    }
                    else if ( (LA68_3==63) ) {
                        int LA68_5 = input.LA(4);

                        if ( (LA68_5==43) ) {
                            int LA68_6 = input.LA(5);

                            if ( (LA68_6==RULE_ID) ) {
                                int LA68_7 = input.LA(6);

                                if ( (LA68_7==44) ) {
                                    int LA68_8 = input.LA(7);

                                    if ( ((LA68_8>=49 && LA68_8<=50)||(LA68_8>=64 && LA68_8<=69)||(LA68_8>=72 && LA68_8<=75)) ) {
                                        alt68=2;
                                    }
                                    else if ( (LA68_8==44) ) {
                                        int LA68_9 = input.LA(8);

                                        if ( ((LA68_9>=49 && LA68_9<=50)||(LA68_9>=64 && LA68_9<=69)||(LA68_9>=74 && LA68_9<=75)) ) {
                                            alt68=1;
                                        }
                                        else if ( (LA68_9==EOF||(LA68_9>=RULE_ID && LA68_9<=RULE_STRING)||(LA68_9>=14 && LA68_9<=15)||(LA68_9>=17 && LA68_9<=24)||(LA68_9>=28 && LA68_9<=30)||LA68_9==32||(LA68_9>=44 && LA68_9<=47)||(LA68_9>=60 && LA68_9<=62)||(LA68_9>=72 && LA68_9<=73)) ) {
                                            alt68=2;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 9, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 8, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3617:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3618:3: lv_subExpressions_1_1= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation5995);
                    lv_subExpressions_1_1=ruleParanthesedBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_1_1, 
                      	        		"ParanthesedBooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3639:8: lv_subExpressions_1_2= ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOperation6014);
                    lv_subExpressions_1_2=ruleUnaryParanthesedOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_1_2, 
                      	        		"UnaryParanthesedOperation", 
                      	        		currentNode);
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
    // $ANTLR end ruleUnaryOperation


    // $ANTLR start entryRuleUnaryParanthesedOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3671:1: entryRuleUnaryParanthesedOperation returns [EObject current=null] : iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF ;
    public final EObject entryRuleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryParanthesedOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3672:2: (iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3673:2: iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryParanthesedOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation6053);
            iv_ruleUnaryParanthesedOperation=ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryParanthesedOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation6063); if (failed) return current;

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
    // $ANTLR end entryRuleUnaryParanthesedOperation


    // $ANTLR start ruleUnaryParanthesedOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3680:1: ruleUnaryParanthesedOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) ;
    public final EObject ruleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3685:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3687:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3687:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3688:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation6109);
            lv_operator_0_0=ruleUnaryParanthesedOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryParanthesedOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"UnaryParanthesedOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,43,FOLLOW_43_in_ruleUnaryParanthesedOperation6119); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3714:1: ( (lv_subExpressions_2_0= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3715:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3715:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3716:3: lv_subExpressions_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation6140);
            lv_subExpressions_2_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryParanthesedOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"BooleanExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,44,FOLLOW_44_in_ruleUnaryParanthesedOperation6150); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end ruleUnaryParanthesedOperation


    // $ANTLR start entryRuleUnaryOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3750:1: entryRuleUnaryOrNormalExpression returns [EObject current=null] : iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF ;
    public final EObject entryRuleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3751:2: (iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3752:2: iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOrNormalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression6186);
            iv_ruleUnaryOrNormalExpression=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOrNormalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression6196); if (failed) return current;

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
    // $ANTLR end entryRuleUnaryOrNormalExpression


    // $ANTLR start ruleUnaryOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3759:1: ruleUnaryOrNormalExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) ;
    public final EObject ruleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        EObject this_UnaryParanthesedOperation_1 = null;

        EObject this_ParanthesedBooleanExpression_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3764:6: ( (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt69=1;
                }
                break;
            case 71:
                {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==43) ) {
                    int LA69_4 = input.LA(3);

                    if ( (LA69_4==63) ) {
                        int LA69_5 = input.LA(4);

                        if ( (LA69_5==43) ) {
                            int LA69_7 = input.LA(5);

                            if ( (LA69_7==RULE_ID) ) {
                                int LA69_8 = input.LA(6);

                                if ( (LA69_8==44) ) {
                                    int LA69_9 = input.LA(7);

                                    if ( ((LA69_9>=49 && LA69_9<=50)||(LA69_9>=64 && LA69_9<=69)||(LA69_9>=72 && LA69_9<=75)) ) {
                                        alt69=2;
                                    }
                                    else if ( (LA69_9==44) ) {
                                        int LA69_10 = input.LA(8);

                                        if ( (LA69_10==EOF||(LA69_10>=RULE_ID && LA69_10<=RULE_STRING)||(LA69_10>=14 && LA69_10<=15)||(LA69_10>=17 && LA69_10<=24)||(LA69_10>=28 && LA69_10<=30)||LA69_10==32||(LA69_10>=44 && LA69_10<=47)||(LA69_10>=60 && LA69_10<=62)||(LA69_10>=72 && LA69_10<=73)) ) {
                                            alt69=2;
                                        }
                                        else if ( ((LA69_10>=49 && LA69_10<=50)||(LA69_10>=64 && LA69_10<=69)||(LA69_10>=74 && LA69_10<=75)) ) {
                                            alt69=3;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 10, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 9, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 8, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA69_4>=RULE_ID && LA69_4<=RULE_FLOAT)||LA69_4==43||(LA69_4>=70 && LA69_4<=71)) ) {
                        alt69=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 43:
            case 63:
                {
                alt69=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3765:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3766:2: this_UnaryOperation_0= ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression6246);
                    this_UnaryOperation_0=ruleUnaryOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_UnaryOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3779:2: this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression6276);
                    this_UnaryParanthesedOperation_1=ruleUnaryParanthesedOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_UnaryParanthesedOperation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3792:2: this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression6306);
                    this_ParanthesedBooleanExpression_2=ruleParanthesedBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedBooleanExpression_2; 
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
    // $ANTLR end ruleUnaryOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3811:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3812:2: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3813:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation6341);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation6351); if (failed) return current;

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
    // $ANTLR end entryRuleAndOperation


    // $ANTLR start ruleAndOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3820:1: ruleAndOperation returns [EObject current=null] : (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrNormalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3825:6: ( (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3826:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3826:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3827:2: this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6401);
            this_UnaryOrNormalExpression_0=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_UnaryOrNormalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3838:1: ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==73) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3838:2: () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3838:2: ()
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3839:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3857:2: ( (lv_operator_2_0= ruleOperatorAnd ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3858:1: (lv_operator_2_0= ruleOperatorAnd )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3858:1: (lv_operator_2_0= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3859:3: lv_operator_2_0= ruleOperatorAnd
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation6434);
            	    lv_operator_2_0=ruleOperatorAnd();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OperatorAnd", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3881:2: ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3882:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3882:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3883:3: lv_subExpressions_3_0= ruleUnaryOrNormalExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6455);
            	    lv_subExpressions_3_0=ruleUnaryOrNormalExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"UnaryOrNormalExpression", 
            	      	        		currentNode);
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
            	    break loop70;
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
    // $ANTLR end ruleAndOperation


    // $ANTLR start entryRuleOrOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3913:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3914:2: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3915:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation6493);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation6503); if (failed) return current;

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
    // $ANTLR end entryRuleOrOperation


    // $ANTLR start ruleOrOperation
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3922:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3927:6: ( (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3928:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3928:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3929:2: this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation6553);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3940:1: ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==72) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3940:2: () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3940:2: ()
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3941:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3959:2: ( (lv_operator_2_0= ruleOperatorOr ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3960:1: (lv_operator_2_0= ruleOperatorOr )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3960:1: (lv_operator_2_0= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3961:3: lv_operator_2_0= ruleOperatorOr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation6586);
            	    lv_operator_2_0=ruleOperatorOr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OperatorOr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3983:2: ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3984:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3984:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3985:3: lv_subExpressions_3_0= ruleAndOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation6607);
            	    lv_subExpressions_3_0=ruleAndOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"AndOperation", 
            	      	        		currentNode);
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
            	    break loop71;
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
    // $ANTLR end ruleOrOperation


    // $ANTLR start entryRuleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4015:1: entryRuleParanthesedBooleanExpression returns [EObject current=null] : iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF ;
    public final EObject entryRuleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4016:2: (iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4017:2: iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression6645);
            iv_ruleParanthesedBooleanExpression=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression6655); if (failed) return current;

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
    // $ANTLR end entryRuleParanthesedBooleanExpression


    // $ANTLR start ruleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4024:1: ruleParanthesedBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) ) ;
    public final EObject ruleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_CompareOperation_1 = null;

        EObject this_SignalReference_2 = null;

        EObject this_ValOperation_3 = null;

        EObject this_HostCode_4 = null;

        EObject this_OrOperation_6 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4029:6: ( (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4030:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4030:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )
            int alt72=6;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt72=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 71:
                {
                alt72=2;
                }
                break;
            case 63:
                {
                int LA72_5 = input.LA(2);

                if ( (synpred96()) ) {
                    alt72=2;
                }
                else if ( (synpred98()) ) {
                    alt72=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4030:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 72, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA72_7 = input.LA(2);

                if ( (synpred96()) ) {
                    alt72=2;
                }
                else if ( (synpred99()) ) {
                    alt72=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4030:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 72, 7, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA72_8 = input.LA(2);

                if ( (synpred96()) ) {
                    alt72=2;
                }
                else if ( (synpred97()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4030:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 72, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4030:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_HostCode_4= ruleHostCode | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4031:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression6705);
                    this_BooleanValue_0=ruleBooleanValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4044:2: this_CompareOperation_1= ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression6735);
                    this_CompareOperation_1=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4057:2: this_SignalReference_2= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression6765);
                    this_SignalReference_2=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignalReference_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4070:2: this_ValOperation_3= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedBooleanExpression6795);
                    this_ValOperation_3=ruleValOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValOperation_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4083:2: this_HostCode_4= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleParanthesedBooleanExpression6825);
                    this_HostCode_4=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4095:6: ( '(' this_OrOperation_6= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4095:6: ( '(' this_OrOperation_6= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4095:8: '(' this_OrOperation_6= ruleOrOperation ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleParanthesedBooleanExpression6841); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression6866);
                    this_OrOperation_6=ruleOrOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OrOperation_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,44,FOLLOW_44_in_ruleParanthesedBooleanExpression6875); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
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
    // $ANTLR end ruleParanthesedBooleanExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4123:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4124:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4125:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6912);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression6922); if (failed) return current;

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
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4132:1: ruleBooleanExpression returns [EObject current=null] : this_OrOperation_0= ruleOrOperation ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrOperation_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4137:6: (this_OrOperation_0= ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4139:2: this_OrOperation_0= ruleOrOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression6971);
            this_OrOperation_0=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_OrOperation_0; 
                      currentNode = currentNode.getParent();
                  
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4158:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4159:2: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4160:2: iv_ruleHostCode= ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode7005);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHostCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode7015); if (failed) return current;

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
    // $ANTLR end entryRuleHostCode


    // $ANTLR start ruleHostCode
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4167:1: ruleHostCode returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4172:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4173:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4173:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4173:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4173:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4174:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4174:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4175:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode7057); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"code",
              	        		lv_code_0_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4197:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==43) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4197:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,43,FOLLOW_43_in_ruleHostCode7073); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4201:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4202:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4202:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4203:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHostCode7090); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,44,FOLLOW_44_in_ruleHostCode7105); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleHostCode


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4237:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4241:6: ( ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4242:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4242:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt74=1;
                }
                break;
            case 32:
                {
                alt74=2;
                }
                break;
            case 46:
                {
                alt74=3;
                }
                break;
            case 47:
                {
                alt74=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4242:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4242:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4242:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4242:4: 'NORMAL'
                    {
                    match(input,45,FOLLOW_45_in_ruleStateType7155); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4248:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4248:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4248:8: 'cond'
                    {
                    match(input,32,FOLLOW_32_in_ruleStateType7170); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4254:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4254:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4254:8: 'ref'
                    {
                    match(input,46,FOLLOW_46_in_ruleStateType7185); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4260:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4260:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4260:8: 'textual'
                    {
                    match(input,47,FOLLOW_47_in_ruleStateType7200); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4270:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4274:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4275:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4275:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt75=1;
                }
                break;
            case 49:
                {
                alt75=2;
                }
                break;
            case 50:
                {
                alt75=3;
                }
                break;
            case 51:
                {
                alt75=4;
                }
                break;
            case 52:
                {
                alt75=5;
                }
                break;
            case 53:
                {
                alt75=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4275:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4275:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4275:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4275:4: 'NONE'
                    {
                    match(input,48,FOLLOW_48_in_ruleCombineOperator7243); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4281:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4281:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4281:8: '+'
                    {
                    match(input,49,FOLLOW_49_in_ruleCombineOperator7258); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4287:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4287:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4287:8: '*'
                    {
                    match(input,50,FOLLOW_50_in_ruleCombineOperator7273); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4293:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4293:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4293:8: 'AND'
                    {
                    match(input,51,FOLLOW_51_in_ruleCombineOperator7288); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4299:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4299:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4299:8: 'OR'
                    {
                    match(input,52,FOLLOW_52_in_ruleCombineOperator7303); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4305:6: ( 'hostCombineOperator' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4305:6: ( 'hostCombineOperator' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4305:8: 'hostCombineOperator'
                    {
                    match(input,53,FOLLOW_53_in_ruleCombineOperator7318); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4315:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4319:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4320:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4320:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt76=1;
                }
                break;
            case 55:
                {
                alt76=2;
                }
                break;
            case 56:
                {
                alt76=3;
                }
                break;
            case 57:
                {
                alt76=4;
                }
                break;
            case 58:
                {
                alt76=5;
                }
                break;
            case 59:
                {
                alt76=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4320:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4320:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4320:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4320:4: 'PURE'
                    {
                    match(input,54,FOLLOW_54_in_ruleValueType7361); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4326:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4326:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4326:8: 'boolean'
                    {
                    match(input,55,FOLLOW_55_in_ruleValueType7376); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4332:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4332:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4332:8: 'unsigned'
                    {
                    match(input,56,FOLLOW_56_in_ruleValueType7391); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4338:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4338:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4338:8: 'integer'
                    {
                    match(input,57,FOLLOW_57_in_ruleValueType7406); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4344:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4344:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4344:8: 'float'
                    {
                    match(input,58,FOLLOW_58_in_ruleValueType7421); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4350:6: ( 'hostType' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4350:6: ( 'hostType' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4350:8: 'hostType'
                    {
                    match(input,59,FOLLOW_59_in_ruleValueType7436); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4360:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4364:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4365:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4365:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt77=1;
                }
                break;
            case 61:
                {
                alt77=2;
                }
                break;
            case 62:
                {
                alt77=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4365:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4365:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4365:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4365:4: '-->'
                    {
                    match(input,60,FOLLOW_60_in_ruleTransitionType7479); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4371:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4371:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4371:8: 'o->'
                    {
                    match(input,61,FOLLOW_61_in_ruleTransitionType7494); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4377:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4377:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4377:8: '>->'
                    {
                    match(input,62,FOLLOW_62_in_ruleTransitionType7509); if (failed) return current;
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


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4389:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4393:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4394:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4394:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4394:3: '?'
            {
            match(input,63,FOLLOW_63_in_ruleValOperator7553); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleValOperator


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4404:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4408:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4409:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4409:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt78=1;
                }
                break;
            case 65:
                {
                alt78=2;
                }
                break;
            case 66:
                {
                alt78=3;
                }
                break;
            case 67:
                {
                alt78=4;
                }
                break;
            case 68:
                {
                alt78=5;
                }
                break;
            case 69:
                {
                alt78=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4409:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4409:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4409:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4409:4: '='
                    {
                    match(input,64,FOLLOW_64_in_ruleCompareOperator7595); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4415:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4415:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4415:8: '<'
                    {
                    match(input,65,FOLLOW_65_in_ruleCompareOperator7610); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4421:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4421:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4421:8: '<='
                    {
                    match(input,66,FOLLOW_66_in_ruleCompareOperator7625); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4427:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4427:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4427:8: '>'
                    {
                    match(input,67,FOLLOW_67_in_ruleCompareOperator7640); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4433:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4433:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4433:8: '>='
                    {
                    match(input,68,FOLLOW_68_in_ruleCompareOperator7655); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4439:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4439:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4439:8: '<>'
                    {
                    match(input,69,FOLLOW_69_in_ruleCompareOperator7670); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5(), null); 
                          
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
    // $ANTLR end ruleCompareOperator


    // $ANTLR start ruleUnaryOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4449:1: ruleUnaryOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4453:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4454:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4454:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4454:3: 'not'
            {
            match(input,70,FOLLOW_70_in_ruleUnaryOperator7712); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleUnaryOperator


    // $ANTLR start ruleUnaryParanthesedOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4464:1: ruleUnaryParanthesedOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator ruleUnaryParanthesedOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4468:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4469:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4469:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4469:3: 'pre'
            {
            match(input,71,FOLLOW_71_in_ruleUnaryParanthesedOperator7753); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleUnaryParanthesedOperator


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4479:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4483:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4484:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4484:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4484:3: 'or'
            {
            match(input,72,FOLLOW_72_in_ruleOperatorOr7794); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorOr


    // $ANTLR start ruleOperatorAnd
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4494:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4498:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4499:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4499:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4499:3: 'and'
            {
            match(input,73,FOLLOW_73_in_ruleOperatorAnd7835); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorAnd


    // $ANTLR start rulePlusOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4511:1: rulePlusOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator rulePlusOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4515:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4516:1: ( ( '+' ) | ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4516:1: ( ( '+' ) | ( '-' ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==49) ) {
                alt79=1;
            }
            else if ( (LA79_0==74) ) {
                alt79=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4516:1: ( ( '+' ) | ( '-' ) )", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4516:2: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4516:2: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4516:4: '+'
                    {
                    match(input,49,FOLLOW_49_in_rulePlusOperator7879); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4522:6: ( '-' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4522:6: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4522:8: '-'
                    {
                    match(input,74,FOLLOW_74_in_rulePlusOperator7894); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1(), null); 
                          
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
    // $ANTLR end rulePlusOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4532:1: ruleMultOperator returns [Enumerator current=null] : ( ( '*' ) | ( 'mod' ) ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4536:6: ( ( ( '*' ) | ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4537:1: ( ( '*' ) | ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4537:1: ( ( '*' ) | ( 'mod' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==50) ) {
                alt80=1;
            }
            else if ( (LA80_0==75) ) {
                alt80=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4537:1: ( ( '*' ) | ( 'mod' ) )", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4537:2: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4537:2: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4537:4: '*'
                    {
                    match(input,50,FOLLOW_50_in_ruleMultOperator7937); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4543:6: ( 'mod' )
                    {
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4543:6: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4543:8: 'mod'
                    {
                    match(input,75,FOLLOW_75_in_ruleMultOperator7952); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1(), null); 
                          
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
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4553:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4557:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4558:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4558:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4558:3: '/'
            {
            match(input,28,FOLLOW_28_in_ruleDivOperator7994); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleDivOperator

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( ( 'region' ( ( RULE_ID ) ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( 'region' ( ( RULE_ID ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( 'region' ( ( RULE_ID ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:6: 'region' ( ( RULE_ID ) )
        {
        match(input,13,FOLLOW_13_in_synpred1142); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:1: ( ( RULE_ID ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1159); if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: ( 'region' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: 'region'
        {
        match(input,13,FOLLOW_13_in_synpred2181); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: ( ( () ( ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )? ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleState ) )+ ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: ( () ( ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )? ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleState ) )+ ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: ( () ( ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )? ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleState ) )+ ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:3: () ( ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )? ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleState ) )+ )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:3: ()
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:95:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:2: ( ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )? ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleState ) )+ )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )? ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleState ) )+
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( ( 'region' ( ( RULE_ID ) ) ) | 'region' )?
        int alt81=3;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==13) ) {
            int LA81_1 = input.LA(2);

            if ( (LA81_1==RULE_ID) ) {
                int LA81_3 = input.LA(3);

                if ( (synpred1()) ) {
                    alt81=1;
                }
                else if ( (synpred2()) ) {
                    alt81=2;
                }
            }
            else if ( (LA81_1==RULE_STRING||(LA81_1>=14 && LA81_1<=15)||LA81_1==32||LA81_1==34||(LA81_1>=37 && LA81_1<=39)||(LA81_1>=45 && LA81_1<=47)) ) {
                alt81=2;
            }
        }
        switch (alt81) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( 'region' ( ( RULE_ID ) ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: ( 'region' ( ( RULE_ID ) ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:6: 'region' ( ( RULE_ID ) )
                {
                match(input,13,FOLLOW_13_in_synpred6142); if (failed) return ;
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:1: ( ( RULE_ID ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: RULE_ID
                {
                match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred6159); if (failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: 'region'
                {
                match(input,13,FOLLOW_13_in_synpred6181); if (failed) return ;

                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:3: ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )*
        loop82:
        do {
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==34) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=37 && LA82_0<=39)) ) {
                alt82=2;
            }


            switch (alt82) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:4: ( ( ruleVariable ) )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:4: ( ( ruleVariable ) )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:142:1: ( ruleVariable )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:142:1: ( ruleVariable )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:143:3: ruleVariable
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_0_1_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleVariable_in_synpred6205);
        	    ruleVariable();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:166:6: ( ( ruleSignal ) )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:166:6: ( ( ruleSignal ) )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:167:1: ( ruleSignal )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:167:1: ( ruleSignal )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:168:3: ruleSignal
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_0_1_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleSignal_in_synpred6232);
        	    ruleSignal();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop82;
            }
        } while (true);

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:190:4: ( ( ruleState ) )+
        int cnt83=0;
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_STRING)||(LA83_0>=14 && LA83_0<=15)||LA83_0==32||(LA83_0>=45 && LA83_0<=47)) ) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:191:1: ( ruleState )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:191:1: ( ruleState )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:192:3: ruleState
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_0_1_2_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleState_in_synpred6255);
        	    ruleState();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt83 >= 1 ) break loop83;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(83, input);
                    throw eee;
            }
            cnt83++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: ( ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:303:3: 'final'
        {
        match(input,15,FOLLOW_15_in_synpred8433); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( ( ( ruleFULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( ( ruleFULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( ( ruleFULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:1: ( ruleFULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:1: ( ruleFULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:324:3: ruleFULLSTATEID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_0_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred9469);
        ruleFULLSTATEID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( ( ( RULE_STRING ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( ( RULE_STRING ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( ( RULE_STRING ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:348:1: ( RULE_STRING )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:348:1: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:349:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred10492); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:3: ( ( ( ( 'init' ) ) ( ( 'final' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )? ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:3: ( ( ( 'init' ) ) ( ( 'final' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )? )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:3: ( ( ( 'init' ) ) ( ( 'final' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )? )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:4: ( ( 'init' ) ) ( ( 'final' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )?
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:280:4: ( ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:281:1: ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:281:1: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:282:3: 'init'
        {
        match(input,14,FOLLOW_14_in_synpred12402); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:301:2: ( ( 'final' ) )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==15) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: ( 'final' )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:302:1: ( 'final' )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:303:3: 'final'
                {
                match(input,15,FOLLOW_15_in_synpred12433); if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:3: ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )?
        int alt85=4;
        int LA85_0 = input.LA(1);

        if ( (LA85_0==RULE_ID) ) {
            switch ( input.LA(2) ) {
                case 41:
                    {
                    int LA85_4 = input.LA(3);

                    if ( (LA85_4==RULE_ID) ) {
                        int LA85_7 = input.LA(4);

                        if ( (LA85_7==EOF) ) {
                            alt85=1;
                        }
                        else if ( (LA85_7==RULE_STRING) ) {
                            alt85=3;
                        }
                    }
                    }
                    break;
                case EOF:
                    {
                    alt85=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt85=3;
                    }
                    break;
            }

        }
        else if ( (LA85_0==RULE_STRING) ) {
            alt85=2;
        }
        switch (alt85) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( ( ruleFULLSTATEID ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:4: ( ( ruleFULLSTATEID ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:1: ( ruleFULLSTATEID )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:1: ( ruleFULLSTATEID )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:324:3: ruleFULLSTATEID
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_0_2_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred12469);
                ruleFULLSTATEID();
                _fsp--;
                if (failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( ( RULE_STRING ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:6: ( ( RULE_STRING ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:348:1: ( RULE_STRING )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:348:1: ( RULE_STRING )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:349:3: RULE_STRING
                {
                match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred12492); if (failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:6: ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:6: ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:7: ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:372:7: ( ( ruleFULLSTATEID ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:373:1: ( ruleFULLSTATEID )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:373:1: ( ruleFULLSTATEID )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:374:3: ruleFULLSTATEID
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_0_2_2_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred12525);
                ruleFULLSTATEID();
                _fsp--;
                if (failed) return ;

                }


                }

                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:396:2: ( ( RULE_STRING ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:1: ( RULE_STRING )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:1: ( RULE_STRING )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:398:3: RULE_STRING
                {
                match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred12542); if (failed) return ;

                }


                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: ( ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:444:3: 'init'
        {
        match(input,14,FOLLOW_14_in_synpred13607); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( ( ( ruleFULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( ( ruleFULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( ( ruleFULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:464:1: ( ruleFULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:464:1: ( ruleFULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:465:3: ruleFULLSTATEID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_1_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred14643);
        ruleFULLSTATEID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( ( ( RULE_STRING ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( ( RULE_STRING ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( ( RULE_STRING ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:1: ( RULE_STRING )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:1: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:490:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred15666); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: ( ( ( ( 'final' ) ) ( ( 'init' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )? ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: ( ( ( 'final' ) ) ( ( 'init' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )? )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: ( ( ( 'final' ) ) ( ( 'init' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )? )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:7: ( ( 'final' ) ) ( ( 'init' ) )? ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )?
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:7: ( ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:422:1: ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:422:1: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:423:3: 'final'
        {
        match(input,15,FOLLOW_15_in_synpred17576); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:442:2: ( ( 'init' ) )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==14) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: ( 'init' )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:443:1: ( 'init' )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:444:3: 'init'
                {
                match(input,14,FOLLOW_14_in_synpred17607); if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:3: ( ( ( ruleFULLSTATEID ) ) | ( ( RULE_STRING ) ) | ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )?
        int alt87=4;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==RULE_ID) ) {
            switch ( input.LA(2) ) {
                case 41:
                    {
                    int LA87_4 = input.LA(3);

                    if ( (LA87_4==RULE_ID) ) {
                        int LA87_7 = input.LA(4);

                        if ( (LA87_7==EOF) ) {
                            alt87=1;
                        }
                        else if ( (LA87_7==RULE_STRING) ) {
                            alt87=3;
                        }
                    }
                    }
                    break;
                case EOF:
                    {
                    alt87=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt87=3;
                    }
                    break;
            }

        }
        else if ( (LA87_0==RULE_STRING) ) {
            alt87=2;
        }
        switch (alt87) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( ( ruleFULLSTATEID ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:4: ( ( ruleFULLSTATEID ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:464:1: ( ruleFULLSTATEID )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:464:1: ( ruleFULLSTATEID )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:465:3: ruleFULLSTATEID
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_1_2_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred17643);
                ruleFULLSTATEID();
                _fsp--;
                if (failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( ( RULE_STRING ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:488:6: ( ( RULE_STRING ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:1: ( RULE_STRING )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:1: ( RULE_STRING )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:490:3: RULE_STRING
                {
                match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred17666); if (failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:6: ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:6: ( ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:7: ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:513:7: ( ( ruleFULLSTATEID ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:514:1: ( ruleFULLSTATEID )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:514:1: ( ruleFULLSTATEID )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:515:3: ruleFULLSTATEID
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_1_2_2_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred17699);
                ruleFULLSTATEID();
                _fsp--;
                if (failed) return ;

                }


                }

                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:537:2: ( ( RULE_STRING ) )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:538:1: ( RULE_STRING )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:538:1: ( RULE_STRING )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:539:3: RULE_STRING
                {
                match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred17716); if (failed) return ;

                }


                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:6: ( ( ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:6: ( ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:6: ( ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:7: ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:7: ( ( ruleStateType ) )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==32||(LA88_0>=45 && LA88_0<=47)) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:563:1: ( ruleStateType )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:563:1: ( ruleStateType )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:564:3: ruleStateType
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_2_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleStateType_in_synpred19753);
                ruleStateType();
                _fsp--;
                if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:586:3: ( ( ruleFULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:587:1: ( ruleFULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:587:1: ( ruleFULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:588:3: ruleFULLSTATEID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred19775);
        ruleFULLSTATEID();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:6: ( ( ( ( ruleStateType ) )? ( ( RULE_STRING ) ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:6: ( ( ( ruleStateType ) )? ( ( RULE_STRING ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:6: ( ( ( ruleStateType ) )? ( ( RULE_STRING ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:7: ( ( ruleStateType ) )? ( ( RULE_STRING ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:611:7: ( ( ruleStateType ) )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==32||(LA89_0>=45 && LA89_0<=47)) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:612:1: ( ruleStateType )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:612:1: ( ruleStateType )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:613:3: ruleStateType
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_3_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleStateType_in_synpred21804);
                ruleStateType();
                _fsp--;
                if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:635:3: ( ( RULE_STRING ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:636:1: ( RULE_STRING )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:636:1: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:637:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred21822); if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:6: ( ( ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:6: ( ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:6: ( ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:7: ( ( ruleStateType ) )? ( ( ruleFULLSTATEID ) ) ( ( RULE_STRING ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:660:7: ( ( ruleStateType ) )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==32||(LA90_0>=45 && LA90_0<=47)) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:1: ( ruleStateType )
                {
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:1: ( ruleStateType )
                // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:3: ruleStateType
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_4_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleStateType_in_synpred23856);
                ruleStateType();
                _fsp--;
                if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:684:3: ( ( ruleFULLSTATEID ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:685:1: ( ruleFULLSTATEID )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:685:1: ( ruleFULLSTATEID )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:686:3: ruleFULLSTATEID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFULLSTATEIDParserRuleCall_1_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFULLSTATEID_in_synpred23878);
        ruleFULLSTATEID();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:708:2: ( ( RULE_STRING ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:709:1: ( RULE_STRING )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:709:1: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:710:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred23895); if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:9: ( '{' ( ( ruleRegion ) ) ( '||' ( ( ruleRegion ) ) )* '}' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:9: '{' ( ( ruleRegion ) ) ( '||' ( ( ruleRegion ) ) )* '}'
        {
        match(input,22,FOLLOW_22_in_synpred341217); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:972:1: ( ( ruleRegion ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:973:1: ( ruleRegion )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:973:1: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:974:3: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_8_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred341238);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:996:2: ( '||' ( ( ruleRegion ) ) )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==23) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:996:4: '||' ( ( ruleRegion ) )
        	    {
        	    match(input,23,FOLLOW_23_in_synpred341249); if (failed) return ;
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1000:1: ( ( ruleRegion ) )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1001:1: ( ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1001:1: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1002:3: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_8_1_0_2_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleRegion_in_synpred341270);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop91;
            }
        } while (true);

        match(input,24,FOLLOW_24_in_synpred341282); if (failed) return ;

        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2200:2: ( ( ( ruleEffect ) ) ( ',' ( ( ruleEffect ) ) )* )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2200:2: ( ( ruleEffect ) ) ( ',' ( ( ruleEffect ) ) )*
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2200:2: ( ( ruleEffect ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2201:1: ( ruleEffect )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2201:1: ( ruleEffect )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2202:3: ruleEffect
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred743332);
        ruleEffect();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2224:2: ( ',' ( ( ruleEffect ) ) )*
        loop111:
        do {
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==29) ) {
                alt111=1;
            }


            switch (alt111) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2224:4: ',' ( ( ruleEffect ) )
        	    {
        	    match(input,29,FOLLOW_29_in_synpred743343); if (failed) return ;
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2228:1: ( ( ruleEffect ) )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:1: ( ruleEffect )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:1: ( ruleEffect )
        	    // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2230:3: ruleEffect
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleEffect_in_synpred743364);
        	    ruleEffect();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop111;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:3: ( ( '(' ( ( ruleValueExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:3: ( '(' ( ( ruleValueExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:3: ( '(' ( ( ruleValueExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2353:5: '(' ( ( ruleValueExpression ) ) ')'
        {
        match(input,43,FOLLOW_43_in_synpred773629); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2357:1: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2358:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2358:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2359:3: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred773650);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,44,FOLLOW_44_in_synpred773660); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:2: ( ( ( ruleValueExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:2: ( ( ruleValueExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:2: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2464:3: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred783836);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred84
    public final void synpred84_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:6: ( ( '(' rulePlusOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:6: ( '(' rulePlusOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:6: ( '(' rulePlusOperation ')' )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2936:8: '(' rulePlusOperation ')'
        {
        match(input,43,FOLLOW_43_in_synpred844781); if (failed) return ;
        pushFollow(FOLLOW_rulePlusOperation_in_synpred844806);
        rulePlusOperation();
        _fsp--;
        if (failed) return ;
        match(input,44,FOLLOW_44_in_synpred844815); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred84

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3103:2: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3103:2: ruleMultOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred865116);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred86

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4044:2: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4044:2: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred966735);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4057:2: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4057:2: ruleSignalReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred976765);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4070:2: ( ruleValOperation )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4070:2: ruleValOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValOperation_in_synpred986795);
        ruleValOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4083:2: ( ruleHostCode )
        // ../de.cau.cs.kieler.synccharts.textual.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:4083:2: ruleHostCode
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostCode_in_synpred996825);
        ruleHostCode();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred97() {
        backtracking++;
        int start = input.mark();
        try {
            synpred97_fragment(); // can never throw exception
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
    public final boolean synpred74() {
        backtracking++;
        int start = input.mark();
        try {
            synpred74_fragment(); // can never throw exception
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
    public final boolean synpred84() {
        backtracking++;
        int start = input.mark();
        try {
            synpred84_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred86() {
        backtracking++;
        int start = input.mark();
        try {
            synpred86_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred78() {
        backtracking++;
        int start = input.mark();
        try {
            synpred78_fragment(); // can never throw exception
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
    public final boolean synpred77() {
        backtracking++;
        int start = input.mark();
        try {
            synpred77_fragment(); // can never throw exception
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
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred99() {
        backtracking++;
        int start = input.mark();
        try {
            synpred99_fragment(); // can never throw exception
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
    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRegion142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegion159 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_13_in_ruleRegion181 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion205 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion232 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion255 = new BitSet(new long[]{0x0000E0010000C032L});
    public static final BitSet FOLLOW_13_in_ruleRegion275 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegion292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleState402 = new BitSet(new long[]{0x700000E0007F8032L});
    public static final BitSet FOLLOW_15_in_ruleState433 = new BitSet(new long[]{0x700000E0007F0032L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleState469 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState492 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleState525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState542 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_15_in_ruleState576 = new BitSet(new long[]{0x700000E0007F4032L});
    public static final BitSet FOLLOW_14_in_ruleState607 = new BitSet(new long[]{0x700000E0007F0032L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleState643 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState666 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleState699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState716 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleState775 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState822 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleState878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState895 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_14_in_ruleState926 = new BitSet(new long[]{0x0000E00100008000L});
    public static final BitSet FOLLOW_15_in_ruleState958 = new BitSet(new long[]{0x0000E00100000000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState993 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState1016 = new BitSet(new long[]{0x700000E0007F0002L});
    public static final BitSet FOLLOW_16_in_ruleState1028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState1045 = new BitSet(new long[]{0x70000000007E0002L});
    public static final BitSet FOLLOW_17_in_ruleState1063 = new BitSet(new long[]{0x80000800140001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1084 = new BitSet(new long[]{0x70000000007E0002L});
    public static final BitSet FOLLOW_18_in_ruleState1097 = new BitSet(new long[]{0x80000800140001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1118 = new BitSet(new long[]{0x70000000007C0002L});
    public static final BitSet FOLLOW_19_in_ruleState1131 = new BitSet(new long[]{0x80000800140001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1152 = new BitSet(new long[]{0x7000000000780002L});
    public static final BitSet FOLLOW_20_in_ruleState1165 = new BitSet(new long[]{0x80000800140001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState1186 = new BitSet(new long[]{0x7000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleState1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleState1217 = new BitSet(new long[]{0x0000E0E50000E030L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState1238 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleState1249 = new BitSet(new long[]{0x0000E0E50000E030L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState1270 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleState1282 = new BitSet(new long[]{0x7000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleState1295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState1312 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleState1327 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState1352 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleTextualTransition_in_ruleState1371 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition1469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleTransition1496 = new BitSet(new long[]{0x0000000042200000L});
    public static final BitSet FOLLOW_25_in_ruleTransition1507 = new BitSet(new long[]{0x800008001C0001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_26_in_ruleTransition1525 = new BitSet(new long[]{0x80000800180001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_27_in_ruleTransition1550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition1567 = new BitSet(new long[]{0x80000800100001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTransition1596 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition1608 = new BitSet(new long[]{0x0000000040200030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTransition1630 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_29_in_ruleTransition1641 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTransition1662 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_30_in_ruleTransition1688 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransition1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextualTransition_in_entryRuleTextualTransition1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextualTransition1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTextualTransition1804 = new BitSet(new long[]{0x0000000380008000L});
    public static final BitSet FOLLOW_31_in_ruleTextualTransition1815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleTextualTransition1841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33_in_ruleTextualTransition1870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_ruleTextualTransition1910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_ruleTextualTransition1945 = new BitSet(new long[]{0x0000000042200000L});
    public static final BitSet FOLLOW_25_in_ruleTextualTransition1956 = new BitSet(new long[]{0x800008005C2001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_26_in_ruleTextualTransition1974 = new BitSet(new long[]{0x80000800582001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_27_in_ruleTextualTransition1999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextualTransition2016 = new BitSet(new long[]{0x80000800502001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTextualTransition2045 = new BitSet(new long[]{0x0000000050200000L});
    public static final BitSet FOLLOW_28_in_ruleTextualTransition2057 = new BitSet(new long[]{0x0000000040200030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTextualTransition2079 = new BitSet(new long[]{0x0000000060200030L});
    public static final BitSet FOLLOW_29_in_ruleTextualTransition2090 = new BitSet(new long[]{0x0000000040200030L});
    public static final BitSet FOLLOW_30_in_ruleTextualTransition2117 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTextualTransition2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariable2224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2241 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleVariable2258 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleVARSIGVALUE_in_ruleVariable2279 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVariable2291 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2312 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSignal2413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38_in_ruleSignal2450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_39_in_ruleSignal2479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleSignal2501 = new BitSet(new long[]{0x0000011800200000L});
    public static final BitSet FOLLOW_35_in_ruleSignal2513 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleVARSIGVALUE_in_ruleSignal2534 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_ruleSignal2548 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2569 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40_in_ruleSignal2587 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal2618 = new BitSet(new long[]{0x003F000000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2640 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2663 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_entryRuleFULLSTATEID2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULLSTATEID2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULLSTATEID2772 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFULLSTATEID2790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFULLSTATEID2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARSIGVALUE_in_entryRuleVARSIGVALUE2853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARSIGVALUE2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVARSIGVALUE2904 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARSIGVALUE2930 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleVARSIGVALUE2956 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVARSIGVALUE2982 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleVARSIGVALUE3008 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME3055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDNAME3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME3107 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleQUALIFIEDNAME3125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAction3240 = new BitSet(new long[]{0x80000800100001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction3271 = new BitSet(new long[]{0x80000800100001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction3298 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAction3310 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction3332 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAction3343 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction3364 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect3405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission3560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission3617 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEmission3629 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleEmission3650 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEmission3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEmission3678 = new BitSet(new long[]{0x80000800000001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission3699 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEmission3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3804 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAssignment3814 = new BitSet(new long[]{0x80000800000001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleAssignment3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSignalReference3945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference3967 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSignalReference3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation4379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation4435 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression4492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValueExpression4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression4585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValueExpression4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleParanthesedValueExpression4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleParanthesedValueExpression4781 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression4806 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleParanthesedValueExpression4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleParanthesedValueExpression4833 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleParanthesedValueExpression4858 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleParanthesedValueExpression4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation4904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4964 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rulePlusOperation4997 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation5018 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation5056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultOrDivOperation5132 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation5157 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleMultOrDivOperation5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation5203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation5263 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultOperation5296 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation5317 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation5415 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivOperation5448 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation5469 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation5507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation5563 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePreArithmOperation5573 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleValOperation_in_rulePreArithmOperation5594 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePreArithmOperation5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression5640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValueExpression5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation5825 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation5858 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation5916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation5972 = new BitSet(new long[]{0x80000800000001F0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOperation6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation6053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation6109 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleUnaryParanthesedOperation6119 = new BitSet(new long[]{0x80000800000001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation6140 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUnaryParanthesedOperation6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression6186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation6341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation6434 = new BitSet(new long[]{0x80000800000001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation6493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation6553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation6586 = new BitSet(new long[]{0x80000800000001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation6607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression6645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedBooleanExpression6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleParanthesedBooleanExpression6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleParanthesedBooleanExpression6841 = new BitSet(new long[]{0x80000800000001F0L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression6866 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleParanthesedBooleanExpression6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode7005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode7057 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleHostCode7073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHostCode7090 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHostCode7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleStateType7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStateType7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStateType7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleStateType7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCombineOperator7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCombineOperator7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCombineOperator7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCombineOperator7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCombineOperator7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCombineOperator7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleValueType7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleValueType7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleValueType7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValueType7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValueType7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValueType7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTransitionType7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTransitionType7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTransitionType7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleValOperator7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCompareOperator7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCompareOperator7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCompareOperator7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCompareOperator7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCompareOperator7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCompareOperator7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleUnaryOperator7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUnaryParanthesedOperator7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOperatorOr7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOperatorAnd7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePlusOperator7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePlusOperator7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMultOperator7937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleMultOperator7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDivOperator7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred1142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred6142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred6159 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_13_in_synpred6181 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_ruleVariable_in_synpred6205 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred6232 = new BitSet(new long[]{0x0000E0E50000C030L});
    public static final BitSet FOLLOW_ruleState_in_synpred6255 = new BitSet(new long[]{0x0000E0010000C032L});
    public static final BitSet FOLLOW_15_in_synpred8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred10492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred12402 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_15_in_synpred12433 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred12525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred12542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred13607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred15666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred17576 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_14_in_synpred17607 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred17643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred17666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred17699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred19753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred19775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred21804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred21822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred23856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFULLSTATEID_in_synpred23878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred23895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred341217 = new BitSet(new long[]{0x0000E0E50000E030L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred341238 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_synpred341249 = new BitSet(new long[]{0x0000E0E50000E030L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred341270 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_synpred341282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred743332 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_synpred743343 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred743364 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_43_in_synpred773629 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred773650 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred773660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred783836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred844781 = new BitSet(new long[]{0x8000080000000170L,0x0000000000000080L});
    public static final BitSet FOLLOW_rulePlusOperation_in_synpred844806 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred844815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred865116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred966735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred976765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_synpred986795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_synpred996825 = new BitSet(new long[]{0x0000000000000002L});

}