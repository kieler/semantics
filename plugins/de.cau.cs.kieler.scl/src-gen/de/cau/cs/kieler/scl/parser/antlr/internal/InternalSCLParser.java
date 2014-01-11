package de.cau.cs.kieler.scl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.scl.services.SCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "';'", "'}'", "'input'", "'output'", "'static'", "'signal'", "'='", "'combine'", "':'", "'if'", "'then'", "'else'", "'end'", "'goto'", "'fork'", "'par'", "'join'", "'pause'", "'('", "')'", "'@'", "'['", "']'", "'.'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_NUMBER=12;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalSCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[200+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalSCLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SCLGrammarAccess grammarAccess;
     	
        public InternalSCLParser(TokenStream input, SCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:75:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;
        int entryRuleProgram_StartIndex = input.index();
        EObject iv_ruleProgram = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:76:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:77:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram88);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram98); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleProgram_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:84:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_valuedObjects_2_0= ruleValuedObject ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;
        int ruleProgram_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_valuedObjects_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:87:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_valuedObjects_2_0= ruleValuedObject ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_valuedObjects_2_0= ruleValuedObject ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_valuedObjects_2_0= ruleValuedObject ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_valuedObjects_2_0= ruleValuedObject ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProgram135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getModuleKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:92:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:93:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:93:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:94:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:110:2: ( (lv_valuedObjects_2_0= ruleValuedObject ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==RULE_COMMENT_ANNOTATION||(LA1_0>=20 && LA1_0<=23)||LA1_0==38||(LA1_0>=58 && LA1_0<=65)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_valuedObjects_2_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_valuedObjects_2_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:112:3: lv_valuedObjects_2_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleProgram178);
            	    lv_valuedObjects_2_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_2_0, 
            	              		"ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleProgram191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:1: ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:2: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:2: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:3: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:3: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:4: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:4: ( (lv_statements_4_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:133:1: (lv_statements_4_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:133:1: (lv_statements_4_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:134:3: lv_statements_4_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleProgram215);
            	    lv_statements_4_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleProgram227); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getSemicolonKeyword_4_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:155:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:155:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:156:1: (lv_statements_6_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:156:1: (lv_statements_6_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:157:3: lv_statements_6_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleProgram255);
            	    lv_statements_6_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:4: ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==17||LA4_0==27||(LA4_0>=31 && LA4_0<=32)||LA4_0==35) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:5: ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:5: ( (lv_statements_7_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:175:3: lv_statements_7_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsInstructionStatementParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleProgram279);
                    lv_statements_7_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_7_0, 
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:2: ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:192:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:192:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:193:3: lv_statements_8_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsEmptyStatementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleProgram300);
                    	    lv_statements_8_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_8_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleProgram316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ruleProgram_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:221:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:222:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:223:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject352);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject362); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:230:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_input_1_0= 'input' ) )? ( (lv_output_2_0= 'output' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_signal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;
        int ruleValuedObject_StartIndex = input.index();
        Token lv_input_1_0=null;
        Token lv_output_2_0=null;
        Token lv_static_3_0=null;
        Token lv_signal_4_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_initialValue_8_0 = null;

        Enumerator lv_combineOperator_10_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:233:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_input_1_0= 'input' ) )? ( (lv_output_2_0= 'output' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_signal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_input_1_0= 'input' ) )? ( (lv_output_2_0= 'output' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_signal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_input_1_0= 'input' ) )? ( (lv_output_2_0= 'output' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_signal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_input_1_0= 'input' ) )? ( (lv_output_2_0= 'output' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_signal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==38) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:235:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:235:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:236:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleValuedObject408);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:252:3: ( (lv_input_1_0= 'input' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:253:1: (lv_input_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:253:1: (lv_input_1_0= 'input' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:254:3: lv_input_1_0= 'input'
                    {
                    lv_input_1_0=(Token)match(input,20,FOLLOW_20_in_ruleValuedObject427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_1_0, grammarAccess.getValuedObjectAccess().getInputInputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:267:3: ( (lv_output_2_0= 'output' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:268:1: (lv_output_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:268:1: (lv_output_2_0= 'output' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:269:3: lv_output_2_0= 'output'
                    {
                    lv_output_2_0=(Token)match(input,21,FOLLOW_21_in_ruleValuedObject459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_2_0, grammarAccess.getValuedObjectAccess().getOutputOutputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:282:3: ( (lv_static_3_0= 'static' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:283:1: (lv_static_3_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:283:1: (lv_static_3_0= 'static' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:284:3: lv_static_3_0= 'static'
                    {
                    lv_static_3_0=(Token)match(input,22,FOLLOW_22_in_ruleValuedObject491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_3_0, grammarAccess.getValuedObjectAccess().getStaticStaticKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:297:3: ( (lv_signal_4_0= 'signal' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:298:1: (lv_signal_4_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:298:1: (lv_signal_4_0= 'signal' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:299:3: lv_signal_4_0= 'signal'
                    {
                    lv_signal_4_0=(Token)match(input,23,FOLLOW_23_in_ruleValuedObject523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_4_0, grammarAccess.getValuedObjectAccess().getSignalSignalKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:312:3: ( (lv_type_5_0= ruleValueType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=58 && LA10_0<=65)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:313:1: (lv_type_5_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:313:1: (lv_type_5_0= ruleValueType )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:314:3: lv_type_5_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getTypeValueTypeEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleValuedObject558);
                    lv_type_5_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:330:3: ( (lv_name_6_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:331:1: (lv_name_6_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:331:1: (lv_name_6_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:332:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObject576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getValuedObjectAccess().getNameIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:348:2: (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:348:4: otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleValuedObject594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:352:1: ( (lv_initialValue_8_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:353:1: (lv_initialValue_8_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:353:1: (lv_initialValue_8_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:354:3: lv_initialValue_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObject615);
                    lv_initialValue_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:370:4: (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:370:6: otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleValuedObject630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getValuedObjectAccess().getCombineKeyword_8_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:374:1: ( (lv_combineOperator_10_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:375:1: (lv_combineOperator_10_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:375:1: (lv_combineOperator_10_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:376:3: lv_combineOperator_10_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleValuedObject651);
                    lv_combineOperator_10_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_10_0, 
                              		"CombineOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleValuedObject665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getValuedObjectAccess().getSemicolonKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:406:1: entryRuleEmptyStatement returns [EObject current=null] : iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
    public final EObject entryRuleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleEmptyStatement_StartIndex = input.index();
        EObject iv_ruleEmptyStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:407:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:408:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement703);
            iv_ruleEmptyStatement=ruleEmptyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyStatement713); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleEmptyStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyStatement"


    // $ANTLR start "ruleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:415:1: ruleEmptyStatement returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int ruleEmptyStatement_StartIndex = input.index();
        Token lv_label_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:418:28: ( ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:419:1: ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:419:1: ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:419:2: ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:419:2: ( (lv_label_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:420:1: (lv_label_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:420:1: (lv_label_0_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:421:3: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyStatement755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_0_0, grammarAccess.getEmptyStatementAccess().getLabelIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEmptyStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEmptyStatement772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyStatementAccess().getColonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, ruleEmptyStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmptyStatement"


    // $ANTLR start "entryRuleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:449:1: entryRuleInstructionStatement returns [EObject current=null] : iv_ruleInstructionStatement= ruleInstructionStatement EOF ;
    public final EObject entryRuleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleInstructionStatement_StartIndex = input.index();
        EObject iv_ruleInstructionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:450:2: (iv_ruleInstructionStatement= ruleInstructionStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:451:2: iv_ruleInstructionStatement= ruleInstructionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement808);
            iv_ruleInstructionStatement=ruleInstructionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionStatement818); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionStatement"


    // $ANTLR start "ruleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:458:1: ruleInstructionStatement returns [EObject current=null] : ( ( (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope ) ) ) ;
    public final EObject ruleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int ruleInstructionStatement_StartIndex = input.index();
        EObject lv_instruction_0_1 = null;

        EObject lv_instruction_0_2 = null;

        EObject lv_instruction_0_3 = null;

        EObject lv_instruction_0_4 = null;

        EObject lv_instruction_0_5 = null;

        EObject lv_instruction_0_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:461:28: ( ( ( (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:462:1: ( ( (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:462:1: ( ( (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:463:1: ( (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:463:1: ( (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:464:1: (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:464:1: (lv_instruction_0_1= ruleAssignment | lv_instruction_0_2= ruleConditional | lv_instruction_0_3= ruleGoto | lv_instruction_0_4= ruleParallel | lv_instruction_0_5= rulePause | lv_instruction_0_6= ruleStatementScope )
            int alt13=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            case 35:
                {
                alt13=5;
                }
                break;
            case 17:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:465:3: lv_instruction_0_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionAssignmentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstructionStatement865);
                    lv_instruction_0_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_1, 
                              		"Assignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:480:8: lv_instruction_0_2= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionConditionalParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstructionStatement884);
                    lv_instruction_0_2=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_2, 
                              		"Conditional");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:495:8: lv_instruction_0_3= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionGotoParserRuleCall_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstructionStatement903);
                    lv_instruction_0_3=ruleGoto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_3, 
                              		"Goto");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:510:8: lv_instruction_0_4= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionParallelParserRuleCall_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstructionStatement922);
                    lv_instruction_0_4=ruleParallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_4, 
                              		"Parallel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:525:8: lv_instruction_0_5= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionPauseParserRuleCall_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstructionStatement941);
                    lv_instruction_0_5=rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_5, 
                              		"Pause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:540:8: lv_instruction_0_6= ruleStatementScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionStatementScopeParserRuleCall_0_5()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementScope_in_ruleInstructionStatement960);
                    lv_instruction_0_6=ruleStatementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_6, 
                              		"StatementScope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, ruleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInstructionStatement"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:568:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:569:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:570:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1000);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1010); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:577:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;
        int ruleAssignment_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:580:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:582:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:582:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:583:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAssignment1071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:601:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:602:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:602:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:603:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1092);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:627:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;
        int entryRuleConditional_StartIndex = input.index();
        EObject iv_ruleConditional = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:628:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:629:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional1128);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional1138); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:636:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_valuedObjects_3_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;
        int ruleConditional_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_expression_1_0 = null;

        EObject lv_valuedObjects_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;

        EObject lv_elseStatements_11_0 = null;

        EObject lv_elseStatements_13_0 = null;

        EObject lv_elseStatements_14_0 = null;

        EObject lv_elseStatements_15_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:639:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_valuedObjects_3_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:640:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_valuedObjects_3_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:640:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_valuedObjects_3_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:640:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_valuedObjects_3_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleConditional1175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:644:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:645:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:645:1: (lv_expression_1_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:646:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditional1196);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleConditional1208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:666:1: ( (lv_valuedObjects_3_0= ruleValuedObject ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:667:1: (lv_valuedObjects_3_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:667:1: (lv_valuedObjects_3_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:668:3: lv_valuedObjects_3_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getValuedObjectsValuedObjectParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleConditional1229);
            	    lv_valuedObjects_3_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_3_0, 
            	              		"ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:3: ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*
            loop15:
            do {
                int alt15=3;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:685:1: (lv_statements_4_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:685:1: (lv_statements_4_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:686:3: lv_statements_4_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1254);
            	    lv_statements_4_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleConditional1266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getSemicolonKeyword_4_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:707:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:707:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:708:1: (lv_statements_6_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:708:1: (lv_statements_6_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:709:3: lv_statements_6_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1294);
            	    lv_statements_6_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:4: ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==17||LA17_0==27||(LA17_0>=31 && LA17_0<=32)||LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:5: ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:5: ( (lv_statements_7_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:726:1: (lv_statements_7_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:726:1: (lv_statements_7_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:727:3: lv_statements_7_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1318);
                    lv_statements_7_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_7_0, 
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:743:2: ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:744:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:744:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:745:3: lv_statements_8_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1339);
                    	    lv_statements_8_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_8_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:761:6: (otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:761:8: otherlv_9= 'else' ( (lv_valuedObjects_10_0= ruleValuedObject ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleConditional1356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getConditionalAccess().getElseKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:765:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )*
                    loop18:
                    do {
                        int alt18=2;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:766:1: (lv_valuedObjects_10_0= ruleValuedObject )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:766:1: (lv_valuedObjects_10_0= ruleValuedObject )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:767:3: lv_valuedObjects_10_0= ruleValuedObject
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getValuedObjectsValuedObjectParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValuedObject_in_ruleConditional1377);
                    	    lv_valuedObjects_10_0=ruleValuedObject();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"valuedObjects",
                    	              		lv_valuedObjects_10_0, 
                    	              		"ValuedObject");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:3: ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        alt19 = dfa19.predict(input);
                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:785:3: lv_elseStatements_11_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1402);
                    	    lv_elseStatements_11_0=ruleInstructionStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseStatements",
                    	              		lv_elseStatements_11_0, 
                    	              		"InstructionStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleConditional1414); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getConditionalAccess().getSemicolonKeyword_5_2_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:807:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:807:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:808:3: lv_elseStatements_13_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1442);
                    	    lv_elseStatements_13_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseStatements",
                    	              		lv_elseStatements_13_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:824:4: ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==17||LA21_0==27||(LA21_0>=31 && LA21_0<=32)||LA21_0==35) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:824:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:824:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:825:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:825:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:826:3: lv_elseStatements_14_0= ruleInstructionStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1466);
                            lv_elseStatements_14_0=ruleInstructionStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elseStatements",
                                      		lv_elseStatements_14_0, 
                                      		"InstructionStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:842:2: ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_ID) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:843:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    {
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:843:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:844:3: lv_elseStatements_15_0= ruleEmptyStatement
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1487);
                            	    lv_elseStatements_15_0=ruleEmptyStatement();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elseStatements",
                            	              		lv_elseStatements_15_0, 
                            	              		"EmptyStatement");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,30,FOLLOW_30_in_ruleConditional1505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getConditionalAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ruleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:872:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;
        int entryRuleGoto_StartIndex = input.index();
        EObject iv_ruleGoto = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:873:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:874:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1541);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1551); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:881:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;
        int ruleGoto_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_targetLabel_1_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:884:28: ( (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:885:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:885:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:885:3: otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleGoto1588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:889:1: ( (lv_targetLabel_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:890:1: (lv_targetLabel_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:890:1: (lv_targetLabel_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:891:3: lv_targetLabel_1_0= RULE_ID
            {
            lv_targetLabel_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto1605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetLabel_1_0, grammarAccess.getGotoAccess().getTargetLabelIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGotoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetLabel",
                      		lv_targetLabel_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, ruleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:917:1: entryRuleThread returns [EObject current=null] : iv_ruleThread= ruleThread EOF ;
    public final EObject entryRuleThread() throws RecognitionException {
        EObject current = null;
        int entryRuleThread_StartIndex = input.index();
        EObject iv_ruleThread = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:918:2: (iv_ruleThread= ruleThread EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:919:2: iv_ruleThread= ruleThread EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThreadRule()); 
            }
            pushFollow(FOLLOW_ruleThread_in_entryRuleThread1648);
            iv_ruleThread=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThread; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThread1658); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleThread"


    // $ANTLR start "ruleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:926:1: ruleThread returns [EObject current=null] : ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) ;
    public final EObject ruleThread() throws RecognitionException {
        EObject current = null;
        int ruleThread_StartIndex = input.index();
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:929:28: ( ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:930:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:930:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:930:2: () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:930:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getThreadAccess().getThreadAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:2: ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*
            loop23:
            do {
                int alt23=3;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:1: (lv_statements_1_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:1: (lv_statements_1_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:941:3: lv_statements_1_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1719);
            	    lv_statements_1_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleThread1731); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getThreadAccess().getSemicolonKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:963:1: (lv_statements_3_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:963:1: (lv_statements_3_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:964:3: lv_statements_3_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread1759);
            	    lv_statements_3_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:980:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==17||LA25_0==27||(LA25_0>=31 && LA25_0<=32)||LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:980:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:980:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:981:1: (lv_statements_4_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:981:1: (lv_statements_4_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:982:3: lv_statements_4_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1783);
                    lv_statements_4_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_4_0, 
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:998:2: ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:999:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:999:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1000:3: lv_statements_5_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread1804);
                    	    lv_statements_5_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getThreadRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_5_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, ruleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleThread"


    // $ANTLR start "entryRuleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1024:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;
        int entryRuleParallel_StartIndex = input.index();
        EObject iv_ruleParallel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1025:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1026:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel1844);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel1854); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1033:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;
        int ruleParallel_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_threads_1_0 = null;

        EObject lv_threads_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1036:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParallel1891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1041:1: ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1041:2: ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1041:2: ( (lv_threads_1_0= ruleThread ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1042:1: (lv_threads_1_0= ruleThread )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1042:1: (lv_threads_1_0= ruleThread )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1043:3: lv_threads_1_0= ruleThread
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleThread_in_ruleParallel1913);
            lv_threads_1_0=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		add(
                     			current, 
                     			"threads",
                      		lv_threads_1_0, 
                      		"Thread");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1059:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1059:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleParallel1926); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1063:1: ( (lv_threads_3_0= ruleThread ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1064:1: (lv_threads_3_0= ruleThread )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1064:1: (lv_threads_3_0= ruleThread )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1065:3: lv_threads_3_0= ruleThread
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleThread_in_ruleParallel1947);
            	    lv_threads_3_0=ruleThread();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"threads",
            	              		lv_threads_3_0, 
            	              		"Thread");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleParallel1962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParallelAccess().getJoinKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, ruleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1093:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;
        int entryRulePause_StartIndex = input.index();
        EObject iv_rulePause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1094:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1095:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause1998);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause2008); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1102:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;
        int rulePause_StartIndex = input.index();
        Token otherlv_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1105:28: ( (otherlv_0= 'pause' () ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1106:1: (otherlv_0= 'pause' () )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1106:1: (otherlv_0= 'pause' () )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1106:3: otherlv_0= 'pause' ()
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulePause2045); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:1: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1111:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPauseAccess().getPauseAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, rulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1127:1: entryRuleStatementScope returns [EObject current=null] : iv_ruleStatementScope= ruleStatementScope EOF ;
    public final EObject entryRuleStatementScope() throws RecognitionException {
        EObject current = null;
        int entryRuleStatementScope_StartIndex = input.index();
        EObject iv_ruleStatementScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:2: (iv_ruleStatementScope= ruleStatementScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1129:2: iv_ruleStatementScope= ruleStatementScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatementScope_in_entryRuleStatementScope2093);
            iv_ruleStatementScope=ruleStatementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementScope2103); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementScope"


    // $ANTLR start "ruleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1136:1: ruleStatementScope returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_valuedObjects_2_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) ;
    public final EObject ruleStatementScope() throws RecognitionException {
        EObject current = null;
        int ruleStatementScope_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_valuedObjects_2_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1139:28: ( ( () otherlv_1= '{' ( (lv_valuedObjects_2_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1140:1: ( () otherlv_1= '{' ( (lv_valuedObjects_2_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1140:1: ( () otherlv_1= '{' ( (lv_valuedObjects_2_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1140:2: () otherlv_1= '{' ( (lv_valuedObjects_2_0= ruleValuedObject ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1140:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1141:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementScopeAccess().getStatementScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStatementScope2152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatementScopeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1153:1: ( (lv_valuedObjects_2_0= ruleValuedObject ) )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:1: (lv_valuedObjects_2_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:1: (lv_valuedObjects_2_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1155:3: lv_valuedObjects_2_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleStatementScope2173);
            	    lv_valuedObjects_2_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_2_0, 
            	              		"ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:3: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop28:
            do {
                int alt28=3;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1173:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2198);
            	    lv_statements_3_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStatementScope2210); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStatementScopeAccess().getSemicolonKeyword_3_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1195:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1195:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1196:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2238);
            	    lv_statements_5_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==17||LA30_0==27||(LA30_0>=31 && LA30_0<=32)||LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1213:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1213:1: (lv_statements_6_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1214:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2262);
                    lv_statements_6_0=ruleInstructionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_6_0, 
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1230:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1231:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1231:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1232:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2283);
                    	    lv_statements_7_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_7_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleStatementScope2299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getStatementScopeAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ruleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatementScope"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1262:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1263:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1264:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2337);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1271:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1274:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1275:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1275:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1276:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleExpression2397);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1289:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression2427);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1308:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1309:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1310:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2462);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression2472); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1317:1: ruleBoolExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1320:28: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1322:2: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBoolExpression2521);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1341:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleOrExpression_StartIndex = input.index();
        EObject iv_ruleOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1342:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1343:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression2555);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression2565); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1350:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleOrExpression_StartIndex = input.index();
        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1353:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1354:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1354:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1355:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2615);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1366:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1366:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1366:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1367:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1375:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1376:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1376:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1377:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrOperator_in_ruleOrExpression2648);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"OrOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1393:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1394:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1394:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1395:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2669);
            	    lv_subExpressions_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, ruleOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1419:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAndExpression_StartIndex = input.index();
        EObject iv_ruleAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1420:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1421:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2707);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2717); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1428:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1431:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1432:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1432:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1433:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleAndExpression2767);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1444:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1444:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1444:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1445:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1453:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1454:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1454:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1455:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndExpression2800);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1471:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1472:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1472:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1473:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleAndExpression2821);
            	    lv_subExpressions_3_0=ruleCompareOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"CompareOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, ruleAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1497:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1498:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1499:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2859);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation2869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1506:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;
        int ruleCompareOperation_StartIndex = input.index();
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1509:28: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1511:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2920);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1523:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1531:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1533:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation2953);
                    lv_operator_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1549:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1550:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1550:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1551:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2974);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"NotOrValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1569:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleCompareOperation3007);
                    this_NotExpression_4=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, ruleCompareOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1588:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1589:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1590:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression3042);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression3052); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1597:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1600:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1601:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1601:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1602:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression3102);
                    this_ValuedExpression_0=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1615:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression3132);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, ruleNotOrValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1634:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1635:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1636:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression3167);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression3177); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1643:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1646:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1647:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1647:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_HOSTCODE)||LA36_0==RULE_BOOLEAN||LA36_0==36||LA36_0==48||LA36_0==57) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1647:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1647:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1647:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1647:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1648:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1656:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1657:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1657:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1658:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression3236);
                    lv_operator_1_0=ruleNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1675:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1675:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1676:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression3257);
                    lv_subExpressions_2_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1694:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression3289);
                    this_AtomicExpression_3=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, ruleNotExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1713:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1714:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1715:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3324);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression3334); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1722:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1725:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1727:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression3383);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, ruleValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1746:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1747:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1748:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression3417);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression3427); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1755:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1758:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1759:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1759:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1760:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3477);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1771:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==52) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1771:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1771:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1772:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1780:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1781:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1781:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1782:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression3510);
            	    lv_operator_2_0=ruleAddOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AddOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1798:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1800:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3531);
            	    lv_subExpressions_3_0=ruleSubExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"SubExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1824:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1825:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1826:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression3569);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression3579); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1833:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1836:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1837:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1837:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1838:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3629);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1849:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==53) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1849:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1849:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1850:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1858:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1859:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1859:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1860:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression3662);
            	    lv_operator_2_0=ruleSubOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"SubOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1876:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1877:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1877:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1878:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3683);
            	    lv_subExpressions_3_0=ruleMultExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"MultExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, ruleSubExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1902:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1903:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1904:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression3721);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression3731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1911:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1914:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1915:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1915:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1916:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3781);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1927:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==54) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1927:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1927:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1928:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1936:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1937:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1937:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1938:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression3814);
            	    lv_operator_2_0=ruleMultOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MultOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1954:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1955:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1955:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1956:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3835);
            	    lv_subExpressions_3_0=ruleDivExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"DivExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, ruleMultExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1980:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1981:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1982:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression3873);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression3883); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1989:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1992:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1993:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1993:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1994:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3933);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2005:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2005:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2005:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2006:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2014:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2015:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2015:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2016:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression3966);
                    lv_operator_2_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2032:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2033:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2033:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2034:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression3987);
                    lv_subExpressions_3_0=ruleModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"ModExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, ruleDivExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2058:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2059:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2060:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression4025);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression4035); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2067:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2070:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2071:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2071:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2072:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression4085);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2083:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2083:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2083:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2084:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2092:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2093:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2093:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2094:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression4118);
                    lv_operator_2_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2110:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2111:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2111:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2112:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4139);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ruleModExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2136:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2137:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2138:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4177);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2145:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2148:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2149:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2149:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_BOOLEAN)||LA42_0==36||LA42_0==48||LA42_0==57) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2149:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2149:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2149:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2149:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2150:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2158:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2159:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2159:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2160:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression4246);
                    lv_operator_1_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2176:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2177:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2177:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2178:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression4267);
                    lv_subExpressions_2_0=ruleNegExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2196:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4299);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, ruleNegExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2215:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2216:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2217:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4334);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression4344); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2224:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_TextExpression_5 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2227:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2228:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2228:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt43=1;
                }
                break;
            case RULE_ID:
            case 48:
            case 57:
                {
                alt43=2;
                }
                break;
            case 36:
                {
                alt43=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2229:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolValue_in_ruleAtomicExpression4394);
                    this_BoolValue_0=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2242:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4424);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectTestExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2254:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2254:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2254:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleAtomicExpression4442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4467);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleAtomicExpression4478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2276:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression4510);
                    this_TextExpression_5=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, ruleAtomicExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2295:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2296:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2297:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4545);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression4555); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2304:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicValuedExpression_StartIndex = input.index();
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_DoubleValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2307:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2308:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2308:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt44=5;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2309:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4605);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2322:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4635);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2335:2: this_DoubleValue_2= ruleDoubleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleValue_in_ruleAtomicValuedExpression4665);
                    this_DoubleValue_2=ruleDoubleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleAtomicValuedExpression4683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4708);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleAtomicValuedExpression4719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2369:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4751);
                    this_AtomicExpression_6=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, ruleAtomicValuedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2388:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2389:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2390:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4786);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4796); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2397:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectTestExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2400:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2401:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2401:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48||LA46_0==57) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2401:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2401:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2401:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2401:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2402:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2410:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2411:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2411:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2412:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2412:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==48) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==57) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2413:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4857);
                            lv_operator_1_1=rulePreOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_1, 
                                      		"PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2428:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4876);
                            lv_operator_1_2=ruleValOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_2, 
                                      		"ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleValuedObjectTestExpression4891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2450:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2451:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2451:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2452:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4912);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleValuedObjectTestExpression4924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2474:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4956);
                    this_ValuedObjectReference_5=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, ruleValuedObjectTestExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2493:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2494:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2495:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4991);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference5001); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2502:1: ruleValuedObjectReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2505:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2506:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2506:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2507:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2507:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2508:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference5049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2530:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2531:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2532:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression5084);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression5094); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2539:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2542:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2543:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2543:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2544:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2544:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2545:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"HOSTCODE");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2569:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2570:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2571:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue5175);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue5185); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2578:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2581:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2582:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2582:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2583:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2583:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2584:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue5226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2608:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2609:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2610:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue5266);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue5276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2617:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2620:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2621:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2621:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2622:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2622:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2623:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue5317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"FLOAT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2647:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2648:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2649:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_ruleBoolValue_in_entryRuleBoolValue5357);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolValue5367); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2656:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2659:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2661:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2661:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2662:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleDoubleValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2686:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;
        int entryRuleDoubleValue_StartIndex = input.index();
        EObject iv_ruleDoubleValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2687:2: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2688:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleValueRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue5448);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleValue5458); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleDoubleValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2695:1: ruleDoubleValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;
        int ruleDoubleValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2698:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2699:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2699:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2700:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2700:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2701:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleDoubleValue5499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getDoubleValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoubleValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"FLOAT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, ruleDoubleValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2727:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2728:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2729:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation5541);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation5551); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2736:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleAnnotation_StartIndex = input.index();
        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2739:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2740:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2740:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt47=7;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2741:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5601);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2754:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation5631);
                    this_TagAnnotation_1=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2767:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5661);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2780:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5691);
                    this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2793:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5721);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2806:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5751);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2819:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5781);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2840:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2841:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2842:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5818);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation5828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2849:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2852:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2853:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2853:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2854:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2854:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2855:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"COMMENT_ANNOTATION");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2879:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2880:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2881:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5909);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation5919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2888:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTagAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2891:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2892:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2892:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2892:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTagAnnotation5956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2896:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2897:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2897:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2898:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation5977);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2914:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2914:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleTagAnnotation5990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2918:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_COMMENT_ANNOTATION||LA48_0==38) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2919:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2919:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2920:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTagAnnotation6011);
                    	    lv_annotations_3_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_3_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleTagAnnotation6024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2948:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2949:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2950:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6062);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6072); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2957:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2960:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2961:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2961:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2961:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyStringValueAnnotation6109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2965:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2966:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2966:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2967:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6130);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2983:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2984:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2984:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2985:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6151);
            lv_value_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3001:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3001:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleKeyStringValueAnnotation6164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3005:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_COMMENT_ANNOTATION||LA50_0==38) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3006:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3006:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3007:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation6185);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleKeyStringValueAnnotation6198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3035:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3036:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3037:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6236);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6246); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3044:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleTypedKeyStringValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_annotations_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3047:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3048:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3048:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3048:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTypedKeyStringValueAnnotation6283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3052:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3053:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3053:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3054:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6304);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleTypedKeyStringValueAnnotation6316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3074:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3075:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3075:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3076:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6337);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleTypedKeyStringValueAnnotation6349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3096:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3097:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3097:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3098:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6370);
            lv_value_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3114:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3114:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleTypedKeyStringValueAnnotation6383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3118:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_COMMENT_ANNOTATION||LA52_0==38) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3119:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3119:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3120:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation6404);
                    	    lv_annotations_7_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_7_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleTypedKeyStringValueAnnotation6417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3148:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3149:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3150:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6455);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3157:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyBooleanValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3160:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3161:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3161:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3161:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyBooleanValueAnnotation6502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3165:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3166:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3166:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3167:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation6523);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3183:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3184:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3184:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3185:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation6540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3201:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3201:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleKeyBooleanValueAnnotation6558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3205:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_COMMENT_ANNOTATION||LA54_0==38) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3206:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3206:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3207:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation6579);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleKeyBooleanValueAnnotation6592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3235:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3236:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3237:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation6630);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation6640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3244:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyIntValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3247:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3248:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3248:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3248:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyIntValueAnnotation6677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3252:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3253:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3253:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3254:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation6698);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3270:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3271:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3271:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3272:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation6715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3288:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3288:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleKeyIntValueAnnotation6733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3292:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_COMMENT_ANNOTATION||LA56_0==38) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3293:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3293:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3294:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation6754);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleKeyIntValueAnnotation6767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3322:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3323:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3324:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6805);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6815); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3331:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleKeyFloatValueAnnotation_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3334:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3335:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3335:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3335:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyFloatValueAnnotation6852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3339:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3340:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3340:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3341:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6873);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3357:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3358:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3358:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3359:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation6890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3375:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==36) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3375:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleKeyFloatValueAnnotation6908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3379:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_COMMENT_ANNOTATION||LA58_0==38) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3380:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3380:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3381:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation6929);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleKeyFloatValueAnnotation6942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3412:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3413:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString6983);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString6994); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3420:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3423:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3424:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString7034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3432:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString7060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3447:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3448:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3449:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID7106);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID7117); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3456:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3459:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3460:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3460:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3460:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3467:1: (kw= '.' this_ID_2= RULE_ID )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==41) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3468:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleExtendedID7176); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7191); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3488:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleCompareOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3490:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3491:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3491:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt62=1;
                }
                break;
            case 43:
                {
                alt62=2;
                }
                break;
            case 44:
                {
                alt62=3;
                }
                break;
            case 45:
                {
                alt62=4;
                }
                break;
            case 46:
                {
                alt62=5;
                }
                break;
            case 47:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3491:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3491:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3491:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleCompareOperator7252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3497:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3497:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3497:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleCompareOperator7269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3503:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3503:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3503:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleCompareOperator7286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3509:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3509:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3509:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleCompareOperator7303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3515:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3515:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3515:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_46_in_ruleCompareOperator7320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3521:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3521:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3521:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleCompareOperator7337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3531:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3533:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3534:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3534:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3534:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_rulePreOperator7381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleOrOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3544:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3546:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3547:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3547:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3547:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleOrOperator7424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, ruleOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3557:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3559:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3560:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3560:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3560:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleAndOperator7467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, ruleAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3570:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3572:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3573:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3573:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3573:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleNotOperator7510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3583:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3585:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3586:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3586:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3586:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleAddOperator7553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3596:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3598:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3599:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3599:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3599:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleSubOperator7596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3609:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3611:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3612:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3612:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3612:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleMultOperator7639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3622:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3624:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3625:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3625:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3625:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleModOperator7682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3635:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3637:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3638:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3638:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3638:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleDivOperator7725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3648:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3650:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3651:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3651:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3651:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleValOperator7768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3661:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;
        int ruleValueType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3663:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3664:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3664:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) )
            int alt63=8;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt63=1;
                }
                break;
            case 59:
                {
                alt63=2;
                }
                break;
            case 60:
                {
                alt63=3;
                }
                break;
            case 61:
                {
                alt63=4;
                }
                break;
            case 62:
                {
                alt63=5;
                }
                break;
            case 63:
                {
                alt63=6;
                }
                break;
            case 64:
                {
                alt63=7;
                }
                break;
            case 65:
                {
                alt63=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3664:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3664:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3664:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleValueType7812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3670:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3670:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3670:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleValueType7829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3676:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3676:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3676:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleValueType7846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3682:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3682:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3682:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleValueType7863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3688:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3688:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3688:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_62_in_ruleValueType7880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3694:6: (enumLiteral_5= 'double' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3694:6: (enumLiteral_5= 'double' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3694:8: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_63_in_ruleValueType7897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3700:6: (enumLiteral_6= 'string' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3700:6: (enumLiteral_6= 'string' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3700:8: enumLiteral_6= 'string'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_64_in_ruleValueType7914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3706:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3706:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3706:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,65,FOLLOW_65_in_ruleValueType7931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3716:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleCombineOperator_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3718:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3719:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3719:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt64=8;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt64=1;
                }
                break;
            case 52:
                {
                alt64=2;
                }
                break;
            case 54:
                {
                alt64=3;
                }
                break;
            case 67:
                {
                alt64=4;
                }
                break;
            case 68:
                {
                alt64=5;
                }
                break;
            case 49:
                {
                alt64=6;
                }
                break;
            case 50:
                {
                alt64=7;
                }
                break;
            case 65:
                {
                alt64=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3719:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3719:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3719:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator7976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3725:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3725:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3725:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleCombineOperator7993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3731:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3731:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3731:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleCombineOperator8010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3737:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3737:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3737:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator8027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3743:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3743:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3743:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator8044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3749:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3749:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3749:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_49_in_ruleCombineOperator8061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3755:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3755:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3755:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_50_in_ruleCombineOperator8078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3761:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3761:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3761:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator8095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred2_InternalSCL
    public final void synpred2_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:3: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:3: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:3: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:4: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:132:4: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:133:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:133:1: (lv_statements_4_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:134:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred2_InternalSCL215);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,18,FOLLOW_18_in_synpred2_InternalSCL227); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSCL

    // $ANTLR start synpred3_InternalSCL
    public final void synpred3_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:155:6: ( ( (lv_statements_6_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:155:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:155:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:156:1: (lv_statements_6_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:156:1: (lv_statements_6_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:157:3: lv_statements_6_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred3_InternalSCL255);
        lv_statements_6_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSCL

    // $ANTLR start synpred19_InternalSCL
    public final void synpred19_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:667:1: ( (lv_valuedObjects_3_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:667:1: (lv_valuedObjects_3_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:667:1: (lv_valuedObjects_3_0= ruleValuedObject )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:668:3: lv_valuedObjects_3_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getValuedObjectsValuedObjectParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedObject_in_synpred19_InternalSCL1229);
        lv_valuedObjects_3_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSCL

    // $ANTLR start synpred20_InternalSCL
    public final void synpred20_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:5: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:684:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:685:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:685:1: (lv_statements_4_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:686:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred20_InternalSCL1254);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,18,FOLLOW_18_in_synpred20_InternalSCL1266); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSCL

    // $ANTLR start synpred21_InternalSCL
    public final void synpred21_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:707:6: ( ( (lv_statements_6_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:707:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:707:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:708:1: (lv_statements_6_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:708:1: (lv_statements_6_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:709:3: lv_statements_6_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred21_InternalSCL1294);
        lv_statements_6_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalSCL

    // $ANTLR start synpred24_InternalSCL
    public final void synpred24_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_10_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:766:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:766:1: (lv_valuedObjects_10_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:766:1: (lv_valuedObjects_10_0= ruleValuedObject )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:767:3: lv_valuedObjects_10_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getValuedObjectsValuedObjectParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedObject_in_synpred24_InternalSCL1377);
        lv_valuedObjects_10_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSCL

    // $ANTLR start synpred25_InternalSCL
    public final void synpred25_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_elseStatements_11_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:5: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:785:3: lv_elseStatements_11_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred25_InternalSCL1402);
        lv_elseStatements_11_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,18,FOLLOW_18_in_synpred25_InternalSCL1414); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSCL

    // $ANTLR start synpred26_InternalSCL
    public final void synpred26_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_elseStatements_13_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:6: ( ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:807:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:807:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:808:3: lv_elseStatements_13_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred26_InternalSCL1442);
        lv_elseStatements_13_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalSCL

    // $ANTLR start synpred30_InternalSCL
    public final void synpred30_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:4: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:1: (lv_statements_1_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:1: (lv_statements_1_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:941:3: lv_statements_1_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred30_InternalSCL1719);
        lv_statements_1_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,18,FOLLOW_18_in_synpred30_InternalSCL1731); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalSCL

    // $ANTLR start synpred31_InternalSCL
    public final void synpred31_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:6: ( ( (lv_statements_3_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:963:1: (lv_statements_3_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:963:1: (lv_statements_3_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:964:3: lv_statements_3_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred31_InternalSCL1759);
        lv_statements_3_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31_InternalSCL

    // $ANTLR start synpred35_InternalSCL
    public final void synpred35_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_2_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:1: ( (lv_valuedObjects_2_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:1: (lv_valuedObjects_2_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:1: (lv_valuedObjects_2_0= ruleValuedObject )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1155:3: lv_valuedObjects_2_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedObject_in_synpred35_InternalSCL2173);
        lv_valuedObjects_2_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalSCL

    // $ANTLR start synpred36_InternalSCL
    public final void synpred36_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:5: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: (lv_statements_3_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1173:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred36_InternalSCL2198);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_18_in_synpred36_InternalSCL2210); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalSCL

    // $ANTLR start synpred37_InternalSCL
    public final void synpred37_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1195:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1195:1: (lv_statements_5_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1196:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred37_InternalSCL2238);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalSCL

    // $ANTLR start synpred40_InternalSCL
    public final void synpred40_InternalSCL_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1276:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1276:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBoolExpression_in_synpred40_InternalSCL2397);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalSCL

    // $ANTLR start synpred43_InternalSCL
    public final void synpred43_InternalSCL_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1510:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1511:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred43_InternalSCL2920);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:2: ()
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1523:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1531:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1532:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1533:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOperator_in_synpred43_InternalSCL2953);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1549:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1550:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1550:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1551:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred43_InternalSCL2974);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred43_InternalSCL

    // $ANTLR start synpred44_InternalSCL
    public final void synpred44_InternalSCL_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1602:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1602:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred44_InternalSCL3102);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalSCL

    // $ANTLR start synpred56_InternalSCL
    public final void synpred56_InternalSCL_fragment() throws RecognitionException {   
        EObject this_FloatValue_1 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2322:2: (this_FloatValue_1= ruleFloatValue )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2322:2: this_FloatValue_1= ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFloatValue_in_synpred56_InternalSCL4635);
        this_FloatValue_1=ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalSCL

    // $ANTLR start synpred57_InternalSCL
    public final void synpred57_InternalSCL_fragment() throws RecognitionException {   
        EObject this_DoubleValue_2 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2335:2: (this_DoubleValue_2= ruleDoubleValue )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2335:2: this_DoubleValue_2= ruleDoubleValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleDoubleValue_in_synpred57_InternalSCL4665);
        this_DoubleValue_2=ruleDoubleValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalSCL

    // $ANTLR start synpred58_InternalSCL
    public final void synpred58_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2347:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,36,FOLLOW_36_in_synpred58_InternalSCL4683); if (state.failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred58_InternalSCL4708);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,37,FOLLOW_37_in_synpred58_InternalSCL4719); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred58_InternalSCL

    // Delegated rules

    public final boolean synpred19_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\4\6\0\3\uffff";
    static final String DFA2_maxS =
        "\1\43\6\0\3\uffff";
    static final String DFA2_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA2_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\14\uffff\1\6\1\uffff\1\7\7\uffff\1\2\3\uffff\1\3\1\4\2"+
            "\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 132:2: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 8;}

                        else if ( (synpred3_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\27\uffff";
    static final String DFA14_eofS =
        "\27\uffff";
    static final String DFA14_minS =
        "\1\4\1\0\25\uffff";
    static final String DFA14_maxS =
        "\1\101\1\0\25\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\6\uffff\1\1\15\uffff";
    static final String DFA14_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\4\uffff\1\11\7\uffff\1\2\2\uffff\4\11\3\uffff\1\2\1\uffff"+
            "\4\2\2\uffff\1\2\2\uffff\1\11\23\uffff\10\11",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 666:1: ( (lv_valuedObjects_3_0= ruleValuedObject ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\4\6\0\4\uffff";
    static final String DFA15_maxS =
        "\1\43\6\0\4\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\14\uffff\1\6\11\uffff\1\2\1\uffff\2\7\1\3\1\4\2\uffff"+
            "\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 684:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 9;}

                        else if ( (synpred21_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\26\uffff";
    static final String DFA18_eofS =
        "\26\uffff";
    static final String DFA18_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA18_maxS =
        "\1\101\1\0\24\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\5\uffff\1\1\15\uffff";
    static final String DFA18_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\4\uffff\1\10\7\uffff\1\2\2\uffff\4\10\3\uffff\1\2\2\uffff"+
            "\3\2\2\uffff\1\2\2\uffff\1\10\23\uffff\10\10",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 765:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\4\6\0\3\uffff";
    static final String DFA19_maxS =
        "\1\43\6\0\3\uffff";
    static final String DFA19_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA19_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\14\uffff\1\6\11\uffff\1\2\2\uffff\1\7\1\3\1\4\2\uffff"+
            "\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 783:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 8;}

                        else if ( (synpred26_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\1\7\13\uffff";
    static final String DFA23_minS =
        "\1\4\6\0\5\uffff";
    static final String DFA23_maxS =
        "\1\43\6\0\5\uffff";
    static final String DFA23_acceptS =
        "\7\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\5\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\14\uffff\1\6\11\uffff\1\2\3\uffff\1\3\1\4\2\7\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 939:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (synpred31_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\26\uffff";
    static final String DFA27_eofS =
        "\26\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA27_maxS =
        "\1\101\1\0\24\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\5\uffff\1\1\15\uffff";
    static final String DFA27_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\4\uffff\1\10\7\uffff\1\2\1\uffff\1\2\4\10\3\uffff\1\2"+
            "\3\uffff\2\2\2\uffff\1\2\2\uffff\1\10\23\uffff\10\10",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 1153:1: ( (lv_valuedObjects_2_0= ruleValuedObject ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\12\uffff";
    static final String DFA28_eofS =
        "\12\uffff";
    static final String DFA28_minS =
        "\1\4\6\0\3\uffff";
    static final String DFA28_maxS =
        "\1\43\6\0\3\uffff";
    static final String DFA28_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\14\uffff\1\6\1\uffff\1\7\7\uffff\1\2\3\uffff\1\3\1\4\2"+
            "\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 1171:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 8;}

                        else if ( (synpred37_InternalSCL()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSCL()) ) {s = 8;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA31_maxS =
        "\1\71\11\0\2\uffff";
    static final String DFA31_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\10\1\11\1\2\1\3\1\5\33\uffff\1\4\13\uffff\1\6\2\uffff\1"+
            "\12\1\uffff\1\1\3\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1275:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\14\uffff";
    static final String DFA34_eofS =
        "\14\uffff";
    static final String DFA34_minS =
        "\1\4\3\uffff\7\0\1\uffff";
    static final String DFA34_maxS =
        "\1\71\3\uffff\7\0\1\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA34_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\10\1\11\2\1\1\5\33\uffff\1\4\13\uffff\1\6\2\uffff\1\12\1"+
            "\uffff\1\1\3\uffff\1\7",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1510:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\4\3\uffff\6\0\1\uffff";
    static final String DFA35_maxS =
        "\1\71\3\uffff\6\0\1\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA35_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\10\1\11\2\1\1\5\33\uffff\1\4\13\uffff\1\6\2\uffff\1\12\1"+
            "\uffff\1\1\3\uffff\1\7",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1601:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_8 = input.LA(1);

                         
                        int index35_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_9 = input.LA(1);

                         
                        int index35_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index35_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\14\uffff";
    static final String DFA44_eofS =
        "\14\uffff";
    static final String DFA44_minS =
        "\1\4\1\uffff\2\0\10\uffff";
    static final String DFA44_maxS =
        "\1\71\1\uffff\2\0\10\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\4\uffff\1\2\1\3\1\4";
    static final String DFA44_specialS =
        "\2\uffff\1\0\1\1\10\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\4\1\1\1\2\1\4\33\uffff\1\3\13\uffff\1\4\10\uffff\1\4",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2308:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalSCL()) ) {s = 9;}

                        else if ( (synpred57_InternalSCL()) ) {s = 10;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\15\uffff";
    static final String DFA47_eofS =
        "\3\uffff\1\10\5\uffff\1\12\2\uffff\1\10";
    static final String DFA47_minS =
        "\1\11\1\uffff\3\4\4\uffff\1\4\2\uffff\1\4";
    static final String DFA47_maxS =
        "\1\46\1\uffff\1\4\1\101\1\4\4\uffff\1\101\2\uffff\1\101";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\3\uffff\1\4\1\5\1\7\1\2\1\uffff\1\3\1\6\1\uffff";
    static final String DFA47_specialS =
        "\15\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\34\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\uffff\1\13\1\7\1\6\1\10\1\12\11\uffff\4\10\14\uffff"+
            "\3\10\1\5\1\uffff\1\4\20\uffff\10\10",
            "\1\14",
            "",
            "",
            "",
            "",
            "\1\12\4\uffff\1\12\10\uffff\1\10\1\uffff\4\12\2\10\12\uffff"+
            "\3\12\23\uffff\10\12",
            "",
            "",
            "\1\11\1\uffff\1\13\1\7\1\6\1\10\1\12\11\uffff\4\10\14\uffff"+
            "\3\10\1\5\1\uffff\1\4\20\uffff\10\10"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "2740:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProgram135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram152 = new BitSet(new long[]{0xFC00004000F20210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleProgram178 = new BitSet(new long[]{0xFC00004000F20210L,0x0000000000000003L});
    public static final BitSet FOLLOW_17_in_ruleProgram191 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleProgram215 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProgram227 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleProgram255 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleProgram279 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleProgram300 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_19_in_ruleProgram316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleValuedObject408 = new BitSet(new long[]{0xFC00004000F00210L,0x0000000000000003L});
    public static final BitSet FOLLOW_20_in_ruleValuedObject427 = new BitSet(new long[]{0xFC00000000E00010L,0x0000000000000003L});
    public static final BitSet FOLLOW_21_in_ruleValuedObject459 = new BitSet(new long[]{0xFC00000000C00010L,0x0000000000000003L});
    public static final BitSet FOLLOW_22_in_ruleValuedObject491 = new BitSet(new long[]{0xFC00000000800010L,0x0000000000000003L});
    public static final BitSet FOLLOW_23_in_ruleValuedObject523 = new BitSet(new long[]{0xFC00000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleValuedObject558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject576 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_24_in_ruleValuedObject594 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject615 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25_in_ruleValuedObject630 = new BitSet(new long[]{0x0056000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject651 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleValuedObject665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyStatement713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyStatement755 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEmptyStatement772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionStatement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstructionStatement865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstructionStatement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstructionStatement903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstructionStatement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstructionStatement941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_ruleInstructionStatement960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1059 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssignment1071 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConditional1175 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditional1196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConditional1208 = new BitSet(new long[]{0xFC000049E8F20210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleConditional1229 = new BitSet(new long[]{0xFC000049E8F20210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1254 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional1266 = new BitSet(new long[]{0x00000009E8020010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1294 = new BitSet(new long[]{0x00000009E8020010L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1318 = new BitSet(new long[]{0x00000009E8020010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1339 = new BitSet(new long[]{0x00000009E8020010L});
    public static final BitSet FOLLOW_29_in_ruleConditional1356 = new BitSet(new long[]{0xFC000049C8F20210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleConditional1377 = new BitSet(new long[]{0xFC000049C8F20210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1402 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional1414 = new BitSet(new long[]{0x00000009C8020010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1442 = new BitSet(new long[]{0x00000009C8020010L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1466 = new BitSet(new long[]{0x00000009C8020010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1487 = new BitSet(new long[]{0x00000009C8020010L});
    public static final BitSet FOLLOW_30_in_ruleConditional1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleGoto1588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThread_in_entryRuleThread1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThread1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleThread1731 = new BitSet(new long[]{0x0000000988020012L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread1759 = new BitSet(new long[]{0x0000000988020012L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1783 = new BitSet(new long[]{0x0000000988020012L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread1804 = new BitSet(new long[]{0x0000000988020012L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel1844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParallel1891 = new BitSet(new long[]{0x0000000F88020010L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel1913 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleParallel1926 = new BitSet(new long[]{0x0000000F88020010L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel1947 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34_in_ruleParallel1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause1998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePause2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_entryRuleStatementScope2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementScope2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStatementScope2152 = new BitSet(new long[]{0xFC00004988FA0210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleStatementScope2173 = new BitSet(new long[]{0xFC00004988FA0210L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2198 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStatementScope2210 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2238 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2262 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2283 = new BitSet(new long[]{0x00000009880A0010L});
    public static final BitSet FOLLOW_19_in_ruleStatementScope2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBoolExpression2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression2555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2615 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression2648 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2669 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression2767 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression2800 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression2821 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2920 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation2953 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression3042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression3167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression3236 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3477 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression3510 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3531 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression3569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3629 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression3662 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3683 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression3721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3781 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression3814 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3835 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3933 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression3966 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression4025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression4085 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression4118 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression4246 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAtomicExpression4442 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4467 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAtomicExpression4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_ruleAtomicValuedExpression4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAtomicValuedExpression4683 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4708 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAtomicValuedExpression4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4857 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4876 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleValuedObjectTestExpression4891 = new BitSet(new long[]{0x0201000000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4912 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleValuedObjectTestExpression4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression5084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue5175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue5266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue5357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue5448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleDoubleValue5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTagAnnotation5956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation5977 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleTagAnnotation5990 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation6011 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_37_in_ruleTagAnnotation6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyStringValueAnnotation6109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6130 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6151 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleKeyStringValueAnnotation6164 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation6185 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_37_in_ruleKeyStringValueAnnotation6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypedKeyStringValueAnnotation6283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6304 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTypedKeyStringValueAnnotation6316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6337 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTypedKeyStringValueAnnotation6349 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6370 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypedKeyStringValueAnnotation6383 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation6404 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_37_in_ruleTypedKeyStringValueAnnotation6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyBooleanValueAnnotation6502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation6523 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation6540 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleKeyBooleanValueAnnotation6558 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation6579 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_37_in_ruleKeyBooleanValueAnnotation6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyIntValueAnnotation6677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation6698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation6715 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleKeyIntValueAnnotation6733 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation6754 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_37_in_ruleKeyIntValueAnnotation6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyFloatValueAnnotation6852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6873 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation6890 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleKeyFloatValueAnnotation6908 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation6929 = new BitSet(new long[]{0x0000006000000200L});
    public static final BitSet FOLLOW_37_in_ruleKeyFloatValueAnnotation6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID7106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7157 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleExtendedID7176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7191 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompareOperator7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCompareOperator7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCompareOperator7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCompareOperator7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCompareOperator7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCompareOperator7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePreOperator7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOrOperator7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAndOperator7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNotOperator7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAddOperator7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSubOperator7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMultOperator7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleModOperator7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDivOperator7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValOperator7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValueType7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValueType7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValueType7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleValueType7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleValueType7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleValueType7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleValueType7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleValueType7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCombineOperator7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCombineOperator8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCombineOperator8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCombineOperator8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred2_InternalSCL215 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred2_InternalSCL227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred3_InternalSCL255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_synpred19_InternalSCL1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred20_InternalSCL1254 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred20_InternalSCL1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred21_InternalSCL1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_synpred24_InternalSCL1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred25_InternalSCL1402 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred25_InternalSCL1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred26_InternalSCL1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred30_InternalSCL1719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred30_InternalSCL1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred31_InternalSCL1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_synpred35_InternalSCL2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred36_InternalSCL2198 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred36_InternalSCL2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred37_InternalSCL2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_synpred40_InternalSCL2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred43_InternalSCL2920 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_synpred43_InternalSCL2953 = new BitSet(new long[]{0x02290010000001F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred43_InternalSCL2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred44_InternalSCL3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_synpred56_InternalSCL4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_synpred57_InternalSCL4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred58_InternalSCL4683 = new BitSet(new long[]{0x02210010000001F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred58_InternalSCL4708 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred58_InternalSCL4719 = new BitSet(new long[]{0x0000000000000002L});

}