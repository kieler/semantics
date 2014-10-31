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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "';'", "'}'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "'='", "'combine'", "':'", "'if'", "'then'", "'else'", "'end'", "'goto'", "'fork'", "'par'", "'join'", "'pause'", "'('", "')'", "'['", "']'", "'<'", "'>'", "'&'", "'@'", "'.'", "'=='", "'<='", "'>='", "'<>'", "'pre'", "'|'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=8;
    public static final int T__69=69;
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
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
            this.state.ruleMemo = new HashMap[215+1];
             
             
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:84:1: ruleProgram returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;
        int ruleProgram_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_statements_9_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:87:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '{' ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? ) otherlv_10= '}'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==45) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:89:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:89:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:90:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleProgram144);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
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
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProgram157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getModuleKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:110:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:112:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:128:2: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||(LA2_0>=20 && LA2_0<=24)||LA2_0==45||(LA2_0>=62 && LA2_0<=68)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:129:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:129:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:130:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProgram200);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleProgram213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:1: ( ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )*
            loop3:
            do {
                int alt3=3;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleProgram237);
            	    lv_statements_5_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"InstructionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleProgram249); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getSemicolonKeyword_5_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:175:3: lv_statements_7_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsEmptyStatementParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleProgram277);
            	    lv_statements_7_0=ruleEmptyStatement();

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
            	              		"EmptyStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:4: ( ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==17||LA5_0==29||(LA5_0>=33 && LA5_0<=34)||LA5_0==37||LA5_0==45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:5: ( (lv_statements_8_0= ruleInstructionStatement ) ) ( (lv_statements_9_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:191:5: ( (lv_statements_8_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:192:1: (lv_statements_8_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:192:1: (lv_statements_8_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:193:3: lv_statements_8_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsInstructionStatementParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleProgram301);
                    lv_statements_8_0=ruleInstructionStatement();

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
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:209:2: ( (lv_statements_9_0= ruleEmptyStatement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==45) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:210:1: (lv_statements_9_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:210:1: (lv_statements_9_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:211:3: lv_statements_9_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsEmptyStatementParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleProgram322);
                    	    lv_statements_9_0=ruleEmptyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_9_0, 
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleProgram338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6());
                  
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


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:239:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:240:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:241:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration374);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:248:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleDeclaration_StartIndex = input.index();
        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_valuedObjects_9_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:251:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:252:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:252:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:252:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:252:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:253:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:253:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:254:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDeclaration430);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
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
            	    break loop6;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:270:3: ( (lv_const_1_0= 'const' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:271:1: (lv_const_1_0= 'const' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:271:1: (lv_const_1_0= 'const' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:272:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getDeclarationAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:285:3: ( (lv_input_2_0= 'input' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:286:1: (lv_input_2_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:286:1: (lv_input_2_0= 'input' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:287:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getDeclarationAccess().getInputInputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:300:3: ( (lv_output_3_0= 'output' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:301:1: (lv_output_3_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:301:1: (lv_output_3_0= 'output' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:302:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getDeclarationAccess().getOutputOutputKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:315:3: ( (lv_static_4_0= 'static' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:316:1: (lv_static_4_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:316:1: (lv_static_4_0= 'static' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:317:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getDeclarationAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:330:3: ( (lv_signal_5_0= 'signal' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:331:1: (lv_signal_5_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:331:1: (lv_signal_5_0= 'signal' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:332:3: lv_signal_5_0= 'signal'
                    {
                    lv_signal_5_0=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_5_0, grammarAccess.getDeclarationAccess().getSignalSignalKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:345:3: ( (lv_type_6_0= ruleValueType ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:346:1: (lv_type_6_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:346:1: (lv_type_6_0= ruleValueType )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:347:3: lv_type_6_0= ruleValueType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueType_in_ruleDeclaration612);
            lv_type_6_0=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_6_0, 
                      		"ValueType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:363:2: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:364:1: (lv_valuedObjects_7_0= ruleValuedObject )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:364:1: (lv_valuedObjects_7_0= ruleValuedObject )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:365:3: lv_valuedObjects_7_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration633);
            lv_valuedObjects_7_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_7_0, 
                      		"ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:381:2: (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:381:4: otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration646); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:385:1: ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:386:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:386:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:387:3: lv_valuedObjects_9_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleDeclaration667);
            	    lv_valuedObjects_9_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_9_0, 
            	              		"ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getSemicolonKeyword_9());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:415:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObject_StartIndex = input.index();
        EObject iv_ruleValuedObject = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:416:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:417:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject717);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject727); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:424:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) ) )? (otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;
        int ruleValuedObject_StartIndex = input.index();
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_initialValue_3_0 = null;

        Enumerator lv_combineOperator_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:427:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) ) )? (otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:428:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) ) )? (otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:428:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) ) )? (otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:428:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) ) )? (otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:428:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMENT_ANNOTATION||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:429:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:429:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:430:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleValuedObject773);
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
            	    break loop13;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:446:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:447:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:447:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:448:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObject791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getValuedObjectAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:464:2: (otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:464:4: otherlv_2= '=' ( (lv_initialValue_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleValuedObject809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:468:1: ( (lv_initialValue_3_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:469:1: (lv_initialValue_3_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:469:1: (lv_initialValue_3_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:470:3: lv_initialValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObject830);
                    lv_initialValue_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:486:4: (otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:486:6: otherlv_4= 'combine' ( (lv_combineOperator_5_0= ruleCombineOperator ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleValuedObject845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:490:1: ( (lv_combineOperator_5_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:491:1: (lv_combineOperator_5_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:491:1: (lv_combineOperator_5_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:492:3: lv_combineOperator_5_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleValuedObject866);
                    lv_combineOperator_5_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_5_0, 
                              		"CombineOperator");
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleValuedObject_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:518:1: entryRuleEmptyStatement returns [EObject current=null] : iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
    public final EObject entryRuleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleEmptyStatement_StartIndex = input.index();
        EObject iv_ruleEmptyStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:519:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:520:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement906);
            iv_ruleEmptyStatement=ruleEmptyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyStatement916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleEmptyStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyStatement"


    // $ANTLR start "ruleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:527:1: ruleEmptyStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) ;
    public final EObject ruleEmptyStatement() throws RecognitionException {
        EObject current = null;
        int ruleEmptyStatement_StartIndex = input.index();
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:530:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:531:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:531:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:531:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:531:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:532:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:532:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:533:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmptyStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEmptyStatement962);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmptyStatementRule());
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
            	    break loop16;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:549:3: ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:549:4: ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:549:4: ( (lv_label_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:550:1: (lv_label_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:550:1: (lv_label_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:551:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyStatement981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_1_0, grammarAccess.getEmptyStatementAccess().getLabelIDTerminalRuleCall_1_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEmptyStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEmptyStatement998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEmptyStatementAccess().getColonKeyword_1_1());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleEmptyStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEmptyStatement"


    // $ANTLR start "entryRuleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:579:1: entryRuleInstructionStatement returns [EObject current=null] : iv_ruleInstructionStatement= ruleInstructionStatement EOF ;
    public final EObject entryRuleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleInstructionStatement_StartIndex = input.index();
        EObject iv_ruleInstructionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:580:2: (iv_ruleInstructionStatement= ruleInstructionStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:581:2: iv_ruleInstructionStatement= ruleInstructionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement1035);
            iv_ruleInstructionStatement=ruleInstructionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionStatement1045); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionStatement"


    // $ANTLR start "ruleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:588:1: ruleInstructionStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) ) ;
    public final EObject ruleInstructionStatement() throws RecognitionException {
        EObject current = null;
        int ruleInstructionStatement_StartIndex = input.index();
        EObject lv_annotations_0_0 = null;

        EObject lv_instruction_1_1 = null;

        EObject lv_instruction_1_2 = null;

        EObject lv_instruction_1_3 = null;

        EObject lv_instruction_1_4 = null;

        EObject lv_instruction_1_5 = null;

        EObject lv_instruction_1_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:591:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:592:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:592:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:592:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:592:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMENT_ANNOTATION||LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:593:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:593:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:594:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionStatement1091);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
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
            	    break loop17;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:610:3: ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:611:1: ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:611:1: ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:612:1: (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:612:1: (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            case 37:
                {
                alt18=5;
                }
                break;
            case 17:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:613:3: lv_instruction_1_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionAssignmentParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstructionStatement1115);
                    lv_instruction_1_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_1, 
                              		"Assignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:628:8: lv_instruction_1_2= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionConditionalParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstructionStatement1134);
                    lv_instruction_1_2=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_2, 
                              		"Conditional");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:643:8: lv_instruction_1_3= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionGotoParserRuleCall_1_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstructionStatement1153);
                    lv_instruction_1_3=ruleGoto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_3, 
                              		"Goto");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:658:8: lv_instruction_1_4= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionParallelParserRuleCall_1_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstructionStatement1172);
                    lv_instruction_1_4=ruleParallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_4, 
                              		"Parallel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:673:8: lv_instruction_1_5= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionPauseParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstructionStatement1191);
                    lv_instruction_1_5=rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_5, 
                              		"Pause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:688:8: lv_instruction_1_6= ruleStatementScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionStatementScopeParserRuleCall_1_0_5()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementScope_in_ruleInstructionStatement1210);
                    lv_instruction_1_6=ruleStatementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_1_6, 
                              		"StatementScope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleInstructionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInstructionStatement"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:716:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:717:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:718:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1251);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1261); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;
        int ruleAssignment_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:728:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:729:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:729:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:729:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:729:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:730:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:730:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:731:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAssignment1322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:749:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:750:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:750:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:751:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1343);
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:775:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;
        int entryRuleConditional_StartIndex = input.index();
        EObject iv_ruleConditional = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:776:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:777:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional1379);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional1389); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) ;
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

        EObject lv_declarations_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_declarations_10_0 = null;

        EObject lv_elseStatements_11_0 = null;

        EObject lv_elseStatements_13_0 = null;

        EObject lv_elseStatements_14_0 = null;

        EObject lv_elseStatements_15_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:787:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:788:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:788:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:788:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_declarations_3_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleConditional1426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:792:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:793:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:793:1: (lv_expression_1_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:794:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditional1447);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleConditional1459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:814:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:815:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:815:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:816:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleConditional1480);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:3: ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*
            loop20:
            do {
                int alt20=3;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:833:1: (lv_statements_4_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:833:1: (lv_statements_4_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:834:3: lv_statements_4_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1505);
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

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleConditional1517); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getSemicolonKeyword_4_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:855:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:855:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:856:1: (lv_statements_6_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:856:1: (lv_statements_6_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:857:3: lv_statements_6_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1545);
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:873:4: ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==RULE_COMMENT_ANNOTATION||LA22_0==17||LA22_0==29||(LA22_0>=33 && LA22_0<=34)||LA22_0==37||LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:873:5: ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:873:5: ( (lv_statements_7_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:874:1: (lv_statements_7_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:874:1: (lv_statements_7_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:875:3: lv_statements_7_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1569);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:891:2: ( (lv_statements_8_0= ruleEmptyStatement ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==45) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:892:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:892:1: (lv_statements_8_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:893:3: lv_statements_8_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1590);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:909:6: (otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:909:8: otherlv_9= 'else' ( (lv_declarations_10_0= ruleDeclaration ) )* ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleConditional1607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getConditionalAccess().getElseKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:913:1: ( (lv_declarations_10_0= ruleDeclaration ) )*
                    loop23:
                    do {
                        int alt23=2;
                        alt23 = dfa23.predict(input);
                        switch (alt23) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:914:1: (lv_declarations_10_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:914:1: (lv_declarations_10_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:915:3: lv_declarations_10_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDeclaration_in_ruleConditional1628);
                    	    lv_declarations_10_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_10_0, 
                    	              		"Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:3: ( ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )? )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        alt24 = dfa24.predict(input);
                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:932:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:932:1: (lv_elseStatements_11_0= ruleInstructionStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:933:3: lv_elseStatements_11_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1653);
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

                    	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleConditional1665); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getConditionalAccess().getSemicolonKeyword_5_2_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:954:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:954:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:955:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:955:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:956:3: lv_elseStatements_13_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1693);
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
                    	    break loop24;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:972:4: ( ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID||LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==17||LA26_0==29||(LA26_0>=33 && LA26_0<=34)||LA26_0==37||LA26_0==45) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:972:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) ) ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:972:5: ( (lv_elseStatements_14_0= ruleInstructionStatement ) )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:973:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:973:1: (lv_elseStatements_14_0= ruleInstructionStatement )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:974:3: lv_elseStatements_14_0= ruleInstructionStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1717);
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

                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:990:2: ( (lv_elseStatements_15_0= ruleEmptyStatement ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==RULE_ID||LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==45) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:991:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    {
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:991:1: (lv_elseStatements_15_0= ruleEmptyStatement )
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:992:3: lv_elseStatements_15_0= ruleEmptyStatement
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1738);
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleConditional1756); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleConditional_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1020:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;
        int entryRuleGoto_StartIndex = input.index();
        EObject iv_ruleGoto = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1021:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1022:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1792);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1029:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;
        int ruleGoto_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_targetLabel_1_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1032:28: ( (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1033:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1033:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1033:3: otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleGoto1839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1037:1: ( (lv_targetLabel_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1038:1: (lv_targetLabel_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1038:1: (lv_targetLabel_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1039:3: lv_targetLabel_1_0= RULE_ID
            {
            lv_targetLabel_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto1856); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleGoto_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1065:1: entryRuleThread returns [EObject current=null] : iv_ruleThread= ruleThread EOF ;
    public final EObject entryRuleThread() throws RecognitionException {
        EObject current = null;
        int entryRuleThread_StartIndex = input.index();
        EObject iv_ruleThread = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1066:2: (iv_ruleThread= ruleThread EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1067:2: iv_ruleThread= ruleThread EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThreadRule()); 
            }
            pushFollow(FOLLOW_ruleThread_in_entryRuleThread1899);
            iv_ruleThread=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThread; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThread1909); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleThread"


    // $ANTLR start "ruleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1074:1: ruleThread returns [EObject current=null] : ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1077:28: ( ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1078:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1078:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1078:2: () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1078:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1079:2: 
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:2: ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*
            loop28:
            do {
                int alt28=3;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1088:1: (lv_statements_1_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1088:1: (lv_statements_1_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1089:3: lv_statements_1_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1970);
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

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleThread1982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getThreadAccess().getSemicolonKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1111:1: (lv_statements_3_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1111:1: (lv_statements_3_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1112:3: lv_statements_3_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread2010);
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
            	    break loop28;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==17||LA30_0==29||(LA30_0>=33 && LA30_0<=34)||LA30_0==37||LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1129:1: (lv_statements_4_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1129:1: (lv_statements_4_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1130:3: lv_statements_4_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread2034);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1146:2: ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID||LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==45) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1147:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1147:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1148:3: lv_statements_5_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread2055);
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
                    	    break loop29;
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleThread_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleThread"


    // $ANTLR start "entryRuleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;
        int entryRuleParallel_StartIndex = input.index();
        EObject iv_ruleParallel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1173:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1174:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel2095);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel2105); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1181:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1184:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1185:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1185:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1185:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleParallel2142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1189:1: ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1189:2: ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1189:2: ( (lv_threads_1_0= ruleThread ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1190:1: (lv_threads_1_0= ruleThread )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1190:1: (lv_threads_1_0= ruleThread )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1191:3: lv_threads_1_0= ruleThread
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleThread_in_ruleParallel2164);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1207:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1207:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleParallel2177); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1211:1: ( (lv_threads_3_0= ruleThread ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:1: (lv_threads_3_0= ruleThread )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:1: (lv_threads_3_0= ruleThread )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1213:3: lv_threads_3_0= ruleThread
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleThread_in_ruleParallel2198);
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
            	    break loop31;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleParallel2213); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 20, ruleParallel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1241:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;
        int entryRulePause_StartIndex = input.index();
        EObject iv_rulePause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1242:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1243:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause2249);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause2259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1250:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;
        int rulePause_StartIndex = input.index();
        Token otherlv_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1253:28: ( (otherlv_0= 'pause' () ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1254:1: (otherlv_0= 'pause' () )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1254:1: (otherlv_0= 'pause' () )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1254:3: otherlv_0= 'pause' ()
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePause2296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1258:1: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1259:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 22, rulePause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1275:1: entryRuleStatementScope returns [EObject current=null] : iv_ruleStatementScope= ruleStatementScope EOF ;
    public final EObject entryRuleStatementScope() throws RecognitionException {
        EObject current = null;
        int entryRuleStatementScope_StartIndex = input.index();
        EObject iv_ruleStatementScope = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1276:2: (iv_ruleStatementScope= ruleStatementScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1277:2: iv_ruleStatementScope= ruleStatementScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatementScope_in_entryRuleStatementScope2344);
            iv_ruleStatementScope=ruleStatementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementScope2354); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementScope"


    // $ANTLR start "ruleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1284:1: ruleStatementScope returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) ;
    public final EObject ruleStatementScope() throws RecognitionException {
        EObject current = null;
        int ruleStatementScope_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1287:28: ( ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1288:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1288:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1288:2: () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1288:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1289:2: 
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStatementScope2403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatementScopeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1301:1: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1302:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1302:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1303:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleStatementScope2424);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_2_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:3: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop33:
            do {
                int alt33=3;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1320:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1320:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1321:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2449);
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

            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStatementScope2461); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStatementScopeAccess().getSemicolonKeyword_3_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1342:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1342:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1343:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1343:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1344:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2489);
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
            	    break loop33;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1360:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==RULE_COMMENT_ANNOTATION||LA35_0==17||LA35_0==29||(LA35_0>=33 && LA35_0<=34)||LA35_0==37||LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1360:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1360:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1361:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1361:1: (lv_statements_6_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1362:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2513);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1378:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID||LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==45) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1379:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1379:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1380:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2534);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleStatementScope2550); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleStatementScope_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatementScope"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1410:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1411:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1412:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2588);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2598); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1419:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1422:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1423:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1423:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1424:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleExpression2648);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1437:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression2678);
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1456:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolExpression_StartIndex = input.index();
        EObject iv_ruleBoolExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1457:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1458:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2713);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression2723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1465:1: ruleBoolExpression returns [EObject current=null] : this_OrAndExpression_0= ruleOrAndExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;
        int ruleBoolExpression_StartIndex = input.index();
        EObject this_OrAndExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1468:28: (this_OrAndExpression_0= ruleOrAndExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1470:2: this_OrAndExpression_0= ruleOrAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrAndExpression_in_ruleBoolExpression2772);
            this_OrAndExpression_0=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrAndExpression_0; 
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleBoolExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleOrAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1489:1: entryRuleOrAndExpression returns [EObject current=null] : iv_ruleOrAndExpression= ruleOrAndExpression EOF ;
    public final EObject entryRuleOrAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleOrAndExpression_StartIndex = input.index();
        EObject iv_ruleOrAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1490:2: (iv_ruleOrAndExpression= ruleOrAndExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1491:2: iv_ruleOrAndExpression= ruleOrAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression2806);
            iv_ruleOrAndExpression=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrAndExpression2816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleOrAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOrAndExpression"


    // $ANTLR start "ruleOrAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1498:1: ruleOrAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) ;
    public final EObject ruleOrAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleOrAndExpression_StartIndex = input.index();
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_5_1 = null;

        Enumerator lv_operator_5_2 = null;

        EObject lv_subExpressions_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1501:28: ( (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1502:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1502:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1503:2: this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleOrAndExpression2866);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==52||LA38_0==60) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:3: ()
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1515:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndAdd(
                    	                  grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1523:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1524:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1524:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1525:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1525:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    int alt37=2;
                    	    int LA37_0 = input.LA(1);

                    	    if ( (LA37_0==52) ) {
                    	        alt37=1;
                    	    }
                    	    else if ( (LA37_0==60) ) {
                    	        alt37=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 37, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt37) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1526:3: lv_operator_2_1= ruleOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleOrOperator_in_ruleOrAndExpression2902);
                    	            lv_operator_2_1=ruleOrOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_2_1, 
                    	                      		"OrOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1541:8: lv_operator_2_2= ruleLogicalOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression2921);
                    	            lv_operator_2_2=ruleLogicalOrOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_2_2, 
                    	                      		"LogicalOrOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1559:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1560:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1560:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1561:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleOrAndExpression2945);
                    	    lv_subExpressions_3_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1578:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1578:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==44||LA40_0==61) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1578:7: () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1578:7: ()
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1579:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndAdd(
                    	                  grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1587:2: ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1588:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1588:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1589:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1589:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==44) ) {
                    	        alt39=1;
                    	    }
                    	    else if ( (LA39_0==61) ) {
                    	        alt39=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 39, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1590:3: lv_operator_5_1= ruleAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAndOperator_in_ruleOrAndExpression2989);
                    	            lv_operator_5_1=ruleAndOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_5_1, 
                    	                      		"AndOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1605:8: lv_operator_5_2= ruleLogicalAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression3008);
                    	            lv_operator_5_2=ruleLogicalAndOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_5_2, 
                    	                      		"LogicalAndOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1623:2: ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1624:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1624:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1625:3: lv_subExpressions_6_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleOrAndExpression3032);
                    	    lv_subExpressions_6_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_6_0, 
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleOrAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOrAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1649:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareOperation_StartIndex = input.index();
        EObject iv_ruleCompareOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1650:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1651:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3071);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation3081); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1658:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
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
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1661:28: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1663:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation3132);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1675:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1683:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1684:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1684:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1685:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation3165);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1701:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1702:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1702:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1703:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation3186);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1721:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleCompareOperation3219);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1740:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotOrValuedExpression_StartIndex = input.index();
        EObject iv_ruleNotOrValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1741:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1742:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression3254);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression3264); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1749:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotOrValuedExpression_StartIndex = input.index();
        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1752:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1753:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1753:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1754:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression3314);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1767:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression3344);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1786:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNotExpression_StartIndex = input.index();
        EObject iv_ruleNotExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1787:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1788:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression3379);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression3389); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1795:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;
        int ruleNotExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1798:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_HOSTCODE)||LA44_0==RULE_BOOLEAN||LA44_0==38||LA44_0==42||LA44_0==51||LA44_0==59) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1799:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1800:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1808:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1809:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1809:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1810:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression3448);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1826:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1827:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1827:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1828:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression3469);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1846:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression3501);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1865:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedExpression_StartIndex = input.index();
        EObject iv_ruleValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1866:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1867:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3536);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression3546); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1874:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleValuedExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1877:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1879:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression3595);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1898:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1899:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1900:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression3629);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression3639); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1907:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1910:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1911:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1911:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1912:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3689);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1923:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==54) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1923:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1923:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1924:2: 
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1932:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1933:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1933:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1934:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression3722);
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1950:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1951:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1951:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1952:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression3743);
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
            	    break loop45;
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1976:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubExpression_StartIndex = input.index();
        EObject iv_ruleSubExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1977:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1978:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression3781);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression3791); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1985:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubExpression_StartIndex = input.index();
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1988:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1989:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1989:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1990:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3841);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2001:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==55) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2001:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2001:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2002:2: 
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2010:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2011:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2011:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2012:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression3874);
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2028:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2029:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2029:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2030:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression3895);
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
            	    break loop46;
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2054:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultExpression_StartIndex = input.index();
        EObject iv_ruleMultExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2055:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2056:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression3933);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression3943); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2063:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultExpression_StartIndex = input.index();
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2066:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2067:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2067:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2068:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression3993);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2079:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==56) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2079:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2079:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2080:2: 
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2088:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2089:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2089:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2090:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression4026);
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

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2106:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2107:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2107:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression4047);
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
            	    break loop47;
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2132:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivExpression_StartIndex = input.index();
        EObject iv_ruleDivExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2133:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2134:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression4085);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression4095); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2141:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivExpression_StartIndex = input.index();
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2144:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2145:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2145:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2146:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression4145);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2157:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2157:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2157:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2158:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2166:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2167:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2167:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2168:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression4178);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2184:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2185:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2185:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2186:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression4199);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2210:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModExpression_StartIndex = input.index();
        EObject iv_ruleModExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2211:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2212:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression4237);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression4247); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2219:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;
        int ruleModExpression_StartIndex = input.index();
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2222:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2223:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2223:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2224:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression4297);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2235:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2235:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2235:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2236:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2244:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2245:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2245:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2246:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression4330);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2262:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2263:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2263:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2264:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4351);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2288:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNegExpression_StartIndex = input.index();
        EObject iv_ruleNegExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2289:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2290:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4389);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4399); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2297:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;
        int ruleNegExpression_StartIndex = input.index();
        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2300:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2301:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2301:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_BOOLEAN)||LA50_0==38||LA50_0==42||LA50_0==51||LA50_0==59) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2301:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2301:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2301:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2301:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2302:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2310:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2311:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2311:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2312:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression4458);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2328:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2329:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2329:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2330:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression4479);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2348:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4511);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2367:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicExpression_StartIndex = input.index();
        EObject iv_ruleAtomicExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2368:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2369:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4546);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression4556); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2376:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2379:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2380:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2380:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt51=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt51=1;
                }
                break;
            case RULE_ID:
            case 51:
            case 59:
                {
                alt51=2;
                }
                break;
            case 38:
                {
                alt51=3;
                }
                break;
            case 42:
                {
                alt51=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2381:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolValue_in_ruleAtomicExpression4606);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2394:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4636);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2406:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2406:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2406:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleAtomicExpression4654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4679);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleAtomicExpression4690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2428:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4722);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2441:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression4752);
                    this_TextExpression_6=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_6; 
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2460:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAtomicValuedExpression_StartIndex = input.index();
        EObject iv_ruleAtomicValuedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2461:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2462:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4787);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression4797); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2469:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;
        int ruleAtomicValuedExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2472:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2473:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2473:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt52=4;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2474:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4847);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2487:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4877);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleAtomicValuedExpression4895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4920);
                    this_ValuedExpression_3=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleAtomicValuedExpression4931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2521:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4963);
                    this_AtomicExpression_5=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_5; 
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2540:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectTestExpression_StartIndex = input.index();
        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2541:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2542:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4998);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression5008); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2549:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2552:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2553:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2553:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51||LA54_0==59) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2553:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2553:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2553:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2553:3: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2554:2: 
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2562:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2563:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2563:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2564:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2564:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==51) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==59) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2565:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression5069);
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
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2580:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression5088);
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

                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleValuedObjectTestExpression5103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2602:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2603:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2603:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2604:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression5124);
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

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleValuedObjectTestExpression5136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2626:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5168);
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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2645:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int entryRuleValuedObjectReference_StartIndex = input.index();
        EObject iv_ruleValuedObjectReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2646:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2647:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference5203);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference5213); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2654:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;
        int ruleValuedObjectReference_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2657:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2658:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2658:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2658:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2658:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2659:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2659:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference5262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2674:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==40) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2674:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleValuedObjectReference5275); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2678:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2679:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2679:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2680:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleValuedObjectReference5296);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleValuedObjectReference5308); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleValuedObjectReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2708:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionCall_StartIndex = input.index();
        EObject iv_ruleFunctionCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2709:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2710:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5346);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5356); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2717:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '>' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;
        int ruleFunctionCall_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_functionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2720:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '>' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2721:1: (otherlv_0= '<' ( (lv_functionName_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '>' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2721:1: (otherlv_0= '<' ( (lv_functionName_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '>' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2721:3: otherlv_0= '<' ( (lv_functionName_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFunctionCall5393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2725:1: ( (lv_functionName_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2726:1: (lv_functionName_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2726:1: (lv_functionName_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2727:3: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall5410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_1_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2743:2: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==38) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2743:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleFunctionCall5428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2747:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2748:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2748:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2749:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall5449);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2765:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==25) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2765:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleFunctionCall5462); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2769:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2770:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2770:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2771:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionCall5483);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleFunctionCall5497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleFunctionCall5511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleFunctionCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2803:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2804:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2805:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5547);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5557); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2812:1: ruleParameter returns [EObject current=null] : ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token lv_callByReference_0_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2815:28: ( ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2816:1: ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2816:1: ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2816:2: ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2816:2: ( (lv_callByReference_0_0= '&' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2817:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2817:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2818:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,44,FOLLOW_44_in_ruleParameter5600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_0_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2831:3: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2832:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2832:1: (lv_expression_1_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2833:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameter5635);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2857:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTextExpression_StartIndex = input.index();
        EObject iv_ruleTextExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2858:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2859:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression5671);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression5681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2866:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;
        int ruleTextExpression_StartIndex = input.index();
        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2869:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2870:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2870:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2871:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2871:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2872:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5722); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleTextExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2896:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;
        int entryRuleIntValue_StartIndex = input.index();
        EObject iv_ruleIntValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2897:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2898:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue5762);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue5772); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2905:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;
        int ruleIntValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2908:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2909:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2909:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2910:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2910:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2911:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue5813); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleIntValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2935:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatValue_StartIndex = input.index();
        EObject iv_ruleFloatValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2936:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2937:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue5853);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue5863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2944:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;
        int ruleFloatValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2947:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2948:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2948:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2949:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2949:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2950:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue5904); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleFloatValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2974:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;
        int entryRuleBoolValue_StartIndex = input.index();
        EObject iv_ruleBoolValue = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2975:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2976:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_ruleBoolValue_in_entryRuleBoolValue5944);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolValue5954); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2983:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;
        int ruleBoolValue_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2986:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2987:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2987:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2988:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2988:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2989:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5995); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleBoolValue_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3015:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotation_StartIndex = input.index();
        EObject iv_ruleAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3016:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3017:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6037);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6047); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3024:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3027:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3028:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3028:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt59=7;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3029:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation6097);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3042:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation6127);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3055:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation6157);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3068:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation6187);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3081:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation6217);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3094:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation6247);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3107:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation6277);
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3128:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleCommentAnnotation_StartIndex = input.index();
        EObject iv_ruleCommentAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3129:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3130:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6314);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation6324); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3137:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;
        int ruleCommentAnnotation_StartIndex = input.index();
        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3140:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3141:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3141:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3142:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3142:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3143:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6365); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleCommentAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3167:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTagAnnotation_StartIndex = input.index();
        EObject iv_ruleTagAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3168:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3169:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation6405);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation6415); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3176:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3179:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleTagAnnotation6452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3184:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3185:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3185:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3186:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation6473);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3202:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3202:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTagAnnotation6486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3206:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_COMMENT_ANNOTATION||LA60_0==45) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3207:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3207:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3208:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTagAnnotation6507);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleTagAnnotation6520); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleTagAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3236:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3237:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3238:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6558);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3245:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3248:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3249:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3249:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3249:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleKeyStringValueAnnotation6605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3253:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3254:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3254:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3255:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6626);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3271:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3272:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3272:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3273:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6647);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3289:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==38) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3289:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleKeyStringValueAnnotation6660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3293:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_COMMENT_ANNOTATION||LA62_0==45) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3294:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3294:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3295:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation6681);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleKeyStringValueAnnotation6694); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3323:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleTypedKeyStringValueAnnotation_StartIndex = input.index();
        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3324:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3325:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6732);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3332:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3335:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3336:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3336:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3336:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleTypedKeyStringValueAnnotation6779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3340:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3341:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3341:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3342:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6800);
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

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleTypedKeyStringValueAnnotation6812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3362:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3363:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3363:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3364:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6833);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleTypedKeyStringValueAnnotation6845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3384:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3385:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3385:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3386:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6866);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3402:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==38) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3402:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleTypedKeyStringValueAnnotation6879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3406:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_COMMENT_ANNOTATION||LA64_0==45) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3407:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3407:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3408:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation6900);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleTypedKeyStringValueAnnotation6913); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleTypedKeyStringValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3436:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyBooleanValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3437:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3438:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6951);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3445:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3448:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3449:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3449:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3449:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleKeyBooleanValueAnnotation6998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3453:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3454:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3454:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3455:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation7019);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3471:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3472:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3472:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3473:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation7036); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3489:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3489:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleKeyBooleanValueAnnotation7054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3493:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_COMMENT_ANNOTATION||LA66_0==45) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3494:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3494:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3495:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation7075);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleKeyBooleanValueAnnotation7088); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleKeyBooleanValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3523:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyIntValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3524:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3525:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation7126);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation7136); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3532:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3535:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3536:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3536:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3536:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleKeyIntValueAnnotation7173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3540:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3541:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3541:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3542:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation7194);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3558:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3559:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3559:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3560:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation7211); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3576:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3576:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleKeyIntValueAnnotation7229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3580:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_COMMENT_ANNOTATION||LA68_0==45) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3581:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3581:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3582:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation7250);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleKeyIntValueAnnotation7263); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleKeyIntValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3610:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;
        int entryRuleKeyFloatValueAnnotation_StartIndex = input.index();
        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3611:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3612:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation7301);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation7311); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3619:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3622:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3623:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3623:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3623:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleKeyFloatValueAnnotation7348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3627:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3628:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3628:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3629:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation7369);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3645:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3646:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3646:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3647:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation7386); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3663:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==38) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3663:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleKeyFloatValueAnnotation7404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3667:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_COMMENT_ANNOTATION||LA70_0==45) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3668:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3668:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3669:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation7425);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleKeyFloatValueAnnotation7438); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleKeyFloatValueAnnotation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3699:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;
        int entryRuleEString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3700:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3701:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString7479);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString7490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3708:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleEString_StartIndex = input.index();
        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3711:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3712:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3712:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_ID) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3712:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString7530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3720:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString7556); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleEString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3735:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;
        int entryRuleExtendedID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3736:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3737:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID7602);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID7613); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3744:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExtendedID_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3747:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3748:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3748:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3748:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3755:1: (kw= '.' this_ID_2= RULE_ID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==46) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3756:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleExtendedID7672); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID7687); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleExtendedID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3776:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3778:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3779:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3779:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt74=1;
                }
                break;
            case 42:
                {
                alt74=2;
                }
                break;
            case 48:
                {
                alt74=3;
                }
                break;
            case 43:
                {
                alt74=4;
                }
                break;
            case 49:
                {
                alt74=5;
                }
                break;
            case 50:
                {
                alt74=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3779:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3779:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3779:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleCompareOperator7748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3785:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3785:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3785:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleCompareOperator7765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3791:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3791:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3791:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleCompareOperator7782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3797:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3797:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3797:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleCompareOperator7799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3803:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3803:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3803:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_49_in_ruleCompareOperator7816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3809:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3809:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3809:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_50_in_ruleCompareOperator7833); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 91, ruleCompareOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3819:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;
        int rulePreOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3821:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3822:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3822:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3822:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_rulePreOperator7877); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 92, rulePreOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleOrOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3832:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3834:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3835:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3835:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3835:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleOrOperator7920); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 93, ruleOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3845:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3847:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3848:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3848:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3848:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleAndOperator7963); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3858:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleNotOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3860:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3861:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3861:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3861:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleNotOperator8006); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 95, ruleNotOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3871:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleAddOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3873:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3874:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3874:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3874:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleAddOperator8049); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleAddOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3884:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleSubOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3886:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3887:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3887:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3887:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleSubOperator8092); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 97, ruleSubOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3897:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleMultOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3899:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3900:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3900:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3900:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleMultOperator8135); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleMultOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3910:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleModOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3912:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3913:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3913:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3913:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleModOperator8178); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 99, ruleModOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3923:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleDivOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3925:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3926:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3926:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3926:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleDivOperator8221); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleDivOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3936:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleValOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3938:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3939:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3939:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3939:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleValOperator8264); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 101, ruleValOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3949:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalOrOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3951:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3952:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3952:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3952:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleLogicalOrOperator8307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleLogicalOrOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3962:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;
        int ruleLogicalAndOperator_StartIndex = input.index();
        Token enumLiteral_0=null;

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3964:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3965:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3965:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3965:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleLogicalAndOperator8350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
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
            if ( state.backtracking>0 ) { memoize(input, 103, ruleLogicalAndOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3975:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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

         enterRule(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3977:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3978:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3978:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt75=1;
                }
                break;
            case 63:
                {
                alt75=2;
                }
                break;
            case 64:
                {
                alt75=3;
                }
                break;
            case 65:
                {
                alt75=4;
                }
                break;
            case 66:
                {
                alt75=5;
                }
                break;
            case 67:
                {
                alt75=6;
                }
                break;
            case 68:
                {
                alt75=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3978:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3978:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3978:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleValueType8394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3984:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3984:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3984:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleValueType8411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3990:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3990:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3990:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_ruleValueType8428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3996:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3996:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3996:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_65_in_ruleValueType8445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4002:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4002:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4002:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_66_in_ruleValueType8462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4008:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4008:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4008:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_67_in_ruleValueType8479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4014:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4014:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4014:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,68,FOLLOW_68_in_ruleValueType8496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6()); 
                          
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleValueType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4024:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4026:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4027:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4027:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt76=8;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt76=1;
                }
                break;
            case 54:
                {
                alt76=2;
                }
                break;
            case 56:
                {
                alt76=3;
                }
                break;
            case 70:
                {
                alt76=4;
                }
                break;
            case 71:
                {
                alt76=5;
                }
                break;
            case 52:
                {
                alt76=6;
                }
                break;
            case 44:
                {
                alt76=7;
                }
                break;
            case 68:
                {
                alt76=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4027:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4027:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4027:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator8541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4033:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4033:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4033:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleCombineOperator8558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4039:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4039:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4039:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleCombineOperator8575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4045:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4045:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4045:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator8592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4051:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4051:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4051:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator8609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4057:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4057:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4057:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_52_in_ruleCombineOperator8626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4063:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4063:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4063:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_44_in_ruleCombineOperator8643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4069:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4069:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4069:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator8660); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 105, ruleCombineOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred3_InternalSCL
    public final void synpred3_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:3: ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:150:4: ( (lv_statements_5_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:151:1: (lv_statements_5_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:152:3: lv_statements_5_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsInstructionStatementParserRuleCall_5_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred3_InternalSCL237);
        lv_statements_5_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,18,FOLLOW_18_in_synpred3_InternalSCL249); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSCL

    // $ANTLR start synpred4_InternalSCL
    public final void synpred4_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_7_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( ( (lv_statements_7_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:173:6: ( (lv_statements_7_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:174:1: (lv_statements_7_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:175:3: lv_statements_7_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsEmptyStatementParserRuleCall_5_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred4_InternalSCL277);
        lv_statements_7_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSCL

    // $ANTLR start synpred24_InternalSCL
    public final void synpred24_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_declarations_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:815:1: ( (lv_declarations_3_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:815:1: (lv_declarations_3_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:815:1: (lv_declarations_3_0= ruleDeclaration )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:816:3: lv_declarations_3_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDeclaration_in_synpred24_InternalSCL1480);
        lv_declarations_3_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSCL

    // $ANTLR start synpred25_InternalSCL
    public final void synpred25_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:5: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:5: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:6: ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:832:6: ( (lv_statements_4_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:833:1: (lv_statements_4_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:833:1: (lv_statements_4_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:834:3: lv_statements_4_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_4_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred25_InternalSCL1505);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,18,FOLLOW_18_in_synpred25_InternalSCL1517); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSCL

    // $ANTLR start synpred26_InternalSCL
    public final void synpred26_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_6_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:855:6: ( ( (lv_statements_6_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:855:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:855:6: ( (lv_statements_6_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:856:1: (lv_statements_6_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:856:1: (lv_statements_6_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:857:3: lv_statements_6_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred26_InternalSCL1545);
        lv_statements_6_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalSCL

    // $ANTLR start synpred29_InternalSCL
    public final void synpred29_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_declarations_10_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:914:1: ( (lv_declarations_10_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:914:1: (lv_declarations_10_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:914:1: (lv_declarations_10_0= ruleDeclaration )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:915:3: lv_declarations_10_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getDeclarationsDeclarationParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDeclaration_in_synpred29_InternalSCL1628);
        lv_declarations_10_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalSCL

    // $ANTLR start synpred30_InternalSCL
    public final void synpred30_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_elseStatements_11_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:5: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:5: ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:931:6: ( (lv_elseStatements_11_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:932:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:932:1: (lv_elseStatements_11_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:933:3: lv_elseStatements_11_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_5_2_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred30_InternalSCL1653);
        lv_elseStatements_11_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,18,FOLLOW_18_in_synpred30_InternalSCL1665); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalSCL

    // $ANTLR start synpred31_InternalSCL
    public final void synpred31_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_elseStatements_13_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:954:6: ( ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:954:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:954:6: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:955:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:955:1: (lv_elseStatements_13_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:956:3: lv_elseStatements_13_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_5_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred31_InternalSCL1693);
        lv_elseStatements_13_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31_InternalSCL

    // $ANTLR start synpred35_InternalSCL
    public final void synpred35_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:4: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1087:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1088:1: (lv_statements_1_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1088:1: (lv_statements_1_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1089:3: lv_statements_1_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred35_InternalSCL1970);
        lv_statements_1_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,18,FOLLOW_18_in_synpred35_InternalSCL1982); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalSCL

    // $ANTLR start synpred36_InternalSCL
    public final void synpred36_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:6: ( ( (lv_statements_3_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1111:1: (lv_statements_3_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1111:1: (lv_statements_3_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1112:3: lv_statements_3_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred36_InternalSCL2010);
        lv_statements_3_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSCL

    // $ANTLR start synpred40_InternalSCL
    public final void synpred40_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_declarations_2_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1302:1: ( (lv_declarations_2_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1302:1: (lv_declarations_2_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1302:1: (lv_declarations_2_0= ruleDeclaration )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1303:3: lv_declarations_2_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDeclaration_in_synpred40_InternalSCL2424);
        lv_declarations_2_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred40_InternalSCL

    // $ANTLR start synpred41_InternalSCL
    public final void synpred41_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:5: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1319:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1320:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1320:1: (lv_statements_3_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1321:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred41_InternalSCL2449);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FOLLOW_18_in_synpred41_InternalSCL2461); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalSCL

    // $ANTLR start synpred42_InternalSCL
    public final void synpred42_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1342:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1342:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1342:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1343:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1343:1: (lv_statements_5_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1344:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred42_InternalSCL2489);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred42_InternalSCL

    // $ANTLR start synpred45_InternalSCL
    public final void synpred45_InternalSCL_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1424:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1424:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBoolExpression_in_synpred45_InternalSCL2648);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalSCL

    // $ANTLR start synpred48_InternalSCL
    public final void synpred48_InternalSCL_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:2: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==52||LA88_0==60) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    {
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1514:3: ()
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1515:2: 
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	  /* */ 
        	      	
        	    }

        	    }

        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1523:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1524:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    {
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1524:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1525:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    {
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1525:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    int alt87=2;
        	    int LA87_0 = input.LA(1);

        	    if ( (LA87_0==52) ) {
        	        alt87=1;
        	    }
        	    else if ( (LA87_0==60) ) {
        	        alt87=2;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 87, 0, input);

        	        throw nvae;
        	    }
        	    switch (alt87) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1526:3: lv_operator_2_1= ruleOrOperator
        	            {
        	            pushFollow(FOLLOW_ruleOrOperator_in_synpred48_InternalSCL2902);
        	            lv_operator_2_1=ruleOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1541:8: lv_operator_2_2= ruleLogicalOrOperator
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
        	              	    
        	            }
        	            pushFollow(FOLLOW_ruleLogicalOrOperator_in_synpred48_InternalSCL2921);
        	            lv_operator_2_2=ruleLogicalOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }


        	    }

        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1559:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1560:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    {
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1560:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1561:3: lv_subExpressions_3_0= ruleCompareOperation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleCompareOperation_in_synpred48_InternalSCL2945);
        	    lv_subExpressions_3_0=ruleCompareOperation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop88;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred48_InternalSCL

    // $ANTLR start synpred51_InternalSCL
    public final void synpred51_InternalSCL_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1663:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred51_InternalSCL3132);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1674:2: ()
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1675:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1683:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1684:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1684:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1685:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOperator_in_synpred51_InternalSCL3165);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1701:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1702:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1702:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1703:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred51_InternalSCL3186);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalSCL

    // $ANTLR start synpred52_InternalSCL
    public final void synpred52_InternalSCL_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1754:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1754:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred52_InternalSCL3314);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalSCL

    // $ANTLR start synpred66_InternalSCL
    public final void synpred66_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ValuedExpression_3 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:6: ( (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
        {
        otherlv_2=(Token)match(input,38,FOLLOW_38_in_synpred66_InternalSCL4895); if (state.failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred66_InternalSCL4920);
        this_ValuedExpression_3=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_4=(Token)match(input,39,FOLLOW_39_in_synpred66_InternalSCL4931); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred66_InternalSCL

    // Delegated rules

    public final boolean synpred29_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred51_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred52_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred4_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred41_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\1\4\10\0\3\uffff";
    static final String DFA3_maxS =
        "\1\55\10\0\3\uffff";
    static final String DFA3_acceptS =
        "\11\uffff\1\3\1\1\1\2";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\10\1\uffff\1\11\11\uffff\1\4\3\uffff"+
            "\1\5\1\6\2\uffff\1\7\7\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 150:2: ( ( ( (lv_statements_5_0= ruleInstructionStatement ) ) otherlv_6= ';' ) | ( (lv_statements_7_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (synpred4_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (synpred4_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (synpred4_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\27\uffff";
    static final String DFA19_eofS =
        "\27\uffff";
    static final String DFA19_minS =
        "\1\4\2\0\24\uffff";
    static final String DFA19_maxS =
        "\1\104\2\0\24\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\2\7\uffff\1\1\13\uffff";
    static final String DFA19_specialS =
        "\1\uffff\1\0\1\1\24\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\3\2\uffff\5\13\4\uffff\1\3\1\uffff"+
            "\4\3\2\uffff\1\3\7\uffff\1\2\20\uffff\7\13",
            "\1\uffff",
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
            return "()* loopback of 814:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
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
                        if ( (synpred24_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index19_2);
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
    static final String DFA20_eotS =
        "\15\uffff";
    static final String DFA20_eofS =
        "\15\uffff";
    static final String DFA20_minS =
        "\1\4\10\0\4\uffff";
    static final String DFA20_maxS =
        "\1\55\10\0\4\uffff";
    static final String DFA20_acceptS =
        "\11\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\10\13\uffff\1\4\1\uffff\2\11\1\5"+
            "\1\6\2\uffff\1\7\7\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 832:4: ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (synpred26_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\26\uffff";
    static final String DFA23_eofS =
        "\26\uffff";
    static final String DFA23_minS =
        "\1\4\2\0\23\uffff";
    static final String DFA23_maxS =
        "\1\104\2\0\23\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\6\uffff\1\1\13\uffff";
    static final String DFA23_specialS =
        "\1\uffff\1\0\1\1\23\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\3\2\uffff\5\12\4\uffff\1\3\2\uffff"+
            "\3\3\2\uffff\1\3\7\uffff\1\2\20\uffff\7\12",
            "\1\uffff",
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
            return "()* loopback of 913:1: ( (lv_declarations_10_0= ruleDeclaration ) )*";
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
                        if ( (synpred29_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_2);
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
    static final String DFA24_eotS =
        "\14\uffff";
    static final String DFA24_eofS =
        "\14\uffff";
    static final String DFA24_minS =
        "\1\4\10\0\3\uffff";
    static final String DFA24_maxS =
        "\1\55\10\0\3\uffff";
    static final String DFA24_acceptS =
        "\11\uffff\1\3\1\1\1\2";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\10\13\uffff\1\4\2\uffff\1\11\1\5"+
            "\1\6\2\uffff\1\7\7\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 931:4: ( ( ( (lv_elseStatements_11_0= ruleInstructionStatement ) ) otherlv_12= ';' ) | ( (lv_elseStatements_13_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (synpred31_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (synpred31_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (synpred31_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\16\uffff";
    static final String DFA28_eofS =
        "\1\11\15\uffff";
    static final String DFA28_minS =
        "\1\4\10\0\5\uffff";
    static final String DFA28_maxS =
        "\1\55\10\0\5\uffff";
    static final String DFA28_acceptS =
        "\11\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\10\13\uffff\1\4\3\uffff\1\5\1\6\2"+
            "\11\1\7\7\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 1087:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*";
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
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (synpred36_InternalSCL()) ) {s = 13;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalSCL()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index28_8);
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
    static final String DFA32_eotS =
        "\26\uffff";
    static final String DFA32_eofS =
        "\26\uffff";
    static final String DFA32_minS =
        "\1\4\2\0\23\uffff";
    static final String DFA32_maxS =
        "\1\104\2\0\23\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\2\6\uffff\1\1\13\uffff";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\23\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\3\1\uffff\1\3\5\12\4\uffff\1\3\3"+
            "\uffff\2\3\2\uffff\1\3\7\uffff\1\2\20\uffff\7\12",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 1301:1: ( (lv_declarations_2_0= ruleDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\14\uffff";
    static final String DFA33_minS =
        "\1\4\10\0\3\uffff";
    static final String DFA33_maxS =
        "\1\55\10\0\3\uffff";
    static final String DFA33_acceptS =
        "\11\uffff\1\3\1\1\1\2";
    static final String DFA33_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\4\uffff\1\1\7\uffff\1\10\1\uffff\1\11\11\uffff\1\4\3\uffff"+
            "\1\5\1\6\2\uffff\1\7\7\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 1319:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (synpred42_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\15\uffff";
    static final String DFA36_eofS =
        "\15\uffff";
    static final String DFA36_minS =
        "\1\4\12\0\2\uffff";
    static final String DFA36_maxS =
        "\1\73\12\0\2\uffff";
    static final String DFA36_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA36_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\10\1\12\1\2\1\3\1\5\35\uffff\1\4\3\uffff\1\11\10\uffff\1"+
            "\6\1\uffff\1\13\1\uffff\1\1\3\uffff\1\7",
            "\1\uffff",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1423:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\22\uffff";
    static final String DFA41_eofS =
        "\1\5\21\uffff";
    static final String DFA41_minS =
        "\1\4\1\uffff\17\0\1\uffff";
    static final String DFA41_maxS =
        "\1\75\1\uffff\17\0\1\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA41_specialS =
        "\2\uffff\1\14\1\3\1\7\1\15\1\10\1\0\1\4\1\11\1\16\1\1\1\13\1\2\1"+
        "\12\1\5\1\6\1\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\10\4\uffff\1\6\10\uffff\1\4\1\11\5\uffff\1\3\1\uffff\1\2"+
            "\2\uffff\1\16\1\12\1\13\2\uffff\1\14\1\15\2\uffff\1\20\1\uffff"+
            "\1\17\2\uffff\1\21\1\7\6\uffff\1\1\7\uffff\1\1\1\21",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1514:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_11 = input.LA(1);

                         
                        int index41_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_13 = input.LA(1);

                         
                        int index41_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_8 = input.LA(1);

                         
                        int index41_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_15 = input.LA(1);

                         
                        int index41_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_16 = input.LA(1);

                         
                        int index41_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_16);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA41_14 = input.LA(1);

                         
                        int index41_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA41_12 = input.LA(1);

                         
                        int index41_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA41_10 = input.LA(1);

                         
                        int index41_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\15\uffff";
    static final String DFA42_eofS =
        "\15\uffff";
    static final String DFA42_minS =
        "\1\4\3\uffff\10\0\1\uffff";
    static final String DFA42_maxS =
        "\1\73\3\uffff\10\0\1\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA42_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\10\1\12\2\1\1\5\35\uffff\1\4\3\uffff\1\11\10\uffff\1\6\1"+
            "\uffff\1\13\1\uffff\1\1\3\uffff\1\7",
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
            "\1\uffff",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1662:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\14\uffff";
    static final String DFA43_eofS =
        "\14\uffff";
    static final String DFA43_minS =
        "\1\4\3\uffff\7\0\1\uffff";
    static final String DFA43_maxS =
        "\1\73\3\uffff\7\0\1\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA43_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\10\1\12\2\1\1\5\35\uffff\1\4\3\uffff\1\11\10\uffff\1\6\1"+
            "\uffff\1\13\1\uffff\1\1\3\uffff\1\7",
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1753:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_4 = input.LA(1);

                         
                        int index43_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_7 = input.LA(1);

                         
                        int index43_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_9 = input.LA(1);

                         
                        int index43_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_10 = input.LA(1);

                         
                        int index43_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index43_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\13\uffff";
    static final String DFA52_minS =
        "\1\4\2\uffff\1\0\7\uffff";
    static final String DFA52_maxS =
        "\1\73\2\uffff\1\0\7\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\1\3";
    static final String DFA52_specialS =
        "\3\uffff\1\0\7\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\4\1\1\1\2\1\4\35\uffff\1\3\3\uffff\1\4\10\uffff\1\4\7\uffff"+
            "\1\4",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "2473:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\17\uffff";
    static final String DFA59_eofS =
        "\3\uffff\1\10\5\uffff\1\15\2\uffff\1\10\1\16\1\uffff";
    static final String DFA59_minS =
        "\1\11\1\uffff\3\4\4\uffff\1\4\2\uffff\1\4\1\0\1\uffff";
    static final String DFA59_maxS =
        "\1\55\1\uffff\1\4\1\104\1\4\4\uffff\1\104\2\uffff\1\104\1\0\1\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\6\1\7\1\2\1\uffff\1\3\1\4\2\uffff\1\2";
    static final String DFA59_specialS =
        "\17\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1\43\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\uffff\1\6\1\7\1\5\1\10\1\12\5\uffff\2\10\2\uffff\5"+
            "\10\4\uffff\1\10\3\uffff\2\10\2\uffff\3\10\1\13\4\uffff\1\10"+
            "\1\4\17\uffff\7\10",
            "\1\14",
            "",
            "",
            "",
            "",
            "\1\12\4\uffff\1\12\6\uffff\2\12\1\10\1\uffff\5\12\4\10\1\12"+
            "\3\uffff\2\12\2\uffff\3\12\5\uffff\1\12\20\uffff\7\12",
            "",
            "",
            "\1\11\1\uffff\1\6\1\7\1\5\1\10\1\12\5\uffff\2\10\2\uffff\5"+
            "\10\4\uffff\1\10\3\uffff\2\10\2\uffff\3\10\1\13\4\uffff\1\10"+
            "\1\4\17\uffff\7\10",
            "\1\uffff",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3028:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleProgram144 = new BitSet(new long[]{0x0000200000010200L});
    public static final BitSet FOLLOW_16_in_ruleProgram157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram174 = new BitSet(new long[]{0xC000200001F30200L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProgram200 = new BitSet(new long[]{0xC000200001F30200L,0x000000000000001FL});
    public static final BitSet FOLLOW_17_in_ruleProgram213 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleProgram237 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProgram249 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleProgram277 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleProgram301 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleProgram322 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_19_in_ruleProgram338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration430 = new BitSet(new long[]{0xC000200001F10200L,0x000000000000001FL});
    public static final BitSet FOLLOW_20_in_ruleDeclaration449 = new BitSet(new long[]{0xC000200001F10200L,0x000000000000001FL});
    public static final BitSet FOLLOW_21_in_ruleDeclaration481 = new BitSet(new long[]{0xC000200001F10200L,0x000000000000001FL});
    public static final BitSet FOLLOW_22_in_ruleDeclaration513 = new BitSet(new long[]{0xC000200001F10200L,0x000000000000001FL});
    public static final BitSet FOLLOW_23_in_ruleDeclaration545 = new BitSet(new long[]{0xC000200001F10200L,0x000000000000001FL});
    public static final BitSet FOLLOW_24_in_ruleDeclaration577 = new BitSet(new long[]{0xC000200001F10200L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration612 = new BitSet(new long[]{0x0000200000010210L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration633 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration646 = new BitSet(new long[]{0x0000200000010210L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration667 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleValuedObject773 = new BitSet(new long[]{0x0000200000010210L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject791 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleValuedObject809 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject830 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleValuedObject845 = new BitSet(new long[]{0x0150100000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyStatement916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEmptyStatement962 = new BitSet(new long[]{0x0000200000010210L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyStatement981 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEmptyStatement998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionStatement1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionStatement1091 = new BitSet(new long[]{0x0000202620030210L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstructionStatement1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstructionStatement1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstructionStatement1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstructionStatement1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstructionStatement1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_ruleInstructionStatement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1310 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssignment1322 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleConditional1426 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditional1447 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleConditional1459 = new BitSet(new long[]{0xC0002027A1F30210L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleConditional1480 = new BitSet(new long[]{0xC0002027A1F30210L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1505 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional1517 = new BitSet(new long[]{0x00002027A0030210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1545 = new BitSet(new long[]{0x00002027A0030210L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1569 = new BitSet(new long[]{0x00002027A0030210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1590 = new BitSet(new long[]{0x00002027A0030210L});
    public static final BitSet FOLLOW_31_in_ruleConditional1607 = new BitSet(new long[]{0xC000202721F30210L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleConditional1628 = new BitSet(new long[]{0xC000202721F30210L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1653 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional1665 = new BitSet(new long[]{0x0000202720030210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1693 = new BitSet(new long[]{0x0000202720030210L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1717 = new BitSet(new long[]{0x0000202720030210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1738 = new BitSet(new long[]{0x0000202720030210L});
    public static final BitSet FOLLOW_32_in_ruleConditional1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGoto1839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThread_in_entryRuleThread1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThread1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleThread1982 = new BitSet(new long[]{0x0000202620030212L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread2010 = new BitSet(new long[]{0x0000202620030212L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread2034 = new BitSet(new long[]{0x0000202620030212L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread2055 = new BitSet(new long[]{0x0000202620030212L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel2095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleParallel2142 = new BitSet(new long[]{0x0000203E20030210L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel2164 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleParallel2177 = new BitSet(new long[]{0x0000203E20030210L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel2198 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleParallel2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePause2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_entryRuleStatementScope2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementScope2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStatementScope2403 = new BitSet(new long[]{0xC000202621FB0210L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatementScope2424 = new BitSet(new long[]{0xC000202621FB0210L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2449 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStatementScope2461 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2489 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2513 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2534 = new BitSet(new long[]{0x00002026200B0210L});
    public static final BitSet FOLLOW_19_in_ruleStatementScope2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression2713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrAndExpression_in_ruleBoolExpression2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression2806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrAndExpression2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression2866 = new BitSet(new long[]{0x3010100000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrAndExpression2902 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression2921 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression2945 = new BitSet(new long[]{0x1010000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleOrAndExpression2989 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression3008 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression3032 = new BitSet(new long[]{0x2000100000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation3132 = new BitSet(new long[]{0x00078C0000000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation3165 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression3254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression3379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression3448 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression3536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3689 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression3722 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression3743 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression3781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3841 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression3874 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression3895 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression3933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression3993 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression4026 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression4047 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression4085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression4145 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression4178 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression4297 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression4330 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression4458 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAtomicExpression4654 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression4679 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAtomicExpression4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression4787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAtomicValuedExpression4895 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4920 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAtomicValuedExpression4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression5069 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression5088 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleValuedObjectTestExpression5103 = new BitSet(new long[]{0x0808000000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression5124 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleValuedObjectTestExpression5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference5203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference5262 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleValuedObjectReference5275 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference5296 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleValuedObjectReference5308 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFunctionCall5393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall5410 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_38_in_ruleFunctionCall5428 = new BitSet(new long[]{0x08A81440000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall5449 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionCall5462 = new BitSet(new long[]{0x08A81440000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall5483 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleFunctionCall5497 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleFunctionCall5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParameter5600 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameter5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression5671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue5762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue5853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue5944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation6405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTagAnnotation6452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation6473 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleTagAnnotation6486 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation6507 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_39_in_ruleTagAnnotation6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation6558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleKeyStringValueAnnotation6605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation6626 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6647 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyStringValueAnnotation6660 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation6681 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_39_in_ruleKeyStringValueAnnotation6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypedKeyStringValueAnnotation6779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6800 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTypedKeyStringValueAnnotation6812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6833 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTypedKeyStringValueAnnotation6845 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6866 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypedKeyStringValueAnnotation6879 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation6900 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_39_in_ruleTypedKeyStringValueAnnotation6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleKeyBooleanValueAnnotation6998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation7019 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation7036 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyBooleanValueAnnotation7054 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation7075 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_39_in_ruleKeyBooleanValueAnnotation7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation7126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleKeyIntValueAnnotation7173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation7194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation7211 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyIntValueAnnotation7229 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation7250 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_39_in_ruleKeyIntValueAnnotation7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation7301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleKeyFloatValueAnnotation7348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation7369 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation7386 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyFloatValueAnnotation7404 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation7425 = new BitSet(new long[]{0x0000208000010200L});
    public static final BitSet FOLLOW_39_in_ruleKeyFloatValueAnnotation7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString7479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID7602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7653 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExtendedID7672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7687 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_47_in_ruleCompareOperator7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompareOperator7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCompareOperator7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCompareOperator7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCompareOperator7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCompareOperator7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePreOperator7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOrOperator7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAndOperator7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNotOperator8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAddOperator8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSubOperator8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMultOperator8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleModOperator8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDivOperator8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValOperator8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalOrOperator8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalAndOperator8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleValueType8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleValueType8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleValueType8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleValueType8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleValueType8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleValueType8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleValueType8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCombineOperator8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCombineOperator8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCombineOperator8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred3_InternalSCL237 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred3_InternalSCL249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred4_InternalSCL277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_synpred24_InternalSCL1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred25_InternalSCL1505 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred25_InternalSCL1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred26_InternalSCL1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_synpred29_InternalSCL1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred30_InternalSCL1653 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred30_InternalSCL1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred31_InternalSCL1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred35_InternalSCL1970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred35_InternalSCL1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred36_InternalSCL2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_synpred40_InternalSCL2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred41_InternalSCL2449 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred41_InternalSCL2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred42_InternalSCL2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_synpred45_InternalSCL2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_synpred48_InternalSCL2902 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleLogicalOrOperator_in_synpred48_InternalSCL2921 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred48_InternalSCL2945 = new BitSet(new long[]{0x1010000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred51_InternalSCL3132 = new BitSet(new long[]{0x00078C0000000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_synpred51_InternalSCL3165 = new BitSet(new long[]{0x08A80440000001F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred51_InternalSCL3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred52_InternalSCL3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred66_InternalSCL4895 = new BitSet(new long[]{0x08880440000001F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred66_InternalSCL4920 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred66_InternalSCL4931 = new BitSet(new long[]{0x0000000000000002L});

}