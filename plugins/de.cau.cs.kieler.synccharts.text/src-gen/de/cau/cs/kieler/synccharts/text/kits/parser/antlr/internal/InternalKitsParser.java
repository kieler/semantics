package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.text.kits.services.KitsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKitsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Region'", "'init'", "'final'", "'State'", "','", "';'", "'{'", "'['", "'||'", "']'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'}'", "'var'", "':='", "':'", "'input'", "'output'", "'signal'", "'combine'", "'with'", "'<'", "'>'", "'#'", "'delay:='", "'/'", "' history'", "'('", "')'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'NORMAL'", "'CONDITIONAL'", "'REFERENCE'", "'TEXTUAL'", "'-->'", "'o->'", "'>->'", "'='", "'<='", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'*'", "'mod'", "'?'", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'max'", "'min'", "'host'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalKitsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[201+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g"; }



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
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Region";	
       	}
       	
       	@Override
       	protected KitsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:84:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:85:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:86:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRegion_in_entryRuleRegion81);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegion91); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:93:1: ruleRegion returns [EObject current=null] : ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) )? ( (lv_innerStates_2_0= ruleState ) ) ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        EObject lv_innerStates_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:98:6: ( ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) )? ( (lv_innerStates_2_0= ruleState ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:1: ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) )? ( (lv_innerStates_2_0= ruleState ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:1: ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) )? ( (lv_innerStates_2_0= ruleState ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:2: ( 'Region' ( (lv_label_1_0= RULE_ID ) ) )? ( (lv_innerStates_2_0= ruleState ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:2: ( 'Region' ( (lv_label_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:4: 'Region' ( (lv_label_1_0= RULE_ID ) )
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleRegion127); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:103:1: ( (lv_label_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:104:1: (lv_label_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:104:1: (lv_label_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:105:3: lv_label_1_0= RULE_ID
                    {
                    lv_label_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRegion144); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getRegionAccess().getLabelIDTerminalRuleCall_0_1_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_1_0, 
                      	        		"ID", 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:127:4: ( (lv_innerStates_2_0= ruleState ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:128:1: (lv_innerStates_2_0= ruleState )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:128:1: (lv_innerStates_2_0= ruleState )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:129:3: lv_innerStates_2_0= ruleState
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRegion172);
            lv_innerStates_2_0=ruleState();
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
              	        		lv_innerStates_2_0, 
              	        		"State", 
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
    // $ANTLR end ruleRegion


    // $ANTLR start entryRuleNestedRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:159:1: entryRuleNestedRegion returns [EObject current=null] : iv_ruleNestedRegion= ruleNestedRegion EOF ;
    public final EObject entryRuleNestedRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:160:2: (iv_ruleNestedRegion= ruleNestedRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:161:2: iv_ruleNestedRegion= ruleNestedRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedRegion_in_entryRuleNestedRegion208);
            iv_ruleNestedRegion=ruleNestedRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedRegion218); if (failed) return current;

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
    // $ANTLR end entryRuleNestedRegion


    // $ANTLR start ruleNestedRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:168:1: ruleNestedRegion returns [EObject current=null] : ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )* )? ( (lv_innerStates_4_0= ruleState ) )* ) ;
    public final EObject ruleNestedRegion() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        EObject lv_variables_2_0 = null;

        EObject lv_signals_3_0 = null;

        EObject lv_innerStates_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:173:6: ( ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )* )? ( (lv_innerStates_4_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:174:1: ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )* )? ( (lv_innerStates_4_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:174:1: ( ( 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )* )? ( (lv_innerStates_4_0= ruleState ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:174:2: ( 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )* )? ( (lv_innerStates_4_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:174:2: ( 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:174:4: 'Region' ( (lv_label_1_0= RULE_ID ) ) ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )*
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleNestedRegion254); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNestedRegionAccess().getRegionKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:178:1: ( (lv_label_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:179:1: (lv_label_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:179:1: (lv_label_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:180:3: lv_label_1_0= RULE_ID
                    {
                    lv_label_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNestedRegion271); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getNestedRegionAccess().getLabelIDTerminalRuleCall_0_1_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNestedRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:202:2: ( ( (lv_variables_2_0= ruleVariable ) ) | ( (lv_signals_3_0= ruleSignal ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==26) ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>=29 && LA2_0<=31)) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:202:3: ( (lv_variables_2_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:202:3: ( (lv_variables_2_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:1: (lv_variables_2_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:1: (lv_variables_2_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:204:3: lv_variables_2_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getNestedRegionAccess().getVariablesVariableParserRuleCall_0_2_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleNestedRegion298);
                    	    lv_variables_2_0=ruleVariable();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getNestedRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"variables",
                    	      	        		lv_variables_2_0, 
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:227:6: ( (lv_signals_3_0= ruleSignal ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:227:6: ( (lv_signals_3_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:228:1: (lv_signals_3_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:228:1: (lv_signals_3_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:229:3: lv_signals_3_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getNestedRegionAccess().getSignalsSignalParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleNestedRegion325);
                    	    lv_signals_3_0=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getNestedRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_3_0, 
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


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:251:6: ( (lv_innerStates_4_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING||(LA4_0>=12 && LA4_0<=14)||(LA4_0>=48 && LA4_0<=51)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:252:1: (lv_innerStates_4_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:252:1: (lv_innerStates_4_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:253:3: lv_innerStates_4_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getNestedRegionAccess().getInnerStatesStateParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleNestedRegion350);
            	    lv_innerStates_4_0=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getNestedRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"innerStates",
            	      	        		lv_innerStates_4_0, 
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
            	    break loop4;
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
    // $ANTLR end ruleNestedRegion


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:283:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:284:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:285:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState387);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState397); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:292:1: ruleState returns [EObject current=null] : ( ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) ) ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0_0=null;
        Token lv_isFinal_1_0=null;
        Token lv_id_3_0=null;
        Token lv_isFinal_5_0=null;
        Token lv_isInitial_6_0=null;
        Token lv_id_8_0=null;
        Token lv_id_12_0=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;

        AntlrDatatypeRuleToken lv_label_9_0 = null;

        Enumerator lv_type_10_0 = null;

        AntlrDatatypeRuleToken lv_label_13_0 = null;

        EObject lv_outgoingTransitions_14_0 = null;

        EObject lv_outgoingTransitions_16_0 = null;

        EObject lv_regions_20_0 = null;

        EObject lv_regions_22_0 = null;

        EObject lv_signals_24_0 = null;

        EObject lv_variables_25_0 = null;

        EObject lv_entryActions_27_0 = null;

        EObject lv_innerActions_29_0 = null;

        EObject lv_exitActions_31_0 = null;

        EObject lv_suspensionTrigger_33_0 = null;

        EObject lv_signals_34_0 = null;

        EObject lv_variables_35_0 = null;

        EObject lv_entryActions_37_0 = null;

        EObject lv_innerActions_39_0 = null;

        EObject lv_exitActions_41_0 = null;

        EObject lv_suspensionTrigger_43_0 = null;

        EObject lv_regions_45_0 = null;

        EObject lv_regions_47_0 = null;

        EObject lv_outgoingTransitions_50_0 = null;

        EObject lv_outgoingTransitions_52_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:297:6: ( ( ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) ) ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:1: ( ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) ) ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:1: ( ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) ) ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:2: ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) ) ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:2: ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt14=1;
                }
                break;
            case 13:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 14:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt14=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("298:2: ( ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) ) | ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) ) | ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:3: ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:3: ( ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:4: ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? ) ( 'State' )? ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= ruleEString ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:4: ( ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:5: ( (lv_isInitial_0_0= 'init' ) ) ( (lv_isFinal_1_0= 'final' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:5: ( (lv_isInitial_0_0= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:299:1: (lv_isInitial_0_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:299:1: (lv_isInitial_0_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:300:3: lv_isInitial_0_0= 'init'
                    {
                    lv_isInitial_0_0=(Token)input.LT(1);
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleState443); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:319:2: ( (lv_isFinal_1_0= 'final' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==13) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:320:1: (lv_isFinal_1_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:320:1: (lv_isFinal_1_0= 'final' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:321:3: lv_isFinal_1_0= 'final'
                            {
                            lv_isFinal_1_0=(Token)input.LT(1);
                            match(input,13,FollowSets000.FOLLOW_13_in_ruleState474); if (failed) return current;
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

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:340:4: ( 'State' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==14) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:340:6: 'State'
                            {
                            match(input,14,FollowSets000.FOLLOW_14_in_ruleState500); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:344:3: ( (lv_id_3_0= RULE_ID ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==RULE_ID||LA7_1==RULE_STRING) ) {
                            alt7=1;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:345:1: (lv_id_3_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:345:1: (lv_id_3_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:346:3: lv_id_3_0= RULE_ID
                            {
                            lv_id_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState519); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_0_0_2_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_3_0, 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:368:3: ( (lv_label_4_0= ruleEString ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:369:1: (lv_label_4_0= ruleEString )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:369:1: (lv_label_4_0= ruleEString )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:370:3: lv_label_4_0= ruleEString
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getLabelEStringParserRuleCall_0_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState546);
                    lv_label_4_0=ruleEString();
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
                      	       			"label",
                      	        		lv_label_4_0, 
                      	        		"EString", 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:393:6: ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:393:6: ( ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:393:7: ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? ) ( 'State' )? ( (lv_id_8_0= RULE_ID ) )? ( (lv_label_9_0= ruleEString ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:393:7: ( ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:393:8: ( (lv_isFinal_5_0= 'final' ) ) ( (lv_isInitial_6_0= 'init' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:393:8: ( (lv_isFinal_5_0= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:394:1: (lv_isFinal_5_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:394:1: (lv_isFinal_5_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:395:3: lv_isFinal_5_0= 'final'
                    {
                    lv_isFinal_5_0=(Token)input.LT(1);
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleState573); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:414:2: ( (lv_isInitial_6_0= 'init' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==12) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:415:1: (lv_isInitial_6_0= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:415:1: (lv_isInitial_6_0= 'init' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:416:3: lv_isInitial_6_0= 'init'
                            {
                            lv_isInitial_6_0=(Token)input.LT(1);
                            match(input,12,FollowSets000.FOLLOW_12_in_ruleState604); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_1_0(), "isInitial"); 
                                  
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


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:435:4: ( 'State' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==14) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:435:6: 'State'
                            {
                            match(input,14,FollowSets000.FOLLOW_14_in_ruleState630); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:439:3: ( (lv_id_8_0= RULE_ID ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==RULE_ID||LA10_1==RULE_STRING) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:440:1: (lv_id_8_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:440:1: (lv_id_8_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:441:3: lv_id_8_0= RULE_ID
                            {
                            lv_id_8_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState649); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_0_1_2_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:463:3: ( (lv_label_9_0= ruleEString ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:464:1: (lv_label_9_0= ruleEString )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:464:1: (lv_label_9_0= ruleEString )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:465:3: lv_label_9_0= ruleEString
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getLabelEStringParserRuleCall_0_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState676);
                    lv_label_9_0=ruleEString();
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
                      	       			"label",
                      	        		lv_label_9_0, 
                      	        		"EString", 
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
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:488:6: ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:488:6: ( ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:488:7: ( (lv_type_10_0= ruleStateType ) )? ( 'State' )? ( (lv_id_12_0= RULE_ID ) )? ( (lv_label_13_0= ruleEString ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:488:7: ( (lv_type_10_0= ruleStateType ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=48 && LA11_0<=51)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:489:1: (lv_type_10_0= ruleStateType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:489:1: (lv_type_10_0= ruleStateType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:490:3: lv_type_10_0= ruleStateType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleState705);
                            lv_type_10_0=ruleStateType();
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
                              	        		lv_type_10_0, 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:512:3: ( 'State' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==14) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:512:5: 'State'
                            {
                            match(input,14,FollowSets000.FOLLOW_14_in_ruleState717); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_2_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:516:3: ( (lv_id_12_0= RULE_ID ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==RULE_ID||LA13_1==RULE_STRING) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:517:1: (lv_id_12_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:517:1: (lv_id_12_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:518:3: lv_id_12_0= RULE_ID
                            {
                            lv_id_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState736); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_0_2_2_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_12_0, 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:540:3: ( (lv_label_13_0= ruleEString ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:541:1: (lv_label_13_0= ruleEString )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:541:1: (lv_label_13_0= ruleEString )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:542:3: lv_label_13_0= ruleEString
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getLabelEStringParserRuleCall_0_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState763);
                    lv_label_13_0=ruleEString();
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
                      	       			"label",
                      	        		lv_label_13_0, 
                      	        		"EString", 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:4: ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16||(LA25_0>=52 && LA25_0<=54)) ) {
                alt25=1;
            }
            else if ( (LA25_0==17) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("564:4: ( ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' ) | ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:5: ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:5: ( ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:6: ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )? ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:6: ( ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=52 && LA16_0<=54)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:7: ( (lv_outgoingTransitions_14_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )*
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:564:7: ( (lv_outgoingTransitions_14_0= ruleTransition ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:565:1: (lv_outgoingTransitions_14_0= ruleTransition )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:565:1: (lv_outgoingTransitions_14_0= ruleTransition )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:566:3: lv_outgoingTransitions_14_0= ruleTransition
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_1_0_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState789);
                            lv_outgoingTransitions_14_0=ruleTransition();
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
                              	        		lv_outgoingTransitions_14_0, 
                              	        		"Transition", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:588:2: ( ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==15) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:588:4: ',' ( (lv_outgoingTransitions_16_0= ruleTransition ) )
                            	    {
                            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleState800); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_1_0_0_1_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:592:1: ( (lv_outgoingTransitions_16_0= ruleTransition ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:593:1: (lv_outgoingTransitions_16_0= ruleTransition )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:593:1: (lv_outgoingTransitions_16_0= ruleTransition )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:594:3: lv_outgoingTransitions_16_0= ruleTransition
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_1_0_0_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState821);
                            	    lv_outgoingTransitions_16_0=ruleTransition();
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
                            	      	        		lv_outgoingTransitions_16_0, 
                            	      	        		"Transition", 
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
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleState835); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getSemicolonKeyword_1_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:621:6: ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:621:6: ( '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:621:8: '{' ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) ) '}' ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )?
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleState853); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:625:1: ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==18) ) {
                        alt22=1;
                    }
                    else if ( ((LA22_0>=21 && LA22_0<=24)||LA22_0==26||(LA22_0>=29 && LA22_0<=31)) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("625:1: ( ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' ) | ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:625:2: ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:625:2: ( '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:625:4: '[' ( (lv_regions_20_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )* ']'
                            {
                            match(input,18,FollowSets000.FOLLOW_18_in_ruleState865); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_1_1_1_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:629:1: ( (lv_regions_20_0= ruleNestedRegion ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:630:1: (lv_regions_20_0= ruleNestedRegion )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:630:1: (lv_regions_20_0= ruleNestedRegion )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:631:3: lv_regions_20_0= ruleNestedRegion
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsNestedRegionParserRuleCall_1_1_1_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNestedRegion_in_ruleState886);
                            lv_regions_20_0=ruleNestedRegion();
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
                              	        		lv_regions_20_0, 
                              	        		"NestedRegion", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:653:2: ( '||' ( (lv_regions_22_0= ruleNestedRegion ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==19) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:653:4: '||' ( (lv_regions_22_0= ruleNestedRegion ) )
                            	    {
                            	    match(input,19,FollowSets000.FOLLOW_19_in_ruleState897); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_1_1_1_0_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:657:1: ( (lv_regions_22_0= ruleNestedRegion ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:658:1: (lv_regions_22_0= ruleNestedRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:658:1: (lv_regions_22_0= ruleNestedRegion )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:659:3: lv_regions_22_0= ruleNestedRegion
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsNestedRegionParserRuleCall_1_1_1_0_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNestedRegion_in_ruleState918);
                            	    lv_regions_22_0=ruleNestedRegion();
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
                            	      	        		lv_regions_22_0, 
                            	      	        		"NestedRegion", 
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
                            	    break loop17;
                                }
                            } while (true);

                            match(input,20,FollowSets000.FOLLOW_20_in_ruleState930); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getRightSquareBracketKeyword_1_1_1_0_3(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:686:6: ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:686:6: ( ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )? )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:686:7: ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) ) ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )* ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )?
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:686:7: ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) )
                            int alt18=6;
                            switch ( input.LA(1) ) {
                            case 29:
                            case 30:
                            case 31:
                                {
                                alt18=1;
                                }
                                break;
                            case 26:
                                {
                                alt18=2;
                                }
                                break;
                            case 21:
                                {
                                alt18=3;
                                }
                                break;
                            case 22:
                                {
                                alt18=4;
                                }
                                break;
                            case 23:
                                {
                                alt18=5;
                                }
                                break;
                            case 24:
                                {
                                alt18=6;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("686:7: ( ( (lv_signals_24_0= ruleSignal ) ) | ( (lv_variables_25_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) ) )", 18, 0, input);

                                throw nvae;
                            }

                            switch (alt18) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:686:8: ( (lv_signals_24_0= ruleSignal ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:686:8: ( (lv_signals_24_0= ruleSignal ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:687:1: (lv_signals_24_0= ruleSignal )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:687:1: (lv_signals_24_0= ruleSignal )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:688:3: lv_signals_24_0= ruleSignal
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_1_1_1_1_0_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleState960);
                                    lv_signals_24_0=ruleSignal();
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
                                      	        		lv_signals_24_0, 
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
                                case 2 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:711:6: ( (lv_variables_25_0= ruleVariable ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:711:6: ( (lv_variables_25_0= ruleVariable ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:712:1: (lv_variables_25_0= ruleVariable )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:712:1: (lv_variables_25_0= ruleVariable )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:713:3: lv_variables_25_0= ruleVariable
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getVariablesVariableParserRuleCall_1_1_1_1_0_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleState987);
                                    lv_variables_25_0=ruleVariable();
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
                                      	       			"variables",
                                      	        		lv_variables_25_0, 
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
                                case 3 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:736:6: ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:736:6: ( 'onentry' ( (lv_entryActions_27_0= ruleAction ) ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:736:8: 'onentry' ( (lv_entryActions_27_0= ruleAction ) )
                                    {
                                    match(input,21,FollowSets000.FOLLOW_21_in_ruleState1004); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_1_1_1_1_0_2_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:740:1: ( (lv_entryActions_27_0= ruleAction ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:741:1: (lv_entryActions_27_0= ruleAction )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:741:1: (lv_entryActions_27_0= ruleAction )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:742:3: lv_entryActions_27_0= ruleAction
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_1_1_1_1_0_2_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1025);
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


                                    }
                                    break;
                                case 4 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:765:6: ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:765:6: ( 'oninner' ( (lv_innerActions_29_0= ruleAction ) ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:765:8: 'oninner' ( (lv_innerActions_29_0= ruleAction ) )
                                    {
                                    match(input,22,FollowSets000.FOLLOW_22_in_ruleState1043); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_1_1_1_1_0_3_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:769:1: ( (lv_innerActions_29_0= ruleAction ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:770:1: (lv_innerActions_29_0= ruleAction )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:770:1: (lv_innerActions_29_0= ruleAction )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:771:3: lv_innerActions_29_0= ruleAction
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_1_1_1_1_0_3_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1064);
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


                                    }
                                    break;
                                case 5 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:794:6: ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:794:6: ( 'onexit' ( (lv_exitActions_31_0= ruleAction ) ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:794:8: 'onexit' ( (lv_exitActions_31_0= ruleAction ) )
                                    {
                                    match(input,23,FollowSets000.FOLLOW_23_in_ruleState1082); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_1_1_1_1_0_4_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:798:1: ( (lv_exitActions_31_0= ruleAction ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:799:1: (lv_exitActions_31_0= ruleAction )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:799:1: (lv_exitActions_31_0= ruleAction )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:800:3: lv_exitActions_31_0= ruleAction
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_1_1_1_1_0_4_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1103);
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


                                    }
                                    break;
                                case 6 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:823:6: ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:823:6: ( 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:823:8: 'suspension' ( (lv_suspensionTrigger_33_0= ruleAction ) )
                                    {
                                    match(input,24,FollowSets000.FOLLOW_24_in_ruleState1121); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_1_1_1_1_0_5_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:827:1: ( (lv_suspensionTrigger_33_0= ruleAction ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:828:1: (lv_suspensionTrigger_33_0= ruleAction )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:828:1: (lv_suspensionTrigger_33_0= ruleAction )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:829:3: lv_suspensionTrigger_33_0= ruleAction
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_1_1_1_1_0_5_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1142);
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


                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:851:4: ( ( (lv_signals_34_0= ruleSignal ) ) | ( (lv_variables_35_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) ) )*
                            loop19:
                            do {
                                int alt19=7;
                                switch ( input.LA(1) ) {
                                case 29:
                                case 30:
                                case 31:
                                    {
                                    alt19=1;
                                    }
                                    break;
                                case 26:
                                    {
                                    alt19=2;
                                    }
                                    break;
                                case 21:
                                    {
                                    alt19=3;
                                    }
                                    break;
                                case 22:
                                    {
                                    alt19=4;
                                    }
                                    break;
                                case 23:
                                    {
                                    alt19=5;
                                    }
                                    break;
                                case 24:
                                    {
                                    alt19=6;
                                    }
                                    break;

                                }

                                switch (alt19) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:851:5: ( (lv_signals_34_0= ruleSignal ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:851:5: ( (lv_signals_34_0= ruleSignal ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:852:1: (lv_signals_34_0= ruleSignal )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:852:1: (lv_signals_34_0= ruleSignal )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:853:3: lv_signals_34_0= ruleSignal
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_1_1_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleState1166);
                            	    lv_signals_34_0=ruleSignal();
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
                            	      	        		lv_signals_34_0, 
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
                            	case 2 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:876:6: ( (lv_variables_35_0= ruleVariable ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:876:6: ( (lv_variables_35_0= ruleVariable ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:877:1: (lv_variables_35_0= ruleVariable )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:877:1: (lv_variables_35_0= ruleVariable )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:878:3: lv_variables_35_0= ruleVariable
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getVariablesVariableParserRuleCall_1_1_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleState1193);
                            	    lv_variables_35_0=ruleVariable();
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
                            	      	       			"variables",
                            	      	        		lv_variables_35_0, 
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
                            	case 3 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:901:6: ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:901:6: ( 'onentry' ( (lv_entryActions_37_0= ruleAction ) ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:901:8: 'onentry' ( (lv_entryActions_37_0= ruleAction ) )
                            	    {
                            	    match(input,21,FollowSets000.FOLLOW_21_in_ruleState1210); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_1_1_1_1_1_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:905:1: ( (lv_entryActions_37_0= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:906:1: (lv_entryActions_37_0= ruleAction )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:906:1: (lv_entryActions_37_0= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:907:3: lv_entryActions_37_0= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_1_1_1_1_1_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1231);
                            	    lv_entryActions_37_0=ruleAction();
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
                            	      	        		lv_entryActions_37_0, 
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


                            	    }
                            	    break;
                            	case 4 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:930:6: ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:930:6: ( 'oninner' ( (lv_innerActions_39_0= ruleAction ) ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:930:8: 'oninner' ( (lv_innerActions_39_0= ruleAction ) )
                            	    {
                            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleState1249); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_1_1_1_1_1_3_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:934:1: ( (lv_innerActions_39_0= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:935:1: (lv_innerActions_39_0= ruleAction )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:935:1: (lv_innerActions_39_0= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:936:3: lv_innerActions_39_0= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_1_1_1_1_1_3_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1270);
                            	    lv_innerActions_39_0=ruleAction();
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
                            	      	        		lv_innerActions_39_0, 
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


                            	    }
                            	    break;
                            	case 5 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:959:6: ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:959:6: ( 'onexit' ( (lv_exitActions_41_0= ruleAction ) ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:959:8: 'onexit' ( (lv_exitActions_41_0= ruleAction ) )
                            	    {
                            	    match(input,23,FollowSets000.FOLLOW_23_in_ruleState1288); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_1_1_1_1_1_4_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:963:1: ( (lv_exitActions_41_0= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:964:1: (lv_exitActions_41_0= ruleAction )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:964:1: (lv_exitActions_41_0= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:965:3: lv_exitActions_41_0= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_1_1_1_1_1_4_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1309);
                            	    lv_exitActions_41_0=ruleAction();
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
                            	      	        		lv_exitActions_41_0, 
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


                            	    }
                            	    break;
                            	case 6 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:988:6: ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:988:6: ( 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:988:8: 'suspension' ( (lv_suspensionTrigger_43_0= ruleAction ) )
                            	    {
                            	    match(input,24,FollowSets000.FOLLOW_24_in_ruleState1327); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_1_1_1_1_1_5_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:992:1: ( (lv_suspensionTrigger_43_0= ruleAction ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:993:1: (lv_suspensionTrigger_43_0= ruleAction )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:993:1: (lv_suspensionTrigger_43_0= ruleAction )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:994:3: lv_suspensionTrigger_43_0= ruleAction
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_1_1_1_1_1_5_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1348);
                            	    lv_suspensionTrigger_43_0=ruleAction();
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
                            	      	        		lv_suspensionTrigger_43_0, 
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


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1016:5: ( '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==18) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1016:7: '[' ( (lv_regions_45_0= ruleNestedRegion ) ) ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )* ']'
                                    {
                                    match(input,18,FollowSets000.FOLLOW_18_in_ruleState1362); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_1_1_1_1_2_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1020:1: ( (lv_regions_45_0= ruleNestedRegion ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1021:1: (lv_regions_45_0= ruleNestedRegion )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1021:1: (lv_regions_45_0= ruleNestedRegion )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1022:3: lv_regions_45_0= ruleNestedRegion
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsNestedRegionParserRuleCall_1_1_1_1_2_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleNestedRegion_in_ruleState1383);
                                    lv_regions_45_0=ruleNestedRegion();
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
                                      	        		lv_regions_45_0, 
                                      	        		"NestedRegion", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }

                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1044:2: ( '||' ( (lv_regions_47_0= ruleNestedRegion ) ) )*
                                    loop20:
                                    do {
                                        int alt20=2;
                                        int LA20_0 = input.LA(1);

                                        if ( (LA20_0==19) ) {
                                            alt20=1;
                                        }


                                        switch (alt20) {
                                    	case 1 :
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1044:4: '||' ( (lv_regions_47_0= ruleNestedRegion ) )
                                    	    {
                                    	    match(input,19,FollowSets000.FOLLOW_19_in_ruleState1394); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_1_1_1_1_2_2_0(), null); 
                                    	          
                                    	    }
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1048:1: ( (lv_regions_47_0= ruleNestedRegion ) )
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1049:1: (lv_regions_47_0= ruleNestedRegion )
                                    	    {
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1049:1: (lv_regions_47_0= ruleNestedRegion )
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1050:3: lv_regions_47_0= ruleNestedRegion
                                    	    {
                                    	    if ( backtracking==0 ) {
                                    	       
                                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsNestedRegionParserRuleCall_1_1_1_1_2_2_1_0(), currentNode); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleNestedRegion_in_ruleState1415);
                                    	    lv_regions_47_0=ruleNestedRegion();
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
                                    	      	        		lv_regions_47_0, 
                                    	      	        		"NestedRegion", 
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

                                    match(input,20,FollowSets000.FOLLOW_20_in_ruleState1427); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getStateAccess().getRightSquareBracketKeyword_1_1_1_1_2_3(), null); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    match(input,25,FollowSets000.FOLLOW_25_in_ruleState1441); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1080:1: ( ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=52 && LA24_0<=54)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1080:2: ( (lv_outgoingTransitions_50_0= ruleTransition ) ) ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )* ';'
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1080:2: ( (lv_outgoingTransitions_50_0= ruleTransition ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1081:1: (lv_outgoingTransitions_50_0= ruleTransition )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1081:1: (lv_outgoingTransitions_50_0= ruleTransition )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1082:3: lv_outgoingTransitions_50_0= ruleTransition
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_1_1_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState1463);
                            lv_outgoingTransitions_50_0=ruleTransition();
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
                              	        		lv_outgoingTransitions_50_0, 
                              	        		"Transition", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1104:2: ( ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==15) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1104:4: ',' ( (lv_outgoingTransitions_52_0= ruleTransition ) )
                            	    {
                            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleState1474); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_1_1_3_1_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1108:1: ( (lv_outgoingTransitions_52_0= ruleTransition ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1109:1: (lv_outgoingTransitions_52_0= ruleTransition )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1109:1: (lv_outgoingTransitions_52_0= ruleTransition )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1110:3: lv_outgoingTransitions_52_0= ruleTransition
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_1_1_3_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState1495);
                            	    lv_outgoingTransitions_52_0=ruleTransition();
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
                            	      	        		lv_outgoingTransitions_52_0, 
                            	      	        		"Transition", 
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
                            	    break loop23;
                                }
                            } while (true);

                            match(input,16,FollowSets000.FOLLOW_16_in_ruleState1507); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getSemicolonKeyword_1_1_3_2(), null); 
                                  
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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1144:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1145:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1146:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1547);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1557); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1153:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) ) ) ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;

        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1158:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) ) ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1159:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) ) ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1159:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) ) ) ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1159:3: 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) ) ) ';'
            {
            match(input,26,FollowSets000.FOLLOW_26_in_ruleVariable1592); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1164:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1164:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariable1609); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1187:2: ( ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1187:3: ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )? ':' ( (lv_type_5_0= ruleValueType ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1187:3: ( ':=' ( (lv_initialValue_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1187:5: ':=' ( (lv_initialValue_3_0= ruleEString ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleVariable1626); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1191:1: ( (lv_initialValue_3_0= ruleEString ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1192:1: (lv_initialValue_3_0= ruleEString )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1192:1: (lv_initialValue_3_0= ruleEString )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1193:3: lv_initialValue_3_0= ruleEString
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getInitialValueEStringParserRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable1647);
                    lv_initialValue_3_0=ruleEString();
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
                      	        		"EString", 
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleVariable1659); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_2_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1219:1: ( (lv_type_5_0= ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1220:1: (lv_type_5_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1220:1: (lv_type_5_0= ruleValueType )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1221:3: lv_type_5_0= ruleValueType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleVariable1680);
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

            match(input,16,FollowSets000.FOLLOW_16_in_ruleVariable1691); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1255:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1256:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1257:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_entryRuleSignal1727);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal1737); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1264:1: ruleSignal returns [EObject current=null] : ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= ruleEString ) ) ( ':=' ( (lv_initialValue_5_0= ruleEString ) ) )? ( ( ':' ( (lv_type_7_0= ruleValueType ) ) ) | ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) ) )? ';' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_0_0=null;
        Token lv_isOutput_1_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_5_0 = null;

        Enumerator lv_type_7_0 = null;

        Enumerator lv_type_10_0 = null;

        Enumerator lv_combineOperator_12_0 = null;

        AntlrDatatypeRuleToken lv_hostCombineOperator_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1269:6: ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= ruleEString ) ) ( ':=' ( (lv_initialValue_5_0= ruleEString ) ) )? ( ( ':' ( (lv_type_7_0= ruleValueType ) ) ) | ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1270:1: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= ruleEString ) ) ( ':=' ( (lv_initialValue_5_0= ruleEString ) ) )? ( ( ':' ( (lv_type_7_0= ruleValueType ) ) ) | ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1270:1: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= ruleEString ) ) ( ':=' ( (lv_initialValue_5_0= ruleEString ) ) )? ( ( ':' ( (lv_type_7_0= ruleValueType ) ) ) | ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1270:2: ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= ruleEString ) ) ( ':=' ( (lv_initialValue_5_0= ruleEString ) ) )? ( ( ':' ( (lv_type_7_0= ruleValueType ) ) ) | ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1270:2: ( (lv_isInput_0_0= 'input' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1271:1: (lv_isInput_0_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1271:1: (lv_isInput_0_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1272:3: lv_isInput_0_0= 'input'
                    {
                    lv_isInput_0_0=(Token)input.LT(1);
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleSignal1780); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_0(), "isInput"); 
                          
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

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1291:3: ( (lv_isOutput_1_0= 'output' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1292:1: (lv_isOutput_1_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1292:1: (lv_isOutput_1_0= 'output' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1293:3: lv_isOutput_1_0= 'output'
                    {
                    lv_isOutput_1_0=(Token)input.LT(1);
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleSignal1812); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_1_0(), "isOutput"); 
                          
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

            match(input,31,FollowSets000.FOLLOW_31_in_ruleSignal1836); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getSignalKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1316:1: ( (lv_name_3_0= ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1317:1: (lv_name_3_0= ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1317:1: (lv_name_3_0= ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1318:3: lv_name_3_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getNameEStringParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignal1857);
            lv_name_3_0=ruleEString();
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
              	        		"EString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1340:2: ( ':=' ( (lv_initialValue_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1340:4: ':=' ( (lv_initialValue_5_0= ruleEString ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleSignal1868); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1344:1: ( (lv_initialValue_5_0= ruleEString ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1345:1: (lv_initialValue_5_0= ruleEString )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1345:1: (lv_initialValue_5_0= ruleEString )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1346:3: lv_initialValue_5_0= ruleEString
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getInitialValueEStringParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignal1889);
                    lv_initialValue_5_0=ruleEString();
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
                      	        		"EString", 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1368:4: ( ( ':' ( (lv_type_7_0= ruleValueType ) ) ) | ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==32) ) {
                    alt31=2;
                }
                else if ( ((LA31_1>=67 && LA31_1<=72)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1368:5: ( ':' ( (lv_type_7_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1368:5: ( ':' ( (lv_type_7_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1368:7: ':' ( (lv_type_7_0= ruleValueType ) )
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleSignal1903); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1372:1: ( (lv_type_7_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1373:1: (lv_type_7_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1373:1: (lv_type_7_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1374:3: lv_type_7_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleSignal1924);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1397:6: ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1397:6: ( ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1397:8: ':' 'combine' ( (lv_type_10_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) )
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleSignal1942); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_1_0(), null); 
                          
                    }
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleSignal1952); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_5_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1405:1: ( (lv_type_10_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1406:1: (lv_type_10_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1406:1: (lv_type_10_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1407:3: lv_type_10_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleSignal1973);
                    lv_type_10_0=ruleValueType();
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
                      	        		lv_type_10_0, 
                      	        		"ValueType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,33,FollowSets000.FOLLOW_33_in_ruleSignal1983); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_5_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1433:1: ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=60 && LA30_0<=61)||(LA30_0>=63 && LA30_0<=64)||(LA30_0>=73 && LA30_0<=76)) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                        alt30=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1433:1: ( ( (lv_combineOperator_12_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_13_0= ruleEString ) ) )", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1433:2: ( (lv_combineOperator_12_0= ruleCombineOperator ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1433:2: ( (lv_combineOperator_12_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1434:1: (lv_combineOperator_12_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1434:1: (lv_combineOperator_12_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1435:3: lv_combineOperator_12_0= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_5_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleSignal2005);
                            lv_combineOperator_12_0=ruleCombineOperator();
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
                              	        		lv_combineOperator_12_0, 
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1458:6: ( (lv_hostCombineOperator_13_0= ruleEString ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1458:6: ( (lv_hostCombineOperator_13_0= ruleEString ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1459:1: (lv_hostCombineOperator_13_0= ruleEString )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1459:1: (lv_hostCombineOperator_13_0= ruleEString )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1460:3: lv_hostCombineOperator_13_0= ruleEString
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getHostCombineOperatorEStringParserRuleCall_5_1_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignal2032);
                            lv_hostCombineOperator_13_0=ruleEString();
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
                              	       			"hostCombineOperator",
                              	        		lv_hostCombineOperator_13_0, 
                              	        		"EString", 
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
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleSignal2046); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getSemicolonKeyword_6(), null); 
                  
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


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1494:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1495:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1496:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition2082);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition2092); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1503:1: ruleTransition returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleEString ) ) ( '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>' )? ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ( (lv_isHistory_14_0= ' history' ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_6_0=null;
        Token lv_delay_8_0=null;
        Token lv_isHistory_14_0=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_priority_3_0 = null;

        EObject lv_trigger_9_0 = null;

        EObject lv_effects_11_0 = null;

        EObject lv_effects_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1508:6: ( ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleEString ) ) ( '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>' )? ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ( (lv_isHistory_14_0= ' history' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1509:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleEString ) ) ( '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>' )? ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ( (lv_isHistory_14_0= ' history' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1509:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleEString ) ) ( '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>' )? ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ( (lv_isHistory_14_0= ' history' ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1509:2: ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleEString ) ) ( '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>' )? ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ( (lv_isHistory_14_0= ' history' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1509:2: ( (lv_type_0_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1510:1: (lv_type_0_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1510:1: (lv_type_0_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1511:3: lv_type_0_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionType_in_ruleTransition2138);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1533:2: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1534:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1534:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1535:3: ruleEString
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
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition2165);
            ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1552:2: ( '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1552:4: '<' ( (lv_priority_3_0= ruleEIntegerObject ) ) '>'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleTransition2176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getLessThanSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1556:1: ( (lv_priority_3_0= ruleEIntegerObject ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1557:1: (lv_priority_3_0= ruleEIntegerObject )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1557:1: (lv_priority_3_0= ruleEIntegerObject )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1558:3: lv_priority_3_0= ruleEIntegerObject
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getPriorityEIntegerObjectParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleTransition2197);
                    lv_priority_3_0=ruleEIntegerObject();
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
                      	       			"priority",
                      	        		lv_priority_3_0, 
                      	        		"EIntegerObject", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,35,FollowSets000.FOLLOW_35_in_ruleTransition2207); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_2_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1584:3: ( 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1584:5: 'with' ( (lv_isImmediate_6_0= '#' ) )? ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )? ( (lv_trigger_9_0= ruleExpression ) )? ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )?
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleTransition2220); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1588:1: ( (lv_isImmediate_6_0= '#' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==36) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1589:1: (lv_isImmediate_6_0= '#' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1589:1: (lv_isImmediate_6_0= '#' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1590:3: lv_isImmediate_6_0= '#'
                            {
                            lv_isImmediate_6_0=(Token)input.LT(1);
                            match(input,36,FollowSets000.FOLLOW_36_in_ruleTransition2238); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_3_1_0(), "isImmediate"); 
                                  
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1609:3: ( 'delay:=' ( (lv_delay_8_0= RULE_INT ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==37) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1609:5: 'delay:=' ( (lv_delay_8_0= RULE_INT ) )
                            {
                            match(input,37,FollowSets000.FOLLOW_37_in_ruleTransition2263); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getDelayKeyword_3_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1613:1: ( (lv_delay_8_0= RULE_INT ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1614:1: (lv_delay_8_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1614:1: (lv_delay_8_0= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1615:3: lv_delay_8_0= RULE_INT
                            {
                            lv_delay_8_0=(Token)input.LT(1);
                            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition2280); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_3_2_1_0(), "delay"); 
                              		
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1637:4: ( (lv_trigger_9_0= ruleExpression ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==RULE_STRING||LA35_0==40||(LA35_0>=46 && LA35_0<=47)||LA35_0==59||LA35_0==62) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1638:1: (lv_trigger_9_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1638:1: (lv_trigger_9_0= ruleExpression )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1639:3: lv_trigger_9_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTriggerExpressionParserRuleCall_3_3_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTransition2308);
                            lv_trigger_9_0=ruleExpression();
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
                              	        		lv_trigger_9_0, 
                              	        		"Expression", 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1661:3: ( '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==38) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1661:5: '/' ( (lv_effects_11_0= ruleEffect ) ) ( ',' ( (lv_effects_13_0= ruleEffect ) ) )*
                            {
                            match(input,38,FollowSets000.FOLLOW_38_in_ruleTransition2320); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getSolidusKeyword_3_4_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1665:1: ( (lv_effects_11_0= ruleEffect ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1666:1: (lv_effects_11_0= ruleEffect )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1666:1: (lv_effects_11_0= ruleEffect )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1667:3: lv_effects_11_0= ruleEffect
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2341);
                            lv_effects_11_0=ruleEffect();
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

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1689:2: ( ',' ( (lv_effects_13_0= ruleEffect ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==15) ) {
                                    int LA36_2 = input.LA(2);

                                    if ( (LA36_2==RULE_ID||LA36_2==RULE_STRING) ) {
                                        alt36=1;
                                    }


                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1689:4: ',' ( (lv_effects_13_0= ruleEffect ) )
                            	    {
                            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleTransition2352); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_3_4_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1693:1: ( (lv_effects_13_0= ruleEffect ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1694:1: (lv_effects_13_0= ruleEffect )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1694:1: (lv_effects_13_0= ruleEffect )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1695:3: lv_effects_13_0= ruleEffect
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_4_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2373);
                            	    lv_effects_13_0=ruleEffect();
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
                            	      	        		lv_effects_13_0, 
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1717:8: ( (lv_isHistory_14_0= ' history' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1718:1: (lv_isHistory_14_0= ' history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1718:1: (lv_isHistory_14_0= ' history' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1719:3: lv_isHistory_14_0= ' history'
                    {
                    lv_isHistory_14_0=(Token)input.LT(1);
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleTransition2397); if (failed) return current;
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
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1746:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1747:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1748:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2447);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2457); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1755:1: ruleAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1760:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1761:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1761:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1761:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1761:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1762:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getActionAccess().getActionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getActionAccess().getActionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1775:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1776:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1776:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1777:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)input.LT(1);
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleAction2512); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0(), "isImmediate"); 
                          
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1796:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1797:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1797:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1798:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAction2543); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0(), "delay"); 
                      		
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
                      	        		lv_delay_2_0, 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1820:3: ( (lv_trigger_3_0= ruleBooleanExpression ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==RULE_STRING||LA42_0==40||(LA42_0>=46 && LA42_0<=47)||LA42_0==59||LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1821:1: (lv_trigger_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1821:1: (lv_trigger_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1822:3: lv_trigger_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAction2570);
                    lv_trigger_3_0=ruleBooleanExpression();
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
                      	        		lv_trigger_3_0, 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1844:3: ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1844:5: '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleAction2582); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1848:1: ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ID||LA44_0==RULE_STRING) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1848:2: ( (lv_effects_5_0= ruleEffect ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1848:2: ( (lv_effects_5_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1849:1: (lv_effects_5_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1849:1: (lv_effects_5_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1850:3: lv_effects_5_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleAction2604);
                    	    lv_effects_5_0=ruleEffect();
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
                    	      	        		lv_effects_5_0, 
                    	      	        		"Effect", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1872:2: ( ',' )?
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==15) ) {
                    	        alt43=1;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1872:4: ','
                    	            {
                    	            match(input,15,FollowSets000.FOLLOW_15_in_ruleAction2615); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_4_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


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


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1884:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1885:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1886:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect2657);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect2667); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1893:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1898:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1899:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1899:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==27) ) {
                    alt46=2;
                }
                else if ( (LA46_1==EOF||LA46_1==RULE_ID||LA46_1==RULE_STRING||(LA46_1>=15 && LA46_1<=16)||LA46_1==18||(LA46_1>=21 && LA46_1<=26)||(LA46_1>=29 && LA46_1<=31)||(LA46_1>=39 && LA46_1<=40)) ) {
                    alt46=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1899:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==RULE_STRING) ) {
                alt46=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1899:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1900:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect2717);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1913:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect2747);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1926:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect2777);
                    this_TextEffect_2=ruleTextEffect();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextEffect_2; 
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1945:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1946:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1947:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission2812);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission2822); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1954:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;

        EObject lv_newValue_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1959:6: ( ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1960:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1960:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1960:2: ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1960:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1961:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1961:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1962:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission2869); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:2: ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                switch ( input.LA(2) ) {
                    case 46:
                    case 47:
                    case 62:
                        {
                        alt47=2;
                        }
                        break;
                    case RULE_STRING:
                        {
                        switch ( input.LA(3) ) {
                            case 60:
                            case 61:
                                {
                                alt47=2;
                                }
                                break;
                            case 41:
                                {
                                int LA47_9 = input.LA(4);

                                if ( (synpred60()) ) {
                                    alt47=1;
                                }
                                else if ( (synpred61()) ) {
                                    alt47=2;
                                }
                                }
                                break;
                            case 40:
                            case 42:
                            case 63:
                            case 64:
                            case 65:
                                {
                                alt47=1;
                                }
                                break;
                        }

                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(3) ) {
                            case 42:
                            case 63:
                            case 64:
                            case 65:
                                {
                                alt47=1;
                                }
                                break;
                            case 41:
                                {
                                int LA47_9 = input.LA(4);

                                if ( (synpred60()) ) {
                                    alt47=1;
                                }
                                else if ( (synpred61()) ) {
                                    alt47=2;
                                }
                                }
                                break;
                            case 60:
                            case 61:
                                {
                                alt47=2;
                                }
                                break;
                        }

                        }
                        break;
                    case 59:
                        {
                        int LA47_6 = input.LA(3);

                        if ( (LA47_6==40) ) {
                            int LA47_10 = input.LA(4);

                            if ( (LA47_10==RULE_ID||LA47_10==RULE_STRING) ) {
                                alt47=2;
                            }
                            else if ( (LA47_10==66) ) {
                                alt47=1;
                            }
                        }
                        }
                        break;
                    case 40:
                        {
                        int LA47_7 = input.LA(3);

                        if ( (synpred60()) ) {
                            alt47=1;
                        }
                        else if ( (synpred61()) ) {
                            alt47=2;
                        }
                        }
                        break;
                    case RULE_INT:
                    case 42:
                    case 43:
                    case 66:
                        {
                        alt47=1;
                        }
                        break;
                }

            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:5: '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleEmission2881); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1981:1: ( (lv_newValue_2_0= ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1982:1: (lv_newValue_2_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1982:1: (lv_newValue_2_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1983:3: lv_newValue_2_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleEmission2902);
                    lv_newValue_2_0=ruleValuedExpression();
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
                      	        		"ValuedExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleEmission2912); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:8: '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleEmission2930); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2014:1: ( (lv_newValue_5_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2015:1: (lv_newValue_5_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2015:1: (lv_newValue_5_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2016:3: lv_newValue_5_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleEmission2951);
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

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleEmission2961); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2050:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2051:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2052:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment3000);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment3010); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2059:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2064:6: ( ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2065:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2065:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2065:2: ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2065:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2066:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2066:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2067:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment3057); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignment3067); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt48=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 42:
            case 43:
            case 66:
                {
                alt48=1;
                }
                break;
            case RULE_STRING:
                {
                int LA48_2 = input.LA(2);

                if ( (synpred62()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA48_3 = input.LA(2);

                if ( (synpred62()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 48, 3, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                int LA48_4 = input.LA(2);

                if ( (LA48_4==40) ) {
                    int LA48_7 = input.LA(3);

                    if ( (LA48_7==66) ) {
                        alt48=1;
                    }
                    else if ( (LA48_7==RULE_ID||LA48_7==RULE_STRING) ) {
                        alt48=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 48, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 48, 4, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA48_5 = input.LA(2);

                if ( (synpred62()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 48, 5, input);

                    throw nvae;
                }
                }
                break;
            case 46:
            case 47:
            case 62:
                {
                alt48=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2086:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2086:2: ( (lv_expression_2_0= ruleValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2086:2: ( (lv_expression_2_0= ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2087:1: (lv_expression_2_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2087:1: (lv_expression_2_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2088:3: lv_expression_2_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAssignment3089);
                    lv_expression_2_0=ruleValuedExpression();
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
                      	        		"ValuedExpression", 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2111:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2111:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2112:1: (lv_expression_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2112:1: (lv_expression_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2113:3: lv_expression_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAssignment3116);
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


    // $ANTLR start entryRuleTextEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2143:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2144:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2145:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect3153);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect3163); if (failed) return current;

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
    // $ANTLR end entryRuleTextEffect


    // $ANTLR start ruleTextEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2152:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2157:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2158:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2158:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2158:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2158:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2159:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2159:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2160:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextEffect3205); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextEffectRule().getType().getClassifier());
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2182:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2182:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleTextEffect3221); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2186:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2187:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2187:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2188:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextEffect3238); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextEffectRule().getType().getClassifier());
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

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleTextEffect3253); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleTextEffect


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2222:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2223:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2224:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression3291);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression3301); if (failed) return current;

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2231:1: ruleExpression returns [EObject current=null] : this_BooleanExpression_0= ruleBooleanExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2236:6: (this_BooleanExpression_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2238:2: this_BooleanExpression_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExpression3350);
            this_BooleanExpression_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_BooleanExpression_0; 
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2257:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2258:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2259:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3384);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression3394); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2266:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2271:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2273:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression3443);
            this_OrExpression_0=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_OrExpression_0; 
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


    // $ANTLR start entryRuleOrExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2292:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2293:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2294:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression3477);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression3487); if (failed) return current;

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
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2301:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2306:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2307:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2307:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2308:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression3537);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2319:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==60) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2319:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2319:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2320:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2338:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2339:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2339:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2340:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrExpression3570);
            	    lv_operator_2_0=ruleOrOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OrOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2362:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2363:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2363:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2364:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression3591);
            	    lv_subExpressions_3_0=ruleAndExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"AndExpression", 
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
            	    break loop50;
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
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2394:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2395:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2396:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression3629);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression3639); if (failed) return current;

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
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2403:1: ruleAndExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2408:6: ( (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2409:1: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2409:1: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2410:2: this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleAndExpression3689);
            this_NotExpression_0=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NotExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2421:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==61) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2421:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2421:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2422:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2440:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2441:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2441:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2442:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleAndExpression3722);
            	    lv_operator_2_0=ruleAndOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"AndOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2464:2: ( (lv_subExpressions_3_0= ruleNotExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2465:1: (lv_subExpressions_3_0= ruleNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2465:1: (lv_subExpressions_3_0= ruleNotExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2466:3: lv_subExpressions_3_0= ruleNotExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleAndExpression3743);
            	    lv_subExpressions_3_0=ruleNotExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"NotExpression", 
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
            	    break loop51;
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
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2496:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2497:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2498:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression3781);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression3791); if (failed) return current;

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
    // $ANTLR end entryRuleNotExpression


    // $ANTLR start ruleNotExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2505:1: ruleNotExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2510:6: ( (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2511:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2511:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==RULE_STRING||LA52_0==40||(LA52_0>=46 && LA52_0<=47)||LA52_0==59) ) {
                alt52=1;
            }
            else if ( (LA52_0==62) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2511:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2512:2: this_AtomicExpression_0= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression3841);
                    this_AtomicExpression_0=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2524:6: ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2524:6: ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2524:7: () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2524:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2525:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2538:2: ( (lv_operator_2_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2539:1: (lv_operator_2_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2539:1: (lv_operator_2_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2540:3: lv_operator_2_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression3880);
                    lv_operator_2_0=ruleNotOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNotExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"NotOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2562:2: ( (lv_subExpressions_3_0= ruleAtomicExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2563:1: (lv_subExpressions_3_0= ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2563:1: (lv_subExpressions_3_0= ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2564:3: lv_subExpressions_3_0= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression3901);
                    lv_subExpressions_3_0=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNotExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"AtomicExpression", 
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
    // $ANTLR end ruleNotExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2594:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2595:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2596:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3938);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression3948); if (failed) return current;

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
    // $ANTLR end entryRuleAtomicExpression


    // $ANTLR start ruleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2603:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_SignalReference_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_CompareOperation_8 = null;

        EObject this_BooleanExpression_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2608:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
                {
                alt53=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case 59:
                {
                alt53=3;
                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 46:
                case 47:
                case 62:
                    {
                    alt53=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA53_6 = input.LA(3);

                    if ( ((LA53_6>=34 && LA53_6<=35)||LA53_6==40||LA53_6==42||(LA53_6>=55 && LA53_6<=58)||(LA53_6>=63 && LA53_6<=65)) ) {
                        alt53=4;
                    }
                    else if ( (LA53_6==41||(LA53_6>=60 && LA53_6<=61)) ) {
                        alt53=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA53_7 = input.LA(3);

                    if ( (LA53_7==41||(LA53_7>=60 && LA53_7<=61)) ) {
                        alt53=5;
                    }
                    else if ( ((LA53_7>=34 && LA53_7<=35)||LA53_7==42||(LA53_7>=55 && LA53_7<=58)||(LA53_7>=63 && LA53_7<=65)) ) {
                        alt53=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA53_8 = input.LA(3);

                    if ( (LA53_8==40) ) {
                        int LA53_11 = input.LA(4);

                        if ( (LA53_11==RULE_ID||LA53_11==RULE_STRING) ) {
                            alt53=5;
                        }
                        else if ( (LA53_11==66) ) {
                            alt53=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA53_9 = input.LA(3);

                    if ( (synpred70()) ) {
                        alt53=4;
                    }
                    else if ( (true) ) {
                        alt53=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                case 42:
                case 43:
                case 66:
                    {
                    alt53=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2609:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2610:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleAtomicExpression3998);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2623:2: this_SignalReference_1= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_ruleAtomicExpression4028);
                    this_SignalReference_1=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignalReference_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2635:6: ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2635:6: ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2635:7: () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2635:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2636:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2649:2: ( (lv_operator_3_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2650:1: (lv_operator_3_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2650:1: (lv_operator_3_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2651:3: lv_operator_3_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleAtomicExpression4067);
                    lv_operator_3_0=rulePreOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAtomicExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_3_0, 
                      	        		"PreOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicExpression4077); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2677:1: ( (lv_subExpressions_5_0= ruleSignalReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2678:1: (lv_subExpressions_5_0= ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2678:1: (lv_subExpressions_5_0= ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2679:3: lv_subExpressions_5_0= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_ruleAtomicExpression4098);
                    lv_subExpressions_5_0=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAtomicExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_5_0, 
                      	        		"SignalReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicExpression4108); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:6: ( '(' this_CompareOperation_8= ruleCompareOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:6: ( '(' this_CompareOperation_8= ruleCompareOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:8: '(' this_CompareOperation_8= ruleCompareOperation ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicExpression4126); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAtomicExpression4151);
                    this_CompareOperation_8=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_8; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicExpression4160); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2727:6: ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2727:6: ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2727:8: '(' this_BooleanExpression_11= ruleBooleanExpression ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicExpression4178); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression4203);
                    this_BooleanExpression_11=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_11; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicExpression4212); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2(), null); 
                          
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
    // $ANTLR end ruleAtomicExpression


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2755:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2756:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2757:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_entryRuleSignalReference4249);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignalReference4259); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2764:1: ruleSignalReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2769:6: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2770:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2770:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2771:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2771:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2772:3: ruleEString
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
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSignalReference4310);
            ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2797:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2798:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2799:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4345);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation4355); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2806:1: ruleCompareOperation returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2811:6: ( (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2812:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2812:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2813:2: this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleCompareOperation4405);
            this_ValuedExpression_0=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2824:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2824:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2824:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2825:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2843:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2844:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2844:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2845:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation4438);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2867:2: ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2868:1: (lv_subExpressions_3_0= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2868:1: (lv_subExpressions_3_0= ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2869:3: lv_subExpressions_3_0= ruleValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleCompareOperation4459);
            lv_subExpressions_3_0=ruleValuedExpression();
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
              	        		"ValuedExpression", 
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


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2899:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2900:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2901:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4496);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression4506); if (failed) return current;

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
    // $ANTLR end entryRuleValuedExpression


    // $ANTLR start ruleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2908:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2913:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2915:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression4555);
            this_AddExpression_0=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AddExpression_0; 
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
    // $ANTLR end ruleValuedExpression


    // $ANTLR start entryRuleAddExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2934:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2935:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2936:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression4589);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression4599); if (failed) return current;

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
    // $ANTLR end entryRuleAddExpression


    // $ANTLR start ruleAddExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2943:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2948:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2949:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2949:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2950:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression4649);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2961:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==63) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2961:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2961:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2962:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2980:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2981:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2981:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2982:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression4682);
            	    lv_operator_2_0=ruleAddOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"AddOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3004:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3005:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3005:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3006:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression4703);
            	    lv_subExpressions_3_0=ruleSubExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"SubExpression", 
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
            	    break loop54;
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
    // $ANTLR end ruleAddExpression


    // $ANTLR start entryRuleSubExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3036:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3037:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3038:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression4741);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression4751); if (failed) return current;

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
    // $ANTLR end entryRuleSubExpression


    // $ANTLR start ruleSubExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3045:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3050:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3051:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3051:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3052:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression4801);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3063:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==42) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3063:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3063:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3064:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3082:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3083:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3083:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3084:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression4834);
            	    lv_operator_2_0=ruleSubOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"SubOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3106:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3107:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3107:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3108:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression4855);
            	    lv_subExpressions_3_0=ruleMultExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"MultExpression", 
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
            	    break loop55;
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
    // $ANTLR end ruleSubExpression


    // $ANTLR start entryRuleMultExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3138:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3139:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3140:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression4893);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression4903); if (failed) return current;

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
    // $ANTLR end entryRuleMultExpression


    // $ANTLR start ruleMultExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3147:1: ruleMultExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3152:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3153:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3153:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3154:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleMultExpression4953);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3165:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==64) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3165:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3165:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3166:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3184:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3185:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3185:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3186:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression4986);
            	    lv_operator_2_0=ruleMultOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultExpressionRule().getType().getClassifier());
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3208:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3209:1: (lv_subExpressions_3_0= ruleModExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3209:1: (lv_subExpressions_3_0= ruleModExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3210:3: lv_subExpressions_3_0= ruleModExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleMultExpression5007);
            	    lv_subExpressions_3_0=ruleModExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"ModExpression", 
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
            	    break loop56;
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
    // $ANTLR end ruleMultExpression


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3240:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3241:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3242:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression5045);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression5055); if (failed) return current;

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
    // $ANTLR end entryRuleModExpression


    // $ANTLR start ruleModExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3249:1: ruleModExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3254:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3255:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3255:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3256:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5105);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3267:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==65) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3267:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3267:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3268:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3286:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3287:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3287:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3288:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression5138);
                    lv_operator_2_0=ruleModOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"ModOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3310:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3311:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3311:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3312:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5159);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"AtomicValuedExpression", 
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
    // $ANTLR end ruleModExpression


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3342:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3343:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3344:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5197);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression5207); if (failed) return current;

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
    // $ANTLR end entryRuleAtomicValuedExpression


    // $ANTLR start ruleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3351:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_VariableReference_2 = null;

        EObject this_ValueTestExpression_3 = null;

        EObject this_PreValueTestExpression_4 = null;

        EObject this_DivExpression_6 = null;

        EObject this_ValuedExpression_9 = null;

        EObject this_TextExpression_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3356:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )
            int alt58=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_INT) ) {
                    int LA58_2 = input.LA(3);

                    if ( (LA58_2==EOF||LA58_2==RULE_ID||LA58_2==RULE_STRING||(LA58_2>=15 && LA58_2<=16)||LA58_2==18||(LA58_2>=21 && LA58_2<=26)||(LA58_2>=29 && LA58_2<=31)||(LA58_2>=34 && LA58_2<=35)||(LA58_2>=38 && LA58_2<=39)||(LA58_2>=41 && LA58_2<=42)||(LA58_2>=55 && LA58_2<=58)||(LA58_2>=63 && LA58_2<=65)) ) {
                        alt58=1;
                    }
                    else if ( (LA58_2==43) ) {
                        alt58=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA58_1==43) ) {
                    alt58=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==EOF||LA58_2==RULE_ID||LA58_2==RULE_STRING||(LA58_2>=15 && LA58_2<=16)||LA58_2==18||(LA58_2>=21 && LA58_2<=26)||(LA58_2>=29 && LA58_2<=31)||(LA58_2>=34 && LA58_2<=35)||(LA58_2>=38 && LA58_2<=39)||(LA58_2>=41 && LA58_2<=42)||(LA58_2>=55 && LA58_2<=58)||(LA58_2>=63 && LA58_2<=65)) ) {
                    alt58=1;
                }
                else if ( (LA58_2==43) ) {
                    alt58=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt58=2;
                }
                break;
            case RULE_STRING:
                {
                int LA58_4 = input.LA(2);

                if ( (synpred77()) ) {
                    alt58=3;
                }
                else if ( (true) ) {
                    alt58=8;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt58=3;
                }
                break;
            case 66:
                {
                alt58=4;
                }
                break;
            case 59:
                {
                alt58=5;
                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    int LA58_11 = input.LA(3);

                    if ( (LA58_11==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 43:
                            {
                            int LA58_13 = input.LA(5);

                            if ( (LA58_13==RULE_INT) ) {
                                switch ( input.LA(6) ) {
                                case 44:
                                    {
                                    int LA58_25 = input.LA(7);

                                    if ( (LA58_25==42) ) {
                                        int LA58_31 = input.LA(8);

                                        if ( (LA58_31==RULE_INT) ) {
                                            int LA58_32 = input.LA(9);

                                            if ( (LA58_32==38) ) {
                                                alt58=6;
                                            }
                                            else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                                alt58=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA58_25==RULE_INT) ) {
                                        int LA58_32 = input.LA(8);

                                        if ( (LA58_32==38) ) {
                                            alt58=6;
                                        }
                                        else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                            alt58=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 25, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 45:
                                    {
                                    int LA58_26 = input.LA(7);

                                    if ( (LA58_26==42) ) {
                                        int LA58_31 = input.LA(8);

                                        if ( (LA58_31==RULE_INT) ) {
                                            int LA58_32 = input.LA(9);

                                            if ( (LA58_32==38) ) {
                                                alt58=6;
                                            }
                                            else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                                alt58=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA58_26==RULE_INT) ) {
                                        int LA58_32 = input.LA(8);

                                        if ( (LA58_32==38) ) {
                                            alt58=6;
                                        }
                                        else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                            alt58=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 26, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 38:
                                    {
                                    alt58=6;
                                    }
                                    break;
                                case 41:
                                case 42:
                                case 63:
                                case 64:
                                case 65:
                                    {
                                    alt58=7;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 21, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 13, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 38:
                            {
                            alt58=6;
                            }
                            break;
                        case 41:
                        case 42:
                        case 63:
                        case 64:
                        case 65:
                            {
                            alt58=7;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 12, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA58_11==43) ) {
                        int LA58_13 = input.LA(4);

                        if ( (LA58_13==RULE_INT) ) {
                            switch ( input.LA(5) ) {
                            case 44:
                                {
                                int LA58_25 = input.LA(6);

                                if ( (LA58_25==42) ) {
                                    int LA58_31 = input.LA(7);

                                    if ( (LA58_31==RULE_INT) ) {
                                        int LA58_32 = input.LA(8);

                                        if ( (LA58_32==38) ) {
                                            alt58=6;
                                        }
                                        else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                            alt58=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA58_25==RULE_INT) ) {
                                    int LA58_32 = input.LA(7);

                                    if ( (LA58_32==38) ) {
                                        alt58=6;
                                    }
                                    else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                        alt58=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 25, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 45:
                                {
                                int LA58_26 = input.LA(6);

                                if ( (LA58_26==42) ) {
                                    int LA58_31 = input.LA(7);

                                    if ( (LA58_31==RULE_INT) ) {
                                        int LA58_32 = input.LA(8);

                                        if ( (LA58_32==38) ) {
                                            alt58=6;
                                        }
                                        else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                            alt58=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA58_26==RULE_INT) ) {
                                    int LA58_32 = input.LA(7);

                                    if ( (LA58_32==38) ) {
                                        alt58=6;
                                    }
                                    else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                        alt58=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 26, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 38:
                                {
                                alt58=6;
                                }
                                break;
                            case 41:
                            case 42:
                            case 63:
                            case 64:
                            case 65:
                                {
                                alt58=7;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 21, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        int LA58_13 = input.LA(4);

                        if ( (LA58_13==RULE_INT) ) {
                            switch ( input.LA(5) ) {
                            case 44:
                                {
                                int LA58_25 = input.LA(6);

                                if ( (LA58_25==42) ) {
                                    int LA58_31 = input.LA(7);

                                    if ( (LA58_31==RULE_INT) ) {
                                        int LA58_32 = input.LA(8);

                                        if ( (LA58_32==38) ) {
                                            alt58=6;
                                        }
                                        else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                            alt58=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA58_25==RULE_INT) ) {
                                    int LA58_32 = input.LA(7);

                                    if ( (LA58_32==38) ) {
                                        alt58=6;
                                    }
                                    else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                        alt58=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 25, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 45:
                                {
                                int LA58_26 = input.LA(6);

                                if ( (LA58_26==42) ) {
                                    int LA58_31 = input.LA(7);

                                    if ( (LA58_31==RULE_INT) ) {
                                        int LA58_32 = input.LA(8);

                                        if ( (LA58_32==38) ) {
                                            alt58=6;
                                        }
                                        else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                            alt58=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA58_26==RULE_INT) ) {
                                    int LA58_32 = input.LA(7);

                                    if ( (LA58_32==38) ) {
                                        alt58=6;
                                    }
                                    else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                        alt58=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 26, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 38:
                                {
                                alt58=6;
                                }
                                break;
                            case 41:
                            case 42:
                            case 63:
                            case 64:
                            case 65:
                                {
                                alt58=7;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 21, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 38:
                        {
                        alt58=6;
                        }
                        break;
                    case 41:
                    case 42:
                    case 63:
                    case 64:
                    case 65:
                        {
                        alt58=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 12, input);

                        throw nvae;
                    }

                    }
                    break;
                case 43:
                    {
                    int LA58_13 = input.LA(3);

                    if ( (LA58_13==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 44:
                            {
                            int LA58_25 = input.LA(5);

                            if ( (LA58_25==42) ) {
                                int LA58_31 = input.LA(6);

                                if ( (LA58_31==RULE_INT) ) {
                                    int LA58_32 = input.LA(7);

                                    if ( (LA58_32==38) ) {
                                        alt58=6;
                                    }
                                    else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                        alt58=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA58_25==RULE_INT) ) {
                                int LA58_32 = input.LA(6);

                                if ( (LA58_32==38) ) {
                                    alt58=6;
                                }
                                else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                    alt58=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 25, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 45:
                            {
                            int LA58_26 = input.LA(5);

                            if ( (LA58_26==42) ) {
                                int LA58_31 = input.LA(6);

                                if ( (LA58_31==RULE_INT) ) {
                                    int LA58_32 = input.LA(7);

                                    if ( (LA58_32==38) ) {
                                        alt58=6;
                                    }
                                    else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                        alt58=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 31, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA58_26==RULE_INT) ) {
                                int LA58_32 = input.LA(6);

                                if ( (LA58_32==38) ) {
                                    alt58=6;
                                }
                                else if ( ((LA58_32>=41 && LA58_32<=42)||(LA58_32>=63 && LA58_32<=65)) ) {
                                    alt58=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 32, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 26, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 38:
                            {
                            alt58=6;
                            }
                            break;
                        case 41:
                        case 42:
                        case 63:
                        case 64:
                        case 65:
                            {
                            alt58=7;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 21, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 41:
                    case 42:
                    case 63:
                    case 64:
                    case 65:
                        {
                        alt58=7;
                        }
                        break;
                    case 40:
                        {
                        int LA58_22 = input.LA(4);

                        if ( (LA58_22==RULE_ID) ) {
                            int LA58_27 = input.LA(5);

                            if ( (LA58_27==41) ) {
                                int LA58_33 = input.LA(6);

                                if ( (LA58_33==38) ) {
                                    alt58=6;
                                }
                                else if ( ((LA58_33>=41 && LA58_33<=42)||(LA58_33>=63 && LA58_33<=65)) ) {
                                    alt58=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 33, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 27, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 38:
                        {
                        alt58=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 14, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    int LA58_15 = input.LA(3);

                    if ( ((LA58_15>=41 && LA58_15<=42)||(LA58_15>=63 && LA58_15<=65)) ) {
                        alt58=7;
                    }
                    else if ( (LA58_15==38) ) {
                        alt58=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 66:
                    {
                    int LA58_16 = input.LA(3);

                    if ( (LA58_16==40) ) {
                        int LA58_23 = input.LA(4);

                        if ( (LA58_23==RULE_STRING) ) {
                            int LA58_28 = input.LA(5);

                            if ( (LA58_28==41) ) {
                                int LA58_34 = input.LA(6);

                                if ( (LA58_34==38) ) {
                                    alt58=6;
                                }
                                else if ( ((LA58_34>=41 && LA58_34<=42)||(LA58_34>=63 && LA58_34<=65)) ) {
                                    alt58=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 34, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 28, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA58_23==RULE_ID) ) {
                            int LA58_29 = input.LA(5);

                            if ( (LA58_29==41) ) {
                                int LA58_34 = input.LA(6);

                                if ( (LA58_34==38) ) {
                                    alt58=6;
                                }
                                else if ( ((LA58_34>=41 && LA58_34<=42)||(LA58_34>=63 && LA58_34<=65)) ) {
                                    alt58=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 34, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 29, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 23, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA58_17 = input.LA(3);

                    if ( (LA58_17==40) ) {
                        int LA58_24 = input.LA(4);

                        if ( (LA58_24==66) ) {
                            int LA58_30 = input.LA(5);

                            if ( (LA58_30==40) ) {
                                int LA58_35 = input.LA(6);

                                if ( (LA58_35==RULE_STRING) ) {
                                    int LA58_36 = input.LA(7);

                                    if ( (LA58_36==41) ) {
                                        int LA58_38 = input.LA(8);

                                        if ( (LA58_38==41) ) {
                                            int LA58_39 = input.LA(9);

                                            if ( (LA58_39==38) ) {
                                                alt58=6;
                                            }
                                            else if ( ((LA58_39>=41 && LA58_39<=42)||(LA58_39>=63 && LA58_39<=65)) ) {
                                                alt58=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 38, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 36, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA58_35==RULE_ID) ) {
                                    int LA58_37 = input.LA(7);

                                    if ( (LA58_37==41) ) {
                                        int LA58_38 = input.LA(8);

                                        if ( (LA58_38==41) ) {
                                            int LA58_39 = input.LA(9);

                                            if ( (LA58_39==38) ) {
                                                alt58=6;
                                            }
                                            else if ( ((LA58_39>=41 && LA58_39<=42)||(LA58_39>=63 && LA58_39<=65)) ) {
                                                alt58=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 38, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 35, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA58_18 = input.LA(3);

                    if ( (synpred80()) ) {
                        alt58=6;
                    }
                    else if ( (synpred81()) ) {
                        alt58=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3357:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3358:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5257);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3371:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5287);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3384:2: this_VariableReference_2= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_ruleAtomicValuedExpression5317);
                    this_VariableReference_2=ruleVariableReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_VariableReference_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3397:2: this_ValueTestExpression_3= ruleValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTestExpression_in_ruleAtomicValuedExpression5347);
                    this_ValueTestExpression_3=ruleValueTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValueTestExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3410:2: this_PreValueTestExpression_4= rulePreValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreValueTestExpression_in_ruleAtomicValuedExpression5377);
                    this_PreValueTestExpression_4=rulePreValueTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PreValueTestExpression_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:6: ( '(' this_DivExpression_6= ruleDivExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:6: ( '(' this_DivExpression_6= ruleDivExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:8: '(' this_DivExpression_6= ruleDivExpression ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicValuedExpression5393); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression5418);
                    this_DivExpression_6=ruleDivExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivExpression_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicValuedExpression5427); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:6: ( '(' this_ValuedExpression_9= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:6: ( '(' this_ValuedExpression_9= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:8: '(' this_ValuedExpression_9= ruleValuedExpression ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicValuedExpression5445); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5470);
                    this_ValuedExpression_9=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicValuedExpression5479); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3465:2: this_TextExpression_11= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicValuedExpression5511);
                    this_TextExpression_11=ruleTextExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextExpression_11; 
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
    // $ANTLR end ruleAtomicValuedExpression


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3484:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3485:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3486:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression5546);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression5556); if (failed) return current;

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
    // $ANTLR end entryRuleDivExpression


    // $ANTLR start ruleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3493:1: ruleDivExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3498:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3499:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3499:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3500:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5606);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3511:1: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3512:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:2: ( (lv_operator_2_0= ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3531:1: (lv_operator_2_0= ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3531:1: (lv_operator_2_0= ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3532:3: lv_operator_2_0= ruleDivOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression5638);
            lv_operator_2_0=ruleDivOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDivExpressionRule().getType().getClassifier());
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3554:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3555:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3555:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3556:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5659);
            lv_subExpressions_3_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDivExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_3_0, 
              	        		"AtomicValuedExpression", 
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
    // $ANTLR end ruleDivExpression


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3586:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3587:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3588:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference5695);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference5705); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3595:1: ruleVariableReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3600:6: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3601:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3601:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3602:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3602:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3603:3: ruleEString
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
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableReference5756);
            ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
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


    // $ANTLR start entryRuleValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3628:1: entryRuleValueTestExpression returns [EObject current=null] : iv_ruleValueTestExpression= ruleValueTestExpression EOF ;
    public final EObject entryRuleValueTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3629:2: (iv_ruleValueTestExpression= ruleValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3630:2: iv_ruleValueTestExpression= ruleValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueTestExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression5791);
            iv_ruleValueTestExpression=ruleValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueTestExpression5801); if (failed) return current;

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
    // $ANTLR end entryRuleValueTestExpression


    // $ANTLR start ruleValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3637:1: ruleValueTestExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' ) ;
    public final EObject ruleValueTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3642:6: ( ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3643:1: ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3643:1: ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3643:2: ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3643:2: ( (lv_operator_0_0= ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3644:1: (lv_operator_0_0= ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3644:1: (lv_operator_0_0= ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3645:3: lv_operator_0_0= ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_ruleValueTestExpression5847);
            lv_operator_0_0=ruleValueTestOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"ValueTestOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,40,FollowSets000.FOLLOW_40_in_ruleValueTestExpression5857); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3671:1: ( (lv_subExpressions_2_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3672:1: (lv_subExpressions_2_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3672:1: (lv_subExpressions_2_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3673:3: lv_subExpressions_2_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_ruleValueTestExpression5878);
            lv_subExpressions_2_0=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"SignalReference", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,41,FollowSets000.FOLLOW_41_in_ruleValueTestExpression5888); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end ruleValueTestExpression


    // $ANTLR start entryRulePreValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3707:1: entryRulePreValueTestExpression returns [EObject current=null] : iv_rulePreValueTestExpression= rulePreValueTestExpression EOF ;
    public final EObject entryRulePreValueTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3708:2: (iv_rulePreValueTestExpression= rulePreValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:2: iv_rulePreValueTestExpression= rulePreValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreValueTestExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression5924);
            iv_rulePreValueTestExpression=rulePreValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreValueTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePreValueTestExpression5934); if (failed) return current;

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
    // $ANTLR end entryRulePreValueTestExpression


    // $ANTLR start rulePreValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3716:1: rulePreValueTestExpression returns [EObject current=null] : ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' ) ;
    public final EObject rulePreValueTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3721:6: ( ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3722:1: ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3722:1: ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3722:2: ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3722:2: ( (lv_operator_0_0= rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3723:1: (lv_operator_0_0= rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3723:1: (lv_operator_0_0= rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3724:3: lv_operator_0_0= rulePreOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rulePreValueTestExpression5980);
            lv_operator_0_0=rulePreOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"PreOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,40,FollowSets000.FOLLOW_40_in_rulePreValueTestExpression5990); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3750:1: ( (lv_subExpressions_2_0= ruleValueTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3751:1: (lv_subExpressions_2_0= ruleValueTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3751:1: (lv_subExpressions_2_0= ruleValueTestExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3752:3: lv_subExpressions_2_0= ruleValueTestExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestExpression_in_rulePreValueTestExpression6011);
            lv_subExpressions_2_0=ruleValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"ValueTestExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,41,FollowSets000.FOLLOW_41_in_rulePreValueTestExpression6021); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end rulePreValueTestExpression


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3786:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3787:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3788:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression6057);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression6067); if (failed) return current;

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
    // $ANTLR end entryRuleTextExpression


    // $ANTLR start ruleTextExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3795:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3800:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3801:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3801:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3801:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3801:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3802:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3802:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3803:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextExpression6109); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextExpressionRule().getType().getClassifier());
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3825:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==40) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3825:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleTextExpression6125); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3829:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3830:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3830:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3831:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextExpression6142); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextExpressionRule().getType().getClassifier());
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

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleTextExpression6157); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleTextExpression


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3865:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3866:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3867:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue6195);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue6205); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3874:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3879:6: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3880:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3880:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3881:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3881:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3882:3: lv_value_0_0= ruleEIntegerObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleIntValue6250);
            lv_value_0_0=ruleEIntegerObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"EIntegerObject", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3912:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3913:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3914:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue6285);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue6295); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3921:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3926:6: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3927:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3927:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3928:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3928:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3929:3: lv_value_0_0= ruleEFloatObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEFloatObject_in_ruleFloatValue6340);
            lv_value_0_0=ruleEFloatObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"EFloatObject", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3959:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3960:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3961:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6375);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue6385); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3968:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3973:6: ( ( (lv_value_0_0= ruleEBooleanObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3974:1: ( (lv_value_0_0= ruleEBooleanObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3974:1: ( (lv_value_0_0= ruleEBooleanObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3975:1: (lv_value_0_0= ruleEBooleanObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3975:1: (lv_value_0_0= ruleEBooleanObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3976:3: lv_value_0_0= ruleEBooleanObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBooleanObject_in_ruleBooleanValue6430);
            lv_value_0_0=ruleEBooleanObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"EBooleanObject", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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


    // $ANTLR start entryRuleEIntegerObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4006:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4007:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4008:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEIntegerObjectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject6466);
            iv_ruleEIntegerObject=ruleEIntegerObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEIntegerObject.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject6477); if (failed) return current;

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
    // $ANTLR end entryRuleEIntegerObject


    // $ANTLR start ruleEIntegerObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4015:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4020:6: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4021:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4021:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4021:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4021:2: (kw= '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4022:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleEIntegerObject6516); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEIntegerObject6533); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleEIntegerObject


    // $ANTLR start entryRuleEFloatObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4042:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4043:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4044:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEFloatObjectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject6579);
            iv_ruleEFloatObject=ruleEFloatObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEFloatObject.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloatObject6590); if (failed) return current;

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
    // $ANTLR end entryRuleEFloatObject


    // $ANTLR start ruleEFloatObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4051:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4056:6: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4057:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4057:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4057:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4057:2: (kw= '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4058:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleEFloatObject6629); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4063:3: (this_INT_1= RULE_INT )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4063:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloatObject6647); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,43,FollowSets000.FOLLOW_43_in_ruleEFloatObject6667); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2(), null); 
                  
            }
            this_INT_3=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloatObject6682); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4083:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=44 && LA65_0<=45)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4083:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4083:2: (kw= 'E' | kw= 'e' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==44) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==45) ) {
                        alt63=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4083:2: (kw= 'E' | kw= 'e' )", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4084:2: kw= 'E'
                            {
                            kw=(Token)input.LT(1);
                            match(input,44,FollowSets000.FOLLOW_44_in_ruleEFloatObject6702); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4091:2: kw= 'e'
                            {
                            kw=(Token)input.LT(1);
                            match(input,45,FollowSets000.FOLLOW_45_in_ruleEFloatObject6721); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4096:2: (kw= '-' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==42) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4097:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,42,FollowSets000.FOLLOW_42_in_ruleEFloatObject6736); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloatObject6753); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2(), null); 
                          
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
    // $ANTLR end ruleEFloatObject


    // $ANTLR start entryRuleEBooleanObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4117:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4118:2: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4119:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEBooleanObjectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject6801);
            iv_ruleEBooleanObject=ruleEBooleanObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEBooleanObject.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBooleanObject6812); if (failed) return current;

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
    // $ANTLR end entryRuleEBooleanObject


    // $ANTLR start ruleEBooleanObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4126:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4131:6: ( (kw= 'true' | kw= 'false' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4132:1: (kw= 'true' | kw= 'false' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4132:1: (kw= 'true' | kw= 'false' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==46) ) {
                alt66=1;
            }
            else if ( (LA66_0==47) ) {
                alt66=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4132:1: (kw= 'true' | kw= 'false' )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4133:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleEBooleanObject6850); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4140:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleEBooleanObject6869); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1(), null); 
                          
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
    // $ANTLR end ruleEBooleanObject


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4153:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4154:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4155:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6910);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6921); if (failed) return current;

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
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4162:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4167:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4168:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4168:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_ID) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4168:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4168:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6961); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4176:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6987); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                          
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
    // $ANTLR end ruleEString


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4191:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'CONDITIONAL' ) | ( 'REFERENCE' ) | ( 'TEXTUAL' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4195:6: ( ( ( 'NORMAL' ) | ( 'CONDITIONAL' ) | ( 'REFERENCE' ) | ( 'TEXTUAL' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4196:1: ( ( 'NORMAL' ) | ( 'CONDITIONAL' ) | ( 'REFERENCE' ) | ( 'TEXTUAL' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4196:1: ( ( 'NORMAL' ) | ( 'CONDITIONAL' ) | ( 'REFERENCE' ) | ( 'TEXTUAL' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt68=1;
                }
                break;
            case 49:
                {
                alt68=2;
                }
                break;
            case 50:
                {
                alt68=3;
                }
                break;
            case 51:
                {
                alt68=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4196:1: ( ( 'NORMAL' ) | ( 'CONDITIONAL' ) | ( 'REFERENCE' ) | ( 'TEXTUAL' ) )", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4196:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4196:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4196:4: 'NORMAL'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleStateType7044); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4202:6: ( 'CONDITIONAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4202:6: ( 'CONDITIONAL' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4202:8: 'CONDITIONAL'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleStateType7059); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4208:6: ( 'REFERENCE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4208:6: ( 'REFERENCE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4208:8: 'REFERENCE'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleStateType7074); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4214:6: ( 'TEXTUAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4214:6: ( 'TEXTUAL' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4214:8: 'TEXTUAL'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleStateType7089); if (failed) return current;
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


    // $ANTLR start ruleTransitionType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4224:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4228:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4229:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4229:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt69=1;
                }
                break;
            case 53:
                {
                alt69=2;
                }
                break;
            case 54:
                {
                alt69=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4229:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4229:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4229:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4229:4: '-->'
                    {
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleTransitionType7132); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4235:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4235:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4235:8: 'o->'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleTransitionType7147); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4241:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4241:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4241:8: '>->'
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleTransitionType7162); if (failed) return current;
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


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4251:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4255:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4256:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4256:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt70=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt70=1;
                }
                break;
            case 34:
                {
                alt70=2;
                }
                break;
            case 56:
                {
                alt70=3;
                }
                break;
            case 35:
                {
                alt70=4;
                }
                break;
            case 57:
                {
                alt70=5;
                }
                break;
            case 58:
                {
                alt70=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4256:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4256:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4256:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4256:4: '='
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleCompareOperator7205); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4262:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4262:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4262:8: '<'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleCompareOperator7220); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4268:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4268:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4268:8: '<='
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleCompareOperator7235); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4274:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4274:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4274:8: '>'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleCompareOperator7250); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4280:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4280:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4280:8: '>='
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleCompareOperator7265); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4286:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4286:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4286:8: '<>'
                    {
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleCompareOperator7280); if (failed) return current;
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


    // $ANTLR start rulePreOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4296:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4300:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4301:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4301:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4301:3: 'pre'
            {
            match(input,59,FollowSets000.FOLLOW_59_in_rulePreOperator7322); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end rulePreOperator


    // $ANTLR start ruleOrOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4311:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4315:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4316:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4316:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4316:3: 'or'
            {
            match(input,60,FollowSets000.FOLLOW_60_in_ruleOrOperator7363); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOrOperator


    // $ANTLR start ruleAndOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4326:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4330:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4331:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4331:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4331:3: 'and'
            {
            match(input,61,FollowSets000.FOLLOW_61_in_ruleAndOperator7404); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleAndOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4341:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4345:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4346:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4346:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4346:3: 'not'
            {
            match(input,62,FollowSets000.FOLLOW_62_in_ruleNotOperator7445); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleAddOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4356:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4360:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4361:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4361:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4361:3: '+'
            {
            match(input,63,FollowSets000.FOLLOW_63_in_ruleAddOperator7486); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleAddOperator


    // $ANTLR start ruleSubOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4371:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4375:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4376:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4376:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4376:3: '-'
            {
            match(input,42,FollowSets000.FOLLOW_42_in_ruleSubOperator7527); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleSubOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4386:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4390:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4391:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4391:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4391:3: '*'
            {
            match(input,64,FollowSets000.FOLLOW_64_in_ruleMultOperator7568); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleModOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4401:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4405:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4406:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4406:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4406:3: 'mod'
            {
            match(input,65,FollowSets000.FOLLOW_65_in_ruleModOperator7609); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleModOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4416:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4420:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4421:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4421:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4421:3: '/'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_ruleDivOperator7650); if (failed) return current;
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


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4431:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4435:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4436:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4436:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4436:3: '?'
            {
            match(input,66,FollowSets000.FOLLOW_66_in_ruleValueTestOperator7691); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleValueTestOperator


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4446:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4450:6: ( ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4451:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4451:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            int alt71=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt71=1;
                }
                break;
            case 68:
                {
                alt71=2;
                }
                break;
            case 69:
                {
                alt71=3;
                }
                break;
            case 70:
                {
                alt71=4;
                }
                break;
            case 71:
                {
                alt71=5;
                }
                break;
            case 72:
                {
                alt71=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4451:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4451:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4451:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4451:4: 'PURE'
                    {
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleValueType7733); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4457:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4457:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4457:8: 'BOOL'
                    {
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleValueType7748); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4463:6: ( 'UNSIGNED' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4463:6: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4463:8: 'UNSIGNED'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleValueType7763); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4469:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4469:6: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4469:8: 'INT'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleValueType7778); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4475:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4475:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4475:8: 'FLOAT'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleValueType7793); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4481:6: ( 'HOST' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4481:6: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4481:8: 'HOST'
                    {
                    match(input,72,FollowSets000.FOLLOW_72_in_ruleValueType7808); if (failed) return current;
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


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4491:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4495:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4496:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4496:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt72=8;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt72=1;
                }
                break;
            case 63:
                {
                alt72=2;
                }
                break;
            case 64:
                {
                alt72=3;
                }
                break;
            case 74:
                {
                alt72=4;
                }
                break;
            case 75:
                {
                alt72=5;
                }
                break;
            case 60:
                {
                alt72=6;
                }
                break;
            case 61:
                {
                alt72=7;
                }
                break;
            case 76:
                {
                alt72=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4496:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4496:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4496:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4496:4: 'NONE'
                    {
                    match(input,73,FollowSets000.FOLLOW_73_in_ruleCombineOperator7851); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4502:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4502:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4502:8: '+'
                    {
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleCombineOperator7866); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4508:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4508:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4508:8: '*'
                    {
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleCombineOperator7881); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4514:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4514:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4514:8: 'max'
                    {
                    match(input,74,FollowSets000.FOLLOW_74_in_ruleCombineOperator7896); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4520:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4520:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4520:8: 'min'
                    {
                    match(input,75,FollowSets000.FOLLOW_75_in_ruleCombineOperator7911); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4526:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4526:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4526:8: 'or'
                    {
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleCombineOperator7926); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4532:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4532:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4532:8: 'and'
                    {
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleCombineOperator7941); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4538:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4538:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4538:8: 'host'
                    {
                    match(input,76,FollowSets000.FOLLOW_76_in_ruleCombineOperator7956); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7(), null); 
                          
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

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:3: ( ( '(' ( ( ruleValuedExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:3: ( '(' ( ( ruleValuedExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:3: ( '(' ( ( ruleValuedExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:5: '(' ( ( ruleValuedExpression ) ) ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred602881); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1981:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1982:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1982:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1983:3: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred602902);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,41,FollowSets000.FOLLOW_41_in_synpred602912); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:6: ( ( '(' ( ( ruleBooleanExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2010:8: '(' ( ( ruleBooleanExpression ) ) ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred612930); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2014:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2015:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2015:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2016:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred612951);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,41,FollowSets000.FOLLOW_41_in_synpred612961); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2086:2: ( ( ( ruleValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2086:2: ( ( ruleValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2086:2: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2087:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2087:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2088:3: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred623089);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred70
    public final void synpred70_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:6: ( ( '(' ruleCompareOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:6: ( '(' ruleCompareOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:6: ( '(' ruleCompareOperation ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2706:8: '(' ruleCompareOperation ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred704126); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred704151);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;
        match(input,41,FollowSets000.FOLLOW_41_in_synpred704160); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred70

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3384:2: ( ruleVariableReference )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3384:2: ruleVariableReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_synpred775317);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:6: ( ( '(' ruleDivExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:6: ( '(' ruleDivExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:6: ( '(' ruleDivExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:8: '(' ruleDivExpression ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred805393); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_synpred805418);
        ruleDivExpression();
        _fsp--;
        if (failed) return ;
        match(input,41,FollowSets000.FOLLOW_41_in_synpred805427); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3443:8: '(' ruleValuedExpression ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred815445); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred815470);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,41,FollowSets000.FOLLOW_41_in_synpred815479); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred81

    public final boolean synpred81() {
        backtracking++;
        int start = input.mark();
        try {
            synpred81_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
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
    public final boolean synpred70() {
        backtracking++;
        int start = input.mark();
        try {
            synpred70_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred80() {
        backtracking++;
        int start = input.mark();
        try {
            synpred80_fragment(); // can never throw exception
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
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegion91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRegion127 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRegion144 = new BitSet(new long[]{0x000F000000007050L});
        public static final BitSet FOLLOW_ruleState_in_ruleRegion172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedRegion_in_entryRuleNestedRegion208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedRegion218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleNestedRegion254 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNestedRegion271 = new BitSet(new long[]{0x000F0000E4007052L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleNestedRegion298 = new BitSet(new long[]{0x000F0000E4007052L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleNestedRegion325 = new BitSet(new long[]{0x000F0000E4007052L});
        public static final BitSet FOLLOW_ruleState_in_ruleNestedRegion350 = new BitSet(new long[]{0x000F000000007052L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleState443 = new BitSet(new long[]{0x0000000000006050L});
        public static final BitSet FOLLOW_13_in_ruleState474 = new BitSet(new long[]{0x0000000000004050L});
        public static final BitSet FOLLOW_14_in_ruleState500 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState519 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState546 = new BitSet(new long[]{0x0070000000030000L});
        public static final BitSet FOLLOW_13_in_ruleState573 = new BitSet(new long[]{0x0000000000005050L});
        public static final BitSet FOLLOW_12_in_ruleState604 = new BitSet(new long[]{0x0000000000004050L});
        public static final BitSet FOLLOW_14_in_ruleState630 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState649 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState676 = new BitSet(new long[]{0x0070000000030000L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleState705 = new BitSet(new long[]{0x0000000000004050L});
        public static final BitSet FOLLOW_14_in_ruleState717 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState736 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState763 = new BitSet(new long[]{0x0070000000030000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState789 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleState800 = new BitSet(new long[]{0x0070000000000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState821 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleState835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleState853 = new BitSet(new long[]{0x00000000E5E40000L});
        public static final BitSet FOLLOW_18_in_ruleState865 = new BitSet(new long[]{0x000F000000187850L});
        public static final BitSet FOLLOW_ruleNestedRegion_in_ruleState886 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleState897 = new BitSet(new long[]{0x000F000000187850L});
        public static final BitSet FOLLOW_ruleNestedRegion_in_ruleState918 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleState930 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleState960 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleState987 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_21_in_ruleState1004 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1025 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_22_in_ruleState1043 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1064 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_23_in_ruleState1082 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1103 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_24_in_ruleState1121 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1142 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleState1166 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleState1193 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_21_in_ruleState1210 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1231 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_22_in_ruleState1249 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1270 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_23_in_ruleState1288 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1309 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_24_in_ruleState1327 = new BitSet(new long[]{0x4800C150E7E40070L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1348 = new BitSet(new long[]{0x00000000E7E40000L});
        public static final BitSet FOLLOW_18_in_ruleState1362 = new BitSet(new long[]{0x000F000000187850L});
        public static final BitSet FOLLOW_ruleNestedRegion_in_ruleState1383 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleState1394 = new BitSet(new long[]{0x000F000000187850L});
        public static final BitSet FOLLOW_ruleNestedRegion_in_ruleState1415 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleState1427 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleState1441 = new BitSet(new long[]{0x0070000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState1463 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleState1474 = new BitSet(new long[]{0x0070000000000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState1495 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleState1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleVariable1592 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1609 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleVariable1626 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable1647 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleVariable1659 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleVariable1680 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVariable1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSignal1780 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleSignal1812 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSignal1836 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignal1857 = new BitSet(new long[]{0x0000000018010000L});
        public static final BitSet FOLLOW_27_in_ruleSignal1868 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignal1889 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_28_in_ruleSignal1903 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1924 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_28_in_ruleSignal1942 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSignal1952 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1973 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSignal1983 = new BitSet(new long[]{0xB000000000000050L,0x0000000000001E01L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2005 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignal2032 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSignal2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition2138 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition2165 = new BitSet(new long[]{0x0000008600000002L});
        public static final BitSet FOLLOW_34_in_ruleTransition2176 = new BitSet(new long[]{0x0000040000000020L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleTransition2197 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleTransition2207 = new BitSet(new long[]{0x0000008200000002L});
        public static final BitSet FOLLOW_33_in_ruleTransition2220 = new BitSet(new long[]{0x4800C1F000000052L});
        public static final BitSet FOLLOW_36_in_ruleTransition2238 = new BitSet(new long[]{0x4800C1E000000052L});
        public static final BitSet FOLLOW_37_in_ruleTransition2263 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition2280 = new BitSet(new long[]{0x4800C1C000000052L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTransition2308 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_38_in_ruleTransition2320 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2341 = new BitSet(new long[]{0x0000008000008002L});
        public static final BitSet FOLLOW_15_in_ruleTransition2352 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2373 = new BitSet(new long[]{0x0000008000008002L});
        public static final BitSet FOLLOW_39_in_ruleTransition2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAction2512 = new BitSet(new long[]{0x4800C14000000072L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAction2543 = new BitSet(new long[]{0x4800C14000000052L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction2570 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleAction2582 = new BitSet(new long[]{0x0000000000000052L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleAction2604 = new BitSet(new long[]{0x0000000000008052L});
        public static final BitSet FOLLOW_15_in_ruleAction2615 = new BitSet(new long[]{0x0000000000000052L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect2667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission2812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission2869 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleEmission2881 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleEmission2902 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleEmission2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEmission2930 = new BitSet(new long[]{0x4800C10000000050L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission2951 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleEmission2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3057 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAssignment3067 = new BitSet(new long[]{0x4800CD0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAssignment3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextEffect3205 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleTextEffect3221 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect3238 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTextEffect3253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression3301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression3477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression3487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3537 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression3570 = new BitSet(new long[]{0x4800C10000000050L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3591 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression3629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression3639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleAndExpression3689 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression3722 = new BitSet(new long[]{0x4800C10000000050L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleAndExpression3743 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression3781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression3791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression3880 = new BitSet(new long[]{0x0800C10000000050L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_ruleAtomicExpression4028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleAtomicExpression4067 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAtomicExpression4077 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleSignalReference_in_ruleAtomicExpression4098 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicExpression4108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicExpression4126 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAtomicExpression4151 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicExpression4160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicExpression4178 = new BitSet(new long[]{0x4800C10000000050L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression4203 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicExpression4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference4249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSignalReference4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation4405 = new BitSet(new long[]{0x0780000C00000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4438 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression4589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression4599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4649 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression4682 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4703 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression4741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4801 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression4834 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4855 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression4893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression4903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression4953 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression4986 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression5007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression5045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression5055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression5138 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression5207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_ruleAtomicValuedExpression5317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestExpression_in_ruleAtomicValuedExpression5347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreValueTestExpression_in_ruleAtomicValuedExpression5377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicValuedExpression5393 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression5418 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicValuedExpression5427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicValuedExpression5445 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5470 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicValuedExpression5479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicValuedExpression5511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression5546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5606 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression5638 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference5695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference5705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableReference5756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression5791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueTestExpression5801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValueTestExpression5847 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleValueTestExpression5857 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleSignalReference_in_ruleValueTestExpression5878 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleValueTestExpression5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression5924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePreValueTestExpression5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rulePreValueTestExpression5980 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_rulePreValueTestExpression5990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValueTestExpression_in_rulePreValueTestExpression6011 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_rulePreValueTestExpression6021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextExpression6109 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleTextExpression6125 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression6142 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTextExpression6157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue6195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue6205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntValue6250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue6285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue6295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue6340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue6385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBooleanObject_in_ruleBooleanValue6430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject6466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject6477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEIntegerObject6516 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject6579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject6590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEFloatObject6629 = new BitSet(new long[]{0x0000080000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject6647 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleEFloatObject6667 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject6682 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_44_in_ruleEFloatObject6702 = new BitSet(new long[]{0x0000040000000020L});
        public static final BitSet FOLLOW_45_in_ruleEFloatObject6721 = new BitSet(new long[]{0x0000040000000020L});
        public static final BitSet FOLLOW_42_in_ruleEFloatObject6736 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject6753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject6801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBooleanObject6812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEBooleanObject6850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEBooleanObject6869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleStateType7044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStateType7059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleStateType7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleStateType7089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTransitionType7132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTransitionType7147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTransitionType7162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleCompareOperator7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleCompareOperator7220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleCompareOperator7235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleCompareOperator7250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleCompareOperator7265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleCompareOperator7280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePreOperator7322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleOrOperator7363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleAndOperator7404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleNotOperator7445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleAddOperator7486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSubOperator7527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMultOperator7568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleModOperator7609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDivOperator7650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleValueTestOperator7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleValueType7733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleValueType7748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleValueType7763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleValueType7778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleValueType7793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleValueType7808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleCombineOperator7851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCombineOperator7866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCombineOperator7881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleCombineOperator7896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleCombineOperator7911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCombineOperator7926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCombineOperator7941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleCombineOperator7956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred602881 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred602902 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred602912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred612930 = new BitSet(new long[]{0x4800C10000000050L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred612951 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred612961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred623089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred704126 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred704151 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred704160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_synpred775317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred805393 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleDivExpression_in_synpred805418 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred805427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred815445 = new BitSet(new long[]{0x08000D0000000070L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred815470 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred815479 = new BitSet(new long[]{0x0000000000000002L});
    }


}