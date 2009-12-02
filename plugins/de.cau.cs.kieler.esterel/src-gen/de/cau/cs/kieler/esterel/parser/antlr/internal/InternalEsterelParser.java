package de.cau.cs.kieler.esterel.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.esterel.services.EsterelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEsterelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ESTERELID", "RULE_BASETYPE", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ESTEREL_SL_COMMENT", "RULE_ESTEREL_ML_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "':'", "'end'", "'.'", "'input'", "','", "';'", "'output'", "'inputoutput'", "'return'", "'sensor'", "'relation'", "'=>'", "'#'", "'type'", "'constant'", "'='", "'-'", "'function'", "'('", "')'", "'procedure'", "'||'", "'['", "']'", "':='", "'abort'", "'when'", "'do'", "'case'", "'await'", "'upto'", "'watching'", "'timeout'", "'emit'", "'every'", "'exit'", "'halt'", "'if'", "'elsif'", "'then'", "'else'", "'loop'", "'each'", "'nothing'", "'pause'", "'present'", "'positive'", "'repeat'", "'times'", "'run'", "'copymodule'", "'/'", "'signal'", "'in'", "'suspend'", "'sustain'", "'trap'", "'handle'", "'var'", "'weak'", "'and'", "'or'", "'not'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'+'", "'*'", "'mod'", "'?'", "'pre'", "'??'", "'tick'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=12;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_INT=6;
    public static final int RULE_ESTERELID=4;
    public static final int RULE_WS=15;
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_BASETYPE=5;
    public static final int RULE_ESTEREL_ML_COMMENT=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_ESTEREL_SL_COMMENT=10;

        public InternalEsterelParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g"; }


     
     	private EsterelGrammarAccess grammarAccess;
     	
        public InternalEsterelParser(TokenStream input, IAstFactory factory, EsterelGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	} 



    // $ANTLR start entryRuleProgram
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:72:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:72:49: (iv_ruleProgram= ruleProgram EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:73:2: iv_ruleProgram= ruleProgram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram73);
            iv_ruleProgram=ruleProgram();
            _fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:80:1: ruleProgram returns [EObject current=null] : ( (lv_module_0= ruleModule ) (lv_module_1= ruleModule )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0 = null;

        EObject lv_module_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ESTEREL_SL_COMMENT", "RULE_ESTEREL_ML_COMMENT", "RULE_WS");
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:87:6: ( ( (lv_module_0= ruleModule ) (lv_module_1= ruleModule )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:88:1: ( (lv_module_0= ruleModule ) (lv_module_1= ruleModule )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:88:1: ( (lv_module_0= ruleModule ) (lv_module_1= ruleModule )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:88:2: (lv_module_0= ruleModule ) (lv_module_1= ruleModule )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:88:2: (lv_module_0= ruleModule )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:91:6: lv_module_0= ruleModule
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getModuleModuleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModule_in_ruleProgram142);
            lv_module_0=ruleModule();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "module", lv_module_0, "Module", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:109:2: (lv_module_1= ruleModule )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:112:6: lv_module_1= ruleModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getModuleModuleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleProgram180);
            	    lv_module_1=ruleModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "module", lv_module_1, "Module", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
            		myHiddenTokenState.restore();
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:137:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:137:48: (iv_ruleModule= ruleModule EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:138:2: iv_ruleModule= ruleModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule218);
            iv_ruleModule=ruleModule();
            _fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:145:1: ruleModule returns [EObject current=null] : ( 'module' (lv_name_1= RULE_ESTERELID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_modInt_3 = null;

        EObject lv_modBody_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:150:6: ( ( 'module' (lv_name_1= RULE_ESTERELID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:151:1: ( 'module' (lv_name_1= RULE_ESTERELID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:151:1: ( 'module' (lv_name_1= RULE_ESTERELID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:151:2: 'module' (lv_name_1= RULE_ESTERELID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule
            {
            match(input,17,FOLLOW_17_in_ruleModule262); 

                    createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:155:1: (lv_name_1= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:157:6: lv_name_1= RULE_ESTERELID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleModule284); 

            		createLeafNode(grammarAccess.getModuleAccess().getNameEsterelIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleModule301); 

                    createLeafNode(grammarAccess.getModuleAccess().getColonKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:179:1: (lv_modInt_3= ruleModuleInterface )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=28)||(LA2_0>=31 && LA2_0<=32)||LA2_0==35||LA2_0==38) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:182:6: lv_modInt_3= ruleModuleInterface
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModIntModuleInterfaceParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleInterface_in_ruleModule335);
                    lv_modInt_3=ruleModuleInterface();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "modInt", lv_modInt_3, "ModuleInterface", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:200:3: (lv_modBody_4= ruleModuleBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:203:6: lv_modBody_4= ruleModuleBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModBodyModuleBodyParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModuleBody_in_ruleModule374);
            lv_modBody_4=ruleModuleBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "modBody", lv_modBody_4, "ModuleBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            pushFollow(FOLLOW_ruleEndModule_in_ruleModule387);
            ruleEndModule();
            _fsp--;


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleEndModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:228:1: entryRuleEndModule returns [String current=null] : iv_ruleEndModule= ruleEndModule EOF ;
    public final String entryRuleEndModule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndModule = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:228:50: (iv_ruleEndModule= ruleEndModule EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:229:2: iv_ruleEndModule= ruleEndModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEndModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleEndModule_in_entryRuleEndModule413);
            iv_ruleEndModule=ruleEndModule();
            _fsp--;

             current =iv_ruleEndModule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndModule424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEndModule


    // $ANTLR start ruleEndModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:236:1: ruleEndModule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'end' kw= 'module' ) | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleEndModule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:242:6: ( ( (kw= 'end' kw= 'module' ) | kw= '.' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:243:1: ( (kw= 'end' kw= 'module' ) | kw= '.' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:243:1: ( (kw= 'end' kw= 'module' ) | kw= '.' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("243:1: ( (kw= 'end' kw= 'module' ) | kw= '.' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:243:2: (kw= 'end' kw= 'module' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:243:2: (kw= 'end' kw= 'module' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:244:2: kw= 'end' kw= 'module'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleEndModule463); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndModuleAccess().getEndKeyword_0_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleEndModule476); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndModuleAccess().getModuleKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:257:2: kw= '.'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleEndModule496); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndModuleAccess().getFullStopKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEndModule


    // $ANTLR start entryRuleModuleBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:270:1: entryRuleModuleBody returns [EObject current=null] : iv_ruleModuleBody= ruleModuleBody EOF ;
    public final EObject entryRuleModuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:270:52: (iv_ruleModuleBody= ruleModuleBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:271:2: iv_ruleModuleBody= ruleModuleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleBody_in_entryRuleModuleBody534);
            iv_ruleModuleBody=ruleModuleBody();
            _fsp--;

             current =iv_ruleModuleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleBody544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleBody


    // $ANTLR start ruleModuleBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:278:1: ruleModuleBody returns [EObject current=null] : (lv_statement_0= ruleStatement ) ;
    public final EObject ruleModuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:283:6: ( (lv_statement_0= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:284:1: (lv_statement_0= ruleStatement )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:284:1: (lv_statement_0= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:287:6: lv_statement_0= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleBodyAccess().getStatementStatementParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleModuleBody602);
            lv_statement_0=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "statement", lv_statement_0, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleBody


    // $ANTLR start entryRuleModuleInterface
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:312:1: entryRuleModuleInterface returns [EObject current=null] : iv_ruleModuleInterface= ruleModuleInterface EOF ;
    public final EObject entryRuleModuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleInterface = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:312:57: (iv_ruleModuleInterface= ruleModuleInterface EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:313:2: iv_ruleModuleInterface= ruleModuleInterface EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleInterfaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleInterface_in_entryRuleModuleInterface638);
            iv_ruleModuleInterface=ruleModuleInterface();
            _fsp--;

             current =iv_ruleModuleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleInterface648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleInterface


    // $ANTLR start ruleModuleInterface
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:320:1: ruleModuleInterface returns [EObject current=null] : ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) | (lv_intProcedureDecl_6= ruleProcedureDecl ) )+ ;
    public final EObject ruleModuleInterface() throws RecognitionException {
        EObject current = null;

        EObject lv_intSignalDecl_0 = null;

        EObject lv_intTypeDecl_1 = null;

        EObject lv_intSensorDecl_2 = null;

        EObject lv_intConstantDecl_3 = null;

        EObject lv_intRelationDecl_4 = null;

        EObject lv_intFunctionDecl_5 = null;

        EObject lv_intProcedureDecl_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:325:6: ( ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) | (lv_intProcedureDecl_6= ruleProcedureDecl ) )+ )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:326:1: ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) | (lv_intProcedureDecl_6= ruleProcedureDecl ) )+
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:326:1: ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) | (lv_intProcedureDecl_6= ruleProcedureDecl ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=8;
                switch ( input.LA(1) ) {
                case 21:
                case 24:
                case 25:
                case 26:
                    {
                    alt4=1;
                    }
                    break;
                case 31:
                    {
                    alt4=2;
                    }
                    break;
                case 27:
                    {
                    alt4=3;
                    }
                    break;
                case 32:
                    {
                    alt4=4;
                    }
                    break;
                case 28:
                    {
                    alt4=5;
                    }
                    break;
                case 35:
                    {
                    alt4=6;
                    }
                    break;
                case 38:
                    {
                    alt4=7;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:326:2: (lv_intSignalDecl_0= ruleSignalDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:326:2: (lv_intSignalDecl_0= ruleSignalDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:329:6: lv_intSignalDecl_0= ruleSignalDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntSignalDeclSignalDeclParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignalDecl_in_ruleModuleInterface707);
            	    lv_intSignalDecl_0=ruleSignalDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intSignalDecl", lv_intSignalDecl_0, "SignalDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:348:6: (lv_intTypeDecl_1= ruleTypeDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:348:6: (lv_intTypeDecl_1= ruleTypeDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:351:6: lv_intTypeDecl_1= ruleTypeDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntTypeDeclTypeDeclParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDecl_in_ruleModuleInterface751);
            	    lv_intTypeDecl_1=ruleTypeDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intTypeDecl", lv_intTypeDecl_1, "TypeDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:370:6: (lv_intSensorDecl_2= ruleSensorDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:370:6: (lv_intSensorDecl_2= ruleSensorDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:373:6: lv_intSensorDecl_2= ruleSensorDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntSensorDeclSensorDeclParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSensorDecl_in_ruleModuleInterface795);
            	    lv_intSensorDecl_2=ruleSensorDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intSensorDecl", lv_intSensorDecl_2, "SensorDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:392:6: (lv_intConstantDecl_3= ruleConstantDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:392:6: (lv_intConstantDecl_3= ruleConstantDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:395:6: lv_intConstantDecl_3= ruleConstantDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntConstantDeclConstantDeclParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstantDecl_in_ruleModuleInterface839);
            	    lv_intConstantDecl_3=ruleConstantDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intConstantDecl", lv_intConstantDecl_3, "ConstantDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:414:6: (lv_intRelationDecl_4= ruleRelationDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:414:6: (lv_intRelationDecl_4= ruleRelationDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:417:6: lv_intRelationDecl_4= ruleRelationDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntRelationDeclRelationDeclParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationDecl_in_ruleModuleInterface883);
            	    lv_intRelationDecl_4=ruleRelationDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intRelationDecl", lv_intRelationDecl_4, "RelationDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:436:6: (lv_intFunctionDecl_5= ruleFunctionDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:436:6: (lv_intFunctionDecl_5= ruleFunctionDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:439:6: lv_intFunctionDecl_5= ruleFunctionDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntFunctionDeclFunctionDeclParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDecl_in_ruleModuleInterface927);
            	    lv_intFunctionDecl_5=ruleFunctionDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intFunctionDecl", lv_intFunctionDecl_5, "FunctionDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:458:6: (lv_intProcedureDecl_6= ruleProcedureDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:458:6: (lv_intProcedureDecl_6= ruleProcedureDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:461:6: lv_intProcedureDecl_6= ruleProcedureDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntProcedureDeclProcedureDeclParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcedureDecl_in_ruleModuleInterface971);
            	    lv_intProcedureDecl_6=ruleProcedureDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intProcedureDecl", lv_intProcedureDecl_6, "ProcedureDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleInterface


    // $ANTLR start entryRuleSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:486:1: entryRuleSignalDecl returns [EObject current=null] : iv_ruleSignalDecl= ruleSignalDecl EOF ;
    public final EObject entryRuleSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:486:52: (iv_ruleSignalDecl= ruleSignalDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:487:2: iv_ruleSignalDecl= ruleSignalDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalDecl_in_entryRuleSignalDecl1009);
            iv_ruleSignalDecl=ruleSignalDecl();
            _fsp--;

             current =iv_ruleSignalDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDecl1019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignalDecl


    // $ANTLR start ruleSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:494:1: ruleSignalDecl returns [EObject current=null] : ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) ) ;
    public final EObject ruleSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signal_2 = null;

        EObject lv_signal_4 = null;

        EObject lv_signal_8 = null;

        EObject lv_signal_10 = null;

        EObject lv_signal_14 = null;

        EObject lv_signal_16 = null;

        EObject lv_signal_20 = null;

        EObject lv_signal_22 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:499:6: ( ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:500:1: ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:500:1: ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("500:1: ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:500:2: ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:500:2: ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:500:3: () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:500:3: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:501:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getInputAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getInputAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,21,FOLLOW_21_in_ruleSignalDecl1063); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getInputKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:515:1: (lv_signal_2= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:518:6: lv_signal_2= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1097);
                    lv_signal_2=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_2, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:536:2: ( ',' (lv_signal_4= ruleSignal ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:536:3: ',' (lv_signal_4= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1111); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_0_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:540:1: (lv_signal_4= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:543:6: lv_signal_4= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_0_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1145);
                    	    lv_signal_4=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_4, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1160); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:566:6: ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:566:6: ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:566:7: () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:566:7: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:567:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getOutputAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getOutputAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,24,FOLLOW_24_in_ruleSignalDecl1186); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getOutputKeyword_1_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:581:1: (lv_signal_8= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:584:6: lv_signal_8= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1220);
                    lv_signal_8=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_8, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:602:2: ( ',' (lv_signal_10= ruleSignal ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:602:3: ',' (lv_signal_10= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1234); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_1_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:606:1: (lv_signal_10= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:609:6: lv_signal_10= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_1_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1268);
                    	    lv_signal_10=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_10, "Signal", currentNode);
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

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1283); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_1_4(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:632:6: ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:632:6: ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:632:7: () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:632:7: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:633:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getInputOutputAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getInputOutputAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,25,FOLLOW_25_in_ruleSignalDecl1309); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getInputoutputKeyword_2_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:647:1: (lv_signal_14= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:650:6: lv_signal_14= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1343);
                    lv_signal_14=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_14, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:668:2: ( ',' (lv_signal_16= ruleSignal ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:668:3: ',' (lv_signal_16= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1357); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_2_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:672:1: (lv_signal_16= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:675:6: lv_signal_16= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_2_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1391);
                    	    lv_signal_16=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_16, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1406); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_2_4(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:698:6: ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:698:6: ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:698:7: () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:698:7: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:699:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getReturnAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getReturnAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,26,FOLLOW_26_in_ruleSignalDecl1432); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getReturnKeyword_3_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:713:1: (lv_signal_20= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:716:6: lv_signal_20= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1466);
                    lv_signal_20=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_20, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:734:2: ( ',' (lv_signal_22= ruleSignal ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:734:3: ',' (lv_signal_22= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1480); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_3_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:738:1: (lv_signal_22= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:741:6: lv_signal_22= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_3_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1514);
                    	    lv_signal_22=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_22, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1529); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_3_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSignalDecl


    // $ANTLR start entryRuleSensorDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:770:1: entryRuleSensorDecl returns [EObject current=null] : iv_ruleSensorDecl= ruleSensorDecl EOF ;
    public final EObject entryRuleSensorDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:770:52: (iv_ruleSensorDecl= ruleSensorDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:771:2: iv_ruleSensorDecl= ruleSensorDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSensorDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleSensorDecl_in_entryRuleSensorDecl1563);
            iv_ruleSensorDecl=ruleSensorDecl();
            _fsp--;

             current =iv_ruleSensorDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDecl1573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSensorDecl


    // $ANTLR start ruleSensorDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:778:1: ruleSensorDecl returns [EObject current=null] : ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' ) ;
    public final EObject ruleSensorDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_sensor_1 = null;

        EObject lv_sensor_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:783:6: ( ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:784:1: ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:784:1: ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:784:2: 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';'
            {
            match(input,27,FOLLOW_27_in_ruleSensorDecl1607); 

                    createLeafNode(grammarAccess.getSensorDeclAccess().getSensorKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:788:1: (lv_sensor_1= ruleSensor )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:791:6: lv_sensor_1= ruleSensor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSensorDeclAccess().getSensorSensorParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSensor_in_ruleSensorDecl1641);
            lv_sensor_1=ruleSensor();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSensorDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "sensor", lv_sensor_1, "Sensor", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:809:2: ( ',' (lv_sensor_3= ruleSensor ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:809:3: ',' (lv_sensor_3= ruleSensor )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleSensorDecl1655); 

            	            createLeafNode(grammarAccess.getSensorDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:813:1: (lv_sensor_3= ruleSensor )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:816:6: lv_sensor_3= ruleSensor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSensorDeclAccess().getSensorSensorParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSensor_in_ruleSensorDecl1689);
            	    lv_sensor_3=ruleSensor();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSensorDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "sensor", lv_sensor_3, "Sensor", currentNode);
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

            match(input,23,FOLLOW_23_in_ruleSensorDecl1704); 

                    createLeafNode(grammarAccess.getSensorDeclAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSensorDecl


    // $ANTLR start entryRuleRelationDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:845:1: entryRuleRelationDecl returns [EObject current=null] : iv_ruleRelationDecl= ruleRelationDecl EOF ;
    public final EObject entryRuleRelationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:845:54: (iv_ruleRelationDecl= ruleRelationDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:846:2: iv_ruleRelationDecl= ruleRelationDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationDecl_in_entryRuleRelationDecl1737);
            iv_ruleRelationDecl=ruleRelationDecl();
            _fsp--;

             current =iv_ruleRelationDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationDecl1747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationDecl


    // $ANTLR start ruleRelationDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:853:1: ruleRelationDecl returns [EObject current=null] : ( () 'relation' (lv_relation_2= ruleRelationType ) ( ',' (lv_relation_4= ruleRelationType ) )* ';' ) ;
    public final EObject ruleRelationDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_relation_2 = null;

        EObject lv_relation_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:858:6: ( ( () 'relation' (lv_relation_2= ruleRelationType ) ( ',' (lv_relation_4= ruleRelationType ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:859:1: ( () 'relation' (lv_relation_2= ruleRelationType ) ( ',' (lv_relation_4= ruleRelationType ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:859:1: ( () 'relation' (lv_relation_2= ruleRelationType ) ( ',' (lv_relation_4= ruleRelationType ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:859:2: () 'relation' (lv_relation_2= ruleRelationType ) ( ',' (lv_relation_4= ruleRelationType ) )* ';'
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:859:2: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:860:5: 
            {
             
                    temp=factory.create(grammarAccess.getRelationDeclAccess().getRelationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationDeclAccess().getRelationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,28,FOLLOW_28_in_ruleRelationDecl1790); 

                    createLeafNode(grammarAccess.getRelationDeclAccess().getRelationKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:874:1: (lv_relation_2= ruleRelationType )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:877:6: lv_relation_2= ruleRelationType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRelationDeclAccess().getRelationRelationTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRelationType_in_ruleRelationDecl1824);
            lv_relation_2=ruleRelationType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "relation", lv_relation_2, "RelationType", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:895:2: ( ',' (lv_relation_4= ruleRelationType ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:895:3: ',' (lv_relation_4= ruleRelationType )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleRelationDecl1838); 

            	            createLeafNode(grammarAccess.getRelationDeclAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:899:1: (lv_relation_4= ruleRelationType )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:902:6: lv_relation_4= ruleRelationType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRelationDeclAccess().getRelationRelationTypeParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationType_in_ruleRelationDecl1872);
            	    lv_relation_4=ruleRelationType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelationDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "relation", lv_relation_4, "RelationType", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleRelationDecl1887); 

                    createLeafNode(grammarAccess.getRelationDeclAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRelationDecl


    // $ANTLR start entryRuleRelationType
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:931:1: entryRuleRelationType returns [EObject current=null] : iv_ruleRelationType= ruleRelationType EOF ;
    public final EObject entryRuleRelationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationType = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:931:54: (iv_ruleRelationType= ruleRelationType EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:932:2: iv_ruleRelationType= ruleRelationType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationType_in_entryRuleRelationType1920);
            iv_ruleRelationType=ruleRelationType();
            _fsp--;

             current =iv_ruleRelationType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationType1930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationType


    // $ANTLR start ruleRelationType
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:939:1: ruleRelationType returns [EObject current=null] : (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility ) ;
    public final EObject ruleRelationType() throws RecognitionException {
        EObject current = null;

        EObject this_RelationImplication_0 = null;

        EObject this_RelationIncompatibility_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:944:6: ( (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:945:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:945:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ESTERELID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==30) ) {
                    alt12=2;
                }
                else if ( (LA12_1==29) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("945:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("945:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:946:5: this_RelationImplication_0= ruleRelationImplication
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationTypeAccess().getRelationImplicationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationImplication_in_ruleRelationType1977);
                    this_RelationImplication_0=ruleRelationImplication();
                    _fsp--;

                     
                            current = this_RelationImplication_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:956:5: this_RelationIncompatibility_1= ruleRelationIncompatibility
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationTypeAccess().getRelationIncompatibilityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationIncompatibility_in_ruleRelationType2004);
                    this_RelationIncompatibility_1=ruleRelationIncompatibility();
                    _fsp--;

                     
                            current = this_RelationIncompatibility_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRelationType


    // $ANTLR start entryRuleRelationImplication
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:971:1: entryRuleRelationImplication returns [EObject current=null] : iv_ruleRelationImplication= ruleRelationImplication EOF ;
    public final EObject entryRuleRelationImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationImplication = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:971:61: (iv_ruleRelationImplication= ruleRelationImplication EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:972:2: iv_ruleRelationImplication= ruleRelationImplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationImplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationImplication_in_entryRuleRelationImplication2036);
            iv_ruleRelationImplication=ruleRelationImplication();
            _fsp--;

             current =iv_ruleRelationImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationImplication2046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationImplication


    // $ANTLR start ruleRelationImplication
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:979:1: ruleRelationImplication returns [EObject current=null] : ( ( RULE_ESTERELID ) (lv_type_1= '=>' ) ( RULE_ESTERELID ) ) ;
    public final EObject ruleRelationImplication() throws RecognitionException {
        EObject current = null;

        Token lv_type_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:984:6: ( ( ( RULE_ESTERELID ) (lv_type_1= '=>' ) ( RULE_ESTERELID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:985:1: ( ( RULE_ESTERELID ) (lv_type_1= '=>' ) ( RULE_ESTERELID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:985:1: ( ( RULE_ESTERELID ) (lv_type_1= '=>' ) ( RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:985:2: ( RULE_ESTERELID ) (lv_type_1= '=>' ) ( RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:985:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:988:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationImplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleRelationImplication2093); 

            		createLeafNode(grammarAccess.getRelationImplicationAccess().getFirstSignalCrossReference_0_0(), "first"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1001:2: (lv_type_1= '=>' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1003:6: lv_type_1= '=>'
            {
            lv_type_1=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleRelationImplication2117); 

                    createLeafNode(grammarAccess.getRelationImplicationAccess().getTypeEqualsSignGreaterThanSignKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationImplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", /* lv_type_1 */ input.LT(-1), "=>", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1022:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1025:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationImplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleRelationImplication2152); 

            		createLeafNode(grammarAccess.getRelationImplicationAccess().getSecondSignalCrossReference_2_0(), "second"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRelationImplication


    // $ANTLR start entryRuleRelationIncompatibility
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1045:1: entryRuleRelationIncompatibility returns [EObject current=null] : iv_ruleRelationIncompatibility= ruleRelationIncompatibility EOF ;
    public final EObject entryRuleRelationIncompatibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationIncompatibility = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1045:65: (iv_ruleRelationIncompatibility= ruleRelationIncompatibility EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1046:2: iv_ruleRelationIncompatibility= ruleRelationIncompatibility EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationIncompatibilityRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationIncompatibility_in_entryRuleRelationIncompatibility2188);
            iv_ruleRelationIncompatibility=ruleRelationIncompatibility();
            _fsp--;

             current =iv_ruleRelationIncompatibility; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationIncompatibility2198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationIncompatibility


    // $ANTLR start ruleRelationIncompatibility
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1053:1: ruleRelationIncompatibility returns [EObject current=null] : ( ( RULE_ESTERELID ) (lv_type_1= '#' ) ( RULE_ESTERELID ) ( '#' ( RULE_ESTERELID ) )* ) ;
    public final EObject ruleRelationIncompatibility() throws RecognitionException {
        EObject current = null;

        Token lv_type_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1058:6: ( ( ( RULE_ESTERELID ) (lv_type_1= '#' ) ( RULE_ESTERELID ) ( '#' ( RULE_ESTERELID ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1059:1: ( ( RULE_ESTERELID ) (lv_type_1= '#' ) ( RULE_ESTERELID ) ( '#' ( RULE_ESTERELID ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1059:1: ( ( RULE_ESTERELID ) (lv_type_1= '#' ) ( RULE_ESTERELID ) ( '#' ( RULE_ESTERELID ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1059:2: ( RULE_ESTERELID ) (lv_type_1= '#' ) ( RULE_ESTERELID ) ( '#' ( RULE_ESTERELID ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1059:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1062:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleRelationIncompatibility2245); 

            		createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getIncompSignalCrossReference_0_0(), "incomp"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1075:2: (lv_type_1= '#' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1077:6: lv_type_1= '#'
            {
            lv_type_1=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleRelationIncompatibility2269); 

                    createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getTypeNumberSignKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", /* lv_type_1 */ input.LT(-1), "#", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1096:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1099:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleRelationIncompatibility2304); 

            		createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getIncompSignalCrossReference_2_0(), "incomp"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1112:2: ( '#' ( RULE_ESTERELID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1112:3: '#' ( RULE_ESTERELID )
            	    {
            	    match(input,30,FOLLOW_30_in_ruleRelationIncompatibility2317); 

            	            createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getNumberSignKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1116:1: ( RULE_ESTERELID )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1119:3: RULE_ESTERELID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleRelationIncompatibility2339); 

            	    		createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getIncompSignalCrossReference_3_1_0(), "incomp"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRelationIncompatibility


    // $ANTLR start entryRuleTypeDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1139:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1139:50: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1140:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl2377);
            iv_ruleTypeDecl=ruleTypeDecl();
            _fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl2387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDecl


    // $ANTLR start ruleTypeDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1147:1: ruleTypeDecl returns [EObject current=null] : ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1 = null;

        EObject lv_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1152:6: ( ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1153:1: ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1153:1: ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1153:2: 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';'
            {
            match(input,31,FOLLOW_31_in_ruleTypeDecl2421); 

                    createLeafNode(grammarAccess.getTypeDeclAccess().getTypeKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1157:1: (lv_type_1= ruleType )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1160:6: lv_type_1= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeDeclAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDecl2455);
            lv_type_1=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "type", lv_type_1, "Type", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1178:2: ( ',' (lv_type_3= ruleType ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1178:3: ',' (lv_type_3= ruleType )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTypeDecl2469); 

            	            createLeafNode(grammarAccess.getTypeDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1182:1: (lv_type_3= ruleType )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1185:6: lv_type_3= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTypeDeclAccess().getTypeTypeParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTypeDecl2503);
            	    lv_type_3=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTypeDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "type", lv_type_3, "Type", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleTypeDecl2518); 

                    createLeafNode(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeDecl


    // $ANTLR start entryRuleType
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1214:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1214:46: (iv_ruleType= ruleType EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1215:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2551);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1222:1: ruleType returns [EObject current=null] : (lv_name_0= RULE_ESTERELID ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1227:6: ( (lv_name_0= RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1228:1: (lv_name_0= RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1228:1: (lv_name_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1230:6: lv_name_0= RULE_ESTERELID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleType2607); 

            		createLeafNode(grammarAccess.getTypeAccess().getNameEsterelIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1255:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1255:54: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1256:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl2647);
            iv_ruleConstantDecl=ruleConstantDecl();
            _fsp--;

             current =iv_ruleConstantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDecl2657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantDecl


    // $ANTLR start ruleConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1263:1: ruleConstantDecl returns [EObject current=null] : ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_1 = null;

        EObject lv_constant_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1268:6: ( ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1269:1: ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1269:1: ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1269:2: 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';'
            {
            match(input,32,FOLLOW_32_in_ruleConstantDecl2691); 

                    createLeafNode(grammarAccess.getConstantDeclAccess().getConstantKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1273:1: (lv_constant_1= ruleOneTypeConstantDecl )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1276:6: lv_constant_1= ruleOneTypeConstantDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantDeclAccess().getConstantOneTypeConstantDeclParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2725);
            lv_constant_1=ruleOneTypeConstantDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "constant", lv_constant_1, "OneTypeConstantDecl", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1294:2: ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1294:3: ',' (lv_constant_3= ruleOneTypeConstantDecl )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleConstantDecl2739); 

            	            createLeafNode(grammarAccess.getConstantDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1298:1: (lv_constant_3= ruleOneTypeConstantDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1301:6: lv_constant_3= ruleOneTypeConstantDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConstantDeclAccess().getConstantOneTypeConstantDeclParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2773);
            	    lv_constant_3=ruleOneTypeConstantDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getConstantDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "constant", lv_constant_3, "OneTypeConstantDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleConstantDecl2788); 

                    createLeafNode(grammarAccess.getConstantDeclAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantDecl


    // $ANTLR start entryRuleOneTypeConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1330:1: entryRuleOneTypeConstantDecl returns [EObject current=null] : iv_ruleOneTypeConstantDecl= ruleOneTypeConstantDecl EOF ;
    public final EObject entryRuleOneTypeConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneTypeConstantDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1330:61: (iv_ruleOneTypeConstantDecl= ruleOneTypeConstantDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1331:2: iv_ruleOneTypeConstantDecl= ruleOneTypeConstantDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOneTypeConstantDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleOneTypeConstantDecl_in_entryRuleOneTypeConstantDecl2821);
            iv_ruleOneTypeConstantDecl=ruleOneTypeConstantDecl();
            _fsp--;

             current =iv_ruleOneTypeConstantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneTypeConstantDecl2831); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOneTypeConstantDecl


    // $ANTLR start ruleOneTypeConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1338:1: ruleOneTypeConstantDecl returns [EObject current=null] : ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ) ;
    public final EObject ruleOneTypeConstantDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_4=null;
        Token lv_type_5=null;
        EObject lv_constant_0 = null;

        EObject lv_constant_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1343:6: ( ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1344:1: ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1344:1: ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1344:2: (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1344:2: (lv_constant_0= ruleConstant )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1347:6: lv_constant_0= ruleConstant
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOneTypeConstantDeclAccess().getConstantConstantParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl2890);
            lv_constant_0=ruleConstant();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "constant", lv_constant_0, "Constant", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1365:2: ( ',' (lv_constant_2= ruleConstant ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1365:3: ',' (lv_constant_2= ruleConstant )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleOneTypeConstantDecl2904); 

            	            createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1369:1: (lv_constant_2= ruleConstant )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1372:6: lv_constant_2= ruleConstant
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOneTypeConstantDeclAccess().getConstantConstantParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl2938);
            	    lv_constant_2=ruleConstant();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "constant", lv_constant_2, "Constant", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleOneTypeConstantDecl2953); 

                    createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getColonKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1394:1: ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ESTERELID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_BASETYPE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1394:1: ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1394:2: (lv_type_4= RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1394:2: (lv_type_4= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1396:6: lv_type_4= RULE_ESTERELID
                    {
                    lv_type_4=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleOneTypeConstantDecl2976); 

                    		createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getTypeEsterelIDTerminalRuleCall_3_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_4, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1415:6: (lv_type_5= RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1415:6: (lv_type_5= RULE_BASETYPE )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1417:6: lv_type_5= RULE_BASETYPE
                    {
                    lv_type_5=(Token)input.LT(1);
                    match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleOneTypeConstantDecl3012); 

                    		createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getTypeBaseTypeTerminalRuleCall_3_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_5, "BaseType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOneTypeConstantDecl


    // $ANTLR start entryRuleConstant
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1442:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1442:50: (iv_ruleConstant= ruleConstant EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1443:2: iv_ruleConstant= ruleConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3054);
            iv_ruleConstant=ruleConstant();
            _fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3064); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstant


    // $ANTLR start ruleConstant
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1450:1: ruleConstant returns [EObject current=null] : ( (lv_name_0= RULE_ESTERELID ) ( '=' (lv_value_2= ruleConstantValue ) )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        AntlrDatatypeRuleToken lv_value_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1455:6: ( ( (lv_name_0= RULE_ESTERELID ) ( '=' (lv_value_2= ruleConstantValue ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1456:1: ( (lv_name_0= RULE_ESTERELID ) ( '=' (lv_value_2= ruleConstantValue ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1456:1: ( (lv_name_0= RULE_ESTERELID ) ( '=' (lv_value_2= ruleConstantValue ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1456:2: (lv_name_0= RULE_ESTERELID ) ( '=' (lv_value_2= ruleConstantValue ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1456:2: (lv_name_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1458:6: lv_name_0= RULE_ESTERELID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleConstant3111); 

            		createLeafNode(grammarAccess.getConstantAccess().getNameEsterelIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1476:2: ( '=' (lv_value_2= ruleConstantValue ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1476:3: '=' (lv_value_2= ruleConstantValue )
                    {
                    match(input,33,FOLLOW_33_in_ruleConstant3129); 

                            createLeafNode(grammarAccess.getConstantAccess().getEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1480:1: (lv_value_2= ruleConstantValue )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1483:6: lv_value_2= ruleConstantValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getValueConstantValueParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleConstant3163);
                    lv_value_2=ruleConstantValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_2, "ConstantValue", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstant


    // $ANTLR start entryRuleConstantValue
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1508:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1508:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1509:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue3203);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue3214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1516:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EsterelID_0= RULE_ESTERELID | ( (kw= '-' )? this_INT_2= RULE_INT ) | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EsterelID_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_Float_4=null;
        Token this_Boolean_5=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1522:6: ( (this_EsterelID_0= RULE_ESTERELID | ( (kw= '-' )? this_INT_2= RULE_INT ) | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1523:1: (this_EsterelID_0= RULE_ESTERELID | ( (kw= '-' )? this_INT_2= RULE_INT ) | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1523:1: (this_EsterelID_0= RULE_ESTERELID | ( (kw= '-' )? this_INT_2= RULE_INT ) | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN )
            int alt20=5;
            switch ( input.LA(1) ) {
            case RULE_ESTERELID:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt20=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1523:1: (this_EsterelID_0= RULE_ESTERELID | ( (kw= '-' )? this_INT_2= RULE_INT ) | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1523:6: this_EsterelID_0= RULE_ESTERELID
                    {
                    this_EsterelID_0=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleConstantValue3254); 

                    		current.merge(this_EsterelID_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getEsterelIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1531:6: ( (kw= '-' )? this_INT_2= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1531:6: ( (kw= '-' )? this_INT_2= RULE_INT )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1531:7: (kw= '-' )? this_INT_2= RULE_INT
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1531:7: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==34) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1532:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_ruleConstantValue3280); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getConstantValueAccess().getHyphenMinusKeyword_1_0(), null); 
                                

                            }
                            break;

                    }

                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantValue3297); 

                    		current.merge(this_INT_2);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getINTTerminalRuleCall_1_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1545:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantValue3324); 

                    		current.merge(this_STRING_3);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1553:10: this_Float_4= RULE_FLOAT
                    {
                    this_Float_4=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleConstantValue3350); 

                    		current.merge(this_Float_4);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getFloatTerminalRuleCall_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1561:10: this_Boolean_5= RULE_BOOLEAN
                    {
                    this_Boolean_5=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleConstantValue3376); 

                    		current.merge(this_Boolean_5);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getBooleanTerminalRuleCall_4(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleFunctionDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1576:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1576:54: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1577:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionDecl_in_entryRuleFunctionDecl3419);
            iv_ruleFunctionDecl=ruleFunctionDecl();
            _fsp--;

             current =iv_ruleFunctionDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDecl3429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionDecl


    // $ANTLR start ruleFunctionDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1584:1: ruleFunctionDecl returns [EObject current=null] : ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_function_1 = null;

        EObject lv_function_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1589:6: ( ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1590:1: ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1590:1: ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1590:2: 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';'
            {
            match(input,35,FOLLOW_35_in_ruleFunctionDecl3463); 

                    createLeafNode(grammarAccess.getFunctionDeclAccess().getFunctionKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1594:1: (lv_function_1= ruleFunction )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1597:6: lv_function_1= ruleFunction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionFunctionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunction_in_ruleFunctionDecl3497);
            lv_function_1=ruleFunction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "function", lv_function_1, "Function", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1615:2: ( ',' (lv_function_3= ruleFunction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1615:3: ',' (lv_function_3= ruleFunction )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleFunctionDecl3511); 

            	            createLeafNode(grammarAccess.getFunctionDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1619:1: (lv_function_3= ruleFunction )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1622:6: lv_function_3= ruleFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionFunctionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleFunctionDecl3545);
            	    lv_function_3=ruleFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "function", lv_function_3, "Function", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleFunctionDecl3560); 

                    createLeafNode(grammarAccess.getFunctionDeclAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionDecl


    // $ANTLR start entryRuleFunction
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1651:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1651:50: (iv_ruleFunction= ruleFunction EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1652:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3593);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1659:1: ruleFunction returns [EObject current=null] : ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_idList_2=null;
        Token lv_idList_4=null;
        Token lv_type_7=null;
        Token lv_type_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1664:6: ( ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1665:1: ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1665:1: ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1665:2: (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1665:2: (lv_name_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1667:6: lv_name_0= RULE_ESTERELID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleFunction3650); 

            		createLeafNode(grammarAccess.getFunctionAccess().getNameEsterelIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,36,FOLLOW_36_in_ruleFunction3667); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1689:1: ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ESTERELID && LA25_0<=RULE_BASETYPE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1689:2: (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )*
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1689:2: (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1691:6: lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1691:18: ( RULE_ESTERELID | RULE_BASETYPE )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ESTERELID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_BASETYPE) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1691:18: ( RULE_ESTERELID | RULE_BASETYPE )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1691:20: RULE_ESTERELID
                            {
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleFunction3691); 

                            		createLeafNode(grammarAccess.getFunctionAccess().getIdListEsterelIDTerminalRuleCall_2_0_0_0(), "idList"); 
                            	

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1696:7: RULE_BASETYPE
                            {
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleFunction3703); 

                            		createLeafNode(grammarAccess.getFunctionAccess().getIdListBaseTypeTerminalRuleCall_2_0_0_1(), "idList"); 
                            	

                            }
                            break;

                    }


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "idList", lv_idList_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1715:2: ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==22) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1715:3: ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleFunction3723); 

                    	            createLeafNode(grammarAccess.getFunctionAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1719:1: (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1721:6: lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE )
                    	    {
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1721:18: ( RULE_ESTERELID | RULE_BASETYPE )
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==RULE_ESTERELID) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==RULE_BASETYPE) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1721:18: ( RULE_ESTERELID | RULE_BASETYPE )", 23, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1721:20: RULE_ESTERELID
                    	            {
                    	            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleFunction3746); 

                    	            		createLeafNode(grammarAccess.getFunctionAccess().getIdListEsterelIDTerminalRuleCall_2_1_1_0_0(), "idList"); 
                    	            	

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1726:7: RULE_BASETYPE
                    	            {
                    	            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleFunction3758); 

                    	            		createLeafNode(grammarAccess.getFunctionAccess().getIdListBaseTypeTerminalRuleCall_2_1_1_0_1(), "idList"); 
                    	            	

                    	            }
                    	            break;

                    	    }


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "idList", lv_idList_4, null, lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_ruleFunction3781); 

                    createLeafNode(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3(), null); 
                
            match(input,18,FOLLOW_18_in_ruleFunction3790); 

                    createLeafNode(grammarAccess.getFunctionAccess().getColonKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1753:1: ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ESTERELID) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_BASETYPE) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1753:1: ( (lv_type_7= RULE_ESTERELID ) | (lv_type_8= RULE_BASETYPE ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1753:2: (lv_type_7= RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1753:2: (lv_type_7= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1755:6: lv_type_7= RULE_ESTERELID
                    {
                    lv_type_7=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleFunction3813); 

                    		createLeafNode(grammarAccess.getFunctionAccess().getTypeEsterelIDTerminalRuleCall_5_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_7, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1774:6: (lv_type_8= RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1774:6: (lv_type_8= RULE_BASETYPE )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1776:6: lv_type_8= RULE_BASETYPE
                    {
                    lv_type_8=(Token)input.LT(1);
                    match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleFunction3849); 

                    		createLeafNode(grammarAccess.getFunctionAccess().getTypeBaseTypeTerminalRuleCall_5_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_8, "BaseType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleProcedureDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1801:1: entryRuleProcedureDecl returns [EObject current=null] : iv_ruleProcedureDecl= ruleProcedureDecl EOF ;
    public final EObject entryRuleProcedureDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1801:55: (iv_ruleProcedureDecl= ruleProcedureDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1802:2: iv_ruleProcedureDecl= ruleProcedureDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedureDecl_in_entryRuleProcedureDecl3891);
            iv_ruleProcedureDecl=ruleProcedureDecl();
            _fsp--;

             current =iv_ruleProcedureDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedureDecl3901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedureDecl


    // $ANTLR start ruleProcedureDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1809:1: ruleProcedureDecl returns [EObject current=null] : ( 'procedure' (lv_procedure_1= ruleProcedure ) ( ',' (lv_procedure_3= ruleProcedure ) )* ';' ) ;
    public final EObject ruleProcedureDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_1 = null;

        EObject lv_procedure_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1814:6: ( ( 'procedure' (lv_procedure_1= ruleProcedure ) ( ',' (lv_procedure_3= ruleProcedure ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1815:1: ( 'procedure' (lv_procedure_1= ruleProcedure ) ( ',' (lv_procedure_3= ruleProcedure ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1815:1: ( 'procedure' (lv_procedure_1= ruleProcedure ) ( ',' (lv_procedure_3= ruleProcedure ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1815:2: 'procedure' (lv_procedure_1= ruleProcedure ) ( ',' (lv_procedure_3= ruleProcedure ) )* ';'
            {
            match(input,38,FOLLOW_38_in_ruleProcedureDecl3935); 

                    createLeafNode(grammarAccess.getProcedureDeclAccess().getProcedureKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1819:1: (lv_procedure_1= ruleProcedure )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1822:6: lv_procedure_1= ruleProcedure
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProcedureDeclAccess().getProcedureProcedureParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProcedure_in_ruleProcedureDecl3969);
            lv_procedure_1=ruleProcedure();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "procedure", lv_procedure_1, "Procedure", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1840:2: ( ',' (lv_procedure_3= ruleProcedure ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1840:3: ',' (lv_procedure_3= ruleProcedure )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleProcedureDecl3983); 

            	            createLeafNode(grammarAccess.getProcedureDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1844:1: (lv_procedure_3= ruleProcedure )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1847:6: lv_procedure_3= ruleProcedure
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProcedureDeclAccess().getProcedureProcedureParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcedure_in_ruleProcedureDecl4017);
            	    lv_procedure_3=ruleProcedure();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProcedureDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "procedure", lv_procedure_3, "Procedure", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleProcedureDecl4032); 

                    createLeafNode(grammarAccess.getProcedureDeclAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedureDecl


    // $ANTLR start entryRuleProcedure
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1876:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1876:51: (iv_ruleProcedure= ruleProcedure EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1877:2: iv_ruleProcedure= ruleProcedure EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcedureRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure4065);
            iv_ruleProcedure=ruleProcedure();
            _fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure4075); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcedure


    // $ANTLR start ruleProcedure
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1884:1: ruleProcedure returns [EObject current=null] : ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' '(' ( (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_idList_2=null;
        Token lv_idList_4=null;
        Token lv_idList_7=null;
        Token lv_idList_9=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1889:6: ( ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' '(' ( (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1890:1: ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' '(' ( (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1890:1: ( (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' '(' ( (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1890:2: (lv_name_0= RULE_ESTERELID ) '(' ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')' '(' ( (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )? ')'
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1890:2: (lv_name_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1892:6: lv_name_0= RULE_ESTERELID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleProcedure4122); 

            		createLeafNode(grammarAccess.getProcedureAccess().getNameEsterelIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,36,FOLLOW_36_in_ruleProcedure4139); 

                    createLeafNode(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1914:1: ( (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ESTERELID && LA31_0<=RULE_BASETYPE)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1914:2: (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )*
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1914:2: (lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1916:6: lv_idList_2= ( RULE_ESTERELID | RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1916:18: ( RULE_ESTERELID | RULE_BASETYPE )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ESTERELID) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_BASETYPE) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1916:18: ( RULE_ESTERELID | RULE_BASETYPE )", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1916:20: RULE_ESTERELID
                            {
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleProcedure4163); 

                            		createLeafNode(grammarAccess.getProcedureAccess().getIdListEsterelIDTerminalRuleCall_2_0_0_0(), "idList"); 
                            	

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1921:7: RULE_BASETYPE
                            {
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleProcedure4175); 

                            		createLeafNode(grammarAccess.getProcedureAccess().getIdListBaseTypeTerminalRuleCall_2_0_0_1(), "idList"); 
                            	

                            }
                            break;

                    }


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "idList", lv_idList_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1940:2: ( ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==22) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1940:3: ',' (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleProcedure4195); 

                    	            createLeafNode(grammarAccess.getProcedureAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1944:1: (lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1946:6: lv_idList_4= ( RULE_ESTERELID | RULE_BASETYPE )
                    	    {
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1946:18: ( RULE_ESTERELID | RULE_BASETYPE )
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==RULE_ESTERELID) ) {
                    	        alt29=1;
                    	    }
                    	    else if ( (LA29_0==RULE_BASETYPE) ) {
                    	        alt29=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1946:18: ( RULE_ESTERELID | RULE_BASETYPE )", 29, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1946:20: RULE_ESTERELID
                    	            {
                    	            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleProcedure4218); 

                    	            		createLeafNode(grammarAccess.getProcedureAccess().getIdListEsterelIDTerminalRuleCall_2_1_1_0_0(), "idList"); 
                    	            	

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1951:7: RULE_BASETYPE
                    	            {
                    	            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleProcedure4230); 

                    	            		createLeafNode(grammarAccess.getProcedureAccess().getIdListBaseTypeTerminalRuleCall_2_1_1_0_1(), "idList"); 
                    	            	

                    	            }
                    	            break;

                    	    }


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "idList", lv_idList_4, null, lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_ruleProcedure4253); 

                    createLeafNode(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_3(), null); 
                
            match(input,36,FOLLOW_36_in_ruleProcedure4262); 

                    createLeafNode(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1978:1: ( (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ESTERELID && LA35_0<=RULE_BASETYPE)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1978:2: (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) ) ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )*
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1978:2: (lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1980:6: lv_idList_7= ( RULE_ESTERELID | RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1980:18: ( RULE_ESTERELID | RULE_BASETYPE )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ESTERELID) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_BASETYPE) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1980:18: ( RULE_ESTERELID | RULE_BASETYPE )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1980:20: RULE_ESTERELID
                            {
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleProcedure4286); 

                            		createLeafNode(grammarAccess.getProcedureAccess().getIdListEsterelIDTerminalRuleCall_5_0_0_0(), "idList"); 
                            	

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:1985:7: RULE_BASETYPE
                            {
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleProcedure4298); 

                            		createLeafNode(grammarAccess.getProcedureAccess().getIdListBaseTypeTerminalRuleCall_5_0_0_1(), "idList"); 
                            	

                            }
                            break;

                    }


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "idList", lv_idList_7, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2004:2: ( ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2004:3: ',' (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleProcedure4318); 

                    	            createLeafNode(grammarAccess.getProcedureAccess().getCommaKeyword_5_1_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2008:1: (lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE ) )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2010:6: lv_idList_9= ( RULE_ESTERELID | RULE_BASETYPE )
                    	    {
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2010:18: ( RULE_ESTERELID | RULE_BASETYPE )
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==RULE_ESTERELID) ) {
                    	        alt33=1;
                    	    }
                    	    else if ( (LA33_0==RULE_BASETYPE) ) {
                    	        alt33=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("2010:18: ( RULE_ESTERELID | RULE_BASETYPE )", 33, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2010:20: RULE_ESTERELID
                    	            {
                    	            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleProcedure4341); 

                    	            		createLeafNode(grammarAccess.getProcedureAccess().getIdListEsterelIDTerminalRuleCall_5_1_1_0_0(), "idList"); 
                    	            	

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2015:7: RULE_BASETYPE
                    	            {
                    	            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleProcedure4353); 

                    	            		createLeafNode(grammarAccess.getProcedureAccess().getIdListBaseTypeTerminalRuleCall_5_1_1_0_1(), "idList"); 
                    	            	

                    	            }
                    	            break;

                    	    }


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProcedureRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "idList", lv_idList_9, null, lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_ruleProcedure4376); 

                    createLeafNode(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcedure


    // $ANTLR start entryRuleStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2045:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2045:51: (iv_ruleStatement= ruleStatement EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2046:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4409);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2053:1: ruleStatement returns [EObject current=null] : (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Sequence_0 = null;

        EObject lv_right_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2058:6: ( (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2059:1: (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2059:1: (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2060:5: this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStatementAccess().getSequenceParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSequence_in_ruleStatement4466);
            this_Sequence_0=ruleSequence();
            _fsp--;

             
                    current = this_Sequence_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2068:1: ( () '||' (lv_right_3= ruleSequence ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2068:2: () '||' (lv_right_3= ruleSequence )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2068:2: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2069:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getStatementAccess().getParallelLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getParallelLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,39,FOLLOW_39_in_ruleStatement4484); 

            	            createLeafNode(grammarAccess.getStatementAccess().getVerticalLineVerticalLineKeyword_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2088:1: (lv_right_3= ruleSequence )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2091:6: lv_right_3= ruleSequence
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getRightSequenceParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleStatement4518);
            	    lv_right_3=ruleSequence();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "right", lv_right_3, "Sequence", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleAtomicStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2116:1: entryRuleAtomicStatement returns [EObject current=null] : iv_ruleAtomicStatement= ruleAtomicStatement EOF ;
    public final EObject entryRuleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicStatement = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2116:57: (iv_ruleAtomicStatement= ruleAtomicStatement EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2117:2: iv_ruleAtomicStatement= ruleAtomicStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomicStatement_in_entryRuleAtomicStatement4557);
            iv_ruleAtomicStatement=ruleAtomicStatement();
            _fsp--;

             current =iv_ruleAtomicStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicStatement4567); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicStatement


    // $ANTLR start ruleAtomicStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2124:1: ruleAtomicStatement returns [EObject current=null] : (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort ) ;
    public final EObject ruleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Abort_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Await_2 = null;

        EObject this_Block_3 = null;

        EObject this_Do_4 = null;

        EObject this_Emit_5 = null;

        EObject this_EveryDo_6 = null;

        EObject this_Exit_7 = null;

        EObject this_Halt_8 = null;

        EObject this_IfTest_9 = null;

        EObject this_LocalSignalDecl_10 = null;

        EObject this_Loop_11 = null;

        EObject this_Nothing_12 = null;

        EObject this_Pause_13 = null;

        EObject this_Present_14 = null;

        EObject this_Repeat_15 = null;

        EObject this_Run_16 = null;

        EObject this_Suspend_17 = null;

        EObject this_Sustain_18 = null;

        EObject this_Trap_19 = null;

        EObject this_Variable_20 = null;

        EObject this_WeakAbort_21 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2129:6: ( (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2130:1: (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2130:1: (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort )
            int alt37=22;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt37=1;
                }
                break;
            case RULE_ESTERELID:
                {
                alt37=2;
                }
                break;
            case 47:
                {
                alt37=3;
                }
                break;
            case 40:
                {
                alt37=4;
                }
                break;
            case 45:
                {
                alt37=5;
                }
                break;
            case 51:
                {
                alt37=6;
                }
                break;
            case 52:
                {
                alt37=7;
                }
                break;
            case 53:
                {
                alt37=8;
                }
                break;
            case 54:
                {
                alt37=9;
                }
                break;
            case 55:
                {
                alt37=10;
                }
                break;
            case 70:
                {
                alt37=11;
                }
                break;
            case 59:
                {
                alt37=12;
                }
                break;
            case 61:
                {
                alt37=13;
                }
                break;
            case 62:
                {
                alt37=14;
                }
                break;
            case 63:
                {
                alt37=15;
                }
                break;
            case 64:
            case 65:
                {
                alt37=16;
                }
                break;
            case 67:
            case 68:
                {
                alt37=17;
                }
                break;
            case 72:
                {
                alt37=18;
                }
                break;
            case 73:
                {
                alt37=19;
                }
                break;
            case 74:
                {
                alt37=20;
                }
                break;
            case 76:
                {
                alt37=21;
                }
                break;
            case 77:
                {
                alt37=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2130:1: (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2131:5: this_Abort_0= ruleAbort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getAbortParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbort_in_ruleAtomicStatement4614);
                    this_Abort_0=ruleAbort();
                    _fsp--;

                     
                            current = this_Abort_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2141:5: this_Assignment_1= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getAssignmentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleAtomicStatement4641);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2151:5: this_Await_2= ruleAwait
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getAwaitParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwait_in_ruleAtomicStatement4668);
                    this_Await_2=ruleAwait();
                    _fsp--;

                     
                            current = this_Await_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2161:5: this_Block_3= ruleBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getBlockParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleAtomicStatement4695);
                    this_Block_3=ruleBlock();
                    _fsp--;

                     
                            current = this_Block_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2171:5: this_Do_4= ruleDo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getDoParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDo_in_ruleAtomicStatement4722);
                    this_Do_4=ruleDo();
                    _fsp--;

                     
                            current = this_Do_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2181:5: this_Emit_5= ruleEmit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getEmitParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmit_in_ruleAtomicStatement4749);
                    this_Emit_5=ruleEmit();
                    _fsp--;

                     
                            current = this_Emit_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2191:5: this_EveryDo_6= ruleEveryDo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getEveryDoParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEveryDo_in_ruleAtomicStatement4776);
                    this_EveryDo_6=ruleEveryDo();
                    _fsp--;

                     
                            current = this_EveryDo_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2201:5: this_Exit_7= ruleExit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getExitParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExit_in_ruleAtomicStatement4803);
                    this_Exit_7=ruleExit();
                    _fsp--;

                     
                            current = this_Exit_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2211:5: this_Halt_8= ruleHalt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getHaltParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHalt_in_ruleAtomicStatement4830);
                    this_Halt_8=ruleHalt();
                    _fsp--;

                     
                            current = this_Halt_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2221:5: this_IfTest_9= ruleIfTest
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getIfTestParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIfTest_in_ruleAtomicStatement4857);
                    this_IfTest_9=ruleIfTest();
                    _fsp--;

                     
                            current = this_IfTest_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2231:5: this_LocalSignalDecl_10= ruleLocalSignalDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getLocalSignalDeclParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalSignalDecl_in_ruleAtomicStatement4884);
                    this_LocalSignalDecl_10=ruleLocalSignalDecl();
                    _fsp--;

                     
                            current = this_LocalSignalDecl_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2241:5: this_Loop_11= ruleLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getLoopParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLoop_in_ruleAtomicStatement4911);
                    this_Loop_11=ruleLoop();
                    _fsp--;

                     
                            current = this_Loop_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2251:5: this_Nothing_12= ruleNothing
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getNothingParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNothing_in_ruleAtomicStatement4938);
                    this_Nothing_12=ruleNothing();
                    _fsp--;

                     
                            current = this_Nothing_12; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2261:5: this_Pause_13= rulePause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getPauseParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePause_in_ruleAtomicStatement4965);
                    this_Pause_13=rulePause();
                    _fsp--;

                     
                            current = this_Pause_13; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2271:5: this_Present_14= rulePresent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getPresentParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresent_in_ruleAtomicStatement4992);
                    this_Present_14=rulePresent();
                    _fsp--;

                     
                            current = this_Present_14; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2281:5: this_Repeat_15= ruleRepeat
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getRepeatParserRuleCall_15(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRepeat_in_ruleAtomicStatement5019);
                    this_Repeat_15=ruleRepeat();
                    _fsp--;

                     
                            current = this_Repeat_15; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2291:5: this_Run_16= ruleRun
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getRunParserRuleCall_16(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRun_in_ruleAtomicStatement5046);
                    this_Run_16=ruleRun();
                    _fsp--;

                     
                            current = this_Run_16; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2301:5: this_Suspend_17= ruleSuspend
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getSuspendParserRuleCall_17(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSuspend_in_ruleAtomicStatement5073);
                    this_Suspend_17=ruleSuspend();
                    _fsp--;

                     
                            current = this_Suspend_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2311:5: this_Sustain_18= ruleSustain
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getSustainParserRuleCall_18(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSustain_in_ruleAtomicStatement5100);
                    this_Sustain_18=ruleSustain();
                    _fsp--;

                     
                            current = this_Sustain_18; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2321:5: this_Trap_19= ruleTrap
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getTrapParserRuleCall_19(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrap_in_ruleAtomicStatement5127);
                    this_Trap_19=ruleTrap();
                    _fsp--;

                     
                            current = this_Trap_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2331:5: this_Variable_20= ruleVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getVariableParserRuleCall_20(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleAtomicStatement5154);
                    this_Variable_20=ruleVariable();
                    _fsp--;

                     
                            current = this_Variable_20; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2341:5: this_WeakAbort_21= ruleWeakAbort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getWeakAbortParserRuleCall_21(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWeakAbort_in_ruleAtomicStatement5181);
                    this_WeakAbort_21=ruleWeakAbort();
                    _fsp--;

                     
                            current = this_WeakAbort_21; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicStatement


    // $ANTLR start entryRuleSequence
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2356:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2356:50: (iv_ruleSequence= ruleSequence EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2357:2: iv_ruleSequence= ruleSequence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSequenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence5213);
            iv_ruleSequence=ruleSequence();
            _fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence5223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSequence


    // $ANTLR start ruleSequence
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2364:1: ruleSequence returns [EObject current=null] : (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicStatement_0 = null;

        EObject lv_right_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2369:6: ( (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2370:1: (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2370:1: (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2371:5: this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getSequenceAccess().getAtomicStatementParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAtomicStatement_in_ruleSequence5270);
            this_AtomicStatement_0=ruleAtomicStatement();
            _fsp--;

             
                    current = this_AtomicStatement_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2379:1: ( () ';' (lv_right_3= ruleAtomicStatement ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==23) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_ESTERELID||LA38_1==40||LA38_1==43||LA38_1==45||LA38_1==47||(LA38_1>=51 && LA38_1<=55)||LA38_1==59||(LA38_1>=61 && LA38_1<=65)||(LA38_1>=67 && LA38_1<=68)||LA38_1==70||(LA38_1>=72 && LA38_1<=74)||(LA38_1>=76 && LA38_1<=77)) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2379:2: () ';' (lv_right_3= ruleAtomicStatement )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2379:2: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2380:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,23,FOLLOW_23_in_ruleSequence5288); 

            	            createLeafNode(grammarAccess.getSequenceAccess().getSemicolonKeyword_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2399:1: (lv_right_3= ruleAtomicStatement )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2402:6: lv_right_3= ruleAtomicStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSequenceAccess().getRightAtomicStatementParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicStatement_in_ruleSequence5322);
            	    lv_right_3=ruleAtomicStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSequenceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "right", lv_right_3, "AtomicStatement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2420:4: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2420:5: ';'
                    {
                    match(input,23,FOLLOW_23_in_ruleSequence5338); 

                            createLeafNode(grammarAccess.getSequenceAccess().getSemicolonKeyword_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSequence


    // $ANTLR start entryRuleBlock
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2431:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2431:47: (iv_ruleBlock= ruleBlock EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2432:2: iv_ruleBlock= ruleBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock5373);
            iv_ruleBlock=ruleBlock();
            _fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock5383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2439:1: ruleBlock returns [EObject current=null] : ( '[' (lv_statement_1= ruleStatement ) ']' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2444:6: ( ( '[' (lv_statement_1= ruleStatement ) ']' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2445:1: ( '[' (lv_statement_1= ruleStatement ) ']' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2445:1: ( '[' (lv_statement_1= ruleStatement ) ']' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2445:2: '[' (lv_statement_1= ruleStatement ) ']'
            {
            match(input,40,FOLLOW_40_in_ruleBlock5417); 

                    createLeafNode(grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2449:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2452:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleBlock5451);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,41,FOLLOW_41_in_ruleBlock5464); 

                    createLeafNode(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2481:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2481:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2482:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment5497);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment5507); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2489:1: ruleAssignment returns [EObject current=null] : ( (lv_variable_0= RULE_ESTERELID ) ':=' (lv_expr_2= ruleDataExpr ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0=null;
        EObject lv_expr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2494:6: ( ( (lv_variable_0= RULE_ESTERELID ) ':=' (lv_expr_2= ruleDataExpr ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2495:1: ( (lv_variable_0= RULE_ESTERELID ) ':=' (lv_expr_2= ruleDataExpr ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2495:1: ( (lv_variable_0= RULE_ESTERELID ) ':=' (lv_expr_2= ruleDataExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2495:2: (lv_variable_0= RULE_ESTERELID ) ':=' (lv_expr_2= ruleDataExpr )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2495:2: (lv_variable_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2497:6: lv_variable_0= RULE_ESTERELID
            {
            lv_variable_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleAssignment5554); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getVariableEsterelIDTerminalRuleCall_0_0(), "variable"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "variable", lv_variable_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,42,FOLLOW_42_in_ruleAssignment5571); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2519:1: (lv_expr_2= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2522:6: lv_expr_2= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExprDataExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleAssignment5605);
            lv_expr_2=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_2, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2547:1: entryRuleAbort returns [EObject current=null] : iv_ruleAbort= ruleAbort EOF ;
    public final EObject entryRuleAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbort = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2547:47: (iv_ruleAbort= ruleAbort EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2548:2: iv_ruleAbort= ruleAbort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbort_in_entryRuleAbort5642);
            iv_ruleAbort=ruleAbort();
            _fsp--;

             current =iv_ruleAbort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbort5652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbort


    // $ANTLR start ruleAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2555:1: ruleAbort returns [EObject current=null] : ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) ) ;
    public final EObject ruleAbort() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;

        EObject lv_body_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2560:6: ( ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2561:1: ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2561:1: ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2561:2: 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody )
            {
            match(input,43,FOLLOW_43_in_ruleAbort5686); 

                    createLeafNode(grammarAccess.getAbortAccess().getAbortKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2565:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2568:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleAbort5720);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,44,FOLLOW_44_in_ruleAbort5733); 

                    createLeafNode(grammarAccess.getAbortAccess().getWhenKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2590:1: (lv_body_3= ruleAbortBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2593:6: lv_body_3= ruleAbortBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortAccess().getBodyAbortBodyParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortBody_in_ruleAbort5767);
            lv_body_3=ruleAbortBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_3, "AbortBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbort


    // $ANTLR start entryRuleAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2618:1: entryRuleAbortBody returns [EObject current=null] : iv_ruleAbortBody= ruleAbortBody EOF ;
    public final EObject entryRuleAbortBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2618:51: (iv_ruleAbortBody= ruleAbortBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2619:2: iv_ruleAbortBody= ruleAbortBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortBody_in_entryRuleAbortBody5804);
            iv_ruleAbortBody=ruleAbortBody();
            _fsp--;

             current =iv_ruleAbortBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortBody5814); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortBody


    // $ANTLR start ruleAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2626:1: ruleAbortBody returns [EObject current=null] : (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase ) ;
    public final EObject ruleAbortBody() throws RecognitionException {
        EObject current = null;

        EObject this_AbortInstance_0 = null;

        EObject this_AbortCase_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2631:6: ( (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2632:1: (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2632:1: (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ESTERELID||(LA40_0>=RULE_INT && LA40_0<=RULE_BOOLEAN)||(LA40_0>=33 && LA40_0<=34)||LA40_0==36||LA40_0==40||LA40_0==69||(LA40_0>=78 && LA40_0<=92)) ) {
                alt40=1;
            }
            else if ( (LA40_0==46) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2632:1: (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2633:5: this_AbortInstance_0= ruleAbortInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbortBodyAccess().getAbortInstanceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbortInstance_in_ruleAbortBody5861);
                    this_AbortInstance_0=ruleAbortInstance();
                    _fsp--;

                     
                            current = this_AbortInstance_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2643:5: this_AbortCase_1= ruleAbortCase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbortBodyAccess().getAbortCaseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbortCase_in_ruleAbortBody5888);
                    this_AbortCase_1=ruleAbortCase();
                    _fsp--;

                     
                            current = this_AbortCase_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbortBody


    // $ANTLR start entryRuleAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2658:1: entryRuleAbortEnd returns [String current=null] : iv_ruleAbortEnd= ruleAbortEnd EOF ;
    public final String entryRuleAbortEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbortEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2658:49: (iv_ruleAbortEnd= ruleAbortEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2659:2: iv_ruleAbortEnd= ruleAbortEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortEnd_in_entryRuleAbortEnd5921);
            iv_ruleAbortEnd=ruleAbortEnd();
            _fsp--;

             current =iv_ruleAbortEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortEnd5932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortEnd


    // $ANTLR start ruleAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2666:1: ruleAbortEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' (kw= 'abort' )? ) ;
    public final AntlrDatatypeRuleToken ruleAbortEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2672:6: ( (kw= 'end' (kw= 'abort' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2673:1: (kw= 'end' (kw= 'abort' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2673:1: (kw= 'end' (kw= 'abort' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2674:2: kw= 'end' (kw= 'abort' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleAbortEnd5970); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getAbortEndAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2679:1: (kw= 'abort' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2680:2: kw= 'abort'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleAbortEnd5984); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAbortEndAccess().getAbortKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbortEnd


    // $ANTLR start entryRuleAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2693:1: entryRuleAbortInstance returns [EObject current=null] : iv_ruleAbortInstance= ruleAbortInstance EOF ;
    public final EObject entryRuleAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortInstance = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2693:55: (iv_ruleAbortInstance= ruleAbortInstance EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2694:2: iv_ruleAbortInstance= ruleAbortInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortInstance_in_entryRuleAbortInstance6024);
            iv_ruleAbortInstance=ruleAbortInstance();
            _fsp--;

             current =iv_ruleAbortInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortInstance6034); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortInstance


    // $ANTLR start ruleAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2701:1: ruleAbortInstance returns [EObject current=null] : ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? ) ;
    public final EObject ruleAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_0 = null;

        EObject lv_statement_2 = null;

        AntlrDatatypeRuleToken lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2706:6: ( ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2707:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2707:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2707:2: (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2707:2: (lv_delay_0= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2710:6: lv_delay_0= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortInstanceAccess().getDelayDelayExprParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleAbortInstance6093);
            lv_delay_0=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_0, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2728:2: ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2728:3: 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd )
                    {
                    match(input,45,FOLLOW_45_in_ruleAbortInstance6107); 

                            createLeafNode(grammarAccess.getAbortInstanceAccess().getDoKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2732:1: (lv_statement_2= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2735:6: lv_statement_2= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortInstanceAccess().getStatementStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleAbortInstance6141);
                    lv_statement_2=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2753:2: (lv_end_3= ruleAbortEnd )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2756:6: lv_end_3= ruleAbortEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortInstanceAccess().getEndAbortEndParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAbortEnd_in_ruleAbortInstance6179);
                    lv_end_3=ruleAbortEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "AbortEnd", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbortInstance


    // $ANTLR start entryRuleAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2781:1: entryRuleAbortCase returns [EObject current=null] : iv_ruleAbortCase= ruleAbortCase EOF ;
    public final EObject entryRuleAbortCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2781:51: (iv_ruleAbortCase= ruleAbortCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2782:2: iv_ruleAbortCase= ruleAbortCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortCase_in_entryRuleAbortCase6218);
            iv_ruleAbortCase=ruleAbortCase();
            _fsp--;

             current =iv_ruleAbortCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortCase6228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortCase


    // $ANTLR start ruleAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2789:1: ruleAbortCase returns [EObject current=null] : ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) ) ;
    public final EObject ruleAbortCase() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0 = null;

        EObject lv_cases_1 = null;

        AntlrDatatypeRuleToken lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2794:6: ( ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2795:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2795:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2795:2: (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2795:2: (lv_cases_0= ruleAbortCaseSingle )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2798:6: lv_cases_0= ruleAbortCaseSingle
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase6287);
            lv_cases_0=ruleAbortCaseSingle();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "cases", lv_cases_0, "AbortCaseSingle", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2816:2: (lv_cases_1= ruleAbortCaseSingle )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==46) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2819:6: lv_cases_1= ruleAbortCaseSingle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase6325);
            	    lv_cases_1=ruleAbortCaseSingle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAbortCaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "cases", lv_cases_1, "AbortCaseSingle", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2837:3: (lv_end_2= ruleAbortEnd )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2840:6: lv_end_2= ruleAbortEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortCaseAccess().getEndAbortEndParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortEnd_in_ruleAbortCase6364);
            lv_end_2=ruleAbortEnd();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "end", lv_end_2, "AbortEnd", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbortCase


    // $ANTLR start entryRuleAbortCaseSingle
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2865:1: entryRuleAbortCaseSingle returns [EObject current=null] : iv_ruleAbortCaseSingle= ruleAbortCaseSingle EOF ;
    public final EObject entryRuleAbortCaseSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortCaseSingle = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2865:57: (iv_ruleAbortCaseSingle= ruleAbortCaseSingle EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2866:2: iv_ruleAbortCaseSingle= ruleAbortCaseSingle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortCaseSingleRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_entryRuleAbortCaseSingle6401);
            iv_ruleAbortCaseSingle=ruleAbortCaseSingle();
            _fsp--;

             current =iv_ruleAbortCaseSingle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortCaseSingle6411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortCaseSingle


    // $ANTLR start ruleAbortCaseSingle
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2873:1: ruleAbortCaseSingle returns [EObject current=null] : ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? ) ;
    public final EObject ruleAbortCaseSingle() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2878:6: ( ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2879:1: ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2879:1: ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2879:2: 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )?
            {
            match(input,46,FOLLOW_46_in_ruleAbortCaseSingle6445); 

                    createLeafNode(grammarAccess.getAbortCaseSingleAccess().getCaseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2883:1: (lv_delay_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2886:6: lv_delay_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortCaseSingleAccess().getDelayDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleAbortCaseSingle6479);
            lv_delay_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortCaseSingleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2904:2: ( 'do' (lv_statement_3= ruleStatement ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2904:3: 'do' (lv_statement_3= ruleStatement )
                    {
                    match(input,45,FOLLOW_45_in_ruleAbortCaseSingle6493); 

                            createLeafNode(grammarAccess.getAbortCaseSingleAccess().getDoKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2908:1: (lv_statement_3= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2911:6: lv_statement_3= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortCaseSingleAccess().getStatementStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleAbortCaseSingle6527);
                    lv_statement_3=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortCaseSingleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbortCaseSingle


    // $ANTLR start entryRuleAwait
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2936:1: entryRuleAwait returns [EObject current=null] : iv_ruleAwait= ruleAwait EOF ;
    public final EObject entryRuleAwait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwait = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2936:47: (iv_ruleAwait= ruleAwait EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2937:2: iv_ruleAwait= ruleAwait EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwait_in_entryRuleAwait6566);
            iv_ruleAwait=ruleAwait();
            _fsp--;

             current =iv_ruleAwait; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwait6576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwait


    // $ANTLR start ruleAwait
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2944:1: ruleAwait returns [EObject current=null] : ( 'await' (lv_body_1= ruleAwaitBody ) ) ;
    public final EObject ruleAwait() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2949:6: ( ( 'await' (lv_body_1= ruleAwaitBody ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2950:1: ( 'await' (lv_body_1= ruleAwaitBody ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2950:1: ( 'await' (lv_body_1= ruleAwaitBody ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2950:2: 'await' (lv_body_1= ruleAwaitBody )
            {
            match(input,47,FOLLOW_47_in_ruleAwait6610); 

                    createLeafNode(grammarAccess.getAwaitAccess().getAwaitKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2954:1: (lv_body_1= ruleAwaitBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2957:6: lv_body_1= ruleAwaitBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitAccess().getBodyAwaitBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAwaitBody_in_ruleAwait6644);
            lv_body_1=ruleAwaitBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_1, "AwaitBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAwait


    // $ANTLR start entryRuleAwaitBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2982:1: entryRuleAwaitBody returns [EObject current=null] : iv_ruleAwaitBody= ruleAwaitBody EOF ;
    public final EObject entryRuleAwaitBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwaitBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2982:51: (iv_ruleAwaitBody= ruleAwaitBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2983:2: iv_ruleAwaitBody= ruleAwaitBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitBody_in_entryRuleAwaitBody6681);
            iv_ruleAwaitBody=ruleAwaitBody();
            _fsp--;

             current =iv_ruleAwaitBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitBody6691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitBody


    // $ANTLR start ruleAwaitBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2990:1: ruleAwaitBody returns [EObject current=null] : (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase ) ;
    public final EObject ruleAwaitBody() throws RecognitionException {
        EObject current = null;

        EObject this_AwaitInstance_0 = null;

        EObject this_AwaitCase_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2995:6: ( (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2996:1: (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2996:1: (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ESTERELID||(LA45_0>=RULE_INT && LA45_0<=RULE_BOOLEAN)||(LA45_0>=33 && LA45_0<=34)||LA45_0==36||LA45_0==40||LA45_0==69||(LA45_0>=78 && LA45_0<=92)) ) {
                alt45=1;
            }
            else if ( (LA45_0==46) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2996:1: (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:2997:5: this_AwaitInstance_0= ruleAwaitInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAwaitBodyAccess().getAwaitInstanceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwaitInstance_in_ruleAwaitBody6738);
                    this_AwaitInstance_0=ruleAwaitInstance();
                    _fsp--;

                     
                            current = this_AwaitInstance_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3007:5: this_AwaitCase_1= ruleAwaitCase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAwaitBodyAccess().getAwaitCaseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwaitCase_in_ruleAwaitBody6765);
                    this_AwaitCase_1=ruleAwaitCase();
                    _fsp--;

                     
                            current = this_AwaitCase_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAwaitBody


    // $ANTLR start entryRuleAwaitEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3022:1: entryRuleAwaitEnd returns [String current=null] : iv_ruleAwaitEnd= ruleAwaitEnd EOF ;
    public final String entryRuleAwaitEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAwaitEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3022:49: (iv_ruleAwaitEnd= ruleAwaitEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3023:2: iv_ruleAwaitEnd= ruleAwaitEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitEnd_in_entryRuleAwaitEnd6798);
            iv_ruleAwaitEnd=ruleAwaitEnd();
            _fsp--;

             current =iv_ruleAwaitEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitEnd6809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitEnd


    // $ANTLR start ruleAwaitEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3030:1: ruleAwaitEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' (kw= 'await' )? ) ;
    public final AntlrDatatypeRuleToken ruleAwaitEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3036:6: ( (kw= 'end' (kw= 'await' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3037:1: (kw= 'end' (kw= 'await' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3037:1: (kw= 'end' (kw= 'await' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3038:2: kw= 'end' (kw= 'await' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleAwaitEnd6847); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getAwaitEndAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3043:1: (kw= 'await' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3044:2: kw= 'await'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleAwaitEnd6861); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAwaitEndAccess().getAwaitKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAwaitEnd


    // $ANTLR start entryRuleAwaitInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3057:1: entryRuleAwaitInstance returns [EObject current=null] : iv_ruleAwaitInstance= ruleAwaitInstance EOF ;
    public final EObject entryRuleAwaitInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwaitInstance = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3057:55: (iv_ruleAwaitInstance= ruleAwaitInstance EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3058:2: iv_ruleAwaitInstance= ruleAwaitInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitInstance_in_entryRuleAwaitInstance6901);
            iv_ruleAwaitInstance=ruleAwaitInstance();
            _fsp--;

             current =iv_ruleAwaitInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitInstance6911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitInstance


    // $ANTLR start ruleAwaitInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3065:1: ruleAwaitInstance returns [EObject current=null] : (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? ) ;
    public final EObject ruleAwaitInstance() throws RecognitionException {
        EObject current = null;

        EObject this_DelayExpr_0 = null;

        EObject lv_statement_2 = null;

        AntlrDatatypeRuleToken lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3070:6: ( (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3071:1: (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3071:1: (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3072:5: this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAwaitInstanceAccess().getDelayExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleAwaitInstance6958);
            this_DelayExpr_0=ruleDelayExpr();
            _fsp--;

             
                    current = this_DelayExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3080:1: ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3080:2: 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd )
                    {
                    match(input,45,FOLLOW_45_in_ruleAwaitInstance6967); 

                            createLeafNode(grammarAccess.getAwaitInstanceAccess().getDoKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3084:1: (lv_statement_2= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3087:6: lv_statement_2= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAwaitInstanceAccess().getStatementStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleAwaitInstance7001);
                    lv_statement_2=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAwaitInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3105:2: (lv_end_3= ruleAwaitEnd )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3108:6: lv_end_3= ruleAwaitEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAwaitInstanceAccess().getEndAwaitEndParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAwaitEnd_in_ruleAwaitInstance7039);
                    lv_end_3=ruleAwaitEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAwaitInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "AwaitEnd", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAwaitInstance


    // $ANTLR start entryRuleAwaitCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3133:1: entryRuleAwaitCase returns [EObject current=null] : iv_ruleAwaitCase= ruleAwaitCase EOF ;
    public final EObject entryRuleAwaitCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwaitCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3133:51: (iv_ruleAwaitCase= ruleAwaitCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3134:2: iv_ruleAwaitCase= ruleAwaitCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitCase_in_entryRuleAwaitCase7078);
            iv_ruleAwaitCase=ruleAwaitCase();
            _fsp--;

             current =iv_ruleAwaitCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitCase7088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitCase


    // $ANTLR start ruleAwaitCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3141:1: ruleAwaitCase returns [EObject current=null] : ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) ) ;
    public final EObject ruleAwaitCase() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0 = null;

        EObject lv_cases_1 = null;

        AntlrDatatypeRuleToken lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3146:6: ( ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3147:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3147:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3147:2: (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3147:2: (lv_cases_0= ruleAbortCaseSingle )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3150:6: lv_cases_0= ruleAbortCaseSingle
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitCaseAccess().getCasesAbortCaseSingleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase7147);
            lv_cases_0=ruleAbortCaseSingle();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "cases", lv_cases_0, "AbortCaseSingle", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3168:2: (lv_cases_1= ruleAbortCaseSingle )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==46) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3171:6: lv_cases_1= ruleAbortCaseSingle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAwaitCaseAccess().getCasesAbortCaseSingleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase7185);
            	    lv_cases_1=ruleAbortCaseSingle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAwaitCaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "cases", lv_cases_1, "AbortCaseSingle", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3189:3: (lv_end_2= ruleAwaitEnd )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3192:6: lv_end_2= ruleAwaitEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitCaseAccess().getEndAwaitEndParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAwaitEnd_in_ruleAwaitCase7224);
            lv_end_2=ruleAwaitEnd();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "end", lv_end_2, "AwaitEnd", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAwaitCase


    // $ANTLR start entryRuleDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3217:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3217:44: (iv_ruleDo= ruleDo EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3218:2: iv_ruleDo= ruleDo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoRule(), currentNode); 
            pushFollow(FOLLOW_ruleDo_in_entryRuleDo7261);
            iv_ruleDo=ruleDo();
            _fsp--;

             current =iv_ruleDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo7271); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDo


    // $ANTLR start ruleDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3225:1: ruleDo returns [EObject current=null] : ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;

        EObject lv_end_2 = null;

        EObject lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3230:6: ( ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3231:1: ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3231:1: ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3231:2: 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) )
            {
            match(input,45,FOLLOW_45_in_ruleDo7305); 

                    createLeafNode(grammarAccess.getDoAccess().getDoKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3235:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3238:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleDo7339);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3256:2: ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            else if ( (LA49_0==49) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3256:2: ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3256:3: (lv_end_2= ruleDoUpto )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3256:3: (lv_end_2= ruleDoUpto )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3259:6: lv_end_2= ruleDoUpto
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoAccess().getEndDoUptoParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoUpto_in_ruleDo7378);
                    lv_end_2=ruleDoUpto();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_2, "DoUpto", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3278:6: (lv_end_3= ruleDoWatching )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3278:6: (lv_end_3= ruleDoWatching )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3281:6: lv_end_3= ruleDoWatching
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoAccess().getEndDoWatchingParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoWatching_in_ruleDo7422);
                    lv_end_3=ruleDoWatching();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "DoWatching", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDo


    // $ANTLR start entryRuleDoUpto
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3306:1: entryRuleDoUpto returns [EObject current=null] : iv_ruleDoUpto= ruleDoUpto EOF ;
    public final EObject entryRuleDoUpto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoUpto = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3306:48: (iv_ruleDoUpto= ruleDoUpto EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3307:2: iv_ruleDoUpto= ruleDoUpto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoUptoRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoUpto_in_entryRuleDoUpto7460);
            iv_ruleDoUpto=ruleDoUpto();
            _fsp--;

             current =iv_ruleDoUpto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoUpto7470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoUpto


    // $ANTLR start ruleDoUpto
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3314:1: ruleDoUpto returns [EObject current=null] : ( 'upto' (lv_expr_1= ruleDelayExpr ) ) ;
    public final EObject ruleDoUpto() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3319:6: ( ( 'upto' (lv_expr_1= ruleDelayExpr ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3320:1: ( 'upto' (lv_expr_1= ruleDelayExpr ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3320:1: ( 'upto' (lv_expr_1= ruleDelayExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3320:2: 'upto' (lv_expr_1= ruleDelayExpr )
            {
            match(input,48,FOLLOW_48_in_ruleDoUpto7504); 

                    createLeafNode(grammarAccess.getDoUptoAccess().getUptoKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3324:1: (lv_expr_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3327:6: lv_expr_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoUptoAccess().getExprDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleDoUpto7538);
            lv_expr_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoUptoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoUpto


    // $ANTLR start entryRuleDoWatching
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3352:1: entryRuleDoWatching returns [EObject current=null] : iv_ruleDoWatching= ruleDoWatching EOF ;
    public final EObject entryRuleDoWatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWatching = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3352:52: (iv_ruleDoWatching= ruleDoWatching EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3353:2: iv_ruleDoWatching= ruleDoWatching EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoWatchingRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoWatching_in_entryRuleDoWatching7575);
            iv_ruleDoWatching=ruleDoWatching();
            _fsp--;

             current =iv_ruleDoWatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWatching7585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoWatching


    // $ANTLR start ruleDoWatching
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3360:1: ruleDoWatching returns [EObject current=null] : ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? ) ;
    public final EObject ruleDoWatching() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_1 = null;

        EObject lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3365:6: ( ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3366:1: ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3366:1: ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3366:2: 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )?
            {
            match(input,49,FOLLOW_49_in_ruleDoWatching7619); 

                    createLeafNode(grammarAccess.getDoWatchingAccess().getWatchingKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3370:1: (lv_delay_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3373:6: lv_delay_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWatchingAccess().getDelayDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleDoWatching7653);
            lv_delay_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoWatchingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3391:2: (lv_end_2= ruleDoWatchingEnd )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3394:6: lv_end_2= ruleDoWatchingEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoWatchingAccess().getEndDoWatchingEndParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoWatchingEnd_in_ruleDoWatching7691);
                    lv_end_2=ruleDoWatchingEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoWatchingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_2, "DoWatchingEnd", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoWatching


    // $ANTLR start entryRuleDoWatchingEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3419:1: entryRuleDoWatchingEnd returns [EObject current=null] : iv_ruleDoWatchingEnd= ruleDoWatchingEnd EOF ;
    public final EObject entryRuleDoWatchingEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWatchingEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3419:55: (iv_ruleDoWatchingEnd= ruleDoWatchingEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3420:2: iv_ruleDoWatchingEnd= ruleDoWatchingEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoWatchingEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoWatchingEnd_in_entryRuleDoWatchingEnd7729);
            iv_ruleDoWatchingEnd=ruleDoWatchingEnd();
            _fsp--;

             current =iv_ruleDoWatchingEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWatchingEnd7739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoWatchingEnd


    // $ANTLR start ruleDoWatchingEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3427:1: ruleDoWatchingEnd returns [EObject current=null] : ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? ) ;
    public final EObject ruleDoWatchingEnd() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3432:6: ( ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3433:1: ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3433:1: ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3433:2: 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )?
            {
            match(input,50,FOLLOW_50_in_ruleDoWatchingEnd7773); 

                    createLeafNode(grammarAccess.getDoWatchingEndAccess().getTimeoutKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3437:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3440:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWatchingEndAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleDoWatchingEnd7807);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoWatchingEndRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleDoWatchingEnd7820); 

                    createLeafNode(grammarAccess.getDoWatchingEndAccess().getEndKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3462:1: ( 'timeout' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3462:2: 'timeout'
                    {
                    match(input,50,FOLLOW_50_in_ruleDoWatchingEnd7830); 

                            createLeafNode(grammarAccess.getDoWatchingEndAccess().getTimeoutKeyword_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoWatchingEnd


    // $ANTLR start entryRuleEmit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3473:1: entryRuleEmit returns [EObject current=null] : iv_ruleEmit= ruleEmit EOF ;
    public final EObject entryRuleEmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmit = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3473:46: (iv_ruleEmit= ruleEmit EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3474:2: iv_ruleEmit= ruleEmit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmitRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmit_in_entryRuleEmit7865);
            iv_ruleEmit=ruleEmit();
            _fsp--;

             current =iv_ruleEmit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmit7875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmit


    // $ANTLR start ruleEmit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3481:1: ruleEmit returns [EObject current=null] : ( 'emit' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_expr_4= ruleDataExpr ) ')' )? ) ;
    public final EObject ruleEmit() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tick_2 = null;

        EObject lv_expr_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3486:6: ( ( 'emit' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_expr_4= ruleDataExpr ) ')' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3487:1: ( 'emit' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_expr_4= ruleDataExpr ) ')' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3487:1: ( 'emit' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_expr_4= ruleDataExpr ) ')' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3487:2: 'emit' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_expr_4= ruleDataExpr ) ')' )?
            {
            match(input,51,FOLLOW_51_in_ruleEmit7909); 

                    createLeafNode(grammarAccess.getEmitAccess().getEmitKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3491:1: ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ESTERELID) ) {
                alt52=1;
            }
            else if ( (LA52_0==92) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3491:1: ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3491:2: ( RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3491:2: ( RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3494:3: RULE_ESTERELID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleEmit7932); 

                    		createLeafNode(grammarAccess.getEmitAccess().getSignalSignalCrossReference_1_0_0(), "signal"); 
                    	

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3508:6: (lv_tick_2= ruleTick )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3508:6: (lv_tick_2= ruleTick )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3511:6: lv_tick_2= ruleTick
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmitAccess().getTickTickParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTick_in_ruleEmit7975);
                    lv_tick_2=ruleTick();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tick", lv_tick_2, "Tick", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3529:3: ( '(' (lv_expr_4= ruleDataExpr ) ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3529:4: '(' (lv_expr_4= ruleDataExpr ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleEmit7990); 

                            createLeafNode(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3533:1: (lv_expr_4= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3536:6: lv_expr_4= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmitAccess().getExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleEmit8024);
                    lv_expr_4=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_4, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,37,FOLLOW_37_in_ruleEmit8037); 

                            createLeafNode(grammarAccess.getEmitAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmit


    // $ANTLR start entryRuleEveryDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3565:1: entryRuleEveryDo returns [EObject current=null] : iv_ruleEveryDo= ruleEveryDo EOF ;
    public final EObject entryRuleEveryDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEveryDo = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3565:49: (iv_ruleEveryDo= ruleEveryDo EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3566:2: iv_ruleEveryDo= ruleEveryDo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEveryDoRule(), currentNode); 
            pushFollow(FOLLOW_ruleEveryDo_in_entryRuleEveryDo8072);
            iv_ruleEveryDo=ruleEveryDo();
            _fsp--;

             current =iv_ruleEveryDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEveryDo8082); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEveryDo


    // $ANTLR start ruleEveryDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3573:1: ruleEveryDo returns [EObject current=null] : ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? ) ;
    public final EObject ruleEveryDo() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3578:6: ( ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3579:1: ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3579:1: ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3579:2: 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )?
            {
            match(input,52,FOLLOW_52_in_ruleEveryDo8116); 

                    createLeafNode(grammarAccess.getEveryDoAccess().getEveryKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3583:1: (lv_delay_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3586:6: lv_delay_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEveryDoAccess().getDelayDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleEveryDo8150);
            lv_delay_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEveryDoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,45,FOLLOW_45_in_ruleEveryDo8163); 

                    createLeafNode(grammarAccess.getEveryDoAccess().getDoKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3608:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3611:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEveryDoAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleEveryDo8197);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEveryDoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleEveryDo8210); 

                    createLeafNode(grammarAccess.getEveryDoAccess().getEndKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3633:1: ( 'every' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==52) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3633:2: 'every'
                    {
                    match(input,52,FOLLOW_52_in_ruleEveryDo8220); 

                            createLeafNode(grammarAccess.getEveryDoAccess().getEveryKeyword_5(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEveryDo


    // $ANTLR start entryRuleExit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3644:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3644:46: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3645:2: iv_ruleExit= ruleExit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExitRule(), currentNode); 
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit8255);
            iv_ruleExit=ruleExit();
            _fsp--;

             current =iv_ruleExit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit8265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExit


    // $ANTLR start ruleExit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3652:1: ruleExit returns [EObject current=null] : ( 'exit' ( RULE_ESTERELID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        EObject lv_dataExpr_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3657:6: ( ( 'exit' ( RULE_ESTERELID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3658:1: ( 'exit' ( RULE_ESTERELID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3658:1: ( 'exit' ( RULE_ESTERELID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3658:2: 'exit' ( RULE_ESTERELID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )?
            {
            match(input,53,FOLLOW_53_in_ruleExit8299); 

                    createLeafNode(grammarAccess.getExitAccess().getExitKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3662:1: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3665:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleExit8321); 

            		createLeafNode(grammarAccess.getExitAccess().getTrapTrapDeclCrossReference_1_0(), "trap"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3678:2: ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3678:3: '(' (lv_dataExpr_3= ruleDataExpr ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleExit8334); 

                            createLeafNode(grammarAccess.getExitAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3682:1: (lv_dataExpr_3= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3685:6: lv_dataExpr_3= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExitAccess().getDataExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleExit8368);
                    lv_dataExpr_3=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "dataExpr", lv_dataExpr_3, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,37,FOLLOW_37_in_ruleExit8381); 

                            createLeafNode(grammarAccess.getExitAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExit


    // $ANTLR start entryRuleHalt
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3714:1: entryRuleHalt returns [EObject current=null] : iv_ruleHalt= ruleHalt EOF ;
    public final EObject entryRuleHalt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHalt = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3714:46: (iv_ruleHalt= ruleHalt EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3715:2: iv_ruleHalt= ruleHalt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHaltRule(), currentNode); 
            pushFollow(FOLLOW_ruleHalt_in_entryRuleHalt8416);
            iv_ruleHalt=ruleHalt();
            _fsp--;

             current =iv_ruleHalt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHalt8426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHalt


    // $ANTLR start ruleHalt
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3722:1: ruleHalt returns [EObject current=null] : ( 'halt' () ) ;
    public final EObject ruleHalt() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3727:6: ( ( 'halt' () ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3728:1: ( 'halt' () )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3728:1: ( 'halt' () )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3728:2: 'halt' ()
            {
            match(input,54,FOLLOW_54_in_ruleHalt8460); 

                    createLeafNode(grammarAccess.getHaltAccess().getHaltKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3732:1: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3733:5: 
            {
             
                    temp=factory.create(grammarAccess.getHaltAccess().getHaltAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getHaltAccess().getHaltAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleHalt


    // $ANTLR start entryRuleIfTest
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3750:1: entryRuleIfTest returns [EObject current=null] : iv_ruleIfTest= ruleIfTest EOF ;
    public final EObject entryRuleIfTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfTest = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3750:48: (iv_ruleIfTest= ruleIfTest EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3751:2: iv_ruleIfTest= ruleIfTest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfTestRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfTest_in_entryRuleIfTest8502);
            iv_ruleIfTest=ruleIfTest();
            _fsp--;

             current =iv_ruleIfTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfTest8512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfTest


    // $ANTLR start ruleIfTest
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3758:1: ruleIfTest returns [EObject current=null] : ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? ) ;
    public final EObject ruleIfTest() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1 = null;

        EObject lv_then_2 = null;

        EObject lv_elseIf_3 = null;

        EObject lv_else_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3763:6: ( ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3764:1: ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3764:1: ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3764:2: 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )?
            {
            match(input,55,FOLLOW_55_in_ruleIfTest8546); 

                    createLeafNode(grammarAccess.getIfTestAccess().getIfKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3768:1: (lv_expr_1= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3771:6: lv_expr_1= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getExprDataExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleIfTest8580);
            lv_expr_1=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3789:2: (lv_then_2= ruleThenPart )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==57) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3792:6: lv_then_2= ruleThenPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getThenThenPartParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleThenPart_in_ruleIfTest8618);
                    lv_then_2=ruleThenPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "then", lv_then_2, "ThenPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3810:3: (lv_elseIf_3= ruleElsIfPart )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3813:6: lv_elseIf_3= ruleElsIfPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getElseIfElsIfPartParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElsIfPart_in_ruleIfTest8657);
                    lv_elseIf_3=ruleElsIfPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elseIf", lv_elseIf_3, "ElsIfPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3831:3: (lv_else_4= ruleElsePart )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3834:6: lv_else_4= ruleElsePart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getElseElsePartParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElsePart_in_ruleIfTest8696);
                    lv_else_4=ruleElsePart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "else", lv_else_4, "ElsePart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleIfTest8710); 

                    createLeafNode(grammarAccess.getIfTestAccess().getEndKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3856:1: ( 'if' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==55) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3856:2: 'if'
                    {
                    match(input,55,FOLLOW_55_in_ruleIfTest8720); 

                            createLeafNode(grammarAccess.getIfTestAccess().getIfKeyword_6(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfTest


    // $ANTLR start entryRuleElsIfPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3867:1: entryRuleElsIfPart returns [EObject current=null] : iv_ruleElsIfPart= ruleElsIfPart EOF ;
    public final EObject entryRuleElsIfPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsIfPart = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3867:51: (iv_ruleElsIfPart= ruleElsIfPart EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3868:2: iv_ruleElsIfPart= ruleElsIfPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElsIfPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleElsIfPart_in_entryRuleElsIfPart8755);
            iv_ruleElsIfPart=ruleElsIfPart();
            _fsp--;

             current =iv_ruleElsIfPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElsIfPart8765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElsIfPart


    // $ANTLR start ruleElsIfPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3875:1: ruleElsIfPart returns [EObject current=null] : ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* ) ;
    public final EObject ruleElsIfPart() throws RecognitionException {
        EObject current = null;

        EObject lv_elsif_0 = null;

        EObject lv_elsif_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3880:6: ( ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3881:1: ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3881:1: ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3881:2: (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3881:2: (lv_elsif_0= ruleElsIf )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3884:6: lv_elsif_0= ruleElsIf
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElsIfPartAccess().getElsifElsIfParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElsIf_in_ruleElsIfPart8824);
            lv_elsif_0=ruleElsIf();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElsIfPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "elsif", lv_elsif_0, "ElsIf", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3902:2: (lv_elsif_1= ruleElsIf )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==56) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3905:6: lv_elsif_1= ruleElsIf
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getElsIfPartAccess().getElsifElsIfParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElsIf_in_ruleElsIfPart8862);
            	    lv_elsif_1=ruleElsIf();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getElsIfPartRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elsif", lv_elsif_1, "ElsIf", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElsIfPart


    // $ANTLR start entryRuleElsIf
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3930:1: entryRuleElsIf returns [EObject current=null] : iv_ruleElsIf= ruleElsIf EOF ;
    public final EObject entryRuleElsIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsIf = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3930:47: (iv_ruleElsIf= ruleElsIf EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3931:2: iv_ruleElsIf= ruleElsIf EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElsIfRule(), currentNode); 
            pushFollow(FOLLOW_ruleElsIf_in_entryRuleElsIf8900);
            iv_ruleElsIf=ruleElsIf();
            _fsp--;

             current =iv_ruleElsIf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElsIf8910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElsIf


    // $ANTLR start ruleElsIf
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3938:1: ruleElsIf returns [EObject current=null] : ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? ) ;
    public final EObject ruleElsIf() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1 = null;

        EObject lv_then_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3943:6: ( ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3944:1: ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3944:1: ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3944:2: 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )?
            {
            match(input,56,FOLLOW_56_in_ruleElsIf8944); 

                    createLeafNode(grammarAccess.getElsIfAccess().getElsifKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3948:1: (lv_expr_1= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3951:6: lv_expr_1= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElsIfAccess().getExprDataExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleElsIf8978);
            lv_expr_1=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElsIfRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3969:2: (lv_then_2= ruleThenPart )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==57) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3972:6: lv_then_2= ruleThenPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getElsIfAccess().getThenThenPartParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleThenPart_in_ruleElsIf9016);
                    lv_then_2=ruleThenPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElsIfRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "then", lv_then_2, "ThenPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElsIf


    // $ANTLR start entryRuleThenPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3997:1: entryRuleThenPart returns [EObject current=null] : iv_ruleThenPart= ruleThenPart EOF ;
    public final EObject entryRuleThenPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenPart = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3997:50: (iv_ruleThenPart= ruleThenPart EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:3998:2: iv_ruleThenPart= ruleThenPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleThenPart_in_entryRuleThenPart9054);
            iv_ruleThenPart=ruleThenPart();
            _fsp--;

             current =iv_ruleThenPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenPart9064); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleThenPart


    // $ANTLR start ruleThenPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4005:1: ruleThenPart returns [EObject current=null] : ( 'then' (lv_statement_1= ruleStatement ) ) ;
    public final EObject ruleThenPart() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4010:6: ( ( 'then' (lv_statement_1= ruleStatement ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4011:1: ( 'then' (lv_statement_1= ruleStatement ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4011:1: ( 'then' (lv_statement_1= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4011:2: 'then' (lv_statement_1= ruleStatement )
            {
            match(input,57,FOLLOW_57_in_ruleThenPart9098); 

                    createLeafNode(grammarAccess.getThenPartAccess().getThenKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4015:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4018:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getThenPartAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleThenPart9132);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getThenPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleThenPart


    // $ANTLR start entryRuleElsePart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4043:1: entryRuleElsePart returns [EObject current=null] : iv_ruleElsePart= ruleElsePart EOF ;
    public final EObject entryRuleElsePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsePart = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4043:50: (iv_ruleElsePart= ruleElsePart EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4044:2: iv_ruleElsePart= ruleElsePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElsePartRule(), currentNode); 
            pushFollow(FOLLOW_ruleElsePart_in_entryRuleElsePart9169);
            iv_ruleElsePart=ruleElsePart();
            _fsp--;

             current =iv_ruleElsePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElsePart9179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElsePart


    // $ANTLR start ruleElsePart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4051:1: ruleElsePart returns [EObject current=null] : ( 'else' (lv_statement_1= ruleStatement ) ) ;
    public final EObject ruleElsePart() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4056:6: ( ( 'else' (lv_statement_1= ruleStatement ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4057:1: ( 'else' (lv_statement_1= ruleStatement ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4057:1: ( 'else' (lv_statement_1= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4057:2: 'else' (lv_statement_1= ruleStatement )
            {
            match(input,58,FOLLOW_58_in_ruleElsePart9213); 

                    createLeafNode(grammarAccess.getElsePartAccess().getElseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4061:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4064:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElsePartAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleElsePart9247);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElsePartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElsePart


    // $ANTLR start entryRuleLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4089:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4089:46: (iv_ruleLoop= ruleLoop EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4090:2: iv_ruleLoop= ruleLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop9284);
            iv_ruleLoop=ruleLoop();
            _fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop9294); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoop


    // $ANTLR start ruleLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4097:1: ruleLoop returns [EObject current=null] : ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1 = null;

        EObject lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4102:6: ( ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4103:1: ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4103:1: ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4103:2: 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) )
            {
            match(input,59,FOLLOW_59_in_ruleLoop9328); 

                    createLeafNode(grammarAccess.getLoopAccess().getLoopKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4107:1: (lv_body_1= ruleLoopBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4110:6: lv_body_1= ruleLoopBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getBodyLoopBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLoopBody_in_ruleLoop9362);
            lv_body_1=ruleLoopBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_1, "LoopBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4128:2: ( ruleEndLoop | (lv_end_3= ruleLoopEach ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==19) ) {
                alt62=1;
            }
            else if ( (LA62_0==60) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4128:2: ( ruleEndLoop | (lv_end_3= ruleLoopEach ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4128:3: ruleEndLoop
                    {
                    pushFollow(FOLLOW_ruleEndLoop_in_ruleLoop9376);
                    ruleEndLoop();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4129:6: (lv_end_3= ruleLoopEach )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4129:6: (lv_end_3= ruleLoopEach )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4132:6: lv_end_3= ruleLoopEach
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getEndLoopEachParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLoopEach_in_ruleLoop9408);
                    lv_end_3=ruleLoopEach();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "LoopEach", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoop


    // $ANTLR start entryRuleEndLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4157:1: entryRuleEndLoop returns [String current=null] : iv_ruleEndLoop= ruleEndLoop EOF ;
    public final String entryRuleEndLoop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndLoop = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4157:48: (iv_ruleEndLoop= ruleEndLoop EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4158:2: iv_ruleEndLoop= ruleEndLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEndLoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleEndLoop_in_entryRuleEndLoop9447);
            iv_ruleEndLoop=ruleEndLoop();
            _fsp--;

             current =iv_ruleEndLoop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndLoop9458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEndLoop


    // $ANTLR start ruleEndLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4165:1: ruleEndLoop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' (kw= 'loop' )? ) ;
    public final AntlrDatatypeRuleToken ruleEndLoop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4171:6: ( (kw= 'end' (kw= 'loop' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4172:1: (kw= 'end' (kw= 'loop' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4172:1: (kw= 'end' (kw= 'loop' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4173:2: kw= 'end' (kw= 'loop' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleEndLoop9496); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getEndLoopAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4178:1: (kw= 'loop' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==59) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4179:2: kw= 'loop'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_ruleEndLoop9510); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndLoopAccess().getLoopKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEndLoop


    // $ANTLR start entryRuleLoopEach
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4192:1: entryRuleLoopEach returns [EObject current=null] : iv_ruleLoopEach= ruleLoopEach EOF ;
    public final EObject entryRuleLoopEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopEach = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4192:50: (iv_ruleLoopEach= ruleLoopEach EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4193:2: iv_ruleLoopEach= ruleLoopEach EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopEachRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopEach_in_entryRuleLoopEach9550);
            iv_ruleLoopEach=ruleLoopEach();
            _fsp--;

             current =iv_ruleLoopEach; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopEach9560); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopEach


    // $ANTLR start ruleLoopEach
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4200:1: ruleLoopEach returns [EObject current=null] : ( 'each' this_LoopDelay_1= ruleLoopDelay ) ;
    public final EObject ruleLoopEach() throws RecognitionException {
        EObject current = null;

        EObject this_LoopDelay_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4205:6: ( ( 'each' this_LoopDelay_1= ruleLoopDelay ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4206:1: ( 'each' this_LoopDelay_1= ruleLoopDelay )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4206:1: ( 'each' this_LoopDelay_1= ruleLoopDelay )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4206:2: 'each' this_LoopDelay_1= ruleLoopDelay
            {
            match(input,60,FOLLOW_60_in_ruleLoopEach9594); 

                    createLeafNode(grammarAccess.getLoopEachAccess().getEachKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getLoopEachAccess().getLoopDelayParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleLoopDelay_in_ruleLoopEach9616);
            this_LoopDelay_1=ruleLoopDelay();
            _fsp--;

             
                    current = this_LoopDelay_1; 
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoopEach


    // $ANTLR start entryRuleLoopDelay
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4226:1: entryRuleLoopDelay returns [EObject current=null] : iv_ruleLoopDelay= ruleLoopDelay EOF ;
    public final EObject entryRuleLoopDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopDelay = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4226:51: (iv_ruleLoopDelay= ruleLoopDelay EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4227:2: iv_ruleLoopDelay= ruleLoopDelay EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopDelayRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopDelay_in_entryRuleLoopDelay9648);
            iv_ruleLoopDelay=ruleLoopDelay();
            _fsp--;

             current =iv_ruleLoopDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopDelay9658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopDelay


    // $ANTLR start ruleLoopDelay
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4234:1: ruleLoopDelay returns [EObject current=null] : (lv_delay_0= ruleDelayExpr ) ;
    public final EObject ruleLoopDelay() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4239:6: ( (lv_delay_0= ruleDelayExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4240:1: (lv_delay_0= ruleDelayExpr )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4240:1: (lv_delay_0= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4243:6: lv_delay_0= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopDelayAccess().getDelayDelayExprParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleLoopDelay9716);
            lv_delay_0=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopDelayRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_0, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoopDelay


    // $ANTLR start entryRuleLoopBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4268:1: entryRuleLoopBody returns [EObject current=null] : iv_ruleLoopBody= ruleLoopBody EOF ;
    public final EObject entryRuleLoopBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4268:50: (iv_ruleLoopBody= ruleLoopBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4269:2: iv_ruleLoopBody= ruleLoopBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopBody_in_entryRuleLoopBody9752);
            iv_ruleLoopBody=ruleLoopBody();
            _fsp--;

             current =iv_ruleLoopBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopBody9762); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopBody


    // $ANTLR start ruleLoopBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4276:1: ruleLoopBody returns [EObject current=null] : (lv_statement_0= ruleStatement ) ;
    public final EObject ruleLoopBody() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4281:6: ( (lv_statement_0= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4282:1: (lv_statement_0= ruleStatement )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4282:1: (lv_statement_0= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4285:6: lv_statement_0= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopBodyAccess().getStatementStatementParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleLoopBody9820);
            lv_statement_0=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_0, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLoopBody


    // $ANTLR start entryRuleNothing
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4310:1: entryRuleNothing returns [EObject current=null] : iv_ruleNothing= ruleNothing EOF ;
    public final EObject entryRuleNothing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNothing = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4310:49: (iv_ruleNothing= ruleNothing EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4311:2: iv_ruleNothing= ruleNothing EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNothingRule(), currentNode); 
            pushFollow(FOLLOW_ruleNothing_in_entryRuleNothing9856);
            iv_ruleNothing=ruleNothing();
            _fsp--;

             current =iv_ruleNothing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNothing9866); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNothing


    // $ANTLR start ruleNothing
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4318:1: ruleNothing returns [EObject current=null] : ( 'nothing' () ) ;
    public final EObject ruleNothing() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4323:6: ( ( 'nothing' () ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4324:1: ( 'nothing' () )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4324:1: ( 'nothing' () )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4324:2: 'nothing' ()
            {
            match(input,61,FOLLOW_61_in_ruleNothing9900); 

                    createLeafNode(grammarAccess.getNothingAccess().getNothingKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4328:1: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4329:5: 
            {
             
                    temp=factory.create(grammarAccess.getNothingAccess().getNothingAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getNothingAccess().getNothingAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNothing


    // $ANTLR start entryRulePause
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4346:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4346:47: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4347:2: iv_rulePause= rulePause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPauseRule(), currentNode); 
            pushFollow(FOLLOW_rulePause_in_entryRulePause9942);
            iv_rulePause=rulePause();
            _fsp--;

             current =iv_rulePause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePause9952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePause


    // $ANTLR start rulePause
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4354:1: rulePause returns [EObject current=null] : ( 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4359:6: ( ( 'pause' () ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4360:1: ( 'pause' () )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4360:1: ( 'pause' () )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4360:2: 'pause' ()
            {
            match(input,62,FOLLOW_62_in_rulePause9986); 

                    createLeafNode(grammarAccess.getPauseAccess().getPauseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4364:1: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4365:5: 
            {
             
                    temp=factory.create(grammarAccess.getPauseAccess().getPauseAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPauseAccess().getPauseAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePause


    // $ANTLR start entryRulePresent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4382:1: entryRulePresent returns [EObject current=null] : iv_rulePresent= rulePresent EOF ;
    public final EObject entryRulePresent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4382:49: (iv_rulePresent= rulePresent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4383:2: iv_rulePresent= rulePresent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentRule(), currentNode); 
            pushFollow(FOLLOW_rulePresent_in_entryRulePresent10028);
            iv_rulePresent=rulePresent();
            _fsp--;

             current =iv_rulePresent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresent10038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresent


    // $ANTLR start rulePresent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4390:1: rulePresent returns [EObject current=null] : ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? ) ;
    public final EObject rulePresent() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1 = null;

        EObject lv_elsePart_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4395:6: ( ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4396:1: ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4396:1: ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4396:2: 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )?
            {
            match(input,63,FOLLOW_63_in_rulePresent10072); 

                    createLeafNode(grammarAccess.getPresentAccess().getPresentKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4400:1: (lv_body_1= rulePresentBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4403:6: lv_body_1= rulePresentBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getBodyPresentBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentBody_in_rulePresent10106);
            lv_body_1=rulePresentBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_1, "PresentBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4421:2: (lv_elsePart_2= ruleElsePart )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4424:6: lv_elsePart_2= ruleElsePart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getElsePartElsePartParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElsePart_in_rulePresent10144);
                    lv_elsePart_2=ruleElsePart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elsePart", lv_elsePart_2, "ElsePart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_rulePresent10158); 

                    createLeafNode(grammarAccess.getPresentAccess().getEndKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4446:1: ( 'present' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==63) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4446:2: 'present'
                    {
                    match(input,63,FOLLOW_63_in_rulePresent10168); 

                            createLeafNode(grammarAccess.getPresentAccess().getPresentKeyword_4(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresent


    // $ANTLR start entryRulePresentBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4457:1: entryRulePresentBody returns [EObject current=null] : iv_rulePresentBody= rulePresentBody EOF ;
    public final EObject entryRulePresentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4457:53: (iv_rulePresentBody= rulePresentBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4458:2: iv_rulePresentBody= rulePresentBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentBodyRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentBody_in_entryRulePresentBody10203);
            iv_rulePresentBody=rulePresentBody();
            _fsp--;

             current =iv_rulePresentBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentBody10213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentBody


    // $ANTLR start rulePresentBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4465:1: rulePresentBody returns [EObject current=null] : (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList ) ;
    public final EObject rulePresentBody() throws RecognitionException {
        EObject current = null;

        EObject this_PresentEventBody_0 = null;

        EObject this_PresentCaseList_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4470:6: ( (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4471:1: (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4471:1: (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ESTERELID||LA66_0==36||LA66_0==40||LA66_0==80) ) {
                alt66=1;
            }
            else if ( (LA66_0==46) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4471:1: (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4472:5: this_PresentEventBody_0= rulePresentEventBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPresentBodyAccess().getPresentEventBodyParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresentEventBody_in_rulePresentBody10260);
                    this_PresentEventBody_0=rulePresentEventBody();
                    _fsp--;

                     
                            current = this_PresentEventBody_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4482:5: this_PresentCaseList_1= rulePresentCaseList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPresentBodyAccess().getPresentCaseListParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresentCaseList_in_rulePresentBody10287);
                    this_PresentCaseList_1=rulePresentCaseList();
                    _fsp--;

                     
                            current = this_PresentCaseList_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresentBody


    // $ANTLR start entryRulePresentEventBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4497:1: entryRulePresentEventBody returns [EObject current=null] : iv_rulePresentEventBody= rulePresentEventBody EOF ;
    public final EObject entryRulePresentEventBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentEventBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4497:58: (iv_rulePresentEventBody= rulePresentEventBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4498:2: iv_rulePresentEventBody= rulePresentEventBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentEventBodyRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentEventBody_in_entryRulePresentEventBody10319);
            iv_rulePresentEventBody=rulePresentEventBody();
            _fsp--;

             current =iv_rulePresentEventBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentEventBody10329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentEventBody


    // $ANTLR start rulePresentEventBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4505:1: rulePresentEventBody returns [EObject current=null] : ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? ) ;
    public final EObject rulePresentEventBody() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0 = null;

        EObject lv_thenPart_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4510:6: ( ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4511:1: ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4511:1: ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4511:2: (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4511:2: (lv_event_0= rulePresentEvent )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4514:6: lv_event_0= rulePresentEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentEventBodyAccess().getEventPresentEventParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentEvent_in_rulePresentEventBody10388);
            lv_event_0=rulePresentEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentEventBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_0, "PresentEvent", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4532:2: (lv_thenPart_1= ruleThenPart )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==57) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4535:6: lv_thenPart_1= ruleThenPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentEventBodyAccess().getThenPartThenPartParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleThenPart_in_rulePresentEventBody10426);
                    lv_thenPart_1=ruleThenPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentEventBodyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "thenPart", lv_thenPart_1, "ThenPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresentEventBody


    // $ANTLR start entryRulePresentCaseList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4560:1: entryRulePresentCaseList returns [EObject current=null] : iv_rulePresentCaseList= rulePresentCaseList EOF ;
    public final EObject entryRulePresentCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentCaseList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4560:57: (iv_rulePresentCaseList= rulePresentCaseList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4561:2: iv_rulePresentCaseList= rulePresentCaseList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentCaseListRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentCaseList_in_entryRulePresentCaseList10464);
            iv_rulePresentCaseList=rulePresentCaseList();
            _fsp--;

             current =iv_rulePresentCaseList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentCaseList10474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentCaseList


    // $ANTLR start rulePresentCaseList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4568:1: rulePresentCaseList returns [EObject current=null] : ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* ) ;
    public final EObject rulePresentCaseList() throws RecognitionException {
        EObject current = null;

        EObject lv_case_0 = null;

        EObject lv_case_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4573:6: ( ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4574:1: ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4574:1: ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4574:2: (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4574:2: (lv_case_0= rulePresentCase )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4577:6: lv_case_0= rulePresentCase
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentCaseListAccess().getCasePresentCaseParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentCase_in_rulePresentCaseList10533);
            lv_case_0=rulePresentCase();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentCaseListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "case", lv_case_0, "PresentCase", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4595:2: (lv_case_1= rulePresentCase )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==46) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4598:6: lv_case_1= rulePresentCase
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentCaseListAccess().getCasePresentCaseParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePresentCase_in_rulePresentCaseList10571);
            	    lv_case_1=rulePresentCase();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentCaseListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "case", lv_case_1, "PresentCase", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresentCaseList


    // $ANTLR start entryRulePresentCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4623:1: entryRulePresentCase returns [EObject current=null] : iv_rulePresentCase= rulePresentCase EOF ;
    public final EObject entryRulePresentCase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4623:53: (iv_rulePresentCase= rulePresentCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4624:2: iv_rulePresentCase= rulePresentCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentCaseRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentCase_in_entryRulePresentCase10609);
            iv_rulePresentCase=rulePresentCase();
            _fsp--;

             current =iv_rulePresentCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentCase10619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentCase


    // $ANTLR start rulePresentCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4631:1: rulePresentCase returns [EObject current=null] : ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? ) ;
    public final EObject rulePresentCase() throws RecognitionException {
        EObject current = null;

        EObject lv_event_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4636:6: ( ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4637:1: ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4637:1: ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4637:2: 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )?
            {
            match(input,46,FOLLOW_46_in_rulePresentCase10653); 

                    createLeafNode(grammarAccess.getPresentCaseAccess().getCaseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4641:1: (lv_event_1= rulePresentEvent )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4644:6: lv_event_1= rulePresentEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentCaseAccess().getEventPresentEventParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentEvent_in_rulePresentCase10687);
            lv_event_1=rulePresentEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_1, "PresentEvent", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4662:2: ( 'do' (lv_statement_3= ruleStatement ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==45) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4662:3: 'do' (lv_statement_3= ruleStatement )
                    {
                    match(input,45,FOLLOW_45_in_rulePresentCase10701); 

                            createLeafNode(grammarAccess.getPresentCaseAccess().getDoKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4666:1: (lv_statement_3= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4669:6: lv_statement_3= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentCaseAccess().getStatementStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_rulePresentCase10735);
                    lv_statement_3=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentCaseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresentCase


    // $ANTLR start entryRulePresentEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4694:1: entryRulePresentEvent returns [EObject current=null] : iv_rulePresentEvent= rulePresentEvent EOF ;
    public final EObject entryRulePresentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentEvent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4694:54: (iv_rulePresentEvent= rulePresentEvent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4695:2: iv_rulePresentEvent= rulePresentEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentEventRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentEvent_in_entryRulePresentEvent10774);
            iv_rulePresentEvent=rulePresentEvent();
            _fsp--;

             current =iv_rulePresentEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentEvent10784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentEvent


    // $ANTLR start rulePresentEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4702:1: rulePresentEvent returns [EObject current=null] : ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) ) ;
    public final EObject rulePresentEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0 = null;

        EObject lv_expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4707:6: ( ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4708:1: ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4708:1: ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ESTERELID||LA70_0==36||LA70_0==80) ) {
                alt70=1;
            }
            else if ( (LA70_0==40) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4708:1: ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) )", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4708:2: (lv_expression_0= ruleSigExpr )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4708:2: (lv_expression_0= ruleSigExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4711:6: lv_expression_0= ruleSigExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentEventAccess().getExpressionSigExprParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExpr_in_rulePresentEvent10843);
                    lv_expression_0=ruleSigExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expression", lv_expression_0, "SigExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4730:6: ( '[' (lv_expression_2= ruleSigExpr ) ']' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4730:6: ( '[' (lv_expression_2= ruleSigExpr ) ']' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4730:7: '[' (lv_expression_2= ruleSigExpr ) ']'
                    {
                    match(input,40,FOLLOW_40_in_rulePresentEvent10863); 

                            createLeafNode(grammarAccess.getPresentEventAccess().getLeftSquareBracketKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4734:1: (lv_expression_2= ruleSigExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4737:6: lv_expression_2= ruleSigExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentEventAccess().getExpressionSigExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExpr_in_rulePresentEvent10897);
                    lv_expression_2=ruleSigExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expression", lv_expression_2, "SigExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,41,FOLLOW_41_in_rulePresentEvent10910); 

                            createLeafNode(grammarAccess.getPresentEventAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresentEvent


    // $ANTLR start entryRuleRepeat
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4766:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4766:48: (iv_ruleRepeat= ruleRepeat EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4767:2: iv_ruleRepeat= ruleRepeat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRepeatRule(), currentNode); 
            pushFollow(FOLLOW_ruleRepeat_in_entryRuleRepeat10944);
            iv_ruleRepeat=ruleRepeat();
            _fsp--;

             current =iv_ruleRepeat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeat10954); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRepeat


    // $ANTLR start ruleRepeat
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4774:1: ruleRepeat returns [EObject current=null] : ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token lv_positive_0=null;
        EObject lv_dataExpr_2 = null;

        EObject lv_statement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4779:6: ( ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4780:1: ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4780:1: ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4780:2: (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4780:2: (lv_positive_0= 'positive' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==64) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4782:6: lv_positive_0= 'positive'
                    {
                    lv_positive_0=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_ruleRepeat11000); 

                            createLeafNode(grammarAccess.getRepeatAccess().getPositivePositiveKeyword_0_0(), "positive"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRepeatRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "positive", true, "positive", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,65,FOLLOW_65_in_ruleRepeat11023); 

                    createLeafNode(grammarAccess.getRepeatAccess().getRepeatKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4805:1: (lv_dataExpr_2= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4808:6: lv_dataExpr_2= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRepeatAccess().getDataExprDataExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleRepeat11057);
            lv_dataExpr_2=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "dataExpr", lv_dataExpr_2, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,66,FOLLOW_66_in_ruleRepeat11070); 

                    createLeafNode(grammarAccess.getRepeatAccess().getTimesKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4830:1: (lv_statement_4= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4833:6: lv_statement_4= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRepeatAccess().getStatementStatementParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleRepeat11104);
            lv_statement_4=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_4, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleRepeat11117); 

                    createLeafNode(grammarAccess.getRepeatAccess().getEndKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4855:1: ( 'repeat' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==65) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4855:2: 'repeat'
                    {
                    match(input,65,FOLLOW_65_in_ruleRepeat11127); 

                            createLeafNode(grammarAccess.getRepeatAccess().getRepeatKeyword_6(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRepeat


    // $ANTLR start entryRuleRun
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4866:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4866:45: (iv_ruleRun= ruleRun EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4867:2: iv_ruleRun= ruleRun EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRunRule(), currentNode); 
            pushFollow(FOLLOW_ruleRun_in_entryRuleRun11162);
            iv_ruleRun=ruleRun();
            _fsp--;

             current =iv_ruleRun; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRun11172); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRun


    // $ANTLR start ruleRun
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4874:1: ruleRun returns [EObject current=null] : ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        EObject lv_module_1 = null;

        EObject lv_list_3 = null;

        EObject lv_module_6 = null;

        EObject lv_list_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4879:6: ( ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4880:1: ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4880:1: ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==67) ) {
                alt75=1;
            }
            else if ( (LA75_0==68) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4880:1: ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4880:2: ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4880:2: ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4880:3: 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )?
                    {
                    match(input,67,FOLLOW_67_in_ruleRun11207); 

                            createLeafNode(grammarAccess.getRunAccess().getRunKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4884:1: (lv_module_1= ruleModuleRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4887:6: lv_module_1= ruleModuleRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getModuleModuleRenamingParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleRenaming_in_ruleRun11241);
                    lv_module_1=ruleModuleRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "module", lv_module_1, "ModuleRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4905:2: ( '[' (lv_list_3= ruleRenamingList ) ']' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==40) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4905:3: '[' (lv_list_3= ruleRenamingList ) ']'
                            {
                            match(input,40,FOLLOW_40_in_ruleRun11255); 

                                    createLeafNode(grammarAccess.getRunAccess().getLeftSquareBracketKeyword_0_2_0(), null); 
                                
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4909:1: (lv_list_3= ruleRenamingList )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4912:6: lv_list_3= ruleRenamingList
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getListRenamingListParserRuleCall_0_2_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleRenamingList_in_ruleRun11289);
                            lv_list_3=ruleRenamingList();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "list", lv_list_3, "RenamingList", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            match(input,41,FOLLOW_41_in_ruleRun11302); 

                                    createLeafNode(grammarAccess.getRunAccess().getRightSquareBracketKeyword_0_2_2(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4935:6: ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4935:6: ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4935:7: 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )?
                    {
                    match(input,68,FOLLOW_68_in_ruleRun11321); 

                            createLeafNode(grammarAccess.getRunAccess().getCopymoduleKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4939:1: (lv_module_6= ruleModuleRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4942:6: lv_module_6= ruleModuleRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getModuleModuleRenamingParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleRenaming_in_ruleRun11355);
                    lv_module_6=ruleModuleRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "module", lv_module_6, "ModuleRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4960:2: ( '[' (lv_list_8= ruleRenamingList ) ']' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==40) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4960:3: '[' (lv_list_8= ruleRenamingList ) ']'
                            {
                            match(input,40,FOLLOW_40_in_ruleRun11369); 

                                    createLeafNode(grammarAccess.getRunAccess().getLeftSquareBracketKeyword_1_2_0(), null); 
                                
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4964:1: (lv_list_8= ruleRenamingList )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4967:6: lv_list_8= ruleRenamingList
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getListRenamingListParserRuleCall_1_2_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleRenamingList_in_ruleRun11403);
                            lv_list_8=ruleRenamingList();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "list", lv_list_8, "RenamingList", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            match(input,41,FOLLOW_41_in_ruleRun11416); 

                                    createLeafNode(grammarAccess.getRunAccess().getRightSquareBracketKeyword_1_2_2(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRun


    // $ANTLR start entryRuleModuleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4996:1: entryRuleModuleRenaming returns [EObject current=null] : iv_ruleModuleRenaming= ruleModuleRenaming EOF ;
    public final EObject entryRuleModuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4996:56: (iv_ruleModuleRenaming= ruleModuleRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:4997:2: iv_ruleModuleRenaming= ruleModuleRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleRenaming_in_entryRuleModuleRenaming11452);
            iv_ruleModuleRenaming=ruleModuleRenaming();
            _fsp--;

             current =iv_ruleModuleRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleRenaming11462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleRenaming


    // $ANTLR start ruleModuleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5004:1: ruleModuleRenaming returns [EObject current=null] : ( ( RULE_ESTERELID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID ) )? ) ;
    public final EObject ruleModuleRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_renamed_1=null;
        Token lv_newName_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5009:6: ( ( ( RULE_ESTERELID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5010:1: ( ( RULE_ESTERELID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5010:1: ( ( RULE_ESTERELID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5010:2: ( RULE_ESTERELID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5010:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5013:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleModuleRenaming11509); 

            		createLeafNode(grammarAccess.getModuleRenamingAccess().getModuleModuleCrossReference_0_0(), "module"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5026:2: ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==69) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5026:3: (lv_renamed_1= '/' ) (lv_newName_2= RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5026:3: (lv_renamed_1= '/' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5028:6: lv_renamed_1= '/'
                    {
                    lv_renamed_1=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleModuleRenaming11534); 

                            createLeafNode(grammarAccess.getModuleRenamingAccess().getRenamedSolidusKeyword_1_0_0(), "renamed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModuleRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "renamed", true, "/", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5047:2: (lv_newName_2= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5049:6: lv_newName_2= RULE_ESTERELID
                    {
                    lv_newName_2=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleModuleRenaming11569); 

                    		createLeafNode(grammarAccess.getModuleRenamingAccess().getNewNameEsterelIDTerminalRuleCall_1_1_0(), "newName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModuleRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newName", lv_newName_2, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleRenaming


    // $ANTLR start entryRuleRenamingList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5074:1: entryRuleRenamingList returns [EObject current=null] : iv_ruleRenamingList= ruleRenamingList EOF ;
    public final EObject entryRuleRenamingList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenamingList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5074:54: (iv_ruleRenamingList= ruleRenamingList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5075:2: iv_ruleRenamingList= ruleRenamingList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRenamingListRule(), currentNode); 
            pushFollow(FOLLOW_ruleRenamingList_in_entryRuleRenamingList11612);
            iv_ruleRenamingList=ruleRenamingList();
            _fsp--;

             current =iv_ruleRenamingList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenamingList11622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRenamingList


    // $ANTLR start ruleRenamingList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5082:1: ruleRenamingList returns [EObject current=null] : ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* ) ;
    public final EObject ruleRenamingList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0 = null;

        EObject lv_list_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5087:6: ( ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5088:1: ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5088:1: ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5088:2: (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5088:2: (lv_list_0= ruleRenaming )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5091:6: lv_list_0= ruleRenaming
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRenamingListAccess().getListRenamingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRenaming_in_ruleRenamingList11681);
            lv_list_0=ruleRenaming();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRenamingListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "list", lv_list_0, "Renaming", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5109:2: ( ';' (lv_list_2= ruleRenaming ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==23) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5109:3: ';' (lv_list_2= ruleRenaming )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleRenamingList11695); 

            	            createLeafNode(grammarAccess.getRenamingListAccess().getSemicolonKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5113:1: (lv_list_2= ruleRenaming )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5116:6: lv_list_2= ruleRenaming
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRenamingListAccess().getListRenamingParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRenaming_in_ruleRenamingList11729);
            	    lv_list_2=ruleRenaming();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRenamingListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "list", lv_list_2, "Renaming", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRenamingList


    // $ANTLR start entryRuleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5141:1: entryRuleRenaming returns [EObject current=null] : iv_ruleRenaming= ruleRenaming EOF ;
    public final EObject entryRuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5141:50: (iv_ruleRenaming= ruleRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5142:2: iv_ruleRenaming= ruleRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming11768);
            iv_ruleRenaming=ruleRenaming();
            _fsp--;

             current =iv_ruleRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming11778); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5149:1: ruleRenaming returns [EObject current=null] : ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) ) ;
    public final EObject ruleRenaming() throws RecognitionException {
        EObject current = null;

        EObject lv_renaming_1 = null;

        EObject lv_renaming_3 = null;

        EObject lv_renaming_5 = null;

        EObject lv_renaming_7 = null;

        EObject lv_renaming_9 = null;

        EObject lv_renaming_11 = null;

        EObject lv_renaming_13 = null;

        EObject lv_renaming_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5154:6: ( ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5155:1: ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5155:1: ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt82=1;
                }
                break;
            case 32:
                {
                alt82=2;
                }
                break;
            case 35:
                {
                alt82=3;
                }
                break;
            case 70:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("5155:1: ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5155:2: ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5155:2: ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5155:3: 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )*
                    {
                    match(input,31,FOLLOW_31_in_ruleRenaming11813); 

                            createLeafNode(grammarAccess.getRenamingAccess().getTypeKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5159:1: (lv_renaming_1= ruleTypeRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5162:6: lv_renaming_1= ruleTypeRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingTypeRenamingParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRenaming_in_ruleRenaming11847);
                    lv_renaming_1=ruleTypeRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_1, "TypeRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5180:2: ( ',' (lv_renaming_3= ruleTypeRenaming ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==22) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5180:3: ',' (lv_renaming_3= ruleTypeRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming11861); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_0_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5184:1: (lv_renaming_3= ruleTypeRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5187:6: lv_renaming_3= ruleTypeRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingTypeRenamingParserRuleCall_0_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeRenaming_in_ruleRenaming11895);
                    	    lv_renaming_3=ruleTypeRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_3, "TypeRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5206:6: ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5206:6: ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5206:7: 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )*
                    {
                    match(input,32,FOLLOW_32_in_ruleRenaming11918); 

                            createLeafNode(grammarAccess.getRenamingAccess().getConstantKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5210:1: (lv_renaming_5= ruleConstantRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5213:6: lv_renaming_5= ruleConstantRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingConstantRenamingParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstantRenaming_in_ruleRenaming11952);
                    lv_renaming_5=ruleConstantRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_5, "ConstantRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5231:2: ( ',' (lv_renaming_7= ruleConstantRenaming ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==22) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5231:3: ',' (lv_renaming_7= ruleConstantRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming11966); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5235:1: (lv_renaming_7= ruleConstantRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5238:6: lv_renaming_7= ruleConstantRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingConstantRenamingParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstantRenaming_in_ruleRenaming12000);
                    	    lv_renaming_7=ruleConstantRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_7, "ConstantRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5257:6: ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5257:6: ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5257:7: 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )*
                    {
                    match(input,35,FOLLOW_35_in_ruleRenaming12023); 

                            createLeafNode(grammarAccess.getRenamingAccess().getFunctionKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5261:1: (lv_renaming_9= ruleFunctionRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5264:6: lv_renaming_9= ruleFunctionRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingFunctionRenamingParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionRenaming_in_ruleRenaming12057);
                    lv_renaming_9=ruleFunctionRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_9, "FunctionRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5282:2: ( ',' (lv_renaming_11= ruleFunctionRenaming ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==22) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5282:3: ',' (lv_renaming_11= ruleFunctionRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming12071); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5286:1: (lv_renaming_11= ruleFunctionRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5289:6: lv_renaming_11= ruleFunctionRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingFunctionRenamingParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionRenaming_in_ruleRenaming12105);
                    	    lv_renaming_11=ruleFunctionRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_11, "FunctionRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5308:6: ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5308:6: ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5308:7: 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )*
                    {
                    match(input,70,FOLLOW_70_in_ruleRenaming12128); 

                            createLeafNode(grammarAccess.getRenamingAccess().getSignalKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5312:1: (lv_renaming_13= ruleSignalRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5315:6: lv_renaming_13= ruleSignalRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingSignalRenamingParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignalRenaming_in_ruleRenaming12162);
                    lv_renaming_13=ruleSignalRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_13, "SignalRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5333:2: ( ',' (lv_renaming_15= ruleSignalRenaming ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==22) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5333:3: ',' (lv_renaming_15= ruleSignalRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming12176); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5337:1: (lv_renaming_15= ruleSignalRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5340:6: lv_renaming_15= ruleSignalRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingSignalRenamingParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignalRenaming_in_ruleRenaming12210);
                    	    lv_renaming_15=ruleSignalRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_15, "SignalRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleTypeRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5365:1: entryRuleTypeRenaming returns [EObject current=null] : iv_ruleTypeRenaming= ruleTypeRenaming EOF ;
    public final EObject entryRuleTypeRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5365:54: (iv_ruleTypeRenaming= ruleTypeRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5366:2: iv_ruleTypeRenaming= ruleTypeRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRenaming_in_entryRuleTypeRenaming12250);
            iv_ruleTypeRenaming=ruleTypeRenaming();
            _fsp--;

             current =iv_ruleTypeRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRenaming12260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeRenaming


    // $ANTLR start ruleTypeRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5373:1: ruleTypeRenaming returns [EObject current=null] : ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) ) ;
    public final EObject ruleTypeRenaming() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5378:6: ( ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5379:1: ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5379:1: ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5379:2: ( RULE_ESTERELID ) '/' ( RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5379:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5382:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleTypeRenaming12307); 

            		createLeafNode(grammarAccess.getTypeRenamingAccess().getNewNameTypeCrossReference_0_0(), "newName"); 
            	

            }

            match(input,69,FOLLOW_69_in_ruleTypeRenaming12319); 

                    createLeafNode(grammarAccess.getTypeRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5399:1: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5402:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleTypeRenaming12341); 

            		createLeafNode(grammarAccess.getTypeRenamingAccess().getOldNameTypeCrossReference_2_0(), "oldName"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeRenaming


    // $ANTLR start entryRuleConstantRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5422:1: entryRuleConstantRenaming returns [EObject current=null] : iv_ruleConstantRenaming= ruleConstantRenaming EOF ;
    public final EObject entryRuleConstantRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5422:58: (iv_ruleConstantRenaming= ruleConstantRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5423:2: iv_ruleConstantRenaming= ruleConstantRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantRenaming_in_entryRuleConstantRenaming12377);
            iv_ruleConstantRenaming=ruleConstantRenaming();
            _fsp--;

             current =iv_ruleConstantRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantRenaming12387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantRenaming


    // $ANTLR start ruleConstantRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5430:1: ruleConstantRenaming returns [EObject current=null] : ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ESTERELID ) ) ;
    public final EObject ruleConstantRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_newName_2=null;
        AntlrDatatypeRuleToken lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5435:6: ( ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ESTERELID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5436:1: ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ESTERELID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5436:1: ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5436:2: (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5436:2: (lv_value_0= ruleConstantValue )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5439:6: lv_value_0= ruleConstantValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantRenamingAccess().getValueConstantValueParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_ruleConstantRenaming12446);
            lv_value_0=ruleConstantValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "ConstantValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,69,FOLLOW_69_in_ruleConstantRenaming12459); 

                    createLeafNode(grammarAccess.getConstantRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5461:1: (lv_newName_2= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5463:6: lv_newName_2= RULE_ESTERELID
            {
            lv_newName_2=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleConstantRenaming12481); 

            		createLeafNode(grammarAccess.getConstantRenamingAccess().getNewNameEsterelIDTerminalRuleCall_2_0(), "newName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "newName", lv_newName_2, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantRenaming


    // $ANTLR start entryRuleFunctionRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5488:1: entryRuleFunctionRenaming returns [EObject current=null] : iv_ruleFunctionRenaming= ruleFunctionRenaming EOF ;
    public final EObject entryRuleFunctionRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5488:58: (iv_ruleFunctionRenaming= ruleFunctionRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5489:2: iv_ruleFunctionRenaming= ruleFunctionRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionRenaming_in_entryRuleFunctionRenaming12522);
            iv_ruleFunctionRenaming=ruleFunctionRenaming();
            _fsp--;

             current =iv_ruleFunctionRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionRenaming12532); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionRenaming


    // $ANTLR start ruleFunctionRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5496:1: ruleFunctionRenaming returns [EObject current=null] : ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) ) ;
    public final EObject ruleFunctionRenaming() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5501:6: ( ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5502:1: ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5502:1: ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5502:2: ( RULE_ESTERELID ) '/' ( RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5502:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5505:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleFunctionRenaming12579); 

            		createLeafNode(grammarAccess.getFunctionRenamingAccess().getNewNameFunctionCrossReference_0_0(), "newName"); 
            	

            }

            match(input,69,FOLLOW_69_in_ruleFunctionRenaming12591); 

                    createLeafNode(grammarAccess.getFunctionRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5522:1: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5525:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleFunctionRenaming12613); 

            		createLeafNode(grammarAccess.getFunctionRenamingAccess().getOldNameFunctionCrossReference_2_0(), "oldName"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionRenaming


    // $ANTLR start entryRuleSignalRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5547:1: entryRuleSignalRenaming returns [EObject current=null] : iv_ruleSignalRenaming= ruleSignalRenaming EOF ;
    public final EObject entryRuleSignalRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5547:56: (iv_ruleSignalRenaming= ruleSignalRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5548:2: iv_ruleSignalRenaming= ruleSignalRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming12651);
            iv_ruleSignalRenaming=ruleSignalRenaming();
            _fsp--;

             current =iv_ruleSignalRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalRenaming12661); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5555:1: ruleSignalRenaming returns [EObject current=null] : ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) ) ;
    public final EObject ruleSignalRenaming() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5560:6: ( ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5561:1: ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5561:1: ( ( RULE_ESTERELID ) '/' ( RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5561:2: ( RULE_ESTERELID ) '/' ( RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5561:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5564:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSignalRenaming12708); 

            		createLeafNode(grammarAccess.getSignalRenamingAccess().getNewNameSignalCrossReference_0_0(), "newName"); 
            	

            }

            match(input,69,FOLLOW_69_in_ruleSignalRenaming12720); 

                    createLeafNode(grammarAccess.getSignalRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5581:1: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5584:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSignalRenaming12742); 

            		createLeafNode(grammarAccess.getSignalRenamingAccess().getOldNameSignalCrossReference_2_0(), "oldName"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleLocalSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5604:1: entryRuleLocalSignalDecl returns [EObject current=null] : iv_ruleLocalSignalDecl= ruleLocalSignalDecl EOF ;
    public final EObject entryRuleLocalSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5604:57: (iv_ruleLocalSignalDecl= ruleLocalSignalDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5605:2: iv_ruleLocalSignalDecl= ruleLocalSignalDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalSignalDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalSignalDecl_in_entryRuleLocalSignalDecl12778);
            iv_ruleLocalSignalDecl=ruleLocalSignalDecl();
            _fsp--;

             current =iv_ruleLocalSignalDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalSignalDecl12788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalSignalDecl


    // $ANTLR start ruleLocalSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5612:1: ruleLocalSignalDecl returns [EObject current=null] : ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? ) ;
    public final EObject ruleLocalSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signalList_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5617:6: ( ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5618:1: ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5618:1: ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5618:2: 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )?
            {
            match(input,70,FOLLOW_70_in_ruleLocalSignalDecl12822); 

                    createLeafNode(grammarAccess.getLocalSignalDeclAccess().getSignalKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5622:1: (lv_signalList_1= ruleLocalSignalList )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5625:6: lv_signalList_1= ruleLocalSignalList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocalSignalDeclAccess().getSignalListLocalSignalListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLocalSignalList_in_ruleLocalSignalDecl12856);
            lv_signalList_1=ruleLocalSignalList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalSignalDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "signalList", lv_signalList_1, "LocalSignalList", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,71,FOLLOW_71_in_ruleLocalSignalDecl12869); 

                    createLeafNode(grammarAccess.getLocalSignalDeclAccess().getInKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5647:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5650:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocalSignalDeclAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleLocalSignalDecl12903);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalSignalDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleLocalSignalDecl12916); 

                    createLeafNode(grammarAccess.getLocalSignalDeclAccess().getEndKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5672:1: ( 'signal' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==70) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5672:2: 'signal'
                    {
                    match(input,70,FOLLOW_70_in_ruleLocalSignalDecl12926); 

                            createLeafNode(grammarAccess.getLocalSignalDeclAccess().getSignalKeyword_5(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocalSignalDecl


    // $ANTLR start entryRuleLocalSignalList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5683:1: entryRuleLocalSignalList returns [EObject current=null] : iv_ruleLocalSignalList= ruleLocalSignalList EOF ;
    public final EObject entryRuleLocalSignalList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSignalList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5683:57: (iv_ruleLocalSignalList= ruleLocalSignalList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5684:2: iv_ruleLocalSignalList= ruleLocalSignalList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalSignalListRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalSignalList_in_entryRuleLocalSignalList12961);
            iv_ruleLocalSignalList=ruleLocalSignalList();
            _fsp--;

             current =iv_ruleLocalSignalList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalSignalList12971); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalSignalList


    // $ANTLR start ruleLocalSignalList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5691:1: ruleLocalSignalList returns [EObject current=null] : ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* ) ;
    public final EObject ruleLocalSignalList() throws RecognitionException {
        EObject current = null;

        EObject lv_signal_1 = null;

        EObject lv_signal_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5696:6: ( ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5697:1: ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5697:1: ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5697:2: () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5697:2: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5698:5: 
            {
             
                    temp=factory.create(grammarAccess.getLocalSignalListAccess().getLocalSignalAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLocalSignalListAccess().getLocalSignalAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5708:2: (lv_signal_1= ruleSignal )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5711:6: lv_signal_1= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocalSignalListAccess().getSignalSignalParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleLocalSignalList13039);
            lv_signal_1=ruleSignal();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalSignalListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "signal", lv_signal_1, "Signal", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5729:2: ( ',' (lv_signal_3= ruleSignal ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==22) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5729:3: ',' (lv_signal_3= ruleSignal )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleLocalSignalList13053); 

            	            createLeafNode(grammarAccess.getLocalSignalListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5733:1: (lv_signal_3= ruleSignal )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5736:6: lv_signal_3= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLocalSignalListAccess().getSignalSignalParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleLocalSignalList13087);
            	    lv_signal_3=ruleSignal();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLocalSignalListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "signal", lv_signal_3, "Signal", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocalSignalList


    // $ANTLR start entryRuleSuspend
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5761:1: entryRuleSuspend returns [EObject current=null] : iv_ruleSuspend= ruleSuspend EOF ;
    public final EObject entryRuleSuspend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspend = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5761:49: (iv_ruleSuspend= ruleSuspend EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5762:2: iv_ruleSuspend= ruleSuspend EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSuspendRule(), currentNode); 
            pushFollow(FOLLOW_ruleSuspend_in_entryRuleSuspend13126);
            iv_ruleSuspend=ruleSuspend();
            _fsp--;

             current =iv_ruleSuspend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspend13136); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSuspend


    // $ANTLR start ruleSuspend
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5769:1: ruleSuspend returns [EObject current=null] : ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) ) ;
    public final EObject ruleSuspend() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;

        EObject lv_delay_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5774:6: ( ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5775:1: ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5775:1: ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5775:2: 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr )
            {
            match(input,72,FOLLOW_72_in_ruleSuspend13170); 

                    createLeafNode(grammarAccess.getSuspendAccess().getSuspendKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5779:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5782:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSuspendAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleSuspend13204);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSuspendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,44,FOLLOW_44_in_ruleSuspend13217); 

                    createLeafNode(grammarAccess.getSuspendAccess().getWhenKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5804:1: (lv_delay_3= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5807:6: lv_delay_3= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSuspendAccess().getDelayDelayExprParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleSuspend13251);
            lv_delay_3=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSuspendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_3, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSuspend


    // $ANTLR start entryRuleSustain
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5832:1: entryRuleSustain returns [EObject current=null] : iv_ruleSustain= ruleSustain EOF ;
    public final EObject entryRuleSustain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSustain = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5832:49: (iv_ruleSustain= ruleSustain EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5833:2: iv_ruleSustain= ruleSustain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSustainRule(), currentNode); 
            pushFollow(FOLLOW_ruleSustain_in_entryRuleSustain13288);
            iv_ruleSustain=ruleSustain();
            _fsp--;

             current =iv_ruleSustain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSustain13298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSustain


    // $ANTLR start ruleSustain
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5840:1: ruleSustain returns [EObject current=null] : ( 'sustain' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_dataExpr_4= ruleDataExpr ) ')' )? ) ;
    public final EObject ruleSustain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tick_2 = null;

        EObject lv_dataExpr_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5845:6: ( ( 'sustain' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_dataExpr_4= ruleDataExpr ) ')' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5846:1: ( 'sustain' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_dataExpr_4= ruleDataExpr ) ')' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5846:1: ( 'sustain' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_dataExpr_4= ruleDataExpr ) ')' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5846:2: 'sustain' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ( '(' (lv_dataExpr_4= ruleDataExpr ) ')' )?
            {
            match(input,73,FOLLOW_73_in_ruleSustain13332); 

                    createLeafNode(grammarAccess.getSustainAccess().getSustainKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5850:1: ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ESTERELID) ) {
                alt85=1;
            }
            else if ( (LA85_0==92) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5850:1: ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5850:2: ( RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5850:2: ( RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5853:3: RULE_ESTERELID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getSustainRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSustain13355); 

                    		createLeafNode(grammarAccess.getSustainAccess().getSignalSignalCrossReference_1_0_0(), "signal"); 
                    	

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5867:6: (lv_tick_2= ruleTick )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5867:6: (lv_tick_2= ruleTick )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5870:6: lv_tick_2= ruleTick
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSustainAccess().getTickTickParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTick_in_ruleSustain13398);
                    lv_tick_2=ruleTick();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSustainRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tick", lv_tick_2, "Tick", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5888:3: ( '(' (lv_dataExpr_4= ruleDataExpr ) ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==36) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5888:4: '(' (lv_dataExpr_4= ruleDataExpr ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleSustain13413); 

                            createLeafNode(grammarAccess.getSustainAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5892:1: (lv_dataExpr_4= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5895:6: lv_dataExpr_4= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSustainAccess().getDataExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleSustain13447);
                    lv_dataExpr_4=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSustainRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "dataExpr", lv_dataExpr_4, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,37,FOLLOW_37_in_ruleSustain13460); 

                            createLeafNode(grammarAccess.getSustainAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSustain


    // $ANTLR start entryRuleTrap
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5924:1: entryRuleTrap returns [EObject current=null] : iv_ruleTrap= ruleTrap EOF ;
    public final EObject entryRuleTrap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrap = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5924:46: (iv_ruleTrap= ruleTrap EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5925:2: iv_ruleTrap= ruleTrap EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrap_in_entryRuleTrap13495);
            iv_ruleTrap=ruleTrap();
            _fsp--;

             current =iv_ruleTrap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrap13505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrap


    // $ANTLR start ruleTrap
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5932:1: ruleTrap returns [EObject current=null] : ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? ) ;
    public final EObject ruleTrap() throws RecognitionException {
        EObject current = null;

        EObject lv_trapDeclList_1 = null;

        EObject lv_statement_3 = null;

        EObject lv_trapHandlerList_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5937:6: ( ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5938:1: ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5938:1: ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5938:2: 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )?
            {
            match(input,74,FOLLOW_74_in_ruleTrap13539); 

                    createLeafNode(grammarAccess.getTrapAccess().getTrapKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5942:1: (lv_trapDeclList_1= ruleTrapDeclList )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5945:6: lv_trapDeclList_1= ruleTrapDeclList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapAccess().getTrapDeclListTrapDeclListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapDeclList_in_ruleTrap13573);
            lv_trapDeclList_1=ruleTrapDeclList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "trapDeclList", lv_trapDeclList_1, "TrapDeclList", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,71,FOLLOW_71_in_ruleTrap13586); 

                    createLeafNode(grammarAccess.getTrapAccess().getInKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5967:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5970:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleTrap13620);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5988:2: (lv_trapHandlerList_4= ruleTrapHandlerList )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==75) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:5991:6: lv_trapHandlerList_4= ruleTrapHandlerList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTrapAccess().getTrapHandlerListTrapHandlerListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTrapHandlerList_in_ruleTrap13658);
                    lv_trapHandlerList_4=ruleTrapHandlerList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTrapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "trapHandlerList", lv_trapHandlerList_4, "TrapHandlerList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleTrap13672); 

                    createLeafNode(grammarAccess.getTrapAccess().getEndKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6013:1: ( 'trap' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==74) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6013:2: 'trap'
                    {
                    match(input,74,FOLLOW_74_in_ruleTrap13682); 

                            createLeafNode(grammarAccess.getTrapAccess().getTrapKeyword_6(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrap


    // $ANTLR start entryRuleTrapDeclList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6024:1: entryRuleTrapDeclList returns [EObject current=null] : iv_ruleTrapDeclList= ruleTrapDeclList EOF ;
    public final EObject entryRuleTrapDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapDeclList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6024:54: (iv_ruleTrapDeclList= ruleTrapDeclList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6025:2: iv_ruleTrapDeclList= ruleTrapDeclList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapDeclListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapDeclList_in_entryRuleTrapDeclList13717);
            iv_ruleTrapDeclList=ruleTrapDeclList();
            _fsp--;

             current =iv_ruleTrapDeclList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapDeclList13727); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapDeclList


    // $ANTLR start ruleTrapDeclList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6032:1: ruleTrapDeclList returns [EObject current=null] : ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* ) ;
    public final EObject ruleTrapDeclList() throws RecognitionException {
        EObject current = null;

        EObject lv_trapDecl_0 = null;

        EObject lv_trapDecl_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6037:6: ( ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6038:1: ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6038:1: ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6038:2: (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6038:2: (lv_trapDecl_0= ruleTrapDecl )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6041:6: lv_trapDecl_0= ruleTrapDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapDeclListAccess().getTrapDeclTrapDeclParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13786);
            lv_trapDecl_0=ruleTrapDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapDeclListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "trapDecl", lv_trapDecl_0, "TrapDecl", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6059:2: ( ',' (lv_trapDecl_2= ruleTrapDecl ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==22) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6059:3: ',' (lv_trapDecl_2= ruleTrapDecl )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTrapDeclList13800); 

            	            createLeafNode(grammarAccess.getTrapDeclListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6063:1: (lv_trapDecl_2= ruleTrapDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6066:6: lv_trapDecl_2= ruleTrapDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTrapDeclListAccess().getTrapDeclTrapDeclParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13834);
            	    lv_trapDecl_2=ruleTrapDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTrapDeclListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "trapDecl", lv_trapDecl_2, "TrapDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrapDeclList


    // $ANTLR start entryRuleTrapDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6091:1: entryRuleTrapDecl returns [EObject current=null] : iv_ruleTrapDecl= ruleTrapDecl EOF ;
    public final EObject entryRuleTrapDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6091:50: (iv_ruleTrapDecl= ruleTrapDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6092:2: iv_ruleTrapDecl= ruleTrapDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapDecl_in_entryRuleTrapDecl13873);
            iv_ruleTrapDecl=ruleTrapDecl();
            _fsp--;

             current =iv_ruleTrapDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapDecl13883); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapDecl


    // $ANTLR start ruleTrapDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6099:1: ruleTrapDecl returns [EObject current=null] : ( (lv_name_0= RULE_ESTERELID ) (lv_channelDesc_1= ruleChannelDescription )? ) ;
    public final EObject ruleTrapDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_channelDesc_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6104:6: ( ( (lv_name_0= RULE_ESTERELID ) (lv_channelDesc_1= ruleChannelDescription )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6105:1: ( (lv_name_0= RULE_ESTERELID ) (lv_channelDesc_1= ruleChannelDescription )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6105:1: ( (lv_name_0= RULE_ESTERELID ) (lv_channelDesc_1= ruleChannelDescription )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6105:2: (lv_name_0= RULE_ESTERELID ) (lv_channelDesc_1= ruleChannelDescription )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6105:2: (lv_name_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6107:6: lv_name_0= RULE_ESTERELID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleTrapDecl13930); 

            		createLeafNode(grammarAccess.getTrapDeclAccess().getNameEsterelIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6125:2: (lv_channelDesc_1= ruleChannelDescription )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==18||LA90_0==36||LA90_0==42) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6128:6: lv_channelDesc_1= ruleChannelDescription
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTrapDeclAccess().getChannelDescChannelDescriptionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleChannelDescription_in_ruleTrapDecl13972);
                    lv_channelDesc_1=ruleChannelDescription();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTrapDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "channelDesc", lv_channelDesc_1, "ChannelDescription", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrapDecl


    // $ANTLR start entryRuleTrapHandlerList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6153:1: entryRuleTrapHandlerList returns [EObject current=null] : iv_ruleTrapHandlerList= ruleTrapHandlerList EOF ;
    public final EObject entryRuleTrapHandlerList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapHandlerList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6153:57: (iv_ruleTrapHandlerList= ruleTrapHandlerList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6154:2: iv_ruleTrapHandlerList= ruleTrapHandlerList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapHandlerListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapHandlerList_in_entryRuleTrapHandlerList14010);
            iv_ruleTrapHandlerList=ruleTrapHandlerList();
            _fsp--;

             current =iv_ruleTrapHandlerList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapHandlerList14020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapHandlerList


    // $ANTLR start ruleTrapHandlerList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6161:1: ruleTrapHandlerList returns [EObject current=null] : ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* ) ;
    public final EObject ruleTrapHandlerList() throws RecognitionException {
        EObject current = null;

        EObject lv_trapHandler_0 = null;

        EObject lv_trapHandler_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6166:6: ( ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6167:1: ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6167:1: ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6167:2: (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6167:2: (lv_trapHandler_0= ruleTrapHandler )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6170:6: lv_trapHandler_0= ruleTrapHandler
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerListAccess().getTrapHandlerTrapHandlerParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList14079);
            lv_trapHandler_0=ruleTrapHandler();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapHandlerListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "trapHandler", lv_trapHandler_0, "TrapHandler", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6188:2: (lv_trapHandler_1= ruleTrapHandler )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==75) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6191:6: lv_trapHandler_1= ruleTrapHandler
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerListAccess().getTrapHandlerTrapHandlerParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList14117);
            	    lv_trapHandler_1=ruleTrapHandler();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTrapHandlerListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "trapHandler", lv_trapHandler_1, "TrapHandler", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrapHandlerList


    // $ANTLR start entryRuleTrapHandler
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6216:1: entryRuleTrapHandler returns [EObject current=null] : iv_ruleTrapHandler= ruleTrapHandler EOF ;
    public final EObject entryRuleTrapHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapHandler = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6216:53: (iv_ruleTrapHandler= ruleTrapHandler EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6217:2: iv_ruleTrapHandler= ruleTrapHandler EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapHandlerRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapHandler_in_entryRuleTrapHandler14155);
            iv_ruleTrapHandler=ruleTrapHandler();
            _fsp--;

             current =iv_ruleTrapHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapHandler14165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapHandler


    // $ANTLR start ruleTrapHandler
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6224:1: ruleTrapHandler returns [EObject current=null] : ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) ) ;
    public final EObject ruleTrapHandler() throws RecognitionException {
        EObject current = null;

        EObject lv_trapExpr_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6229:6: ( ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6230:1: ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6230:1: ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6230:2: 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement )
            {
            match(input,75,FOLLOW_75_in_ruleTrapHandler14199); 

                    createLeafNode(grammarAccess.getTrapHandlerAccess().getHandleKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6234:1: (lv_trapExpr_1= ruleTrapExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6237:6: lv_trapExpr_1= ruleTrapExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerAccess().getTrapExprTrapExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapExpr_in_ruleTrapHandler14233);
            lv_trapExpr_1=ruleTrapExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "trapExpr", lv_trapExpr_1, "TrapExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,45,FOLLOW_45_in_ruleTrapHandler14246); 

                    createLeafNode(grammarAccess.getTrapHandlerAccess().getDoKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6259:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6262:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleTrapHandler14280);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrapHandler


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6287:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6287:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6288:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable14317);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable14327); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6295:1: ruleVariable returns [EObject current=null] : ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecl_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6300:6: ( ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6301:1: ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6301:1: ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6301:2: 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )?
            {
            match(input,76,FOLLOW_76_in_ruleVariable14361); 

                    createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6305:1: (lv_varDecl_1= ruleVariableDecl )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6308:6: lv_varDecl_1= ruleVariableDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getVarDeclVariableDeclParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleVariable14395);
            lv_varDecl_1=ruleVariableDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "varDecl", lv_varDecl_1, "VariableDecl", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,71,FOLLOW_71_in_ruleVariable14408); 

                    createLeafNode(grammarAccess.getVariableAccess().getInKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6330:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6333:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleVariable14442);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleVariable14455); 

                    createLeafNode(grammarAccess.getVariableAccess().getEndKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6355:1: ( 'var' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==76) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6355:2: 'var'
                    {
                    match(input,76,FOLLOW_76_in_ruleVariable14465); 

                            createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_5(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleVariableDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6366:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6366:54: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6367:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl14500);
            iv_ruleVariableDecl=ruleVariableDecl();
            _fsp--;

             current =iv_ruleVariableDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDecl14510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableDecl


    // $ANTLR start ruleVariableDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6374:1: ruleVariableDecl returns [EObject current=null] : ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) ) )* ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_2=null;
        Token lv_type_3=null;
        Token lv_type_8=null;
        Token lv_type_9=null;
        EObject lv_varList_0 = null;

        EObject lv_varList_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6379:6: ( ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6380:1: ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6380:1: ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6380:2: (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6380:2: (lv_varList_0= ruleVariableList )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6383:6: lv_varList_0= ruleVariableList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVarListVariableListParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableList_in_ruleVariableDecl14569);
            lv_varList_0=ruleVariableList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "varList", lv_varList_0, "VariableList", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,18,FOLLOW_18_in_ruleVariableDecl14582); 

                    createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6405:1: ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ESTERELID) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_BASETYPE) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6405:1: ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) )", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6405:2: (lv_type_2= RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6405:2: (lv_type_2= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6407:6: lv_type_2= RULE_ESTERELID
                    {
                    lv_type_2=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleVariableDecl14605); 

                    		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeEsterelIDTerminalRuleCall_2_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6426:6: (lv_type_3= RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6426:6: (lv_type_3= RULE_BASETYPE )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6428:6: lv_type_3= RULE_BASETYPE
                    {
                    lv_type_3=(Token)input.LT(1);
                    match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14641); 

                    		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeBaseTypeTerminalRuleCall_2_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_3, "BaseType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6446:3: ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==22) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6446:4: () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6446:4: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6447:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getVariableDeclAccess().getVariableDeclLeftAction_3_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getVariableDeclAccess().getVariableDeclLeftAction_3_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,22,FOLLOW_22_in_ruleVariableDecl14669); 

            	            createLeafNode(grammarAccess.getVariableDeclAccess().getCommaKeyword_3_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6466:1: (lv_varList_6= ruleVariableList )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6469:6: lv_varList_6= ruleVariableList
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVarListVariableListParserRuleCall_3_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableList_in_ruleVariableDecl14703);
            	    lv_varList_6=ruleVariableList();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "varList", lv_varList_6, "VariableList", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,18,FOLLOW_18_in_ruleVariableDecl14716); 

            	            createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_3_3(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6491:1: ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) )
            	    int alt94=2;
            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==RULE_ESTERELID) ) {
            	        alt94=1;
            	    }
            	    else if ( (LA94_0==RULE_BASETYPE) ) {
            	        alt94=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("6491:1: ( (lv_type_8= RULE_ESTERELID ) | (lv_type_9= RULE_BASETYPE ) )", 94, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt94) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6491:2: (lv_type_8= RULE_ESTERELID )
            	            {
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6491:2: (lv_type_8= RULE_ESTERELID )
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6493:6: lv_type_8= RULE_ESTERELID
            	            {
            	            lv_type_8=(Token)input.LT(1);
            	            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleVariableDecl14739); 

            	            		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeEsterelIDTerminalRuleCall_3_4_0_0(), "type"); 
            	            	

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "type", lv_type_8, "EsterelID", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6512:6: (lv_type_9= RULE_BASETYPE )
            	            {
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6512:6: (lv_type_9= RULE_BASETYPE )
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6514:6: lv_type_9= RULE_BASETYPE
            	            {
            	            lv_type_9=(Token)input.LT(1);
            	            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14775); 

            	            		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeBaseTypeTerminalRuleCall_3_4_1_0(), "type"); 
            	            	

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "type", lv_type_9, "BaseType", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableDecl


    // $ANTLR start entryRuleVariableList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6539:1: entryRuleVariableList returns [EObject current=null] : iv_ruleVariableList= ruleVariableList EOF ;
    public final EObject entryRuleVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6539:54: (iv_ruleVariableList= ruleVariableList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6540:2: iv_ruleVariableList= ruleVariableList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableListRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableList_in_entryRuleVariableList14819);
            iv_ruleVariableList=ruleVariableList();
            _fsp--;

             current =iv_ruleVariableList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableList14829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableList


    // $ANTLR start ruleVariableList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6547:1: ruleVariableList returns [EObject current=null] : ( (lv_variable_0= RULE_ESTERELID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* ) ;
    public final EObject ruleVariableList() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0=null;
        Token lv_variable_5=null;
        EObject lv_expression_2 = null;

        EObject lv_expression_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6552:6: ( ( (lv_variable_0= RULE_ESTERELID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6553:1: ( (lv_variable_0= RULE_ESTERELID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6553:1: ( (lv_variable_0= RULE_ESTERELID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6553:2: (lv_variable_0= RULE_ESTERELID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6553:2: (lv_variable_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6555:6: lv_variable_0= RULE_ESTERELID
            {
            lv_variable_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleVariableList14876); 

            		createLeafNode(grammarAccess.getVariableListAccess().getVariableEsterelIDTerminalRuleCall_0_0(), "variable"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "variable", lv_variable_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6573:2: ( ':=' (lv_expression_2= ruleDataExpr ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==42) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6573:3: ':=' (lv_expression_2= ruleDataExpr )
                    {
                    match(input,42,FOLLOW_42_in_ruleVariableList14894); 

                            createLeafNode(grammarAccess.getVariableListAccess().getColonEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6577:1: (lv_expression_2= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6580:6: lv_expression_2= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableListAccess().getExpressionDataExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleVariableList14928);
                    lv_expression_2=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expression", lv_expression_2, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6598:4: ( () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==22) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6598:5: () ',' (lv_variable_5= RULE_ESTERELID ) ( ':=' (lv_expression_7= ruleDataExpr ) )?
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6598:5: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6599:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getVariableListAccess().getVariableListLeftAction_2_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getVariableListAccess().getVariableListLeftAction_2_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,22,FOLLOW_22_in_ruleVariableList14953); 

            	            createLeafNode(grammarAccess.getVariableListAccess().getCommaKeyword_2_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6618:1: (lv_variable_5= RULE_ESTERELID )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6620:6: lv_variable_5= RULE_ESTERELID
            	    {
            	    lv_variable_5=(Token)input.LT(1);
            	    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleVariableList14975); 

            	    		createLeafNode(grammarAccess.getVariableListAccess().getVariableEsterelIDTerminalRuleCall_2_2_0(), "variable"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "variable", lv_variable_5, "EsterelID", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }

            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6638:2: ( ':=' (lv_expression_7= ruleDataExpr ) )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==42) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6638:3: ':=' (lv_expression_7= ruleDataExpr )
            	            {
            	            match(input,42,FOLLOW_42_in_ruleVariableList14993); 

            	                    createLeafNode(grammarAccess.getVariableListAccess().getColonEqualsSignKeyword_2_3_0(), null); 
            	                
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6642:1: (lv_expression_7= ruleDataExpr )
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6645:6: lv_expression_7= ruleDataExpr
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getVariableListAccess().getExpressionDataExprParserRuleCall_2_3_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleDataExpr_in_ruleVariableList15027);
            	            lv_expression_7=ruleDataExpr();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "expression", lv_expression_7, "DataExpr", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableList


    // $ANTLR start entryRuleWeakAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6670:1: entryRuleWeakAbort returns [EObject current=null] : iv_ruleWeakAbort= ruleWeakAbort EOF ;
    public final EObject entryRuleWeakAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbort = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6670:51: (iv_ruleWeakAbort= ruleWeakAbort EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6671:2: iv_ruleWeakAbort= ruleWeakAbort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbort_in_entryRuleWeakAbort15068);
            iv_ruleWeakAbort=ruleWeakAbort();
            _fsp--;

             current =iv_ruleWeakAbort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbort15078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbort


    // $ANTLR start ruleWeakAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6678:1: ruleWeakAbort returns [EObject current=null] : ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) ) ;
    public final EObject ruleWeakAbort() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_2 = null;

        EObject lv_weakAbortBody_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6683:6: ( ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6684:1: ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6684:1: ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6684:2: 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody )
            {
            match(input,77,FOLLOW_77_in_ruleWeakAbort15112); 

                    createLeafNode(grammarAccess.getWeakAbortAccess().getWeakKeyword_0(), null); 
                
            match(input,43,FOLLOW_43_in_ruleWeakAbort15121); 

                    createLeafNode(grammarAccess.getWeakAbortAccess().getAbortKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6692:1: (lv_statement_2= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6695:6: lv_statement_2= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortAccess().getStatementStatementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleWeakAbort15155);
            lv_statement_2=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,44,FOLLOW_44_in_ruleWeakAbort15168); 

                    createLeafNode(grammarAccess.getWeakAbortAccess().getWhenKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6717:1: (lv_weakAbortBody_4= ruleWeakAbortBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6720:6: lv_weakAbortBody_4= ruleWeakAbortBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortAccess().getWeakAbortBodyWeakAbortBodyParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWeakAbortBody_in_ruleWeakAbort15202);
            lv_weakAbortBody_4=ruleWeakAbortBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "weakAbortBody", lv_weakAbortBody_4, "WeakAbortBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWeakAbort


    // $ANTLR start entryRuleWeakAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6745:1: entryRuleWeakAbortBody returns [EObject current=null] : iv_ruleWeakAbortBody= ruleWeakAbortBody EOF ;
    public final EObject entryRuleWeakAbortBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbortBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6745:55: (iv_ruleWeakAbortBody= ruleWeakAbortBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6746:2: iv_ruleWeakAbortBody= ruleWeakAbortBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortBody_in_entryRuleWeakAbortBody15239);
            iv_ruleWeakAbortBody=ruleWeakAbortBody();
            _fsp--;

             current =iv_ruleWeakAbortBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortBody15249); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortBody


    // $ANTLR start ruleWeakAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6753:1: ruleWeakAbortBody returns [EObject current=null] : (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase ) ;
    public final EObject ruleWeakAbortBody() throws RecognitionException {
        EObject current = null;

        EObject this_WeakAbortInstance_0 = null;

        EObject this_WeakAbortCase_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6758:6: ( (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6759:1: (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6759:1: (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ESTERELID||(LA99_0>=RULE_INT && LA99_0<=RULE_BOOLEAN)||(LA99_0>=33 && LA99_0<=34)||LA99_0==36||LA99_0==40||LA99_0==69||(LA99_0>=78 && LA99_0<=92)) ) {
                alt99=1;
            }
            else if ( (LA99_0==46) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6759:1: (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase )", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6760:5: this_WeakAbortInstance_0= ruleWeakAbortInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWeakAbortBodyAccess().getWeakAbortInstanceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWeakAbortInstance_in_ruleWeakAbortBody15296);
                    this_WeakAbortInstance_0=ruleWeakAbortInstance();
                    _fsp--;

                     
                            current = this_WeakAbortInstance_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6770:5: this_WeakAbortCase_1= ruleWeakAbortCase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWeakAbortBodyAccess().getWeakAbortCaseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWeakAbortCase_in_ruleWeakAbortBody15323);
                    this_WeakAbortCase_1=ruleWeakAbortCase();
                    _fsp--;

                     
                            current = this_WeakAbortCase_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWeakAbortBody


    // $ANTLR start entryRuleWeakAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6785:1: entryRuleWeakAbortEnd returns [String current=null] : iv_ruleWeakAbortEnd= ruleWeakAbortEnd EOF ;
    public final String entryRuleWeakAbortEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWeakAbortEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6785:53: (iv_ruleWeakAbortEnd= ruleWeakAbortEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6786:2: iv_ruleWeakAbortEnd= ruleWeakAbortEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortEnd_in_entryRuleWeakAbortEnd15356);
            iv_ruleWeakAbortEnd=ruleWeakAbortEnd();
            _fsp--;

             current =iv_ruleWeakAbortEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortEnd15367); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortEnd


    // $ANTLR start ruleWeakAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6793:1: ruleWeakAbortEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? ) ;
    public final AntlrDatatypeRuleToken ruleWeakAbortEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6799:6: ( (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6800:1: (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6800:1: (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6801:2: kw= 'end' ( (kw= 'weak' )? kw= 'abort' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleWeakAbortEnd15405); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getWeakAbortEndAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6806:1: ( (kw= 'weak' )? kw= 'abort' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==43||LA101_0==77) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6806:2: (kw= 'weak' )? kw= 'abort'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6806:2: (kw= 'weak' )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==77) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6807:2: kw= 'weak'
                            {
                            kw=(Token)input.LT(1);
                            match(input,77,FOLLOW_77_in_ruleWeakAbortEnd15420); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getWeakAbortEndAccess().getWeakKeyword_1_0(), null); 
                                

                            }
                            break;

                    }

                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleWeakAbortEnd15435); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getWeakAbortEndAccess().getAbortKeyword_1_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWeakAbortEnd


    // $ANTLR start entryRuleWeakAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6826:1: entryRuleWeakAbortInstance returns [EObject current=null] : iv_ruleWeakAbortInstance= ruleWeakAbortInstance EOF ;
    public final EObject entryRuleWeakAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbortInstance = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6826:59: (iv_ruleWeakAbortInstance= ruleWeakAbortInstance EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6827:2: iv_ruleWeakAbortInstance= ruleWeakAbortInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortInstance_in_entryRuleWeakAbortInstance15475);
            iv_ruleWeakAbortInstance=ruleWeakAbortInstance();
            _fsp--;

             current =iv_ruleWeakAbortInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortInstance15485); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortInstance


    // $ANTLR start ruleWeakAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6834:1: ruleWeakAbortInstance returns [EObject current=null] : ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? ) ;
    public final EObject ruleWeakAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_0 = null;

        EObject lv_statement_2 = null;

        AntlrDatatypeRuleToken lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6839:6: ( ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6840:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6840:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6840:2: (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6840:2: (lv_delay_0= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6843:6: lv_delay_0= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortInstanceAccess().getDelayDelayExprParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleWeakAbortInstance15544);
            lv_delay_0=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_0, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6861:2: ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==45) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6861:3: 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd )
                    {
                    match(input,45,FOLLOW_45_in_ruleWeakAbortInstance15558); 

                            createLeafNode(grammarAccess.getWeakAbortInstanceAccess().getDoKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6865:1: (lv_statement_2= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6868:6: lv_statement_2= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWeakAbortInstanceAccess().getStatementStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleWeakAbortInstance15592);
                    lv_statement_2=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWeakAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6886:2: (lv_end_3= ruleWeakAbortEnd )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6889:6: lv_end_3= ruleWeakAbortEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWeakAbortInstanceAccess().getEndWeakAbortEndParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortInstance15630);
                    lv_end_3=ruleWeakAbortEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWeakAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "WeakAbortEnd", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWeakAbortInstance


    // $ANTLR start entryRuleWeakAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6914:1: entryRuleWeakAbortCase returns [EObject current=null] : iv_ruleWeakAbortCase= ruleWeakAbortCase EOF ;
    public final EObject entryRuleWeakAbortCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbortCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6914:55: (iv_ruleWeakAbortCase= ruleWeakAbortCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6915:2: iv_ruleWeakAbortCase= ruleWeakAbortCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortCase_in_entryRuleWeakAbortCase15669);
            iv_ruleWeakAbortCase=ruleWeakAbortCase();
            _fsp--;

             current =iv_ruleWeakAbortCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortCase15679); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortCase


    // $ANTLR start ruleWeakAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6922:1: ruleWeakAbortCase returns [EObject current=null] : ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) ) ;
    public final EObject ruleWeakAbortCase() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0 = null;

        EObject lv_cases_1 = null;

        AntlrDatatypeRuleToken lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6927:6: ( ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6928:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6928:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6928:2: (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6928:2: (lv_cases_0= ruleAbortCaseSingle )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6931:6: lv_cases_0= ruleAbortCaseSingle
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15738);
            lv_cases_0=ruleAbortCaseSingle();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "cases", lv_cases_0, "AbortCaseSingle", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6949:2: (lv_cases_1= ruleAbortCaseSingle )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==46) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6952:6: lv_cases_1= ruleAbortCaseSingle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWeakAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15776);
            	    lv_cases_1=ruleAbortCaseSingle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWeakAbortCaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "cases", lv_cases_1, "AbortCaseSingle", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6970:3: (lv_end_2= ruleWeakAbortEnd )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6973:6: lv_end_2= ruleWeakAbortEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortCaseAccess().getEndWeakAbortEndParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortCase15815);
            lv_end_2=ruleWeakAbortEnd();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "end", lv_end_2, "WeakAbortEnd", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWeakAbortCase


    // $ANTLR start entryRuleDataExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6998:1: entryRuleDataExpr returns [EObject current=null] : iv_ruleDataExpr= ruleDataExpr EOF ;
    public final EObject entryRuleDataExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6998:50: (iv_ruleDataExpr= ruleDataExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:6999:2: iv_ruleDataExpr= ruleDataExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataExpr_in_entryRuleDataExpr15852);
            iv_ruleDataExpr=ruleDataExpr();
            _fsp--;

             current =iv_ruleDataExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataExpr15862); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataExpr


    // $ANTLR start ruleDataExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7006:1: ruleDataExpr returns [EObject current=null] : ( (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? ) | ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) ) ) ;
    public final EObject ruleDataExpr() throws RecognitionException {
        EObject current = null;

        EObject this_DataUnaryExpr_0 = null;

        AntlrDatatypeRuleToken lv_op_2 = null;

        EObject lv_right_3 = null;

        AntlrDatatypeRuleToken lv_op_4 = null;

        EObject lv_expr_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7011:6: ( ( (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? ) | ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7012:1: ( (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? ) | ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7012:1: ( (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? ) | ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ESTERELID||(LA105_0>=RULE_INT && LA105_0<=RULE_BOOLEAN)||LA105_0==36||(LA105_0>=89 && LA105_0<=91)) ) {
                alt105=1;
            }
            else if ( ((LA105_0>=33 && LA105_0<=34)||LA105_0==69||(LA105_0>=78 && LA105_0<=88)) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7012:1: ( (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? ) | ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) ) )", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7012:2: (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7012:2: (this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )? )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7013:5: this_DataUnaryExpr_0= ruleDataUnaryExpr ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getDataUnaryExprParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataUnaryExpr_in_ruleDataExpr15910);
                    this_DataUnaryExpr_0=ruleDataUnaryExpr();
                    _fsp--;

                     
                            current = this_DataUnaryExpr_0; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7021:1: ( () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( ((LA104_0>=33 && LA104_0<=34)||LA104_0==69||(LA104_0>=78 && LA104_0<=88)) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7021:2: () (lv_op_2= ruleDataOp ) (lv_right_3= ruleDataExpr )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7021:2: ()
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7022:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getDataExprAccess().getDataExprLeftAction_0_1_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getDataExprAccess().getDataExprLeftAction_0_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7037:2: (lv_op_2= ruleDataOp )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7040:6: lv_op_2= ruleDataOp
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getOpDataOpParserRuleCall_0_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataOp_in_ruleDataExpr15953);
                            lv_op_2=ruleDataOp();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2, "DataOp", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7058:2: (lv_right_3= ruleDataExpr )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7061:6: lv_right_3= ruleDataExpr
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getRightDataExprParserRuleCall_0_1_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataExpr_in_ruleDataExpr15991);
                            lv_right_3=ruleDataExpr();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "right", lv_right_3, "DataExpr", currentNode);
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
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7080:6: ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7080:6: ( (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7080:7: (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7080:7: (lv_op_4= ruleDataOp )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7083:6: lv_op_4= ruleDataOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getOpDataOpParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataOp_in_ruleDataExpr16039);
                    lv_op_4=ruleDataOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "op", lv_op_4, "DataOp", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7101:2: (lv_expr_5= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7104:6: lv_expr_5= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getExprDataExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleDataExpr16077);
                    lv_expr_5=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_5, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataExpr


    // $ANTLR start entryRuleDataOp
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7129:1: entryRuleDataOp returns [String current=null] : iv_ruleDataOp= ruleDataOp EOF ;
    public final String entryRuleDataOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataOp = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7129:47: (iv_ruleDataOp= ruleDataOp EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7130:2: iv_ruleDataOp= ruleDataOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataOp_in_entryRuleDataOp16116);
            iv_ruleDataOp=ruleDataOp();
            _fsp--;

             current =iv_ruleDataOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataOp16127); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataOp


    // $ANTLR start ruleDataOp
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7137:1: ruleDataOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken ruleDataOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7143:6: ( (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7144:1: (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7144:1: (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' )
            int alt106=14;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt106=1;
                }
                break;
            case 79:
                {
                alt106=2;
                }
                break;
            case 80:
                {
                alt106=3;
                }
                break;
            case 81:
                {
                alt106=4;
                }
                break;
            case 82:
                {
                alt106=5;
                }
                break;
            case 83:
                {
                alt106=6;
                }
                break;
            case 84:
                {
                alt106=7;
                }
                break;
            case 85:
                {
                alt106=8;
                }
                break;
            case 33:
                {
                alt106=9;
                }
                break;
            case 86:
                {
                alt106=10;
                }
                break;
            case 34:
                {
                alt106=11;
                }
                break;
            case 87:
                {
                alt106=12;
                }
                break;
            case 69:
                {
                alt106=13;
                }
                break;
            case 88:
                {
                alt106=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7144:1: (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' )", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7145:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleDataOp16165); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getAndKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7152:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleDataOp16184); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getOrKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7159:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleDataOp16203); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getNotKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7166:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleDataOp16222); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getLessThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7173:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_ruleDataOp16241); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getGreaterThanSignKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7180:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_ruleDataOp16260); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7187:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_ruleDataOp16279); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getGreaterThanSignEqualsSignKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7194:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_ruleDataOp16298); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getLessThanSignGreaterThanSignKeyword_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7201:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleDataOp16317); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getEqualsSignKeyword_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7208:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_ruleDataOp16336); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getPlusSignKeyword_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7215:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleDataOp16355); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getHyphenMinusKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7222:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_ruleDataOp16374); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getAsteriskKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7229:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleDataOp16393); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getSolidusKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7236:2: kw= 'mod'
                    {
                    kw=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleDataOp16412); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getModKeyword_13(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataOp


    // $ANTLR start entryRuleDataUnaryExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7249:1: entryRuleDataUnaryExpr returns [EObject current=null] : iv_ruleDataUnaryExpr= ruleDataUnaryExpr EOF ;
    public final EObject entryRuleDataUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataUnaryExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7249:55: (iv_ruleDataUnaryExpr= ruleDataUnaryExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7250:2: iv_ruleDataUnaryExpr= ruleDataUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataUnaryExpr_in_entryRuleDataUnaryExpr16450);
            iv_ruleDataUnaryExpr=ruleDataUnaryExpr();
            _fsp--;

             current =iv_ruleDataUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataUnaryExpr16460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataUnaryExpr


    // $ANTLR start ruleDataUnaryExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7257:1: ruleDataUnaryExpr returns [EObject current=null] : (this_DataValueFloat_0= ruleDataValueFloat | this_DataValueBoolean_1= ruleDataValueBoolean | this_DataValueInt_2= ruleDataValueInt | this_DataValueString_3= ruleDataValueString | this_DataValueID_4= ruleDataValueID | this_DataBlock_5= ruleDataBlock | this_DataCurrent_6= ruleDataCurrent | this_DataPre_7= ruleDataPre | this_DataTrap_8= ruleDataTrap | this_DataFunction_9= ruleDataFunction ) ;
    public final EObject ruleDataUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_DataValueFloat_0 = null;

        EObject this_DataValueBoolean_1 = null;

        EObject this_DataValueInt_2 = null;

        EObject this_DataValueString_3 = null;

        EObject this_DataValueID_4 = null;

        EObject this_DataBlock_5 = null;

        EObject this_DataCurrent_6 = null;

        EObject this_DataPre_7 = null;

        EObject this_DataTrap_8 = null;

        EObject this_DataFunction_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7262:6: ( (this_DataValueFloat_0= ruleDataValueFloat | this_DataValueBoolean_1= ruleDataValueBoolean | this_DataValueInt_2= ruleDataValueInt | this_DataValueString_3= ruleDataValueString | this_DataValueID_4= ruleDataValueID | this_DataBlock_5= ruleDataBlock | this_DataCurrent_6= ruleDataCurrent | this_DataPre_7= ruleDataPre | this_DataTrap_8= ruleDataTrap | this_DataFunction_9= ruleDataFunction ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7263:1: (this_DataValueFloat_0= ruleDataValueFloat | this_DataValueBoolean_1= ruleDataValueBoolean | this_DataValueInt_2= ruleDataValueInt | this_DataValueString_3= ruleDataValueString | this_DataValueID_4= ruleDataValueID | this_DataBlock_5= ruleDataBlock | this_DataCurrent_6= ruleDataCurrent | this_DataPre_7= ruleDataPre | this_DataTrap_8= ruleDataTrap | this_DataFunction_9= ruleDataFunction )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7263:1: (this_DataValueFloat_0= ruleDataValueFloat | this_DataValueBoolean_1= ruleDataValueBoolean | this_DataValueInt_2= ruleDataValueInt | this_DataValueString_3= ruleDataValueString | this_DataValueID_4= ruleDataValueID | this_DataBlock_5= ruleDataBlock | this_DataCurrent_6= ruleDataCurrent | this_DataPre_7= ruleDataPre | this_DataTrap_8= ruleDataTrap | this_DataFunction_9= ruleDataFunction )
            int alt107=10;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt107=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt107=2;
                }
                break;
            case RULE_INT:
                {
                alt107=3;
                }
                break;
            case RULE_STRING:
                {
                alt107=4;
                }
                break;
            case RULE_ESTERELID:
                {
                int LA107_5 = input.LA(2);

                if ( (LA107_5==36) ) {
                    alt107=10;
                }
                else if ( (LA107_5==EOF||LA107_5==RULE_ESTERELID||(LA107_5>=18 && LA107_5<=20)||(LA107_5>=22 && LA107_5<=23)||(LA107_5>=33 && LA107_5<=34)||LA107_5==37||(LA107_5>=39 && LA107_5<=41)||LA107_5==44||LA107_5==46||(LA107_5>=48 && LA107_5<=49)||(LA107_5>=56 && LA107_5<=58)||LA107_5==60||LA107_5==66||LA107_5==69||LA107_5==75||(LA107_5>=78 && LA107_5<=88)||LA107_5==90||LA107_5==92) ) {
                    alt107=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("7263:1: (this_DataValueFloat_0= ruleDataValueFloat | this_DataValueBoolean_1= ruleDataValueBoolean | this_DataValueInt_2= ruleDataValueInt | this_DataValueString_3= ruleDataValueString | this_DataValueID_4= ruleDataValueID | this_DataBlock_5= ruleDataBlock | this_DataCurrent_6= ruleDataCurrent | this_DataPre_7= ruleDataPre | this_DataTrap_8= ruleDataTrap | this_DataFunction_9= ruleDataFunction )", 107, 5, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt107=6;
                }
                break;
            case 89:
                {
                alt107=7;
                }
                break;
            case 90:
                {
                alt107=8;
                }
                break;
            case 91:
                {
                alt107=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7263:1: (this_DataValueFloat_0= ruleDataValueFloat | this_DataValueBoolean_1= ruleDataValueBoolean | this_DataValueInt_2= ruleDataValueInt | this_DataValueString_3= ruleDataValueString | this_DataValueID_4= ruleDataValueID | this_DataBlock_5= ruleDataBlock | this_DataCurrent_6= ruleDataCurrent | this_DataPre_7= ruleDataPre | this_DataTrap_8= ruleDataTrap | this_DataFunction_9= ruleDataFunction )", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7264:5: this_DataValueFloat_0= ruleDataValueFloat
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataValueFloatParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataValueFloat_in_ruleDataUnaryExpr16507);
                    this_DataValueFloat_0=ruleDataValueFloat();
                    _fsp--;

                     
                            current = this_DataValueFloat_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7274:5: this_DataValueBoolean_1= ruleDataValueBoolean
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataValueBooleanParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataValueBoolean_in_ruleDataUnaryExpr16534);
                    this_DataValueBoolean_1=ruleDataValueBoolean();
                    _fsp--;

                     
                            current = this_DataValueBoolean_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7284:5: this_DataValueInt_2= ruleDataValueInt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataValueIntParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataValueInt_in_ruleDataUnaryExpr16561);
                    this_DataValueInt_2=ruleDataValueInt();
                    _fsp--;

                     
                            current = this_DataValueInt_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7294:5: this_DataValueString_3= ruleDataValueString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataValueStringParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataValueString_in_ruleDataUnaryExpr16588);
                    this_DataValueString_3=ruleDataValueString();
                    _fsp--;

                     
                            current = this_DataValueString_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7304:5: this_DataValueID_4= ruleDataValueID
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataValueIDParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataValueID_in_ruleDataUnaryExpr16615);
                    this_DataValueID_4=ruleDataValueID();
                    _fsp--;

                     
                            current = this_DataValueID_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7314:5: this_DataBlock_5= ruleDataBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataBlockParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataBlock_in_ruleDataUnaryExpr16642);
                    this_DataBlock_5=ruleDataBlock();
                    _fsp--;

                     
                            current = this_DataBlock_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7324:5: this_DataCurrent_6= ruleDataCurrent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataCurrentParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataCurrent_in_ruleDataUnaryExpr16669);
                    this_DataCurrent_6=ruleDataCurrent();
                    _fsp--;

                     
                            current = this_DataCurrent_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7334:5: this_DataPre_7= ruleDataPre
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataPreParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataPre_in_ruleDataUnaryExpr16696);
                    this_DataPre_7=ruleDataPre();
                    _fsp--;

                     
                            current = this_DataPre_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7344:5: this_DataTrap_8= ruleDataTrap
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataTrapParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataTrap_in_ruleDataUnaryExpr16723);
                    this_DataTrap_8=ruleDataTrap();
                    _fsp--;

                     
                            current = this_DataTrap_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7354:5: this_DataFunction_9= ruleDataFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataFunctionParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataFunction_in_ruleDataUnaryExpr16750);
                    this_DataFunction_9=ruleDataFunction();
                    _fsp--;

                     
                            current = this_DataFunction_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataUnaryExpr


    // $ANTLR start entryRuleDataValueID
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7369:1: entryRuleDataValueID returns [EObject current=null] : iv_ruleDataValueID= ruleDataValueID EOF ;
    public final EObject entryRuleDataValueID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValueID = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7369:53: (iv_ruleDataValueID= ruleDataValueID EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7370:2: iv_ruleDataValueID= ruleDataValueID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataValueIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataValueID_in_entryRuleDataValueID16782);
            iv_ruleDataValueID=ruleDataValueID();
            _fsp--;

             current =iv_ruleDataValueID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataValueID16792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataValueID


    // $ANTLR start ruleDataValueID
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7377:1: ruleDataValueID returns [EObject current=null] : (lv_value_0= RULE_ESTERELID ) ;
    public final EObject ruleDataValueID() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7382:6: ( (lv_value_0= RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7383:1: (lv_value_0= RULE_ESTERELID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7383:1: (lv_value_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7385:6: lv_value_0= RULE_ESTERELID
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleDataValueID16838); 

            		createLeafNode(grammarAccess.getDataValueIDAccess().getValueEsterelIDTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataValueIDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataValueID


    // $ANTLR start entryRuleDataValueFloat
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7410:1: entryRuleDataValueFloat returns [EObject current=null] : iv_ruleDataValueFloat= ruleDataValueFloat EOF ;
    public final EObject entryRuleDataValueFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValueFloat = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7410:56: (iv_ruleDataValueFloat= ruleDataValueFloat EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7411:2: iv_ruleDataValueFloat= ruleDataValueFloat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataValueFloatRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataValueFloat_in_entryRuleDataValueFloat16878);
            iv_ruleDataValueFloat=ruleDataValueFloat();
            _fsp--;

             current =iv_ruleDataValueFloat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataValueFloat16888); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataValueFloat


    // $ANTLR start ruleDataValueFloat
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7418:1: ruleDataValueFloat returns [EObject current=null] : (lv_value_0= RULE_FLOAT ) ;
    public final EObject ruleDataValueFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7423:6: ( (lv_value_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7424:1: (lv_value_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7424:1: (lv_value_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7426:6: lv_value_0= RULE_FLOAT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleDataValueFloat16934); 

            		createLeafNode(grammarAccess.getDataValueFloatAccess().getValueFloatTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataValueFloatRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "Float", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataValueFloat


    // $ANTLR start entryRuleDataValueBoolean
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7451:1: entryRuleDataValueBoolean returns [EObject current=null] : iv_ruleDataValueBoolean= ruleDataValueBoolean EOF ;
    public final EObject entryRuleDataValueBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValueBoolean = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7451:58: (iv_ruleDataValueBoolean= ruleDataValueBoolean EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7452:2: iv_ruleDataValueBoolean= ruleDataValueBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataValueBooleanRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataValueBoolean_in_entryRuleDataValueBoolean16974);
            iv_ruleDataValueBoolean=ruleDataValueBoolean();
            _fsp--;

             current =iv_ruleDataValueBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataValueBoolean16984); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataValueBoolean


    // $ANTLR start ruleDataValueBoolean
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7459:1: ruleDataValueBoolean returns [EObject current=null] : (lv_value_0= RULE_BOOLEAN ) ;
    public final EObject ruleDataValueBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7464:6: ( (lv_value_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7465:1: (lv_value_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7465:1: (lv_value_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7467:6: lv_value_0= RULE_BOOLEAN
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleDataValueBoolean17030); 

            		createLeafNode(grammarAccess.getDataValueBooleanAccess().getValueBooleanTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataValueBooleanRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "Boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataValueBoolean


    // $ANTLR start entryRuleDataValueInt
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7492:1: entryRuleDataValueInt returns [EObject current=null] : iv_ruleDataValueInt= ruleDataValueInt EOF ;
    public final EObject entryRuleDataValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValueInt = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7492:54: (iv_ruleDataValueInt= ruleDataValueInt EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7493:2: iv_ruleDataValueInt= ruleDataValueInt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataValueIntRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataValueInt_in_entryRuleDataValueInt17070);
            iv_ruleDataValueInt=ruleDataValueInt();
            _fsp--;

             current =iv_ruleDataValueInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataValueInt17080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataValueInt


    // $ANTLR start ruleDataValueInt
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7500:1: ruleDataValueInt returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleDataValueInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7505:6: ( (lv_value_0= RULE_INT ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7506:1: (lv_value_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7506:1: (lv_value_0= RULE_INT )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7508:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataValueInt17126); 

            		createLeafNode(grammarAccess.getDataValueIntAccess().getValueINTTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataValueIntRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataValueInt


    // $ANTLR start entryRuleDataValueString
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7533:1: entryRuleDataValueString returns [EObject current=null] : iv_ruleDataValueString= ruleDataValueString EOF ;
    public final EObject entryRuleDataValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValueString = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7533:57: (iv_ruleDataValueString= ruleDataValueString EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7534:2: iv_ruleDataValueString= ruleDataValueString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataValueStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataValueString_in_entryRuleDataValueString17166);
            iv_ruleDataValueString=ruleDataValueString();
            _fsp--;

             current =iv_ruleDataValueString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataValueString17176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataValueString


    // $ANTLR start ruleDataValueString
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7541:1: ruleDataValueString returns [EObject current=null] : (lv_value_0= RULE_STRING ) ;
    public final EObject ruleDataValueString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7546:6: ( (lv_value_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7547:1: (lv_value_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7547:1: (lv_value_0= RULE_STRING )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7549:6: lv_value_0= RULE_STRING
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataValueString17222); 

            		createLeafNode(grammarAccess.getDataValueStringAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataValueStringRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataValueString


    // $ANTLR start entryRuleDataBlock
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7574:1: entryRuleDataBlock returns [EObject current=null] : iv_ruleDataBlock= ruleDataBlock EOF ;
    public final EObject entryRuleDataBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataBlock = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7574:51: (iv_ruleDataBlock= ruleDataBlock EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7575:2: iv_ruleDataBlock= ruleDataBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataBlock_in_entryRuleDataBlock17262);
            iv_ruleDataBlock=ruleDataBlock();
            _fsp--;

             current =iv_ruleDataBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataBlock17272); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataBlock


    // $ANTLR start ruleDataBlock
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7582:1: ruleDataBlock returns [EObject current=null] : ( '(' (lv_dataExpr_1= ruleDataExpr ) ')' ) ;
    public final EObject ruleDataBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_dataExpr_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7587:6: ( ( '(' (lv_dataExpr_1= ruleDataExpr ) ')' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7588:1: ( '(' (lv_dataExpr_1= ruleDataExpr ) ')' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7588:1: ( '(' (lv_dataExpr_1= ruleDataExpr ) ')' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7588:2: '(' (lv_dataExpr_1= ruleDataExpr ) ')'
            {
            match(input,36,FOLLOW_36_in_ruleDataBlock17306); 

                    createLeafNode(grammarAccess.getDataBlockAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7592:1: (lv_dataExpr_1= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7595:6: lv_dataExpr_1= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDataBlockAccess().getDataExprDataExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleDataBlock17340);
            lv_dataExpr_1=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "dataExpr", lv_dataExpr_1, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,37,FOLLOW_37_in_ruleDataBlock17353); 

                    createLeafNode(grammarAccess.getDataBlockAccess().getRightParenthesisKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataBlock


    // $ANTLR start entryRuleDataCurrent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7624:1: entryRuleDataCurrent returns [EObject current=null] : iv_ruleDataCurrent= ruleDataCurrent EOF ;
    public final EObject entryRuleDataCurrent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataCurrent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7624:53: (iv_ruleDataCurrent= ruleDataCurrent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7625:2: iv_ruleDataCurrent= ruleDataCurrent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataCurrentRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataCurrent_in_entryRuleDataCurrent17386);
            iv_ruleDataCurrent=ruleDataCurrent();
            _fsp--;

             current =iv_ruleDataCurrent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataCurrent17396); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataCurrent


    // $ANTLR start ruleDataCurrent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7632:1: ruleDataCurrent returns [EObject current=null] : ( '?' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ) ;
    public final EObject ruleDataCurrent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tick_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7637:6: ( ( '?' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7638:1: ( '?' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7638:1: ( '?' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7638:2: '?' ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )
            {
            match(input,89,FOLLOW_89_in_ruleDataCurrent17430); 

                    createLeafNode(grammarAccess.getDataCurrentAccess().getQuestionMarkKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7642:1: ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_ESTERELID) ) {
                alt108=1;
            }
            else if ( (LA108_0==92) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7642:1: ( ( RULE_ESTERELID ) | (lv_tick_2= ruleTick ) )", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7642:2: ( RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7642:2: ( RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7645:3: RULE_ESTERELID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDataCurrentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleDataCurrent17453); 

                    		createLeafNode(grammarAccess.getDataCurrentAccess().getSignalSignalCrossReference_1_0_0(), "signal"); 
                    	

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7659:6: (lv_tick_2= ruleTick )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7659:6: (lv_tick_2= ruleTick )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7662:6: lv_tick_2= ruleTick
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataCurrentAccess().getTickTickParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTick_in_ruleDataCurrent17496);
                    lv_tick_2=ruleTick();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataCurrentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tick", lv_tick_2, "Tick", currentNode);
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataCurrent


    // $ANTLR start entryRuleDataPre
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7687:1: entryRuleDataPre returns [EObject current=null] : iv_ruleDataPre= ruleDataPre EOF ;
    public final EObject entryRuleDataPre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPre = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7687:49: (iv_ruleDataPre= ruleDataPre EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7688:2: iv_ruleDataPre= ruleDataPre EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataPreRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataPre_in_entryRuleDataPre17534);
            iv_ruleDataPre=ruleDataPre();
            _fsp--;

             current =iv_ruleDataPre; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataPre17544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataPre


    // $ANTLR start ruleDataPre
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7695:1: ruleDataPre returns [EObject current=null] : ( 'pre' '(' '?' ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) ) ')' ) ;
    public final EObject ruleDataPre() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tick_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7700:6: ( ( 'pre' '(' '?' ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) ) ')' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7701:1: ( 'pre' '(' '?' ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) ) ')' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7701:1: ( 'pre' '(' '?' ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) ) ')' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7701:2: 'pre' '(' '?' ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) ) ')'
            {
            match(input,90,FOLLOW_90_in_ruleDataPre17578); 

                    createLeafNode(grammarAccess.getDataPreAccess().getPreKeyword_0(), null); 
                
            match(input,36,FOLLOW_36_in_ruleDataPre17587); 

                    createLeafNode(grammarAccess.getDataPreAccess().getLeftParenthesisKeyword_1(), null); 
                
            match(input,89,FOLLOW_89_in_ruleDataPre17596); 

                    createLeafNode(grammarAccess.getDataPreAccess().getQuestionMarkKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7713:1: ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ESTERELID) ) {
                alt109=1;
            }
            else if ( (LA109_0==92) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7713:1: ( ( RULE_ESTERELID ) | (lv_tick_4= ruleTick ) )", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7713:2: ( RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7713:2: ( RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7716:3: RULE_ESTERELID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDataPreRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleDataPre17619); 

                    		createLeafNode(grammarAccess.getDataPreAccess().getSignalSignalCrossReference_3_0_0(), "signal"); 
                    	

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7730:6: (lv_tick_4= ruleTick )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7730:6: (lv_tick_4= ruleTick )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7733:6: lv_tick_4= ruleTick
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataPreAccess().getTickTickParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTick_in_ruleDataPre17662);
                    lv_tick_4=ruleTick();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataPreRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tick", lv_tick_4, "Tick", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_ruleDataPre17676); 

                    createLeafNode(grammarAccess.getDataPreAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataPre


    // $ANTLR start entryRuleDataTrap
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7762:1: entryRuleDataTrap returns [EObject current=null] : iv_ruleDataTrap= ruleDataTrap EOF ;
    public final EObject entryRuleDataTrap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTrap = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7762:50: (iv_ruleDataTrap= ruleDataTrap EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7763:2: iv_ruleDataTrap= ruleDataTrap EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTrapRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataTrap_in_entryRuleDataTrap17709);
            iv_ruleDataTrap=ruleDataTrap();
            _fsp--;

             current =iv_ruleDataTrap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTrap17719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataTrap


    // $ANTLR start ruleDataTrap
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7770:1: ruleDataTrap returns [EObject current=null] : ( '??' ( RULE_ESTERELID ) ) ;
    public final EObject ruleDataTrap() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7775:6: ( ( '??' ( RULE_ESTERELID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7776:1: ( '??' ( RULE_ESTERELID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7776:1: ( '??' ( RULE_ESTERELID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7776:2: '??' ( RULE_ESTERELID )
            {
            match(input,91,FOLLOW_91_in_ruleDataTrap17753); 

                    createLeafNode(grammarAccess.getDataTrapAccess().getQuestionMarkQuestionMarkKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7780:1: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7783:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDataTrapRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleDataTrap17775); 

            		createLeafNode(grammarAccess.getDataTrapAccess().getTrapTrapDeclCrossReference_1_0(), "trap"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataTrap


    // $ANTLR start entryRuleDataFunction
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7803:1: entryRuleDataFunction returns [EObject current=null] : iv_ruleDataFunction= ruleDataFunction EOF ;
    public final EObject entryRuleDataFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFunction = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7803:54: (iv_ruleDataFunction= ruleDataFunction EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7804:2: iv_ruleDataFunction= ruleDataFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataFunction_in_entryRuleDataFunction17811);
            iv_ruleDataFunction=ruleDataFunction();
            _fsp--;

             current =iv_ruleDataFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataFunction17821); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataFunction


    // $ANTLR start ruleDataFunction
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7811:1: ruleDataFunction returns [EObject current=null] : ( ( RULE_ESTERELID ) '(' (lv_dataExpr_2= ruleDataExpr ) ( ',' (lv_dataExpr_4= ruleDataExpr ) )* ')' ) ;
    public final EObject ruleDataFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_dataExpr_2 = null;

        EObject lv_dataExpr_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7816:6: ( ( ( RULE_ESTERELID ) '(' (lv_dataExpr_2= ruleDataExpr ) ( ',' (lv_dataExpr_4= ruleDataExpr ) )* ')' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7817:1: ( ( RULE_ESTERELID ) '(' (lv_dataExpr_2= ruleDataExpr ) ( ',' (lv_dataExpr_4= ruleDataExpr ) )* ')' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7817:1: ( ( RULE_ESTERELID ) '(' (lv_dataExpr_2= ruleDataExpr ) ( ',' (lv_dataExpr_4= ruleDataExpr ) )* ')' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7817:2: ( RULE_ESTERELID ) '(' (lv_dataExpr_2= ruleDataExpr ) ( ',' (lv_dataExpr_4= ruleDataExpr ) )* ')'
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7817:2: ( RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7820:3: RULE_ESTERELID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDataFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleDataFunction17868); 

            		createLeafNode(grammarAccess.getDataFunctionAccess().getFunctionFunctionCrossReference_0_0(), "function"); 
            	

            }

            match(input,36,FOLLOW_36_in_ruleDataFunction17880); 

                    createLeafNode(grammarAccess.getDataFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7837:1: (lv_dataExpr_2= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7840:6: lv_dataExpr_2= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDataFunctionAccess().getDataExprDataExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleDataFunction17914);
            lv_dataExpr_2=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "dataExpr", lv_dataExpr_2, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7858:2: ( ',' (lv_dataExpr_4= ruleDataExpr ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==22) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7858:3: ',' (lv_dataExpr_4= ruleDataExpr )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleDataFunction17928); 

            	            createLeafNode(grammarAccess.getDataFunctionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7862:1: (lv_dataExpr_4= ruleDataExpr )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7865:6: lv_dataExpr_4= ruleDataExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataFunctionAccess().getDataExprDataExprParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataExpr_in_ruleDataFunction17962);
            	    lv_dataExpr_4=ruleDataExpr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dataExpr", lv_dataExpr_4, "DataExpr", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            match(input,37,FOLLOW_37_in_ruleDataFunction17977); 

                    createLeafNode(grammarAccess.getDataFunctionAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataFunction


    // $ANTLR start entryRuleTrapExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7894:1: entryRuleTrapExpr returns [EObject current=null] : iv_ruleTrapExpr= ruleTrapExpr EOF ;
    public final EObject entryRuleTrapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7894:50: (iv_ruleTrapExpr= ruleTrapExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7895:2: iv_ruleTrapExpr= ruleTrapExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapExpr_in_entryRuleTrapExpr18010);
            iv_ruleTrapExpr=ruleTrapExpr();
            _fsp--;

             current =iv_ruleTrapExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapExpr18020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapExpr


    // $ANTLR start ruleTrapExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7902:1: ruleTrapExpr returns [EObject current=null] : this_SigExpr_0= ruleSigExpr ;
    public final EObject ruleTrapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_SigExpr_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7907:6: (this_SigExpr_0= ruleSigExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7909:5: this_SigExpr_0= ruleSigExpr
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTrapExprAccess().getSigExprParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleSigExpr_in_ruleTrapExpr18066);
            this_SigExpr_0=ruleSigExpr();
            _fsp--;

             
                    current = this_SigExpr_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrapExpr


    // $ANTLR start entryRuleSigExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7924:1: entryRuleSigExpr returns [EObject current=null] : iv_ruleSigExpr= ruleSigExpr EOF ;
    public final EObject entryRuleSigExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7924:49: (iv_ruleSigExpr= ruleSigExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7925:2: iv_ruleSigExpr= ruleSigExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleSigExpr_in_entryRuleSigExpr18097);
            iv_ruleSigExpr=ruleSigExpr();
            _fsp--;

             current =iv_ruleSigExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExpr18107); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExpr


    // $ANTLR start ruleSigExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7932:1: ruleSigExpr returns [EObject current=null] : ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* ) ;
    public final EObject ruleSigExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_andExpr_0 = null;

        EObject lv_andExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7937:6: ( ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7938:1: ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7938:1: ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7938:2: (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7938:2: (lv_andExpr_0= ruleSigExprAND )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7941:6: lv_andExpr_0= ruleSigExprAND
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSigExprAccess().getAndExprSigExprANDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSigExprAND_in_ruleSigExpr18166);
            lv_andExpr_0=ruleSigExprAND();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSigExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "andExpr", lv_andExpr_0, "SigExprAND", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7959:2: ( 'or' (lv_andExpr_2= ruleSigExprAND ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==79) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7959:3: 'or' (lv_andExpr_2= ruleSigExprAND )
            	    {
            	    match(input,79,FOLLOW_79_in_ruleSigExpr18180); 

            	            createLeafNode(grammarAccess.getSigExprAccess().getOrKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7963:1: (lv_andExpr_2= ruleSigExprAND )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7966:6: lv_andExpr_2= ruleSigExprAND
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSigExprAccess().getAndExprSigExprANDParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSigExprAND_in_ruleSigExpr18214);
            	    lv_andExpr_2=ruleSigExprAND();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSigExprRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "andExpr", lv_andExpr_2, "SigExprAND", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSigExpr


    // $ANTLR start entryRuleSigExprAND
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7991:1: entryRuleSigExprAND returns [EObject current=null] : iv_ruleSigExprAND= ruleSigExprAND EOF ;
    public final EObject entryRuleSigExprAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExprAND = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7991:52: (iv_ruleSigExprAND= ruleSigExprAND EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7992:2: iv_ruleSigExprAND= ruleSigExprAND EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigExprANDRule(), currentNode); 
            pushFollow(FOLLOW_ruleSigExprAND_in_entryRuleSigExprAND18253);
            iv_ruleSigExprAND=ruleSigExprAND();
            _fsp--;

             current =iv_ruleSigExprAND; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExprAND18263); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExprAND


    // $ANTLR start ruleSigExprAND
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:7999:1: ruleSigExprAND returns [EObject current=null] : ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* ) ;
    public final EObject ruleSigExprAND() throws RecognitionException {
        EObject current = null;

        EObject lv_unaExpr_0 = null;

        EObject lv_unaExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8004:6: ( ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8005:1: ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8005:1: ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8005:2: (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8005:2: (lv_unaExpr_0= ruleSigExprUnary )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8008:6: lv_unaExpr_0= ruleSigExprUnary
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSigExprANDAccess().getUnaExprSigExprUnaryParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSigExprUnary_in_ruleSigExprAND18322);
            lv_unaExpr_0=ruleSigExprUnary();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSigExprANDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "unaExpr", lv_unaExpr_0, "SigExprUnary", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8026:2: ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==78) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8026:3: 'and' (lv_unaExpr_2= ruleSigExprUnary )
            	    {
            	    match(input,78,FOLLOW_78_in_ruleSigExprAND18336); 

            	            createLeafNode(grammarAccess.getSigExprANDAccess().getAndKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8030:1: (lv_unaExpr_2= ruleSigExprUnary )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8033:6: lv_unaExpr_2= ruleSigExprUnary
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSigExprANDAccess().getUnaExprSigExprUnaryParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSigExprUnary_in_ruleSigExprAND18370);
            	    lv_unaExpr_2=ruleSigExprUnary();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSigExprANDRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "unaExpr", lv_unaExpr_2, "SigExprUnary", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSigExprAND


    // $ANTLR start entryRuleSigExprUnary
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8058:1: entryRuleSigExprUnary returns [EObject current=null] : iv_ruleSigExprUnary= ruleSigExprUnary EOF ;
    public final EObject entryRuleSigExprUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExprUnary = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8058:54: (iv_ruleSigExprUnary= ruleSigExprUnary EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8059:2: iv_ruleSigExprUnary= ruleSigExprUnary EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigExprUnaryRule(), currentNode); 
            pushFollow(FOLLOW_ruleSigExprUnary_in_entryRuleSigExprUnary18409);
            iv_ruleSigExprUnary=ruleSigExprUnary();
            _fsp--;

             current =iv_ruleSigExprUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExprUnary18419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExprUnary


    // $ANTLR start ruleSigExprUnary
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8066:1: ruleSigExprUnary returns [EObject current=null] : ( (lv_expr_0= RULE_ESTERELID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) ) ;
    public final EObject ruleSigExprUnary() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0=null;
        EObject lv_sigExpr_2 = null;

        EObject lv_sigExpr_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8071:6: ( ( (lv_expr_0= RULE_ESTERELID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8072:1: ( (lv_expr_0= RULE_ESTERELID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8072:1: ( (lv_expr_0= RULE_ESTERELID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case RULE_ESTERELID:
                {
                alt113=1;
                }
                break;
            case 36:
                {
                alt113=2;
                }
                break;
            case 80:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("8072:1: ( (lv_expr_0= RULE_ESTERELID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) )", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8072:2: (lv_expr_0= RULE_ESTERELID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8072:2: (lv_expr_0= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8074:6: lv_expr_0= RULE_ESTERELID
                    {
                    lv_expr_0=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSigExprUnary18466); 

                    		createLeafNode(grammarAccess.getSigExprUnaryAccess().getExprEsterelIDTerminalRuleCall_0_0(), "expr"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSigExprUnaryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_0, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8093:6: ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8093:6: ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8093:7: '(' (lv_sigExpr_2= ruleSigExpr ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleSigExprUnary18490); 

                            createLeafNode(grammarAccess.getSigExprUnaryAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8097:1: (lv_sigExpr_2= ruleSigExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8100:6: lv_sigExpr_2= ruleSigExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSigExprUnaryAccess().getSigExprSigExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExpr_in_ruleSigExprUnary18524);
                    lv_sigExpr_2=ruleSigExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSigExprUnaryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "sigExpr", lv_sigExpr_2, "SigExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,37,FOLLOW_37_in_ruleSigExprUnary18537); 

                            createLeafNode(grammarAccess.getSigExprUnaryAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8123:6: ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8123:6: ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8123:7: 'not' (lv_sigExpr_5= ruleSigExprUnary )
                    {
                    match(input,80,FOLLOW_80_in_ruleSigExprUnary18554); 

                            createLeafNode(grammarAccess.getSigExprUnaryAccess().getNotKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8127:1: (lv_sigExpr_5= ruleSigExprUnary )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8130:6: lv_sigExpr_5= ruleSigExprUnary
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSigExprUnaryAccess().getSigExprSigExprUnaryParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExprUnary_in_ruleSigExprUnary18588);
                    lv_sigExpr_5=ruleSigExprUnary();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSigExprUnaryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "sigExpr", lv_sigExpr_5, "SigExprUnary", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSigExprUnary


    // $ANTLR start entryRuleDelayExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8155:1: entryRuleDelayExpr returns [EObject current=null] : iv_ruleDelayExpr= ruleDelayExpr EOF ;
    public final EObject entryRuleDelayExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8155:51: (iv_ruleDelayExpr= ruleDelayExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8156:2: iv_ruleDelayExpr= ruleDelayExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelayExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelayExpr_in_entryRuleDelayExpr18626);
            iv_ruleDelayExpr=ruleDelayExpr();
            _fsp--;

             current =iv_ruleDelayExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayExpr18636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDelayExpr


    // $ANTLR start ruleDelayExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8163:1: ruleDelayExpr returns [EObject current=null] : ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) ) ;
    public final EObject ruleDelayExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0 = null;

        EObject lv_expr_1 = null;

        EObject lv_event_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8168:6: ( ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8169:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8169:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )
            int alt114=2;
            switch ( input.LA(1) ) {
            case RULE_ESTERELID:
                {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==RULE_ESTERELID||(LA114_1>=33 && LA114_1<=34)||LA114_1==36||LA114_1==40||LA114_1==69||(LA114_1>=78 && LA114_1<=88)||LA114_1==90||LA114_1==92) ) {
                    alt114=2;
                }
                else if ( (LA114_1==EOF||(LA114_1>=19 && LA114_1<=20)||LA114_1==23||LA114_1==39||LA114_1==41||(LA114_1>=44 && LA114_1<=46)||(LA114_1>=48 && LA114_1<=50)||LA114_1==56||LA114_1==58||LA114_1==60||LA114_1==75) ) {
                    alt114=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("8169:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 114, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
            case 92:
                {
                alt114=1;
                }
                break;
            case 90:
                {
                int LA114_3 = input.LA(2);

                if ( (LA114_3==36) ) {
                    int LA114_5 = input.LA(3);

                    if ( (LA114_5==89) ) {
                        alt114=2;
                    }
                    else if ( (LA114_5==RULE_ESTERELID||LA114_5==36||LA114_5==80) ) {
                        alt114=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8169:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 114, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("8169:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 114, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 33:
            case 34:
            case 36:
            case 69:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
                {
                alt114=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("8169:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8169:2: (lv_event_0= ruleDelayEvent )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8169:2: (lv_event_0= ruleDelayEvent )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8172:6: lv_event_0= ruleDelayEvent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDelayExprAccess().getEventDelayEventParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDelayEvent_in_ruleDelayExpr18695);
                    lv_event_0=ruleDelayEvent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "event", lv_event_0, "DelayEvent", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8191:6: ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8191:6: ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8191:7: (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8191:7: (lv_expr_1= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8194:6: lv_expr_1= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDelayExprAccess().getExprDataExprParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleDelayExpr18740);
                    lv_expr_1=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8212:2: (lv_event_2= ruleDelayEvent )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8215:6: lv_event_2= ruleDelayEvent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDelayExprAccess().getEventDelayEventParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDelayEvent_in_ruleDelayExpr18778);
                    lv_event_2=ruleDelayEvent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "event", lv_event_2, "DelayEvent", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDelayExpr


    // $ANTLR start entryRuleDelayEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8240:1: entryRuleDelayEvent returns [EObject current=null] : iv_ruleDelayEvent= ruleDelayEvent EOF ;
    public final EObject entryRuleDelayEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayEvent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8240:52: (iv_ruleDelayEvent= ruleDelayEvent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8241:2: iv_ruleDelayEvent= ruleDelayEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelayEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelayEvent_in_entryRuleDelayEvent18816);
            iv_ruleDelayEvent=ruleDelayEvent();
            _fsp--;

             current =iv_ruleDelayEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayEvent18826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDelayEvent


    // $ANTLR start ruleDelayEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8248:1: ruleDelayEvent returns [EObject current=null] : ( ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) ) | ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' ) | ( '[' this_SigExpr_7= ruleSigExpr ']' ) ) ;
    public final EObject ruleDelayEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tick_1 = null;

        EObject this_SigExpr_4 = null;

        EObject this_SigExpr_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8253:6: ( ( ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) ) | ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' ) | ( '[' this_SigExpr_7= ruleSigExpr ']' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8254:1: ( ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) ) | ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' ) | ( '[' this_SigExpr_7= ruleSigExpr ']' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8254:1: ( ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) ) | ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' ) | ( '[' this_SigExpr_7= ruleSigExpr ']' ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case RULE_ESTERELID:
            case 92:
                {
                alt116=1;
                }
                break;
            case 90:
                {
                alt116=2;
                }
                break;
            case 40:
                {
                alt116=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("8254:1: ( ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) ) | ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' ) | ( '[' this_SigExpr_7= ruleSigExpr ']' ) )", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8254:2: ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8254:2: ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==RULE_ESTERELID) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==92) ) {
                        alt115=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8254:2: ( ( RULE_ESTERELID ) | (lv_tick_1= ruleTick ) )", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8254:3: ( RULE_ESTERELID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8254:3: ( RULE_ESTERELID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8257:3: RULE_ESTERELID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getDelayEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleDelayEvent18874); 

                            		createLeafNode(grammarAccess.getDelayEventAccess().getSignalSignalCrossReference_0_0_0(), "signal"); 
                            	

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8271:6: (lv_tick_1= ruleTick )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8271:6: (lv_tick_1= ruleTick )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8274:6: lv_tick_1= ruleTick
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDelayEventAccess().getTickTickParserRuleCall_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleTick_in_ruleDelayEvent18917);
                            lv_tick_1=ruleTick();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDelayEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "tick", lv_tick_1, "Tick", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8293:6: ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8293:6: ( 'pre' '(' this_SigExpr_4= ruleSigExpr ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8293:7: 'pre' '(' this_SigExpr_4= ruleSigExpr ')'
                    {
                    match(input,90,FOLLOW_90_in_ruleDelayEvent18938); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getPreKeyword_1_0(), null); 
                        
                    match(input,36,FOLLOW_36_in_ruleDelayEvent18947); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDelayEventAccess().getSigExprParserRuleCall_1_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSigExpr_in_ruleDelayEvent18969);
                    this_SigExpr_4=ruleSigExpr();
                    _fsp--;

                     
                            current = this_SigExpr_4; 
                            currentNode = currentNode.getParent();
                        
                    match(input,37,FOLLOW_37_in_ruleDelayEvent18977); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8315:6: ( '[' this_SigExpr_7= ruleSigExpr ']' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8315:6: ( '[' this_SigExpr_7= ruleSigExpr ']' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8315:7: '[' this_SigExpr_7= ruleSigExpr ']'
                    {
                    match(input,40,FOLLOW_40_in_ruleDelayEvent18994); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getLeftSquareBracketKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDelayEventAccess().getSigExprParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSigExpr_in_ruleDelayEvent19016);
                    this_SigExpr_7=ruleSigExpr();
                    _fsp--;

                     
                            current = this_SigExpr_7; 
                            currentNode = currentNode.getParent();
                        
                    match(input,41,FOLLOW_41_in_ruleDelayEvent19024); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getRightSquareBracketKeyword_2_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDelayEvent


    // $ANTLR start entryRuleChannelDescription
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8339:1: entryRuleChannelDescription returns [EObject current=null] : iv_ruleChannelDescription= ruleChannelDescription EOF ;
    public final EObject entryRuleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDescription = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8339:60: (iv_ruleChannelDescription= ruleChannelDescription EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8340:2: iv_ruleChannelDescription= ruleChannelDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChannelDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription19058);
            iv_ruleChannelDescription=ruleChannelDescription();
            _fsp--;

             current =iv_ruleChannelDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelDescription19068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleChannelDescription


    // $ANTLR start ruleChannelDescription
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8347:1: ruleChannelDescription returns [EObject current=null] : ( ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) ) ) ;
    public final EObject ruleChannelDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_1=null;
        Token lv_type_2=null;
        Token lv_type_4=null;
        Token lv_type_5=null;
        Token lv_type_10=null;
        Token lv_type_11=null;
        EObject lv_dataExpr_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8352:6: ( ( ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8353:1: ( ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8353:1: ( ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) ) )
            int alt120=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt120=1;
                }
                break;
            case 36:
                {
                alt120=2;
                }
                break;
            case 42:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("8353:1: ( ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) ) )", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8353:2: ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8353:2: ( ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8353:3: ':' ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleChannelDescription19103); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8357:1: ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==RULE_ESTERELID) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==RULE_BASETYPE) ) {
                        alt117=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8357:1: ( (lv_type_1= RULE_ESTERELID ) | (lv_type_2= RULE_BASETYPE ) )", 117, 0, input);

                        throw nvae;
                    }
                    switch (alt117) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8357:2: (lv_type_1= RULE_ESTERELID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8357:2: (lv_type_1= RULE_ESTERELID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8359:6: lv_type_1= RULE_ESTERELID
                            {
                            lv_type_1=(Token)input.LT(1);
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleChannelDescription19126); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeEsterelIDTerminalRuleCall_0_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_1, "EsterelID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8378:6: (lv_type_2= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8378:6: (lv_type_2= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8380:6: lv_type_2= RULE_BASETYPE
                            {
                            lv_type_2=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleChannelDescription19162); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeBaseTypeTerminalRuleCall_0_1_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_2, "BaseType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8399:6: ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8399:6: ( '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8399:7: '(' ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleChannelDescription19188); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8403:1: ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==RULE_ESTERELID) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==RULE_BASETYPE) ) {
                        alt118=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8403:1: ( (lv_type_4= RULE_ESTERELID ) | (lv_type_5= RULE_BASETYPE ) )", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8403:2: (lv_type_4= RULE_ESTERELID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8403:2: (lv_type_4= RULE_ESTERELID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8405:6: lv_type_4= RULE_ESTERELID
                            {
                            lv_type_4=(Token)input.LT(1);
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleChannelDescription19211); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeEsterelIDTerminalRuleCall_1_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_4, "EsterelID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8424:6: (lv_type_5= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8424:6: (lv_type_5= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8426:6: lv_type_5= RULE_BASETYPE
                            {
                            lv_type_5=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleChannelDescription19247); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeBaseTypeTerminalRuleCall_1_1_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    match(input,37,FOLLOW_37_in_ruleChannelDescription19265); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8449:6: ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8449:6: ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8449:7: ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) )
                    {
                    match(input,42,FOLLOW_42_in_ruleChannelDescription19282); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8453:1: (lv_dataExpr_8= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8456:6: lv_dataExpr_8= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getDataExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleChannelDescription19316);
                    lv_dataExpr_8=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "dataExpr", lv_dataExpr_8, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleChannelDescription19329); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8478:1: ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) )
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==RULE_ESTERELID) ) {
                        alt119=1;
                    }
                    else if ( (LA119_0==RULE_BASETYPE) ) {
                        alt119=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8478:1: ( (lv_type_10= RULE_ESTERELID ) | (lv_type_11= RULE_BASETYPE ) )", 119, 0, input);

                        throw nvae;
                    }
                    switch (alt119) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8478:2: (lv_type_10= RULE_ESTERELID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8478:2: (lv_type_10= RULE_ESTERELID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8480:6: lv_type_10= RULE_ESTERELID
                            {
                            lv_type_10=(Token)input.LT(1);
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleChannelDescription19352); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeEsterelIDTerminalRuleCall_2_3_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_10, "EsterelID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8499:6: (lv_type_11= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8499:6: (lv_type_11= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8501:6: lv_type_11= RULE_BASETYPE
                            {
                            lv_type_11=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleChannelDescription19388); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeBaseTypeTerminalRuleCall_2_3_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_11, "BaseType", lastConsumedNode);
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

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleChannelDescription


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8526:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8526:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8527:2: iv_ruleSignal= ruleSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal19431);
            iv_ruleSignal=ruleSignal();
            _fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal19441); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8534:1: ruleSignal returns [EObject current=null] : ( (lv_name_0= RULE_ESTERELID ) (lv_channel_1= ruleChannelDescription )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_channel_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8539:6: ( ( (lv_name_0= RULE_ESTERELID ) (lv_channel_1= ruleChannelDescription )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8540:1: ( (lv_name_0= RULE_ESTERELID ) (lv_channel_1= ruleChannelDescription )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8540:1: ( (lv_name_0= RULE_ESTERELID ) (lv_channel_1= ruleChannelDescription )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8540:2: (lv_name_0= RULE_ESTERELID ) (lv_channel_1= ruleChannelDescription )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8540:2: (lv_name_0= RULE_ESTERELID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8542:6: lv_name_0= RULE_ESTERELID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSignal19488); 

            		createLeafNode(grammarAccess.getSignalAccess().getNameEsterelIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8560:2: (lv_channel_1= ruleChannelDescription )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==18||LA121_0==36||LA121_0==42) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8563:6: lv_channel_1= ruleChannelDescription
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getChannelChannelDescriptionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleChannelDescription_in_ruleSignal19530);
                    lv_channel_1=ruleChannelDescription();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "channel", lv_channel_1, "ChannelDescription", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleTick
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8588:1: entryRuleTick returns [String current=null] : iv_ruleTick= ruleTick EOF ;
    public final String entryRuleTick() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTick = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8588:45: (iv_ruleTick= ruleTick EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8589:2: iv_ruleTick= ruleTick EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTickRule(), currentNode); 
            pushFollow(FOLLOW_ruleTick_in_entryRuleTick19569);
            iv_ruleTick=ruleTick();
            _fsp--;

             current =iv_ruleTick.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTick19580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTick


    // $ANTLR start ruleTick
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8596:1: ruleTick returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'tick' ;
    public final AntlrDatatypeRuleToken ruleTick() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8602:6: (kw= 'tick' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8604:2: kw= 'tick'
            {
            kw=(Token)input.LT(1);
            match(input,92,FOLLOW_92_in_ruleTick19617); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getTickAccess().getTickKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTick


    // $ANTLR start entryRuleSensor
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8617:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8617:48: (iv_ruleSensor= ruleSensor EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8618:2: iv_ruleSensor= ruleSensor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSensorRule(), currentNode); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor19654);
            iv_ruleSensor=ruleSensor();
            _fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor19664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSensor


    // $ANTLR start ruleSensor
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8625:1: ruleSensor returns [EObject current=null] : ( ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_type_2=null;
        Token lv_type_3=null;
        Token lv_name_4=null;
        Token lv_type_6=null;
        Token lv_type_7=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8630:6: ( ( ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8631:1: ( ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8631:1: ( ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_ESTERELID) ) {
                int LA124_1 = input.LA(2);

                if ( (LA124_1==36) ) {
                    alt124=2;
                }
                else if ( (LA124_1==18) ) {
                    alt124=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("8631:1: ( ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )", 124, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("8631:1: ( ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8631:2: ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8631:2: ( (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8631:3: (lv_name_0= RULE_ESTERELID ) ':' ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8631:3: (lv_name_0= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8633:6: lv_name_0= RULE_ESTERELID
                    {
                    lv_name_0=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSensor19712); 

                    		createLeafNode(grammarAccess.getSensorAccess().getNameEsterelIDTerminalRuleCall_0_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleSensor19729); 

                            createLeafNode(grammarAccess.getSensorAccess().getColonKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8655:1: ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==RULE_ESTERELID) ) {
                        alt122=1;
                    }
                    else if ( (LA122_0==RULE_BASETYPE) ) {
                        alt122=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8655:1: ( (lv_type_2= RULE_ESTERELID ) | (lv_type_3= RULE_BASETYPE ) )", 122, 0, input);

                        throw nvae;
                    }
                    switch (alt122) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8655:2: (lv_type_2= RULE_ESTERELID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8655:2: (lv_type_2= RULE_ESTERELID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8657:6: lv_type_2= RULE_ESTERELID
                            {
                            lv_type_2=(Token)input.LT(1);
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSensor19752); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeEsterelIDTerminalRuleCall_0_2_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_2, "EsterelID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8676:6: (lv_type_3= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8676:6: (lv_type_3= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8678:6: lv_type_3= RULE_BASETYPE
                            {
                            lv_type_3=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleSensor19788); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeBaseTypeTerminalRuleCall_0_2_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_3, "BaseType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8697:6: ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8697:6: ( (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8697:7: (lv_name_4= RULE_ESTERELID ) '(' ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) ) ')'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8697:7: (lv_name_4= RULE_ESTERELID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8699:6: lv_name_4= RULE_ESTERELID
                    {
                    lv_name_4=(Token)input.LT(1);
                    match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSensor19827); 

                    		createLeafNode(grammarAccess.getSensorAccess().getNameEsterelIDTerminalRuleCall_1_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_4, "EsterelID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleSensor19844); 

                            createLeafNode(grammarAccess.getSensorAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8721:1: ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) )
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==RULE_ESTERELID) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==RULE_BASETYPE) ) {
                        alt123=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8721:1: ( (lv_type_6= RULE_ESTERELID ) | (lv_type_7= RULE_BASETYPE ) )", 123, 0, input);

                        throw nvae;
                    }
                    switch (alt123) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8721:2: (lv_type_6= RULE_ESTERELID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8721:2: (lv_type_6= RULE_ESTERELID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8723:6: lv_type_6= RULE_ESTERELID
                            {
                            lv_type_6=(Token)input.LT(1);
                            match(input,RULE_ESTERELID,FOLLOW_RULE_ESTERELID_in_ruleSensor19867); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeEsterelIDTerminalRuleCall_1_2_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_6, "EsterelID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8742:6: (lv_type_7= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8742:6: (lv_type_7= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/esterel/parser/antlr/internal/InternalEsterel.g:8744:6: lv_type_7= RULE_BASETYPE
                            {
                            lv_type_7=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleSensor19903); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeBaseTypeTerminalRuleCall_1_2_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_7, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    match(input,37,FOLLOW_37_in_ruleSensor19921); 

                            createLeafNode(grammarAccess.getSensorAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSensor


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleProgram142 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleProgram180 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModule262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleModule284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModule301 = new BitSet(new long[]{0xE8F8A9499F200010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleModuleInterface_in_ruleModule335 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleModuleBody_in_ruleModule374 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEndModule_in_ruleModule387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndModule_in_entryRuleEndModule413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndModule424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEndModule463 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEndModule476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEndModule496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleBody_in_entryRuleModuleBody534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleBody544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModuleBody602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleInterface_in_entryRuleModuleInterface638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleInterface648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDecl_in_ruleModuleInterface707 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleModuleInterface751 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleSensorDecl_in_ruleModuleInterface795 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_ruleModuleInterface839 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleRelationDecl_in_ruleModuleInterface883 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleFunctionDecl_in_ruleModuleInterface927 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleProcedureDecl_in_ruleModuleInterface971 = new BitSet(new long[]{0x000000499F200002L});
    public static final BitSet FOLLOW_ruleSignalDecl_in_entryRuleSignalDecl1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDecl1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSignalDecl1063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1097 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1145 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSignalDecl1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1220 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1268 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignalDecl1309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1343 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1391 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignalDecl1432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1466 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1514 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDecl_in_entryRuleSensorDecl1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDecl1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSensorDecl1607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleSensorDecl1641 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSensorDecl1655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleSensorDecl1689 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSensorDecl1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDecl_in_entryRuleRelationDecl1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationDecl1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationDecl1790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelationDecl1824 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleRelationDecl1838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelationDecl1872 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleRelationDecl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_entryRuleRelationType1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationType1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationImplication_in_ruleRelationType1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationIncompatibility_in_ruleRelationType2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationImplication_in_entryRuleRelationImplication2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationImplication2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleRelationImplication2093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRelationImplication2117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleRelationImplication2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationIncompatibility_in_entryRuleRelationIncompatibility2188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationIncompatibility2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleRelationIncompatibility2245 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRelationIncompatibility2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleRelationIncompatibility2304 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleRelationIncompatibility2317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleRelationIncompatibility2339 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeDecl2421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDecl2455 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTypeDecl2469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDecl2503 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDecl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleType2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl2647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDecl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConstantDecl2691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2725 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleConstantDecl2739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2773 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleConstantDecl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneTypeConstantDecl_in_entryRuleOneTypeConstantDecl2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneTypeConstantDecl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl2890 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleOneTypeConstantDecl2904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl2938 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleOneTypeConstantDecl2953 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleOneTypeConstantDecl2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleOneTypeConstantDecl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleConstant3111 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleConstant3129 = new BitSet(new long[]{0x00000004000003D0L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleConstant3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue3203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleConstantValue3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConstantValue3280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantValue3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantValue3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleConstantValue3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleConstantValue3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDecl_in_entryRuleFunctionDecl3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDecl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFunctionDecl3463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFunctionDecl3497 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDecl3511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFunctionDecl3545 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionDecl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleFunction3650 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFunction3667 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleFunction3691 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleFunction3703 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunction3723 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleFunction3746 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleFunction3758 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_37_in_ruleFunction3781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunction3790 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleFunction3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleFunction3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedureDecl_in_entryRuleProcedureDecl3891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedureDecl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleProcedureDecl3935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleProcedureDecl3969 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleProcedureDecl3983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleProcedureDecl4017 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleProcedureDecl4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure4065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleProcedure4122 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProcedure4139 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleProcedure4163 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleProcedure4175 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_22_in_ruleProcedure4195 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleProcedure4218 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleProcedure4230 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_37_in_ruleProcedure4253 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProcedure4262 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleProcedure4286 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleProcedure4298 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_22_in_ruleProcedure4318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleProcedure4341 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleProcedure4353 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_37_in_ruleProcedure4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleStatement4466 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleStatement4484 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleSequence_in_ruleStatement4518 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleAtomicStatement_in_entryRuleAtomicStatement4557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicStatement4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_ruleAtomicStatement4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAtomicStatement4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_ruleAtomicStatement4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAtomicStatement4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_ruleAtomicStatement4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_ruleAtomicStatement4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEveryDo_in_ruleAtomicStatement4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleAtomicStatement4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHalt_in_ruleAtomicStatement4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfTest_in_ruleAtomicStatement4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSignalDecl_in_ruleAtomicStatement4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleAtomicStatement4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNothing_in_ruleAtomicStatement4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleAtomicStatement4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_ruleAtomicStatement4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_ruleAtomicStatement5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_ruleAtomicStatement5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_ruleAtomicStatement5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSustain_in_ruleAtomicStatement5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrap_in_ruleAtomicStatement5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAtomicStatement5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbort_in_ruleAtomicStatement5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence5213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicStatement_in_ruleSequence5270 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSequence5288 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleAtomicStatement_in_ruleSequence5322 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSequence5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock5373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBlock5417 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlock5451 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleBlock5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment5497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleAssignment5554 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAssignment5571 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleAssignment5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_entryRuleAbort5642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbort5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAbort5686 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbort5720 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAbort5733 = new BitSet(new long[]{0x00004116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleAbortBody_in_ruleAbort5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortBody_in_entryRuleAbortBody5804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortBody5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortInstance_in_ruleAbortBody5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCase_in_ruleAbortBody5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortEnd_in_entryRuleAbortEnd5921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortEnd5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAbortEnd5970 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAbortEnd5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortInstance_in_entryRuleAbortInstance6024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortInstance6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleAbortInstance6093 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleAbortInstance6107 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbortInstance6141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAbortEnd_in_ruleAbortInstance6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCase_in_entryRuleAbortCase6218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortCase6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase6287 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase6325 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_ruleAbortEnd_in_ruleAbortCase6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_entryRuleAbortCaseSingle6401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortCaseSingle6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAbortCaseSingle6445 = new BitSet(new long[]{0x00000116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleAbortCaseSingle6479 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleAbortCaseSingle6493 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbortCaseSingle6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_entryRuleAwait6566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwait6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAwait6610 = new BitSet(new long[]{0x00004116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleAwaitBody_in_ruleAwait6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitBody_in_entryRuleAwaitBody6681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitBody6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitInstance_in_ruleAwaitBody6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitCase_in_ruleAwaitBody6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitEnd_in_entryRuleAwaitEnd6798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitEnd6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAwaitEnd6847 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAwaitEnd6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitInstance_in_entryRuleAwaitInstance6901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitInstance6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleAwaitInstance6958 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleAwaitInstance6967 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAwaitInstance7001 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAwaitEnd_in_ruleAwaitInstance7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitCase_in_entryRuleAwaitCase7078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitCase7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase7147 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase7185 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_ruleAwaitEnd_in_ruleAwaitCase7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_entryRuleDo7261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDo7305 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo7339 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleDoUpto_in_ruleDo7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWatching_in_ruleDo7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoUpto_in_entryRuleDoUpto7460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoUpto7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDoUpto7504 = new BitSet(new long[]{0x00000116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleDoUpto7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWatching_in_entryRuleDoWatching7575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWatching7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDoWatching7619 = new BitSet(new long[]{0x00000116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleDoWatching7653 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleDoWatchingEnd_in_ruleDoWatching7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWatchingEnd_in_entryRuleDoWatchingEnd7729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWatchingEnd7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDoWatchingEnd7773 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDoWatchingEnd7807 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDoWatchingEnd7820 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDoWatchingEnd7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_entryRuleEmit7865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmit7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEmit7909 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleEmit7932 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleTick_in_ruleEmit7975 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleEmit7990 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleEmit8024 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEmit8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEveryDo_in_entryRuleEveryDo8072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEveryDo8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEveryDo8116 = new BitSet(new long[]{0x00000116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleEveryDo8150 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEveryDo8163 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleEveryDo8197 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEveryDo8210 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEveryDo8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit8255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExit8299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleExit8321 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleExit8334 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleExit8368 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExit8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHalt_in_entryRuleHalt8416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHalt8426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleHalt8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfTest_in_entryRuleIfTest8502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfTest8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIfTest8546 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleIfTest8580 = new BitSet(new long[]{0x0700000000080000L});
    public static final BitSet FOLLOW_ruleThenPart_in_ruleIfTest8618 = new BitSet(new long[]{0x0500000000080000L});
    public static final BitSet FOLLOW_ruleElsIfPart_in_ruleIfTest8657 = new BitSet(new long[]{0x0400000000080000L});
    public static final BitSet FOLLOW_ruleElsePart_in_ruleIfTest8696 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIfTest8710 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIfTest8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElsIfPart_in_entryRuleElsIfPart8755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElsIfPart8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElsIf_in_ruleElsIfPart8824 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleElsIf_in_ruleElsIfPart8862 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleElsIf_in_entryRuleElsIf8900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElsIf8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleElsIf8944 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleElsIf8978 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleThenPart_in_ruleElsIf9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenPart_in_entryRuleThenPart9054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenPart9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleThenPart9098 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenPart9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElsePart_in_entryRuleElsePart9169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElsePart9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleElsePart9213 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleElsePart9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop9284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLoop9328 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleLoopBody_in_ruleLoop9362 = new BitSet(new long[]{0x1000000000080000L});
    public static final BitSet FOLLOW_ruleEndLoop_in_ruleLoop9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopEach_in_ruleLoop9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndLoop_in_entryRuleEndLoop9447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndLoop9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEndLoop9496 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEndLoop9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopEach_in_entryRuleLoopEach9550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopEach9560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLoopEach9594 = new BitSet(new long[]{0x00000116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleLoopDelay_in_ruleLoopEach9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopDelay_in_entryRuleLoopDelay9648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopDelay9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleLoopDelay9716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopBody_in_entryRuleLoopBody9752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopBody9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLoopBody9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNothing_in_entryRuleNothing9856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNothing9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNothing9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause9942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePause9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_entryRulePresent10028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresent10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePresent10072 = new BitSet(new long[]{0x0000411000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulePresentBody_in_rulePresent10106 = new BitSet(new long[]{0x0400000000080000L});
    public static final BitSet FOLLOW_ruleElsePart_in_rulePresent10144 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePresent10158 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePresent10168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentBody_in_entryRulePresentBody10203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentBody10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEventBody_in_rulePresentBody10260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentCaseList_in_rulePresentBody10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEventBody_in_entryRulePresentEventBody10319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentEventBody10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEvent_in_rulePresentEventBody10388 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleThenPart_in_rulePresentEventBody10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentCaseList_in_entryRulePresentCaseList10464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentCaseList10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentCase_in_rulePresentCaseList10533 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rulePresentCase_in_rulePresentCaseList10571 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rulePresentCase_in_entryRulePresentCase10609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentCase10619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePresentCase10653 = new BitSet(new long[]{0x0000011000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulePresentEvent_in_rulePresentCase10687 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_rulePresentCase10701 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_rulePresentCase10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEvent_in_entryRulePresentEvent10774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentEvent10784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExpr_in_rulePresentEvent10843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePresentEvent10863 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_rulePresentEvent10897 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePresentEvent10910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat10944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeat10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRepeat11000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRepeat11023 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleRepeat11057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleRepeat11070 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleRepeat11104 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRepeat11117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRepeat11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_entryRuleRun11162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRun11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRun11207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModuleRenaming_in_ruleRun11241 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleRun11255 = new BitSet(new long[]{0x0000000980000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRenamingList_in_ruleRun11289 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRun11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleRun11321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModuleRenaming_in_ruleRun11355 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleRun11369 = new BitSet(new long[]{0x0000000980000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRenamingList_in_ruleRun11403 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRun11416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleRenaming_in_entryRuleModuleRenaming11452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleRenaming11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleModuleRenaming11509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleModuleRenaming11534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleModuleRenaming11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenamingList_in_entryRuleRenamingList11612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenamingList11622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleRenamingList11681 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleRenamingList11695 = new BitSet(new long[]{0x0000000980000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleRenamingList11729 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming11768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRenaming11813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRenaming_in_ruleRenaming11847 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming11861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRenaming_in_ruleRenaming11895 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_32_in_ruleRenaming11918 = new BitSet(new long[]{0x00000004000003D0L});
    public static final BitSet FOLLOW_ruleConstantRenaming_in_ruleRenaming11952 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming11966 = new BitSet(new long[]{0x00000004000003D0L});
    public static final BitSet FOLLOW_ruleConstantRenaming_in_ruleRenaming12000 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_35_in_ruleRenaming12023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionRenaming_in_ruleRenaming12057 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming12071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionRenaming_in_ruleRenaming12105 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_70_in_ruleRenaming12128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_ruleRenaming12162 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming12176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_ruleRenaming12210 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTypeRenaming_in_entryRuleTypeRenaming12250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRenaming12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleTypeRenaming12307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleTypeRenaming12319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleTypeRenaming12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantRenaming_in_entryRuleConstantRenaming12377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantRenaming12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleConstantRenaming12446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleConstantRenaming12459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleConstantRenaming12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionRenaming_in_entryRuleFunctionRenaming12522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionRenaming12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleFunctionRenaming12579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFunctionRenaming12591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleFunctionRenaming12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming12651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalRenaming12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSignalRenaming12708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSignalRenaming12720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSignalRenaming12742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSignalDecl_in_entryRuleLocalSignalDecl12778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalSignalDecl12788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLocalSignalDecl12822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocalSignalList_in_ruleLocalSignalDecl12856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleLocalSignalDecl12869 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLocalSignalDecl12903 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalSignalDecl12916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleLocalSignalDecl12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSignalList_in_entryRuleLocalSignalList12961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalSignalList12971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleLocalSignalList13039 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleLocalSignalList13053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleLocalSignalList13087 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSuspend_in_entryRuleSuspend13126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspend13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSuspend13170 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSuspend13204 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSuspend13217 = new BitSet(new long[]{0x00000116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleSuspend13251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSustain_in_entryRuleSustain13288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSustain13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSustain13332 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSustain13355 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleTick_in_ruleSustain13398 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleSustain13413 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleSustain13447 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSustain13460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrap_in_entryRuleTrap13495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrap13505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTrap13539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTrapDeclList_in_ruleTrap13573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleTrap13586 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTrap13620 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTrapHandlerList_in_ruleTrap13658 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTrap13672 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleTrap13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapDeclList_in_entryRuleTrapDeclList13717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapDeclList13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13786 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTrapDeclList13800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13834 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTrapDecl_in_entryRuleTrapDecl13873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapDecl13883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleTrapDecl13930 = new BitSet(new long[]{0x0000041000040002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_ruleTrapDecl13972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapHandlerList_in_entryRuleTrapHandlerList14010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapHandlerList14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList14079 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList14117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTrapHandler_in_entryRuleTrapHandler14155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapHandler14165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTrapHandler14199 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleTrapExpr_in_ruleTrapHandler14233 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTrapHandler14246 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTrapHandler14280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable14317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable14327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleVariable14361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleVariable14395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleVariable14408 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVariable14442 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariable14455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleVariable14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl14500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl14510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableList_in_ruleVariableDecl14569 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDecl14582 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleVariableDecl14605 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14641 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleVariableDecl14669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableList_in_ruleVariableDecl14703 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDecl14716 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleVariableDecl14739 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14775 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleVariableList_in_entryRuleVariableList14819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableList14829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleVariableList14876 = new BitSet(new long[]{0x0000040000400002L});
    public static final BitSet FOLLOW_42_in_ruleVariableList14894 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleVariableList14928 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleVariableList14953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleVariableList14975 = new BitSet(new long[]{0x0000040000400002L});
    public static final BitSet FOLLOW_42_in_ruleVariableList14993 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleVariableList15027 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleWeakAbort_in_entryRuleWeakAbort15068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbort15078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleWeakAbort15112 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleWeakAbort15121 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWeakAbort15155 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleWeakAbort15168 = new BitSet(new long[]{0x00004116000003D0L,0x000000001FFFC020L});
    public static final BitSet FOLLOW_ruleWeakAbortBody_in_ruleWeakAbort15202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortBody_in_entryRuleWeakAbortBody15239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortBody15249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortInstance_in_ruleWeakAbortBody15296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortCase_in_ruleWeakAbortBody15323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortEnd_in_entryRuleWeakAbortEnd15356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortEnd15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWeakAbortEnd15405 = new BitSet(new long[]{0x0000080000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleWeakAbortEnd15420 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleWeakAbortEnd15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortInstance_in_entryRuleWeakAbortInstance15475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortInstance15485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleWeakAbortInstance15544 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleWeakAbortInstance15558 = new BitSet(new long[]{0xE8F8A90000000010L,0x000000000000375BL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWeakAbortInstance15592 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortInstance15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortCase_in_entryRuleWeakAbortCase15669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortCase15679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15738 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15776 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortCase15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataExpr_in_entryRuleDataExpr15852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataExpr15862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataUnaryExpr_in_ruleDataExpr15910 = new BitSet(new long[]{0x0000000600000002L,0x0000000001FFC020L});
    public static final BitSet FOLLOW_ruleDataOp_in_ruleDataExpr15953 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataExpr15991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataOp_in_ruleDataExpr16039 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataExpr16077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataOp_in_entryRuleDataOp16116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataOp16127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDataOp16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDataOp16184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDataOp16203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDataOp16222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDataOp16241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDataOp16260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDataOp16279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDataOp16298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataOp16317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDataOp16336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataOp16355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDataOp16374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDataOp16393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDataOp16412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataUnaryExpr_in_entryRuleDataUnaryExpr16450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataUnaryExpr16460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueFloat_in_ruleDataUnaryExpr16507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueBoolean_in_ruleDataUnaryExpr16534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueInt_in_ruleDataUnaryExpr16561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueString_in_ruleDataUnaryExpr16588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueID_in_ruleDataUnaryExpr16615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBlock_in_ruleDataUnaryExpr16642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataCurrent_in_ruleDataUnaryExpr16669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataPre_in_ruleDataUnaryExpr16696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTrap_in_ruleDataUnaryExpr16723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataFunction_in_ruleDataUnaryExpr16750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueID_in_entryRuleDataValueID16782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataValueID16792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleDataValueID16838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueFloat_in_entryRuleDataValueFloat16878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataValueFloat16888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleDataValueFloat16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueBoolean_in_entryRuleDataValueBoolean16974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataValueBoolean16984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleDataValueBoolean17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueInt_in_entryRuleDataValueInt17070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataValueInt17080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataValueInt17126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataValueString_in_entryRuleDataValueString17166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataValueString17176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataValueString17222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBlock_in_entryRuleDataBlock17262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataBlock17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataBlock17306 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataBlock17340 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDataBlock17353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataCurrent_in_entryRuleDataCurrent17386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataCurrent17396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDataCurrent17430 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleDataCurrent17453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_ruleDataCurrent17496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataPre_in_entryRuleDataPre17534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataPre17544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDataPre17578 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDataPre17587 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleDataPre17596 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleDataPre17619 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleTick_in_ruleDataPre17662 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDataPre17676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTrap_in_entryRuleDataTrap17709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTrap17719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleDataTrap17753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleDataTrap17775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataFunction_in_entryRuleDataFunction17811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataFunction17821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleDataFunction17868 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDataFunction17880 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataFunction17914 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_22_in_ruleDataFunction17928 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataFunction17962 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_37_in_ruleDataFunction17977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapExpr_in_entryRuleTrapExpr18010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapExpr18020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleTrapExpr18066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExpr_in_entryRuleSigExpr18097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExpr18107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExprAND_in_ruleSigExpr18166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleSigExpr18180 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExprAND_in_ruleSigExpr18214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSigExprAND_in_entryRuleSigExprAND18253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExprAND18263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_ruleSigExprAND18322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleSigExprAND18336 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_ruleSigExprAND18370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_entryRuleSigExprUnary18409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExprUnary18419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSigExprUnary18466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSigExprUnary18490 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleSigExprUnary18524 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSigExprUnary18537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleSigExprUnary18554 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_ruleSigExprUnary18588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_entryRuleDelayExpr18626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayExpr18636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayEvent_in_ruleDelayExpr18695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDelayExpr18740 = new BitSet(new long[]{0x0000010000000010L,0x0000000014000000L});
    public static final BitSet FOLLOW_ruleDelayEvent_in_ruleDelayExpr18778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayEvent_in_entryRuleDelayEvent18816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayEvent18826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleDelayEvent18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_ruleDelayEvent18917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDelayEvent18938 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDelayEvent18947 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleDelayEvent18969 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDelayEvent18977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDelayEvent18994 = new BitSet(new long[]{0x0000001000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleDelayEvent19016 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDelayEvent19024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription19058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelDescription19068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleChannelDescription19103 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleChannelDescription19126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleChannelDescription19162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleChannelDescription19188 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleChannelDescription19211 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleChannelDescription19247 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleChannelDescription19265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleChannelDescription19282 = new BitSet(new long[]{0x00000016000003D0L,0x000000000FFFC020L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleChannelDescription19316 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChannelDescription19329 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleChannelDescription19352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleChannelDescription19388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal19431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal19441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSignal19488 = new BitSet(new long[]{0x0000041000040002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_ruleSignal19530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_entryRuleTick19569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTick19580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTick19617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor19654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor19664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSensor19712 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSensor19729 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSensor19752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleSensor19788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSensor19827 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSensor19844 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ESTERELID_in_ruleSensor19867 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleSensor19903 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSensor19921 = new BitSet(new long[]{0x0000000000000002L});

}