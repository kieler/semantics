package de.cau.cs.kieler.sim.esi.parser.antlr.internal; 

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
import de.cau.cs.kieler.sim.esi.services.EsiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEsiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_LETTER", "RULE_DIGIT", "RULE_WS", "RULE_COMMENT", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_COMMENT=9;
    public static final int RULE_WS=8;
    public static final int EOF=-1;
    public static final int RULE_DIGIT=7;
    public static final int RULE_LETTER=6;
    public static final int RULE_NUM=5;

        public InternalEsiParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g"; }



     	private EsiGrammarAccess grammarAccess;
     	
        public InternalEsiParser(TokenStream input, IAstFactory factory, EsiGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "tracelist";	
       	}
       	
       	@Override
       	protected EsiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuletracelist
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:77:1: entryRuletracelist returns [EObject current=null] : iv_ruletracelist= ruletracelist EOF ;
    public final EObject entryRuletracelist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletracelist = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:78:2: (iv_ruletracelist= ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:79:2: iv_ruletracelist= ruletracelist EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTracelistRule(), currentNode); 
            pushFollow(FOLLOW_ruletracelist_in_entryRuletracelist75);
            iv_ruletracelist=ruletracelist();
            _fsp--;

             current =iv_ruletracelist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletracelist85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuletracelist


    // $ANTLR start ruletracelist
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:86:1: ruletracelist returns [EObject current=null] : ( ( (lv_traces_0_0= ruletrace ) )? ( '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) ) )+ ) ;
    public final EObject ruletracelist() throws RecognitionException {
        EObject current = null;

        EObject lv_traces_0_0 = null;

        EObject lv_traces_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:91:6: ( ( ( (lv_traces_0_0= ruletrace ) )? ( '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) ) )+ ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:92:1: ( ( (lv_traces_0_0= ruletrace ) )? ( '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) ) )+ )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:92:1: ( ( (lv_traces_0_0= ruletrace ) )? ( '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) ) )+ )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:92:2: ( (lv_traces_0_0= ruletrace ) )? ( '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) ) )+
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:92:2: ( (lv_traces_0_0= ruletrace ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:93:1: (lv_traces_0_0= ruletrace )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:93:1: (lv_traces_0_0= ruletrace )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:94:3: lv_traces_0_0= ruletrace
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruletrace_in_ruletracelist131);
                    lv_traces_0_0=ruletrace();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTracelistRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"traces",
                    	        		lv_traces_0_0, 
                    	        		"trace", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:116:3: ( '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:116:5: '!' 'reset' ';' ( (lv_traces_4_0= ruletrace ) )
            	    {
            	    match(input,10,FOLLOW_10_in_ruletracelist143); 

            	            createLeafNode(grammarAccess.getTracelistAccess().getExclamationMarkKeyword_1_0(), null); 
            	        
            	    match(input,11,FOLLOW_11_in_ruletracelist153); 

            	            createLeafNode(grammarAccess.getTracelistAccess().getResetKeyword_1_1(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruletracelist163); 

            	            createLeafNode(grammarAccess.getTracelistAccess().getSemicolonKeyword_1_2(), null); 
            	        
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:128:1: ( (lv_traces_4_0= ruletrace ) )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:129:1: (lv_traces_4_0= ruletrace )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:129:1: (lv_traces_4_0= ruletrace )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:130:3: lv_traces_4_0= ruletrace
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruletrace_in_ruletracelist184);
            	    lv_traces_4_0=ruletrace();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTracelistRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"traces",
            	    	        		lv_traces_4_0, 
            	    	        		"trace", 
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end ruletracelist


    // $ANTLR start entryRuletrace
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:160:1: entryRuletrace returns [EObject current=null] : iv_ruletrace= ruletrace EOF ;
    public final EObject entryRuletrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletrace = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:161:2: (iv_ruletrace= ruletrace EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:162:2: iv_ruletrace= ruletrace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTraceRule(), currentNode); 
            pushFollow(FOLLOW_ruletrace_in_entryRuletrace222);
            iv_ruletrace=ruletrace();
            _fsp--;

             current =iv_ruletrace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletrace232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuletrace


    // $ANTLR start ruletrace
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:169:1: ruletrace returns [EObject current=null] : ( () ( (lv_ticks_1_0= ruletick ) )+ ) ;
    public final EObject ruletrace() throws RecognitionException {
        EObject current = null;

        EObject lv_ticks_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:174:6: ( ( () ( (lv_ticks_1_0= ruletick ) )+ ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:175:1: ( () ( (lv_ticks_1_0= ruletick ) )+ )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:175:1: ( () ( (lv_ticks_1_0= ruletick ) )+ )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:175:2: () ( (lv_ticks_1_0= ruletick ) )+
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:175:2: ()
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:176:5: 
            {
             
                    temp=factory.create(grammarAccess.getTraceAccess().getTraceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTraceAccess().getTraceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:186:2: ( (lv_ticks_1_0= ruletick ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=12 && LA3_0<=13)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:187:1: (lv_ticks_1_0= ruletick )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:187:1: (lv_ticks_1_0= ruletick )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:188:3: lv_ticks_1_0= ruletick
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruletick_in_ruletrace287);
            	    lv_ticks_1_0=ruletick();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTraceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ticks",
            	    	        		lv_ticks_1_0, 
            	    	        		"tick", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end ruletrace


    // $ANTLR start entryRuletick
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:218:1: entryRuletick returns [EObject current=null] : iv_ruletick= ruletick EOF ;
    public final EObject entryRuletick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletick = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:219:2: (iv_ruletick= ruletick EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:220:2: iv_ruletick= ruletick EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTickRule(), currentNode); 
            pushFollow(FOLLOW_ruletick_in_entryRuletick324);
            iv_ruletick=ruletick();
            _fsp--;

             current =iv_ruletick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletick334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuletick


    // $ANTLR start ruletick
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:227:1: ruletick returns [EObject current=null] : ( ( (lv_input_0_0= rulesignal ) )* ( '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_n_5_0= ';' ) ) ) ;
    public final EObject ruletick() throws RecognitionException {
        EObject current = null;

        Token lv_n_5_0=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:232:6: ( ( ( (lv_input_0_0= rulesignal ) )* ( '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_n_5_0= ';' ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:233:1: ( ( (lv_input_0_0= rulesignal ) )* ( '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_n_5_0= ';' ) ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:233:1: ( ( (lv_input_0_0= rulesignal ) )* ( '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_n_5_0= ';' ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:233:2: ( (lv_input_0_0= rulesignal ) )* ( '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_n_5_0= ';' ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:233:2: ( (lv_input_0_0= rulesignal ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:234:1: (lv_input_0_0= rulesignal )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:234:1: (lv_input_0_0= rulesignal )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:235:3: lv_input_0_0= rulesignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getInputSignalParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulesignal_in_ruletick380);
            	    lv_input_0_0=rulesignal();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"input",
            	    	        		lv_input_0_0, 
            	    	        		"signal", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:257:3: ( '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:257:5: '%' 'Output' ':' ( (lv_output_4_0= rulesignal ) )*
                    {
                    match(input,13,FOLLOW_13_in_ruletick392); 

                            createLeafNode(grammarAccess.getTickAccess().getPercentSignKeyword_1_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruletick402); 

                            createLeafNode(grammarAccess.getTickAccess().getOutputKeyword_1_1(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruletick412); 

                            createLeafNode(grammarAccess.getTickAccess().getColonKeyword_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:269:1: ( (lv_output_4_0= rulesignal ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:270:1: (lv_output_4_0= rulesignal )
                    	    {
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:270:1: (lv_output_4_0= rulesignal )
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:271:3: lv_output_4_0= rulesignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_1_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesignal_in_ruletick433);
                    	    lv_output_4_0=rulesignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"output",
                    	    	        		lv_output_4_0, 
                    	    	        		"signal", 
                    	    	        		currentNode);
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


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:293:5: ( (lv_n_5_0= ';' ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:294:1: (lv_n_5_0= ';' )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:294:1: (lv_n_5_0= ';' )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:295:3: lv_n_5_0= ';'
            {
            lv_n_5_0=(Token)input.LT(1);
            match(input,12,FOLLOW_12_in_ruletick454); 

                    createLeafNode(grammarAccess.getTickAccess().getNSemicolonKeyword_2_0(), "n"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "n", lv_n_5_0, ";", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruletick


    // $ANTLR start entryRulesignal
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:322:1: entryRulesignal returns [EObject current=null] : iv_rulesignal= rulesignal EOF ;
    public final EObject entryRulesignal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:323:2: (iv_rulesignal= rulesignal EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:324:2: iv_rulesignal= rulesignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            pushFollow(FOLLOW_rulesignal_in_entryRulesignal503);
            iv_rulesignal=rulesignal();
            _fsp--;

             current =iv_rulesignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignal513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulesignal


    // $ANTLR start rulesignal
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:331:1: rulesignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')' )? ) ;
    public final EObject rulesignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_valued_1_0=null;
        Token lv_val_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:336:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')' )? ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:337:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:337:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')' )? )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:337:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')' )?
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:337:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:338:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:338:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:339:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesignal555); 

            			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:2: ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:3: ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) ')'
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:3: ( (lv_valued_1_0= '(' ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:362:1: (lv_valued_1_0= '(' )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:362:1: (lv_valued_1_0= '(' )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:363:3: lv_valued_1_0= '('
                    {
                    lv_valued_1_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_rulesignal579); 

                            createLeafNode(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0(), "valued"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "valued", true, "(", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:382:2: ( (lv_val_2_0= RULE_NUM ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:383:1: (lv_val_2_0= RULE_NUM )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:383:1: (lv_val_2_0= RULE_NUM )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:384:3: lv_val_2_0= RULE_NUM
                    {
                    lv_val_2_0=(Token)input.LT(1);
                    match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rulesignal609); 

                    			createLeafNode(grammarAccess.getSignalAccess().getValNUMTerminalRuleCall_1_1_0(), "val"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"val",
                    	        		lv_val_2_0, 
                    	        		"NUM", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_rulesignal624); 

                            createLeafNode(grammarAccess.getSignalAccess().getRightParenthesisKeyword_1_2(), null); 
                        

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
    // $ANTLR end rulesignal


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist131 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruletracelist143 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruletracelist153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruletracelist163 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist184 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_ruletrace287 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick380 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_13_in_ruletick392 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruletick402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruletick412 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick433 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruletick454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesignal555 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rulesignal579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUM_in_rulesignal609 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulesignal624 = new BitSet(new long[]{0x0000000000000002L});

}