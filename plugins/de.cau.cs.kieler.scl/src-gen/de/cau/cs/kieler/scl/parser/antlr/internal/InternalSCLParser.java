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
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL", "RULE_INT", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "';'", "'}'", "'input'", "'output'", "':'", "'='", "'@'", "','", "'if'", "'then'", "'else'", "'end'", "'goto'", "'fork'", "'par'", "'join'", "'pause'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'var'", "'readonly'", "'external'", "'operation'", "'('", "')'", "'local'", "'in'", "'out'", "'default'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'/'", "'#'", "'['", "']'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=8;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_BOOL=5;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
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
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalSCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
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

        EObject iv_ruleProgram = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:76:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:77:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram81);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:84:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:87:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:88:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( ( ( ( (lv_statements_4_0= ruleInstructionStatement ) ) otherlv_5= ';' ) | ( (lv_statements_6_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_7_0= ruleInstructionStatement ) ) ( (lv_statements_8_0= ruleEmptyStatement ) )* )? ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProgram128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getModuleKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:92:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:93:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:93:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:94:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram145); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:110:2: ( (lv_declarations_2_0= ruleVariableDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_declarations_2_0= ruleVariableDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_declarations_2_0= ruleVariableDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:112:3: lv_declarations_2_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsVariableDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleProgram171);
            	    lv_declarations_2_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_2_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProgram184); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleProgram208);
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

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProgram220); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleProgram248);
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

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==15||LA4_0==22||LA4_0==24||(LA4_0>=28 && LA4_0<=29)||LA4_0==32||LA4_0==44||(LA4_0>=55 && LA4_0<=56)||LA4_0==66||(LA4_0>=84 && LA4_0<=85)||LA4_0==88) ) {
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
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleProgram272);
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

                        if ( (LA3_0==RULE_ID||LA3_0==22) ) {
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
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleProgram293);
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

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleProgram309); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:221:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:222:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:223:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration345);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:230:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_input_0_0= 'input' ) )? ( (lv_output_1_0= 'output' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_input_0_0=null;
        Token lv_output_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initialValue_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:233:28: ( ( ( (lv_input_0_0= 'input' ) )? ( (lv_output_1_0= 'output' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:1: ( ( (lv_input_0_0= 'input' ) )? ( (lv_output_1_0= 'output' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:1: ( ( (lv_input_0_0= 'input' ) )? ( (lv_output_1_0= 'output' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? otherlv_7= ';' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:2: ( (lv_input_0_0= 'input' ) )? ( (lv_output_1_0= 'output' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:234:2: ( (lv_input_0_0= 'input' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:235:1: (lv_input_0_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:235:1: (lv_input_0_0= 'input' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:236:3: lv_input_0_0= 'input'
                    {
                    lv_input_0_0=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_0_0, grammarAccess.getVariableDeclarationAccess().getInputInputKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:249:3: ( (lv_output_1_0= 'output' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:250:1: (lv_output_1_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:250:1: (lv_output_1_0= 'output' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:251:3: lv_output_1_0= 'output'
                    {
                    lv_output_1_0=(Token)match(input,19,FOLLOW_19_in_ruleVariableDeclaration430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_1_0, grammarAccess.getVariableDeclarationAccess().getOutputOutputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:264:3: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:265:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:265:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:266:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:282:2: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:282:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVariableDeclaration479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:286:1: ( (otherlv_4= RULE_ID ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:287:1: (otherlv_4= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:287:1: (otherlv_4= RULE_ID )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:288:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getTypeTypeCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:302:4: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:302:6: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleVariableDeclaration518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:306:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:307:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:307:1: (lv_initialValue_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:308:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration539);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleVariableDeclaration553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:338:1: entryRuleEmptyStatement returns [EObject current=null] : iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
    public final EObject entryRuleEmptyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyStatement = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:339:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:340:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStatementRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement591);
            iv_ruleEmptyStatement=ruleEmptyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyStatement601); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyStatement"


    // $ANTLR start "ruleEmptyStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:347:1: ruleEmptyStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) ;
    public final EObject ruleEmptyStatement() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:350:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:351:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:351:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:351:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:351:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:352:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:352:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:353:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmptyStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEmptyStatement647);
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
            	    break loop9;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:369:3: ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:369:4: ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:369:4: ( (lv_label_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:370:1: (lv_label_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:370:1: (lv_label_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:371:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyStatement666); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEmptyStatement683); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleEmptyStatement"


    // $ANTLR start "entryRuleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:399:1: entryRuleInstructionStatement returns [EObject current=null] : iv_ruleInstructionStatement= ruleInstructionStatement EOF ;
    public final EObject entryRuleInstructionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionStatement = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:400:2: (iv_ruleInstructionStatement= ruleInstructionStatement EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:401:2: iv_ruleInstructionStatement= ruleInstructionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement720);
            iv_ruleInstructionStatement=ruleInstructionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionStatement730); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionStatement"


    // $ANTLR start "ruleInstructionStatement"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:408:1: ruleInstructionStatement returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) ) ;
    public final EObject ruleInstructionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_instruction_1_1 = null;

        EObject lv_instruction_1_2 = null;

        EObject lv_instruction_1_3 = null;

        EObject lv_instruction_1_4 = null;

        EObject lv_instruction_1_5 = null;

        EObject lv_instruction_1_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:411:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:412:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:412:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:412:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:412:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:413:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:413:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:414:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionStatement776);
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
            	    break loop10;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:430:3: ( ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:431:1: ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:431:1: ( (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:432:1: (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:432:1: (lv_instruction_1_1= ruleAssignment | lv_instruction_1_2= ruleConditional | lv_instruction_1_3= ruleGoto | lv_instruction_1_4= ruleParallel | lv_instruction_1_5= rulePause | lv_instruction_1_6= ruleStatementScope )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_BOOL:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
            case 44:
            case 55:
            case 56:
            case 66:
            case 84:
            case 85:
            case 88:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            case 15:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:433:3: lv_instruction_1_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionAssignmentParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstructionStatement800);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:448:8: lv_instruction_1_2= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionConditionalParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstructionStatement819);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:463:8: lv_instruction_1_3= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionGotoParserRuleCall_1_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstructionStatement838);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:478:8: lv_instruction_1_4= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionParallelParserRuleCall_1_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstructionStatement857);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:493:8: lv_instruction_1_5= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionPauseParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstructionStatement876);
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:508:8: lv_instruction_1_6= ruleStatementScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionStatementAccess().getInstructionStatementScopeParserRuleCall_1_0_5()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementScope_in_ruleInstructionStatement895);
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
        }
        return current;
    }
    // $ANTLR end "ruleInstructionStatement"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:536:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:537:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:538:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation936);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation946); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:545:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameter_3_0=null;
        Token otherlv_4=null;
        Token lv_parameter_5_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:548:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:549:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:549:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:549:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:553:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:554:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:554:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:555:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation1000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:571:2: (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:571:4: otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAnnotation1018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:575:1: ( (lv_parameter_3_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:576:1: (lv_parameter_3_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:576:1: (lv_parameter_3_0= RULE_ID )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:577:3: lv_parameter_3_0= RULE_ID
                    {
                    lv_parameter_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation1035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parameter_3_0, grammarAccess.getAnnotationAccess().getParameterIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"parameter",
                              		lv_parameter_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:593:2: (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==23) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:593:4: otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAnnotation1053); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:597:1: ( (lv_parameter_5_0= RULE_ID ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:598:1: (lv_parameter_5_0= RULE_ID )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:598:1: (lv_parameter_5_0= RULE_ID )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:599:3: lv_parameter_5_0= RULE_ID
                    	    {
                    	    lv_parameter_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation1070); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_parameter_5_0, grammarAccess.getAnnotationAccess().getParameterIDTerminalRuleCall_2_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"parameter",
                    	              		lv_parameter_5_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:623:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:624:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:625:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1115);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1125); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:632:1: ruleAssignment returns [EObject current=null] : ( (lv_assignment_0_0= ruleExpression ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:635:28: ( ( (lv_assignment_0_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:636:1: ( (lv_assignment_0_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:636:1: ( (lv_assignment_0_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:637:1: (lv_assignment_0_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:637:1: (lv_assignment_0_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:638:3: lv_assignment_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignmentExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1170);
            lv_assignment_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"assignment",
                      		lv_assignment_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:662:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:663:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:664:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional1205);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional1215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:671:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) (otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? ) )? otherlv_14= 'end' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_elseStatements_9_0 = null;

        EObject lv_elseStatements_11_0 = null;

        EObject lv_elseStatements_12_0 = null;

        EObject lv_elseStatements_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:674:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) (otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? ) )? otherlv_14= 'end' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:675:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) (otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? ) )? otherlv_14= 'end' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:675:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) (otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? ) )? otherlv_14= 'end' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:675:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) (otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? ) )? otherlv_14= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleConditional1252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:679:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:680:1: (lv_expression_1_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:681:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditional1273);
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleConditional1285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:1: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:2: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:2: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop14:
            do {
                int alt14=3;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:3: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:3: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:4: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:4: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:702:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:702:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1309);
            	    lv_statements_3_0=ruleInstructionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
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

            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConditional1321); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getSemicolonKeyword_3_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:724:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:724:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:726:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1349);
            	    lv_statements_5_0=ruleEmptyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
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
            	    break loop14;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:742:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==15||LA16_0==22||LA16_0==24||(LA16_0>=28 && LA16_0<=29)||LA16_0==32||LA16_0==44||(LA16_0>=55 && LA16_0<=56)||LA16_0==66||(LA16_0>=84 && LA16_0<=85)||LA16_0==88) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:742:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:742:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:743:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:743:1: (lv_statements_6_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:744:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1373);
                    lv_statements_6_0=ruleInstructionStatement();

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
                              		"InstructionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:760:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:761:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:761:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:762:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1394);
                    	    lv_statements_7_0=ruleEmptyStatement();

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
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:778:6: (otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:778:8: otherlv_8= 'else' ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleConditional1411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getElseKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:1: ( ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )? )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:2: ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )* ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )?
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:2: ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:3: ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:3: ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:4: ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';'
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:4: ( (lv_elseStatements_9_0= ruleInstructionStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:1: (lv_elseStatements_9_0= ruleInstructionStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:1: (lv_elseStatements_9_0= ruleInstructionStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:3: lv_elseStatements_9_0= ruleInstructionStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_4_1_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1435);
                    	    lv_elseStatements_9_0=ruleInstructionStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseStatements",
                    	              		lv_elseStatements_9_0, 
                    	              		"InstructionStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleConditional1447); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getConditionalAccess().getSemicolonKeyword_4_1_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:805:6: ( (lv_elseStatements_11_0= ruleEmptyStatement ) )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:805:6: ( (lv_elseStatements_11_0= ruleEmptyStatement ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:1: (lv_elseStatements_11_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:1: (lv_elseStatements_11_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:807:3: lv_elseStatements_11_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_4_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1475);
                    	    lv_elseStatements_11_0=ruleEmptyStatement();

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
                    	              		"EmptyStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:823:4: ( ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==15||LA19_0==22||LA19_0==24||(LA19_0>=28 && LA19_0<=29)||LA19_0==32||LA19_0==44||(LA19_0>=55 && LA19_0<=56)||LA19_0==66||(LA19_0>=84 && LA19_0<=85)||LA19_0==88) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:823:5: ( (lv_elseStatements_12_0= ruleInstructionStatement ) ) ( (lv_elseStatements_13_0= ruleEmptyStatement ) )*
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:823:5: ( (lv_elseStatements_12_0= ruleInstructionStatement ) )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:824:1: (lv_elseStatements_12_0= ruleInstructionStatement )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:824:1: (lv_elseStatements_12_0= ruleInstructionStatement )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:825:3: lv_elseStatements_12_0= ruleInstructionStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstructionStatement_in_ruleConditional1499);
                            lv_elseStatements_12_0=ruleInstructionStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elseStatements",
                                      		lv_elseStatements_12_0, 
                                      		"InstructionStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:841:2: ( (lv_elseStatements_13_0= ruleEmptyStatement ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID||LA18_0==22) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:842:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                            	    {
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:842:1: (lv_elseStatements_13_0= ruleEmptyStatement )
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:843:3: lv_elseStatements_13_0= ruleEmptyStatement
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleConditional1520);
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
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleConditional1538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getConditionalAccess().getEndKeyword_5());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:871:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:872:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:873:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1574);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1584); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:880:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetLabel_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:883:28: ( (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:884:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:884:1: (otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:884:3: otherlv_0= 'goto' ( (lv_targetLabel_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleGoto1621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:888:1: ( (lv_targetLabel_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:889:1: (lv_targetLabel_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:889:1: (lv_targetLabel_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:890:3: lv_targetLabel_1_0= RULE_ID
            {
            lv_targetLabel_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto1638); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:916:1: entryRuleThread returns [EObject current=null] : iv_ruleThread= ruleThread EOF ;
    public final EObject entryRuleThread() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThread = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:917:2: (iv_ruleThread= ruleThread EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:918:2: iv_ruleThread= ruleThread EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThreadRule()); 
            }
            pushFollow(FOLLOW_ruleThread_in_entryRuleThread1681);
            iv_ruleThread=ruleThread();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThread; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThread1691); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThread"


    // $ANTLR start "ruleThread"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:925:1: ruleThread returns [EObject current=null] : ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) ;
    public final EObject ruleThread() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:928:28: ( ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:929:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:929:1: ( () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:929:2: () ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:929:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:930:2: 
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:2: ( ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*
            loop21:
            do {
                int alt21=3;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:1: (lv_statements_1_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:1: (lv_statements_1_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:3: lv_statements_1_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1752);
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

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleThread1764); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getThreadAccess().getSemicolonKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:1: (lv_statements_3_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:1: (lv_statements_3_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:963:3: lv_statements_3_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread1792);
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
            	    break loop21;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:979:4: ( ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||LA23_0==15||LA23_0==22||LA23_0==24||(LA23_0>=28 && LA23_0<=29)||LA23_0==32||LA23_0==44||(LA23_0>=55 && LA23_0<=56)||LA23_0==66||(LA23_0>=84 && LA23_0<=85)||LA23_0==88) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:979:5: ( (lv_statements_4_0= ruleInstructionStatement ) ) ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:979:5: ( (lv_statements_4_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:980:1: (lv_statements_4_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:980:1: (lv_statements_4_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:981:3: lv_statements_4_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleThread1816);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:997:2: ( (lv_statements_5_0= ruleEmptyStatement ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID||LA22_0==22) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:998:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:998:1: (lv_statements_5_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:999:3: lv_statements_5_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleThread1837);
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
                    	    break loop22;
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
        }
        return current;
    }
    // $ANTLR end "ruleThread"


    // $ANTLR start "entryRuleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1023:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1024:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1025:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel1877);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel1887); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1032:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_threads_1_0 = null;

        EObject lv_threads_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1035:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1036:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1036:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1036:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleParallel1924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1040:1: ( ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1040:2: ( (lv_threads_1_0= ruleThread ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1040:2: ( (lv_threads_1_0= ruleThread ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1041:1: (lv_threads_1_0= ruleThread )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1041:1: (lv_threads_1_0= ruleThread )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1042:3: lv_threads_1_0= ruleThread
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleThread_in_ruleParallel1946);
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

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1058:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1058:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleThread ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleParallel1959); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1062:1: ( (lv_threads_3_0= ruleThread ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1063:1: (lv_threads_3_0= ruleThread )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1063:1: (lv_threads_3_0= ruleThread )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1064:3: lv_threads_3_0= ruleThread
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsThreadParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleThread_in_ruleParallel1980);
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
            	    break loop24;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleParallel1995); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1092:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1093:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1094:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause2031);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause2041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1101:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1104:28: ( (otherlv_0= 'pause' () ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1105:1: (otherlv_0= 'pause' () )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1105:1: (otherlv_0= 'pause' () )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1105:3: otherlv_0= 'pause' ()
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePause2078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1109:1: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1110:2: 
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
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1126:1: entryRuleStatementScope returns [EObject current=null] : iv_ruleStatementScope= ruleStatementScope EOF ;
    public final EObject entryRuleStatementScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementScope = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1127:2: (iv_ruleStatementScope= ruleStatementScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1128:2: iv_ruleStatementScope= ruleStatementScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatementScope_in_entryRuleStatementScope2126);
            iv_ruleStatementScope=ruleStatementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementScope2136); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementScope"


    // $ANTLR start "ruleStatementScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1135:1: ruleStatementScope returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleVariableDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) ;
    public final EObject ruleStatementScope() throws RecognitionException {
        EObject current = null;

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
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1138:28: ( ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleVariableDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1139:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleVariableDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1139:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleVariableDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1139:2: () otherlv_1= '{' ( (lv_declarations_2_0= ruleVariableDeclaration ) )* ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? ) otherlv_8= '}'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1139:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1140:2: 
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStatementScope2185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatementScopeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1152:1: ( (lv_declarations_2_0= ruleVariableDeclaration ) )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1153:1: (lv_declarations_2_0= ruleVariableDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1153:1: (lv_declarations_2_0= ruleVariableDeclaration )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:3: lv_declarations_2_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatementScope2206);
            	    lv_declarations_2_0=ruleVariableDeclaration();

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
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:3: ( ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )* ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*
            loop26:
            do {
                int alt26=3;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:1: (lv_statements_3_0= ruleInstructionStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:1: (lv_statements_3_0= ruleInstructionStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:3: lv_statements_3_0= ruleInstructionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2231);
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

            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStatementScope2243); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStatementScopeAccess().getSemicolonKeyword_3_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1193:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1193:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:1: (lv_statements_5_0= ruleEmptyStatement )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:1: (lv_statements_5_0= ruleEmptyStatement )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1195:3: lv_statements_5_0= ruleEmptyStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2271);
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
            	    break loop26;
                }
            } while (true);

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1211:4: ( ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==15||LA28_0==22||LA28_0==24||(LA28_0>=28 && LA28_0<=29)||LA28_0==32||LA28_0==44||(LA28_0>=55 && LA28_0<=56)||LA28_0==66||(LA28_0>=84 && LA28_0<=85)||LA28_0==88) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1211:5: ( (lv_statements_6_0= ruleInstructionStatement ) ) ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1211:5: ( (lv_statements_6_0= ruleInstructionStatement ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:1: (lv_statements_6_0= ruleInstructionStatement )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1212:1: (lv_statements_6_0= ruleInstructionStatement )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1213:3: lv_statements_6_0= ruleInstructionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstructionStatement_in_ruleStatementScope2295);
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

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1229:2: ( (lv_statements_7_0= ruleEmptyStatement ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID||LA27_0==22) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1230:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1230:1: (lv_statements_7_0= ruleEmptyStatement )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1231:3: lv_statements_7_0= ruleEmptyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatementScope2316);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleStatementScope2332); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleStatementScope"


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1261:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1262:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1263:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2370);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2380); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefRoot"


    // $ANTLR start "ruleDefRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1270:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1273:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1274:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1274:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt29=1;
                }
                break;
            case 34:
                {
                alt29=2;
                }
                break;
            case 35:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1275:2: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2430);
                    this_StatechartRoot_0=ruleStatechartRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatechartRoot_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1288:2: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2460);
                    this_StateRoot_1=ruleStateRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateRoot_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1301:2: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2490);
                    this_TransitionRoot_2=ruleTransitionRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionRoot_2; 
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
        }
        return current;
    }
    // $ANTLR end "ruleDefRoot"


    // $ANTLR start "entryRuleStatechartRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1320:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1321:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1322:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2525);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2535); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatechartRoot"


    // $ANTLR start "ruleStatechartRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1329:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1332:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1333:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1333:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1333:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStatechartRoot2572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1337:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1338:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1338:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1339:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2593);
            lv_def_1_0=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatechartRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"StatechartSpecification");
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
        }
        return current;
    }
    // $ANTLR end "ruleStatechartRoot"


    // $ANTLR start "entryRuleStateRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1363:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1364:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1365:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2629);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2639); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateRoot"


    // $ANTLR start "ruleStateRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1372:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1375:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1376:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1376:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1376:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStateRoot2676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1380:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1381:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1381:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1382:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2697);
            lv_def_1_0=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"StateSpecification");
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
        }
        return current;
    }
    // $ANTLR end "ruleStateRoot"


    // $ANTLR start "entryRuleTransitionRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1406:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1407:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1408:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2733);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2743); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionRoot"


    // $ANTLR start "ruleTransitionRoot"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1415:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1418:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1419:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1419:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1419:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTransitionRoot2780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1423:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1424:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1424:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1425:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2801);
            lv_def_1_0=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"TransitionSpecification");
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
        }
        return current;
    }
    // $ANTLR end "ruleTransitionRoot"


    // $ANTLR start "entryRuleStatechartSpecification"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1451:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1452:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1453:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2839);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2849); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatechartSpecification"


    // $ANTLR start "ruleStatechartSpecification"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1460:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1463:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1464:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1464:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1464:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1464:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1465:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1473:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1473:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleStatechartSpecification2899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1477:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1478:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1478:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1479:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2920);
                    lv_namespace_2_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatechartSpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"namespace",
                              		lv_namespace_2_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1495:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=37 && LA31_0<=38)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1496:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1496:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1497:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2943);
            	    lv_scopes_3_0=ruleStatechartScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatechartSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_3_0, 
            	              		"StatechartScope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
        }
        return current;
    }
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleStateSpecification"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1521:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1522:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1523:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2980);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification2990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateSpecification"


    // $ANTLR start "ruleStateSpecification"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1530:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1533:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1534:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1534:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1535:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1535:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1536:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3035);
            lv_scope_0_0=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"scope",
                      		lv_scope_0_0, 
                      		"StateScope");
              	        afterParserOrEnumRuleCall();
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleStateSpecification"


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1560:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1561:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1562:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3070);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3080); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionSpecification"


    // $ANTLR start "ruleTransitionSpecification"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1569:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1572:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1573:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1573:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1574:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1574:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1575:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3125);
            lv_reaction_0_0=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"reaction",
                      		lv_reaction_0_0, 
                      		"TransitionReaction");
              	        afterParserOrEnumRuleCall();
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleTransitionSpecification"


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1601:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1602:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1603:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope3162);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope3172); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateScope"


    // $ANTLR start "ruleStateScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1610:1: ruleStateScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1613:28: ( ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1614:1: ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1614:1: ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1614:2: () ( (lv_declarations_1_0= ruleLocalReaction ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1614:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1615:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1623:2: ( (lv_declarations_1_0= ruleLocalReaction ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=50 && LA32_0<=53)||LA32_0==60||(LA32_0>=70 && LA32_0<=71)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1624:1: (lv_declarations_1_0= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1624:1: (lv_declarations_1_0= ruleLocalReaction )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1625:3: lv_declarations_1_0= ruleLocalReaction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope3230);
            	    lv_declarations_1_0=ruleLocalReaction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
            	              		"LocalReaction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
        }
        return current;
    }
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleStatechartScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1649:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1650:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1651:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3267);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3277); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatechartScope"


    // $ANTLR start "ruleStatechartScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1658:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1661:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1662:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            else if ( (LA33_0==38) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1663:2: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3327);
                    this_InterfaceScope_0=ruleInterfaceScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceScope_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1676:2: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3357);
                    this_InternalScope_1=ruleInternalScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InternalScope_1; 
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
        }
        return current;
    }
    // $ANTLR end "ruleStatechartScope"


    // $ANTLR start "entryRuleInterfaceScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1697:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1698:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1699:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3394);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3404); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceScope"


    // $ANTLR start "ruleInterfaceScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1706:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1709:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1710:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1710:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1710:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1710:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1711:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleInterfaceScope3453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1723:1: ( (lv_name_2_0= ruleXID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==26||(LA34_0>=36 && LA34_0<=43)||(LA34_0>=46 && LA34_0<=56)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1724:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1724:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1725:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3474);
                    lv_name_2_0=ruleXID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"XID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceScope3487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1745:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||(LA36_0>=18 && LA36_0<=19)||LA36_0==39||LA36_0==43||(LA36_0>=46 && LA36_0<=48)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1746:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1746:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1747:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1747:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt35=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	    case 46:
            	    case 47:
            	    case 48:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 18:
            	    case 19:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1748:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3510);
            	            lv_declarations_4_1=ruleEventDeclarartion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_1, 
            	                      		"EventDeclarartion");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1763:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3529);
            	            lv_declarations_4_2=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_2, 
            	                      		"VariableDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1778:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3548);
            	            lv_declarations_4_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_3, 
            	                      		"OperationDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1804:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1805:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1806:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3588);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3598); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalScope"


    // $ANTLR start "ruleInternalScope"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1813:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleInternalScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_declarations_3_1 = null;

        EObject lv_declarations_3_2 = null;

        EObject lv_declarations_3_3 = null;

        EObject lv_declarations_3_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1816:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1817:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1817:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1817:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1817:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1818:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleInternalScope3647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInternalScope3659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1834:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||(LA38_0>=18 && LA38_0<=19)||LA38_0==39||LA38_0==43||(LA38_0>=46 && LA38_0<=48)||(LA38_0>=50 && LA38_0<=53)||LA38_0==60||(LA38_0>=70 && LA38_0<=71)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1835:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1835:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1836:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1836:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt37=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	    case 46:
            	    case 47:
            	    case 48:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 18:
            	    case 19:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        int LA37_3 = input.LA(2);

            	        if ( (LA37_3==16||(LA37_3>=20 && LA37_3<=21)) ) {
            	            alt37=2;
            	        }
            	        else if ( (LA37_3==23||LA37_3==44||(LA37_3>=57 && LA37_3<=58)||LA37_3==60) ) {
            	            alt37=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 37, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 60:
            	    case 70:
            	    case 71:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1837:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3682);
            	            lv_declarations_3_1=ruleEventDeclarartion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_1, 
            	                      		"EventDeclarartion");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1852:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3701);
            	            lv_declarations_3_2=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_2, 
            	                      		"VariableDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1867:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3720);
            	            lv_declarations_3_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_3, 
            	                      		"OperationDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1882:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3739);
            	            lv_declarations_3_4=ruleLocalReaction();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_4, 
            	                      		"LocalReaction");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

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
        }
        return current;
    }
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1910:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1911:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1912:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3781);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3791); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDeclarartion"


    // $ANTLR start "ruleEventDeclarartion"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1919:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1922:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1924:2: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3840);
            this_EventDefinition_0=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EventDefinition_0; 
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
        }
        return current;
    }
    // $ANTLR end "ruleEventDeclarartion"


    // $ANTLR start "entryRuleEventDefinition"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1945:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1946:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1947:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3876);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDefinition"


    // $ANTLR start "ruleEventDefinition"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1954:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1957:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1958:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1958:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1958:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1958:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=46 && LA39_0<=48)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1959:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1959:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1960:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3932);
                    lv_direction_0_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_0_0, 
                              		"Direction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEventDefinition3945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1980:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1981:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1981:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1982:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3966);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1998:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1998:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventDefinition3979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2002:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2003:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2003:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2004:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4006);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
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
        }
        return current;
    }
    // $ANTLR end "ruleEventDefinition"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2030:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2()
        		);
        	
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2036:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2037:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition4052);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition4062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2047:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_readonly_3_0=null;
        Token lv_external_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_initialValue_9_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2()
        		);
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2053:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2054:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2054:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2054:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2054:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2055:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleVariableDefinition4115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2067:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2069:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2069:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2070:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2073:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2074:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2074:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2076:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2076:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2077:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2077:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2078:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2081:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2081:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2081:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2082:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2082:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2083:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,41,FOLLOW_41_in_ruleVariableDefinition4178); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_readonly_3_0, grammarAccess.getVariableDefinitionAccess().getReadonlyReadonlyKeyword_2_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "readonly", true, "readonly");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2103:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2103:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2104:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2104:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2105:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2109:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2109:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2110:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,42,FOLLOW_42_in_ruleVariableDefinition4263); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_external_4_0, grammarAccess.getVariableDefinitionAccess().getExternalExternalKeyword_2_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "external", true, "external");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2137:2: ( (lv_name_5_0= ruleXID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2138:1: (lv_name_5_0= ruleXID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2138:1: (lv_name_5_0= ruleXID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2139:3: lv_name_5_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleVariableDefinition4337);
            lv_name_5_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition4349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2159:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2160:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2160:1: ( ruleFQN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2161:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition4376);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2177:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2177:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleVariableDefinition4389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2181:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2182:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2182:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2183:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition4410);
                    lv_initialValue_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_9_0, 
                              		"Expression");
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleOperationDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2210:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2211:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2212:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4452);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4462); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDeclaration"


    // $ANTLR start "ruleOperationDeclaration"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2219:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2222:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2224:2: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4511);
            this_OperationDefinition_0=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OperationDefinition_0; 
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
        }
        return current;
    }
    // $ANTLR end "ruleOperationDeclaration"


    // $ANTLR start "entryRuleOperationDefinition"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2245:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2246:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2247:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4547);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4557); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinition"


    // $ANTLR start "ruleOperationDefinition"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2254:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2257:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2258:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2258:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2258:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2258:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2259:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleOperationDefinition4606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2271:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2272:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2272:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2273:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition4627);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleOperationDefinition4639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2293:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==26||(LA44_0>=36 && LA44_0<=43)||(LA44_0>=46 && LA44_0<=56)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2293:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2293:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2294:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2294:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2295:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4661);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2311:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==23) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2311:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition4674); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2315:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2316:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2316:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2317:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4695);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleOperationDefinition4711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2337:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2337:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition4724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2341:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2342:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2342:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2343:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4751);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
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
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinition"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2367:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2368:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2369:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4789);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4799); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2376:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2379:28: ( ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2380:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2380:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2380:2: ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2380:2: ( (lv_name_0_0= ruleXID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2381:1: (lv_name_0_0= ruleXID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2381:1: (lv_name_0_0= ruleXID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2382:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleParameter4845);
            lv_name_0_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParameter4857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2402:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2403:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2403:1: ( ruleFQN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2404:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4884);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleXID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2428:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2429:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2430:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4921);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXID"


    // $ANTLR start "ruleXID"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2437:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2440:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2441:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2441:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt46=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt46=1;
                }
                break;
            case 36:
                {
                alt46=2;
                }
                break;
            case 37:
                {
                alt46=3;
                }
                break;
            case 38:
                {
                alt46=4;
                }
                break;
            case 39:
                {
                alt46=5;
                }
                break;
            case 46:
                {
                alt46=6;
                }
                break;
            case 47:
                {
                alt46=7;
                }
                break;
            case 48:
                {
                alt46=8;
                }
                break;
            case 40:
                {
                alt46=9;
                }
                break;
            case 41:
                {
                alt46=10;
                }
                break;
            case 42:
                {
                alt46=11;
                }
                break;
            case 43:
                {
                alt46=12;
                }
                break;
            case 49:
                {
                alt46=13;
                }
                break;
            case 26:
                {
                alt46=14;
                }
                break;
            case 50:
                {
                alt46=15;
                }
                break;
            case 51:
                {
                alt46=16;
                }
                break;
            case 52:
                {
                alt46=17;
                }
                break;
            case 53:
                {
                alt46=18;
                }
                break;
            case 54:
                {
                alt46=19;
                }
                break;
            case 55:
                {
                alt46=20;
                }
                break;
            case 56:
                {
                alt46=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2441:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2450:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID4996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2457:2: kw= 'interface'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID5015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2464:2: kw= 'internal'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID5034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2471:2: kw= 'event'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID5053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2478:2: kw= 'local'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID5072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2485:2: kw= 'in'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID5091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2492:2: kw= 'out'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID5110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2499:2: kw= 'var'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID5129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2506:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID5148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2513:2: kw= 'external'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID5167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2520:2: kw= 'operation'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID5186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2527:2: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID5205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2534:2: kw= 'else'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleXID5224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2541:2: kw= 'entry'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID5243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2548:2: kw= 'exit'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID5262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2555:2: kw= 'always'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID5281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2562:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID5300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2569:2: kw= 'raise'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID5319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2576:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID5338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2583:2: kw= 'active'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID5357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getActiveKeyword_20()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleXID"


    // $ANTLR start "entryRuleFQN"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2596:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2597:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2598:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5398);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5409); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2605:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2608:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2609:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2609:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2610:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5456);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2620:1: (kw= '.' this_XID_2= ruleXID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==57) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2621:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_ruleFQN5475); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5497);
            	    this_XID_2=ruleXID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_XID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
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
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2647:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2648:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2649:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5546);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction5556); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalReaction"


    // $ANTLR start "ruleLocalReaction"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2656:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2659:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2660:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2661:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2661:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2662:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5602);
            lv_trigger_0_0=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
              	        }
                     		set(
                     			current, 
                     			"trigger",
                      		lv_trigger_0_0, 
                      		"ReactionTrigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2678:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2678:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2683:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2683:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleLocalReaction5634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2687:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2688:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2688:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2689:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction5655);
            lv_effect_2_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_2_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


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
        }
        return current;
    }
    // $ANTLR end "ruleLocalReaction"


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2713:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2714:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2715:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5693);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5703); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionReaction"


    // $ANTLR start "ruleTransitionReaction"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2722:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2725:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2726:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2726:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2726:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2726:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2727:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2735:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==26||(LA48_0>=49 && LA48_0<=53)||LA48_0==60||(LA48_0>=70 && LA48_0<=71)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2736:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2736:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2737:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5761);
                    lv_trigger_1_0=ruleStextTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_1_0, 
                              		"StextTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2753:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2753:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleTransitionReaction5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2757:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2758:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2758:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2759:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5796);
                    lv_effect_3_0=ruleReactionEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_3_0, 
                              		"ReactionEffect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2775:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==59) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2775:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleTransitionReaction5811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2779:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_ID||LA50_0==62) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2780:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2780:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2781:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5832);
                    	    lv_properties_5_0=ruleTransitionProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_5_0, 
                    	              		"TransitionProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
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
        }
        return current;
    }
    // $ANTLR end "ruleTransitionReaction"


    // $ANTLR start "entryRuleStextTrigger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2805:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2806:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2807:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5871);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5881); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStextTrigger"


    // $ANTLR start "ruleStextTrigger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2814:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2817:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2818:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2818:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||(LA52_0>=50 && LA52_0<=53)||LA52_0==60||(LA52_0>=70 && LA52_0<=71)) ) {
                alt52=1;
            }
            else if ( (LA52_0==26||LA52_0==49) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2819:2: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5931);
                    this_ReactionTrigger_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReactionTrigger_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2832:2: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5961);
                    this_DefaultTrigger_1=ruleDefaultTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefaultTrigger_1; 
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
        }
        return current;
    }
    // $ANTLR end "ruleStextTrigger"


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2851:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2852:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2853:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger5996);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger6006); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionTrigger"


    // $ANTLR start "ruleReactionTrigger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2860:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_triggers_1_0 = null;

        EObject lv_triggers_3_0 = null;

        EObject lv_guardExpression_5_0 = null;

        EObject lv_guardExpression_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2863:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2864:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2864:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2864:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2864:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2865:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2873:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||(LA55_0>=50 && LA55_0<=53)||(LA55_0>=70 && LA55_0<=71)) ) {
                alt55=1;
            }
            else if ( (LA55_0==60) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2873:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2873:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2873:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2873:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2874:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2874:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2875:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger6066);
                    lv_triggers_1_0=ruleEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		add(
                             			current, 
                             			"triggers",
                              		lv_triggers_1_0, 
                              		"EventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2891:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==23) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2891:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleReactionTrigger6079); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2895:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2896:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2896:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2897:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger6100);
                    	    lv_triggers_3_0=ruleEventSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"triggers",
                    	              		lv_triggers_3_0, 
                    	              		"EventSpec");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2913:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==60) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2913:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2913:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2913:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleReactionTrigger6123); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2918:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2919:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2919:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2920:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger6145);
                            lv_guardExpression_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"guardExpression",
                                      		lv_guardExpression_5_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,61,FOLLOW_61_in_ruleReactionTrigger6157); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2941:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2941:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2941:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_60_in_ruleReactionTrigger6179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2945:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2946:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2946:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2947:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger6200);
                    lv_guardExpression_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"guardExpression",
                              		lv_guardExpression_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleReactionTrigger6212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_1_2());
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleReactionTrigger"


    // $ANTLR start "entryRuleDefaultTrigger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2975:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2976:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2977:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger6250);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger6260); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultTrigger"


    // $ANTLR start "ruleDefaultTrigger"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2984:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2987:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2988:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2988:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2988:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2988:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2989:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2997:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==49) ) {
                alt56=1;
            }
            else if ( (LA56_0==26) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2997:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDefaultTrigger6310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3002:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleDefaultTrigger6328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDefaultTriggerAccess().getElseKeyword_1_1());
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleDefaultTrigger"


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3014:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3015:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3016:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect6365);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect6375); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionEffect"


    // $ANTLR start "ruleReactionEffect"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3023:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3026:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3027:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3027:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3027:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3027:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3028:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3036:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3037:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3037:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3038:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3038:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==44||(LA57_0>=55 && LA57_0<=56)||LA57_0==66||(LA57_0>=84 && LA57_0<=85)||LA57_0==88) ) {
                alt57=1;
            }
            else if ( (LA57_0==54) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3039:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect6435);
                    lv_actions_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_1_1, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3054:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6454);
                    lv_actions_1_2=ruleEventRaisingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_1_2, 
                              		"EventRaisingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3072:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==16) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3072:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3072:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3072:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleReactionEffect6478); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3077:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3078:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3078:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3079:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3079:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==44||(LA58_0>=55 && LA58_0<=56)||LA58_0==66||(LA58_0>=84 && LA58_0<=85)||LA58_0==88) ) {
            	        alt58=1;
            	    }
            	    else if ( (LA58_0==54) ) {
            	        alt58=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 58, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3080:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect6502);
            	            lv_actions_3_1=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"actions",
            	                      		lv_actions_3_1, 
            	                      		"Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3095:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6521);
            	            lv_actions_3_2=ruleEventRaisingExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"actions",
            	                      		lv_actions_3_2, 
            	                      		"EventRaisingExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
        }
        return current;
    }
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleTransitionProperty"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3121:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3122:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3123:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty6562);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty6572); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionProperty"


    // $ANTLR start "ruleTransitionProperty"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3130:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3133:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3134:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3134:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3135:2: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty6622);
                    this_EntryPointSpec_0=ruleEntryPointSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryPointSpec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3148:2: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty6652);
                    this_ExitPointSpec_1=ruleExitPointSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitPointSpec_1; 
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
        }
        return current;
    }
    // $ANTLR end "ruleTransitionProperty"


    // $ANTLR start "entryRuleEntryPointSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3167:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3168:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3169:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6687);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec6697); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryPointSpec"


    // $ANTLR start "ruleEntryPointSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3176:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3179:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3180:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleEntryPointSpec6734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3184:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3185:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3185:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3186:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec6751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_entrypoint_1_0, grammarAccess.getEntryPointSpecAccess().getEntrypointIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"entrypoint",
                      		lv_entrypoint_1_0, 
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
        }
        return current;
    }
    // $ANTLR end "ruleEntryPointSpec"


    // $ANTLR start "entryRuleExitPointSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3210:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3211:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3212:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6792);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec6802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitPointSpec"


    // $ANTLR start "ruleExitPointSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3219:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3222:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3223:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3223:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3223:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3223:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3224:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3224:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3225:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec6844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_exitpoint_0_0, grammarAccess.getExitPointSpecAccess().getExitpointIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"exitpoint",
                      		lv_exitpoint_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleExitPointSpec6861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitPointSpecAccess().getGreaterThanSignKeyword_1());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleExitPointSpec"


    // $ANTLR start "entryRuleEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3253:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3254:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3255:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec6897);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec6907); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventSpec"


    // $ANTLR start "ruleEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3262:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3265:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3266:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3266:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt61=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt61=1;
                }
                break;
            case 70:
            case 71:
                {
                alt61=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3267:2: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec6957);
                    this_RegularEventSpec_0=ruleRegularEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegularEventSpec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3280:2: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec6987);
                    this_TimeEventSpec_1=ruleTimeEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeEventSpec_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3293:2: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec7017);
                    this_BuiltinEventSpec_2=ruleBuiltinEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltinEventSpec_2; 
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
        }
        return current;
    }
    // $ANTLR end "ruleEventSpec"


    // $ANTLR start "entryRuleRegularEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3312:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3313:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3314:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec7052);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec7062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularEventSpec"


    // $ANTLR start "ruleRegularEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3321:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3324:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3325:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3325:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3326:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3326:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3327:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec7107);
            lv_event_0_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRegularEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleRegularEventSpec"


    // $ANTLR start "entryRuleTimeEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3351:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3352:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3353:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec7142);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec7152); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeEventSpec"


    // $ANTLR start "ruleTimeEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3360:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3363:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3364:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3364:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3364:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3364:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3365:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3365:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3366:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec7198);
            lv_type_0_0=ruleTimeEventType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TimeEventType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3382:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3383:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3383:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3384:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec7219);
            lv_value_1_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ConditionalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3400:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3401:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3401:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3402:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec7240);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_2_0, 
                      		"TimeUnit");
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
        }
        return current;
    }
    // $ANTLR end "ruleTimeEventSpec"


    // $ANTLR start "entryRuleBuiltinEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3426:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3427:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3428:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec7276);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec7286); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuiltinEventSpec"


    // $ANTLR start "ruleBuiltinEventSpec"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3435:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3438:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3439:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3439:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt62=1;
                }
                break;
            case 51:
                {
                alt62=2;
                }
                break;
            case 52:
            case 53:
                {
                alt62=3;
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
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3440:2: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec7336);
                    this_EntryEvent_0=ruleEntryEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryEvent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3453:2: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec7366);
                    this_ExitEvent_1=ruleExitEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitEvent_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3466:2: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec7396);
                    this_AlwaysEvent_2=ruleAlwaysEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysEvent_2; 
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
        }
        return current;
    }
    // $ANTLR end "ruleBuiltinEventSpec"


    // $ANTLR start "entryRuleEntryEvent"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3485:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3486:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3487:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent7431);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent7441); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryEvent"


    // $ANTLR start "ruleEntryEvent"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3494:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3497:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3498:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3498:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3498:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3498:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3499:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleEntryEvent7490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryEventAccess().getEntryKeyword_1());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleEntryEvent"


    // $ANTLR start "entryRuleExitEvent"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3519:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3520:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3521:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent7526);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent7536); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitEvent"


    // $ANTLR start "ruleExitEvent"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3528:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3531:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3532:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3532:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3532:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3532:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3533:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleExitEvent7585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitEventAccess().getExitKeyword_1());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleExitEvent"


    // $ANTLR start "entryRuleAlwaysEvent"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3553:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3554:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3555:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7621);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent7631); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysEvent"


    // $ANTLR start "ruleAlwaysEvent"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3562:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3565:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3566:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3566:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3566:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3566:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3567:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3575:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            else if ( (LA63_0==53) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3575:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleAlwaysEvent7681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3580:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleAlwaysEvent7699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAlwaysEventAccess().getOncycleKeyword_1_1());
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysEvent"


    // $ANTLR start "entryRuleEventRaisingExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3592:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3593:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3594:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression7736);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression7746); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventRaisingExpression"


    // $ANTLR start "ruleEventRaisingExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3601:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3604:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3605:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3605:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3605:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3605:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3606:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEventRaisingExpression7795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3618:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3619:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3619:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3620:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression7816);
            lv_event_2_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventRaisingExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_2_0, 
                      		"FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3636:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==20) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3636:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventRaisingExpression7829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3640:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3641:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3641:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3642:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression7850);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventRaisingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"Expression");
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
        }
        return current;
    }
    // $ANTLR end "ruleEventRaisingExpression"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3668:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3669:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3670:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7890);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7900); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3677:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3680:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3682:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression7949);
            this_AssignmentExpression_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssignmentExpression_0; 
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
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3701:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3702:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3703:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7983);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression7993); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3710:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3713:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3714:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3714:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3715:2: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression8043);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3726:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==21||(LA65_0>=72 && LA65_0<=81)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3726:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3726:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3727:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3735:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3736:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3736:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3737:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression8076);
            	    lv_operator_2_0=ruleAssignmentOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AssignmentOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3753:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3754:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3754:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3755:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression8097);
            	    lv_expression_3_0=ruleConditionalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"expression",
            	              		lv_expression_3_0, 
            	              		"ConditionalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3779:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3780:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3781:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression8135);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression8145); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3788:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3791:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3792:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3792:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3793:2: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8195);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3804:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==63) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3804:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3804:2: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3805:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleConditionalExpression8219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3817:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3818:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3818:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3819:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8240);
                    lv_trueCase_3_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"trueCase",
                              		lv_trueCase_3_0, 
                              		"LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConditionalExpression8252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3839:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3840:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3840:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3841:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8273);
                    lv_falseCase_5_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"falseCase",
                              		lv_falseCase_5_0, 
                              		"LogicalOrExpression");
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
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3865:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3866:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3867:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression8311);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression8321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3874:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3877:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3878:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3878:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3879:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8371);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3890:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==64) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3890:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3890:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3891:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleLogicalOrExpression8395); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3903:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3904:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3904:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3905:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8416);
            	    lv_rightOperand_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3929:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3930:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3931:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression8454);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression8464); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3938:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3941:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3942:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3942:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3943:2: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8514);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3954:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==65) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3954:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3954:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3955:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleLogicalAndExpression8538); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3967:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3968:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3968:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3969:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8559);
            	    lv_rightOperand_3_0=ruleLogicalNotExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalNotExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
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
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3993:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3994:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:3995:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression8597);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression8607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalNotExpression"


    // $ANTLR start "ruleLogicalNotExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4002:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4005:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4006:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4006:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_STRING)||LA69_0==44||(LA69_0>=55 && LA69_0<=56)||(LA69_0>=84 && LA69_0<=85)||LA69_0==88) ) {
                alt69=1;
            }
            else if ( (LA69_0==66) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4007:2: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8657);
                    this_BitwiseXorExpression_0=ruleBitwiseXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitwiseXorExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4019:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4019:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4019:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4019:7: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4020:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleLogicalNotExpression8687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4032:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4033:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4033:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4034:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8708);
                    lv_operand_3_0=ruleBitwiseXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"BitwiseXorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleLogicalNotExpression"


    // $ANTLR start "entryRuleBitwiseXorExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4058:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4059:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4060:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8745);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression8755); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseXorExpression"


    // $ANTLR start "ruleBitwiseXorExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4067:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4070:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4071:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4071:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4072:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8805);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4083:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==67) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4083:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4083:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4084:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleBitwiseXorExpression8829); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4096:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4097:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4097:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4098:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8850);
            	    lv_rightOperand_3_0=ruleBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"BitwiseOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4122:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4123:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4124:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8888);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression8898); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4131:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4134:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4135:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4135:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4136:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8948);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4147:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==68) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4147:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4147:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4148:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleBitwiseOrExpression8972); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4160:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4161:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4161:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4162:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8993);
            	    lv_rightOperand_3_0=ruleBitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"BitwiseAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4186:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4187:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4188:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression9031);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression9041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4195:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4198:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4199:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4199:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4200:2: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression9091);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4211:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==69) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4211:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4211:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4212:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleBitwiseAndExpression9115); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4224:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4225:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4225:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4226:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression9136);
            	    lv_rightOperand_3_0=ruleLogicalRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalRelationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4250:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4251:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4252:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression9174);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression9184); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalRelationExpression"


    // $ANTLR start "ruleLogicalRelationExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4259:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4262:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4263:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4263:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4264:2: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression9234);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4275:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==62||(LA73_0>=89 && LA73_0<=93)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4275:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4275:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4276:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4284:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4285:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4285:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4286:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression9267);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"RelationalOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4302:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4303:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4303:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4304:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression9288);
            	    lv_rightOperand_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ShiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
        }
        return current;
    }
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4328:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4329:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4330:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression9326);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression9336); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4337:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4340:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4341:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4341:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4342:2: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9386);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4353:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=82 && LA74_0<=83)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4353:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4353:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4354:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4362:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4363:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4363:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4364:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression9419);
            	    lv_operator_2_0=ruleShiftOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"ShiftOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4380:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4381:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4381:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4382:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9440);
            	    lv_rightOperand_3_0=ruleNumericalAddSubtractExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NumericalAddSubtractExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
        }
        return current;
    }
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4406:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4407:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4408:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression9478);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression9488); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericalAddSubtractExpression"


    // $ANTLR start "ruleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4415:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4418:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4419:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4419:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4420:2: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9538);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=84 && LA75_0<=85)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4431:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4432:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4440:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4441:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4441:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4442:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression9571);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalAddSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4458:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4459:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4459:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4460:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9592);
            	    lv_rightOperand_3_0=ruleNumericalMultiplyDivideExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalAddSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NumericalMultiplyDivideExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
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
        }
        return current;
    }
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4484:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4485:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4486:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression9630);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression9640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericalMultiplyDivideExpression"


    // $ANTLR start "ruleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4493:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4496:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4497:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4497:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4498:2: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9690);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4509:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==58||(LA76_0>=86 && LA76_0<=87)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4509:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4509:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4510:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4518:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4519:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4519:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4520:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression9723);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalMultiplyDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MultiplicativeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4536:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4537:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4537:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4538:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9744);
            	    lv_rightOperand_3_0=ruleNumericalUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalMultiplyDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NumericalUnaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
        }
        return current;
    }
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4562:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4563:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4564:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression9782);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression9792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericalUnaryExpression"


    // $ANTLR start "ruleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4571:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4574:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4575:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4575:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_STRING)||LA77_0==44||(LA77_0>=55 && LA77_0<=56)) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=84 && LA77_0<=85)||LA77_0==88) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4576:2: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9842);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4588:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4588:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4588:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4588:7: ()
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4589:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4597:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4598:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4598:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4599:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression9881);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericalUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"UnaryOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4615:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4616:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4616:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4617:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9902);
                    lv_operand_3_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericalUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleNumericalUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4641:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4642:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4643:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression9939);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression9949); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4650:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_EventValueReferenceExpression_3 = null;

        EObject this_ParenthesizedExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4653:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4654:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4654:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression )
            int alt78=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt78=1;
                }
                break;
            case RULE_ID:
                {
                alt78=2;
                }
                break;
            case 56:
                {
                alt78=3;
                }
                break;
            case 55:
                {
                alt78=4;
                }
                break;
            case 44:
                {
                alt78=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4655:2: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression9999);
                    this_PrimitiveValueExpression_0=rulePrimitiveValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveValueExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4668:2: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression10029);
                    this_FeatureCall_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FeatureCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4681:2: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression10059);
                    this_ActiveStateReferenceExpression_2=ruleActiveStateReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActiveStateReferenceExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4694:2: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression10089);
                    this_EventValueReferenceExpression_3=ruleEventValueReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventValueReferenceExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4707:2: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression10119);
                    this_ParenthesizedExpression_4=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_4; 
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
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRulePrimitiveValueExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4726:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4727:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4728:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression10154);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression10164); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveValueExpression"


    // $ANTLR start "rulePrimitiveValueExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4735:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4738:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4739:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4739:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4739:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4739:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4740:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4748:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4749:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4749:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4750:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression10222);
            lv_value_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Literal");
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
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveValueExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4774:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4775:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4776:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall10258);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall10268); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4783:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_operationCall_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_ElementReferenceExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4786:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4787:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4787:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4788:2: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall10318);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4799:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==57) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4799:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4799:2: ()
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4800:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleFeatureCall10342); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4812:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4813:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4813:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4814:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall10366); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4828:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==44) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4828:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4828:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4828:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4835:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4836:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,44,FOLLOW_44_in_ruleFeatureCall10400); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operationCall_4_0, grammarAccess.getFeatureCallAccess().getOperationCallLeftParenthesisKeyword_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4849:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt80=2;
            	            int LA80_0 = input.LA(1);

            	            if ( ((LA80_0>=RULE_ID && LA80_0<=RULE_STRING)||LA80_0==44||(LA80_0>=55 && LA80_0<=56)||LA80_0==66||(LA80_0>=84 && LA80_0<=85)||LA80_0==88) ) {
            	                alt80=1;
            	            }
            	            switch (alt80) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4849:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4849:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4850:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4850:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4851:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10435);
            	                    lv_args_5_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"args",
            	                              		lv_args_5_0, 
            	                              		"Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4867:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop79:
            	                    do {
            	                        int alt79=2;
            	                        int LA79_0 = input.LA(1);

            	                        if ( (LA79_0==23) ) {
            	                            alt79=1;
            	                        }


            	                        switch (alt79) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4867:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall10448); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4871:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4872:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4872:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4873:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10469);
            	                    	    lv_args_7_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"args",
            	                    	              		lv_args_7_0, 
            	                    	              		"Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop79;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleFeatureCall10485); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
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
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4901:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4902:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4903:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression10525);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression10535); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4910:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4913:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4914:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4914:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4914:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4914:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4915:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4923:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4924:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4924:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4925:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression10596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4939:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==44) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4939:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4939:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4939:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4946:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4947:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,44,FOLLOW_44_in_ruleElementReferenceExpression10630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operationCall_2_0, grammarAccess.getElementReferenceExpressionAccess().getOperationCallLeftParenthesisKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "operationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4960:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( ((LA84_0>=RULE_ID && LA84_0<=RULE_STRING)||LA84_0==44||(LA84_0>=55 && LA84_0<=56)||LA84_0==66||(LA84_0>=84 && LA84_0<=85)||LA84_0==88) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4960:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4960:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4961:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4961:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4962:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression10665);
                            lv_args_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4978:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==23) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4978:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression10678); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4982:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4983:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4983:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:4984:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression10699);
                            	    lv_args_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop83;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleElementReferenceExpression10715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getElementReferenceExpressionAccess().getRightParenthesisKeyword_2_2());
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleEventValueReferenceExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5012:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5013:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5014:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression10753);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression10763); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventValueReferenceExpression"


    // $ANTLR start "ruleEventValueReferenceExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5021:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5024:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5025:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5025:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5025:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5025:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5026:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleEventValueReferenceExpression10812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleEventValueReferenceExpression10824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5042:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5043:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5043:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5044:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression10845);
            lv_value_3_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventValueReferenceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleEventValueReferenceExpression10857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEventValueReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleEventValueReferenceExpression"


    // $ANTLR start "entryRuleActiveStateReferenceExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5072:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5073:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5074:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression10893);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression10903); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActiveStateReferenceExpression"


    // $ANTLR start "ruleActiveStateReferenceExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5081:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5084:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5085:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5085:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5085:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5085:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5086:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleActiveStateReferenceExpression10952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleActiveStateReferenceExpression10964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5102:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5103:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5103:1: ( ruleFQN )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5104:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression10991);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleActiveStateReferenceExpression11003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getActiveStateReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleActiveStateReferenceExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5132:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5133:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5134:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression11039);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression11049); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5141:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5144:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5145:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5145:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5145:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5145:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5146:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleParenthesizedExpression11098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5158:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5159:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5159:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5160:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression11119);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleParenthesizedExpression11131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_3());
                  
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
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5188:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5189:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5190:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral11167);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral11177); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5197:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5200:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5201:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5201:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt86=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt86=1;
                }
                break;
            case RULE_INT:
                {
                alt86=2;
                }
                break;
            case RULE_HEX:
                {
                alt86=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt86=4;
                }
                break;
            case RULE_STRING:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5202:2: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral11227);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5215:2: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral11257);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5228:2: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral11287);
                    this_HexLiteral_2=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HexLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5241:2: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral11317);
                    this_RealLiteral_3=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5254:2: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral11347);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_4; 
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
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5273:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5274:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5275:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11382);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral11392); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5282:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5285:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5286:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5286:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5286:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5286:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5287:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5295:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5296:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5296:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5297:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral11446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BOOL");
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5321:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5322:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5323:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11487);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral11497); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5330:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5333:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5334:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5334:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5334:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5334:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5335:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5343:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5344:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5344:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5345:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral11551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5369:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5370:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5371:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral11592);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral11602); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5378:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5381:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5382:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5382:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5382:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5382:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5383:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5391:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5392:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5392:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5393:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral11656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getRealLiteralAccess().getValueFLOATTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRealLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"FLOAT");
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleHexLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5417:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5418:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5419:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral11697);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral11707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexLiteral"


    // $ANTLR start "ruleHexLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5426:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5429:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5430:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5430:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5430:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5430:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5431:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5439:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5440:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5440:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5441:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral11761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getHexLiteralAccess().getValueHEXTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHexLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"HEX");
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleHexLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5465:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5466:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5467:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11802);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11812); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5474:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5477:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5478:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5478:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5478:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5478:2: ()
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5479:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5487:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5488:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5488:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5489:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
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
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5513:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5515:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5516:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5516:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt87=1;
                }
                break;
            case 47:
                {
                alt87=2;
                }
                break;
            case 48:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5516:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5516:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5516:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleDirection11921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5522:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5522:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5522:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleDirection11938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5528:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5528:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5528:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleDirection11955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_2()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTimeEventType"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5538:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5540:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5541:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5541:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==70) ) {
                alt88=1;
            }
            else if ( (LA88_0==71) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5541:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5541:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5541:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleTimeEventType12000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5547:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5547:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5547:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleTimeEventType12017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getEveryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeEventTypeAccess().getEveryEnumLiteralDeclaration_1()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleTimeEventType"


    // $ANTLR start "ruleAssignmentOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5557:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
    public final Enumerator ruleAssignmentOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5559:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5560:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5560:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt89=11;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt89=1;
                }
                break;
            case 72:
                {
                alt89=2;
                }
                break;
            case 73:
                {
                alt89=3;
                }
                break;
            case 74:
                {
                alt89=4;
                }
                break;
            case 75:
                {
                alt89=5;
                }
                break;
            case 76:
                {
                alt89=6;
                }
                break;
            case 77:
                {
                alt89=7;
                }
                break;
            case 78:
                {
                alt89=8;
                }
                break;
            case 79:
                {
                alt89=9;
                }
                break;
            case 80:
                {
                alt89=10;
                }
                break;
            case 81:
                {
                alt89=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5560:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5560:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5560:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleAssignmentOperator12062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5566:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5566:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5566:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator12079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5572:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5572:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5572:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator12096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5578:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5578:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5578:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator12113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5584:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5584:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5584:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator12130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5590:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5590:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5590:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator12147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5596:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5596:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5596:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator12164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5602:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5602:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5602:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator12181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5608:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5608:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5608:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator12198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5614:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5614:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5614:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator12215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5620:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5620:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5620:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator12232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getOrAssignEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOperatorAccess().getOrAssignEnumLiteralDeclaration_10()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "ruleShiftOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5630:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5632:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5633:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5633:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==82) ) {
                alt90=1;
            }
            else if ( (LA90_0==83) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5633:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5633:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5633:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleShiftOperator12277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5639:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5639:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5639:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleShiftOperator12294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getShiftOperatorAccess().getRightEnumLiteralDeclaration_1()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleShiftOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5649:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5651:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5652:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5652:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==84) ) {
                alt91=1;
            }
            else if ( (LA91_0==85) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5652:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5652:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5652:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleAdditiveOperator12339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5658:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5658:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5658:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_85_in_ruleAdditiveOperator12356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5668:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5670:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5671:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5671:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt92=1;
                }
                break;
            case 58:
                {
                alt92=2;
                }
                break;
            case 87:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5671:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5671:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5671:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleMultiplicativeOperator12401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5677:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5677:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5677:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleMultiplicativeOperator12418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5683:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5683:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5683:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_87_in_ruleMultiplicativeOperator12435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getModEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getModEnumLiteralDeclaration_2()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5693:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5695:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5696:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5696:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt93=1;
                }
                break;
            case 85:
                {
                alt93=2;
                }
                break;
            case 88:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5696:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5696:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5696:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleUnaryOperator12480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5702:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5702:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5702:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_85_in_ruleUnaryOperator12497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5708:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5708:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5708:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleUnaryOperator12514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getComplementEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getComplementEnumLiteralDeclaration_2()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5718:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5720:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5721:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5721:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt94=6;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt94=1;
                }
                break;
            case 90:
                {
                alt94=2;
                }
                break;
            case 62:
                {
                alt94=3;
                }
                break;
            case 91:
                {
                alt94=4;
                }
                break;
            case 92:
                {
                alt94=5;
                }
                break;
            case 93:
                {
                alt94=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5721:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5721:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5721:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator12559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5727:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5727:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5727:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator12576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5733:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5733:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5733:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleRelationalOperator12593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5739:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5739:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5739:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator12610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5745:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5745:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5745:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator12627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5751:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5751:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5751:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator12644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getNotEqualsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getNotEqualsEnumLiteralDeclaration_5()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleTimeUnit"
    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5761:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5763:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5764:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5764:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt95=1;
                }
                break;
            case 95:
                {
                alt95=2;
                }
                break;
            case 96:
                {
                alt95=3;
                }
                break;
            case 97:
                {
                alt95=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5764:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5764:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5764:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_94_in_ruleTimeUnit12689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5770:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5770:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5770:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit12706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5776:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5776:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5776:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_96_in_ruleTimeUnit12723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5782:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5782:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:5782:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,97,FOLLOW_97_in_ruleTimeUnit12740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getNanosecondEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getNanosecondEnumLiteralDeclaration_3()); 
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"

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
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred2_InternalSCL208);
        lv_statements_4_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,16,FOLLOW_16_in_synpred2_InternalSCL220); if (state.failed) return ;

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
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred3_InternalSCL248);
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
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:3: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:3: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:3: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:4: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:701:4: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:702:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:702:1: (lv_statements_3_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:703:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred19_InternalSCL1309);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,16,FOLLOW_16_in_synpred19_InternalSCL1321); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSCL

    // $ANTLR start synpred20_InternalSCL
    public final void synpred20_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:724:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:724:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:724:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:725:1: (lv_statements_5_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:726:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred20_InternalSCL1349);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSCL

    // $ANTLR start synpred23_InternalSCL
    public final void synpred23_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_elseStatements_9_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:3: ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:3: ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:3: ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:4: ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:782:4: ( (lv_elseStatements_9_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:1: (lv_elseStatements_9_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:783:1: (lv_elseStatements_9_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:784:3: lv_elseStatements_9_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsInstructionStatementParserRuleCall_4_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred23_InternalSCL1435);
        lv_elseStatements_9_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,16,FOLLOW_16_in_synpred23_InternalSCL1447); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSCL

    // $ANTLR start synpred24_InternalSCL
    public final void synpred24_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_elseStatements_11_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:805:6: ( ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:805:6: ( (lv_elseStatements_11_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:805:6: ( (lv_elseStatements_11_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:1: (lv_elseStatements_11_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:806:1: (lv_elseStatements_11_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:807:3: lv_elseStatements_11_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalAccess().getElseStatementsEmptyStatementParserRuleCall_4_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred24_InternalSCL1475);
        lv_elseStatements_11_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSCL

    // $ANTLR start synpred28_InternalSCL
    public final void synpred28_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:4: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:4: ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:5: ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:938:5: ( (lv_statements_1_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:1: (lv_statements_1_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:939:1: (lv_statements_1_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:940:3: lv_statements_1_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsInstructionStatementParserRuleCall_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred28_InternalSCL1752);
        lv_statements_1_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,16,FOLLOW_16_in_synpred28_InternalSCL1764); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalSCL

    // $ANTLR start synpred29_InternalSCL
    public final void synpred29_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:6: ( ( (lv_statements_3_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:961:6: ( (lv_statements_3_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:1: (lv_statements_3_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:962:1: (lv_statements_3_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:963:3: lv_statements_3_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getThreadAccess().getStatementsEmptyStatementParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred29_InternalSCL1792);
        lv_statements_3_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalSCL

    // $ANTLR start synpred33_InternalSCL
    public final void synpred33_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_declarations_2_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1153:1: ( (lv_declarations_2_0= ruleVariableDeclaration ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1153:1: (lv_declarations_2_0= ruleVariableDeclaration )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1153:1: (lv_declarations_2_0= ruleVariableDeclaration )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1154:3: lv_declarations_2_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariableDeclaration_in_synpred33_InternalSCL2206);
        lv_declarations_2_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalSCL

    // $ANTLR start synpred34_InternalSCL
    public final void synpred34_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:5: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:5: ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:6: ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';'
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1170:6: ( (lv_statements_3_0= ruleInstructionStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:1: (lv_statements_3_0= ruleInstructionStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1171:1: (lv_statements_3_0= ruleInstructionStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1172:3: lv_statements_3_0= ruleInstructionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsInstructionStatementParserRuleCall_3_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstructionStatement_in_synpred34_InternalSCL2231);
        lv_statements_3_0=ruleInstructionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,16,FOLLOW_16_in_synpred34_InternalSCL2243); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSCL

    // $ANTLR start synpred35_InternalSCL
    public final void synpred35_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_statements_5_0 = null;


        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1193:6: ( ( (lv_statements_5_0= ruleEmptyStatement ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1193:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1193:6: ( (lv_statements_5_0= ruleEmptyStatement ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:1: (lv_statements_5_0= ruleEmptyStatement )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1194:1: (lv_statements_5_0= ruleEmptyStatement )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:1195:3: lv_statements_5_0= ruleEmptyStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementScopeAccess().getStatementsEmptyStatementParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEmptyStatement_in_synpred35_InternalSCL2271);
        lv_statements_5_0=ruleEmptyStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalSCL

    // $ANTLR start synpred54_InternalSCL
    public final void synpred54_InternalSCL_fragment() throws RecognitionException {   
        Token lv_readonly_3_0=null;

        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2076:4: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2076:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2076:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2077:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalSCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
        }
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2077:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2078:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2081:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2081:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalSCL", "true");
        }
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2081:16: ( (lv_readonly_3_0= 'readonly' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2082:1: (lv_readonly_3_0= 'readonly' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2082:1: (lv_readonly_3_0= 'readonly' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2083:3: lv_readonly_3_0= 'readonly'
        {
        lv_readonly_3_0=(Token)match(input,41,FOLLOW_41_in_synpred54_InternalSCL4178); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalSCL

    // $ANTLR start synpred55_InternalSCL
    public final void synpred55_InternalSCL_fragment() throws RecognitionException {   
        Token lv_external_4_0=null;

        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2103:4: ( ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2103:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2103:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2104:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred55_InternalSCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
        }
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2104:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2105:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:7: {...}? => ( (lv_external_4_0= 'external' ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred55_InternalSCL", "true");
        }
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2108:16: ( (lv_external_4_0= 'external' ) )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2109:1: (lv_external_4_0= 'external' )
        {
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2109:1: (lv_external_4_0= 'external' )
        // ../de.cau.cs.kieler.scl/src-gen/de/cau/cs/kieler/scl/parser/antlr/internal/InternalSCL.g:2110:3: lv_external_4_0= 'external'
        {
        lv_external_4_0=(Token)match(input,42,FOLLOW_42_in_synpred55_InternalSCL4263); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred55_InternalSCL

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
    public final boolean synpred34_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred28_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred54_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalSCL_fragment(); // can never throw exception
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
    public final boolean synpred23_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSCL_fragment(); // can never throw exception
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
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA2_eotS =
        "\27\uffff";
    static final String DFA2_eofS =
        "\27\uffff";
    static final String DFA2_minS =
        "\1\4\23\0\3\uffff";
    static final String DFA2_maxS =
        "\1\130\23\0\3\uffff";
    static final String DFA2_acceptS =
        "\24\uffff\1\3\1\1\1\2";
    static final String DFA2_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\3\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\7\1\2\1\3\1\5\1\4\1\6\5\uffff\1\23\1\uffff\1\24\4\uffff"+
            "\1\1\1\uffff\1\17\3\uffff\1\20\1\21\2\uffff\1\22\13\uffff\1"+
            "\12\12\uffff\1\11\1\10\11\uffff\1\16\21\uffff\1\13\1\14\2\uffff"+
            "\1\15",
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
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (synpred3_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (synpred3_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index2_19);
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
        "\30\uffff";
    static final String DFA14_eofS =
        "\30\uffff";
    static final String DFA14_minS =
        "\1\4\23\0\4\uffff";
    static final String DFA14_maxS =
        "\1\130\23\0\4\uffff";
    static final String DFA14_acceptS =
        "\24\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\4\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\7\1\2\1\3\1\5\1\4\1\6\5\uffff\1\23\6\uffff\1\1\1\uffff\1"+
            "\17\1\uffff\2\24\1\20\1\21\2\uffff\1\22\13\uffff\1\12\12\uffff"+
            "\1\11\1\10\11\uffff\1\16\21\uffff\1\13\1\14\2\uffff\1\15",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 701:2: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
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
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (synpred20_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (synpred20_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_14 = input.LA(1);

                         
                        int index14_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_16 = input.LA(1);

                         
                        int index14_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_17 = input.LA(1);

                         
                        int index14_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_18 = input.LA(1);

                         
                        int index14_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index14_19);
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
    static final String DFA17_eotS =
        "\27\uffff";
    static final String DFA17_eofS =
        "\27\uffff";
    static final String DFA17_minS =
        "\1\4\23\0\3\uffff";
    static final String DFA17_maxS =
        "\1\130\23\0\3\uffff";
    static final String DFA17_acceptS =
        "\24\uffff\1\3\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\3\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\7\1\2\1\3\1\5\1\4\1\6\5\uffff\1\23\6\uffff\1\1\1\uffff\1"+
            "\17\2\uffff\1\24\1\20\1\21\2\uffff\1\22\13\uffff\1\12\12\uffff"+
            "\1\11\1\10\11\uffff\1\16\21\uffff\1\13\1\14\2\uffff\1\15",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 782:2: ( ( ( (lv_elseStatements_9_0= ruleInstructionStatement ) ) otherlv_10= ';' ) | ( (lv_elseStatements_11_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (synpred24_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (synpred24_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_16 = input.LA(1);

                         
                        int index17_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_17 = input.LA(1);

                         
                        int index17_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_18 = input.LA(1);

                         
                        int index17_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_19 = input.LA(1);

                         
                        int index17_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\31\uffff";
    static final String DFA21_eofS =
        "\1\24\30\uffff";
    static final String DFA21_minS =
        "\1\4\23\0\5\uffff";
    static final String DFA21_maxS =
        "\1\130\23\0\5\uffff";
    static final String DFA21_acceptS =
        "\24\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\7\1\2\1\3\1\5\1\4\1\6\5\uffff\1\23\6\uffff\1\1\1\uffff\1"+
            "\17\3\uffff\1\20\1\21\2\24\1\22\13\uffff\1\12\12\uffff\1\11"+
            "\1\10\11\uffff\1\16\21\uffff\1\13\1\14\2\uffff\1\15",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 938:3: ( ( ( (lv_statements_1_0= ruleInstructionStatement ) ) otherlv_2= ';' ) | ( (lv_statements_3_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (synpred29_InternalSCL()) ) {s = 24;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (synpred29_InternalSCL()) ) {s = 24;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_14 = input.LA(1);

                         
                        int index21_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA21_15 = input.LA(1);

                         
                        int index21_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA21_16 = input.LA(1);

                         
                        int index21_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA21_17 = input.LA(1);

                         
                        int index21_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA21_18 = input.LA(1);

                         
                        int index21_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA21_19 = input.LA(1);

                         
                        int index21_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSCL()) ) {s = 23;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index21_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\27\uffff";
    static final String DFA25_eofS =
        "\27\uffff";
    static final String DFA25_minS =
        "\1\4\6\uffff\1\0\17\uffff";
    static final String DFA25_maxS =
        "\1\130\6\uffff\1\0\17\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\23\uffff\1\1\1\uffff";
    static final String DFA25_specialS =
        "\7\uffff\1\0\17\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\7\5\1\5\uffff\1\1\1\uffff\1\1\2\25\2\uffff\1\1\1\uffff\1"+
            "\1\3\uffff\2\1\2\uffff\1\1\13\uffff\1\1\12\uffff\2\1\11\uffff"+
            "\1\1\21\uffff\2\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 1152:1: ( (lv_declarations_2_0= ruleVariableDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\27\uffff";
    static final String DFA26_eofS =
        "\27\uffff";
    static final String DFA26_minS =
        "\1\4\23\0\3\uffff";
    static final String DFA26_maxS =
        "\1\130\23\0\3\uffff";
    static final String DFA26_acceptS =
        "\24\uffff\1\3\1\1\1\2";
    static final String DFA26_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\3\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\7\1\2\1\3\1\5\1\4\1\6\5\uffff\1\23\1\uffff\1\24\4\uffff"+
            "\1\1\1\uffff\1\17\3\uffff\1\20\1\21\2\uffff\1\22\13\uffff\1"+
            "\12\12\uffff\1\11\1\10\11\uffff\1\16\21\uffff\1\13\1\14\2\uffff"+
            "\1\15",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 1170:4: ( ( ( (lv_statements_3_0= ruleInstructionStatement ) ) otherlv_4= ';' ) | ( (lv_statements_5_0= ruleEmptyStatement ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (synpred35_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (synpred35_InternalSCL()) ) {s = 22;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_12 = input.LA(1);

                         
                        int index26_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_13 = input.LA(1);

                         
                        int index26_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_14 = input.LA(1);

                         
                        int index26_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_15 = input.LA(1);

                         
                        int index26_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_16 = input.LA(1);

                         
                        int index26_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_17 = input.LA(1);

                         
                        int index26_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA26_18 = input.LA(1);

                         
                        int index26_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA26_19 = input.LA(1);

                         
                        int index26_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index26_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\56\uffff";
    static final String DFA41_eofS =
        "\56\uffff";
    static final String DFA41_minS =
        "\1\4\1\uffff\2\4\52\uffff";
    static final String DFA41_maxS =
        "\1\70\1\uffff\2\70\52\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\3\2\uffff\25\1\25\2";
    static final String DFA41_specialS =
        "\2\uffff\1\0\1\1\52\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\25\uffff\1\1\11\uffff\5\1\1\2\1\3\1\1\2\uffff\13\1",
            "",
            "\1\4\17\uffff\1\1\5\uffff\1\21\11\uffff\1\5\1\6\1\7\1\10\1"+
            "\14\1\15\1\16\1\17\2\uffff\1\11\1\12\1\13\1\20\1\22\1\23\1\24"+
            "\1\25\1\26\1\27\1\30",
            "\1\31\17\uffff\1\1\5\uffff\1\46\11\uffff\1\32\1\33\1\34\1"+
            "\35\1\41\1\42\1\43\1\44\2\uffff\1\36\1\37\1\40\1\45\1\47\1\50"+
            "\1\51\1\52\1\53\1\54\1\55",
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
            "",
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
            return "()* loopback of 2074:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA41_2 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 4;}

                        else if ( LA41_2 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 5;}

                        else if ( LA41_2 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 6;}

                        else if ( LA41_2 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 7;}

                        else if ( LA41_2 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 8;}

                        else if ( LA41_2 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 9;}

                        else if ( LA41_2 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 10;}

                        else if ( LA41_2 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 11;}

                        else if ( LA41_2 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 12;}

                        else if ( LA41_2 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 13;}

                        else if ( LA41_2 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( LA41_2 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 15;}

                        else if ( LA41_2 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 16;}

                        else if ( LA41_2 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 17;}

                        else if ( LA41_2 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 18;}

                        else if ( LA41_2 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 19;}

                        else if ( LA41_2 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 20;}

                        else if ( LA41_2 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 21;}

                        else if ( LA41_2 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 22;}

                        else if ( LA41_2 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 23;}

                        else if ( LA41_2 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 24;}

                        else if ( (LA41_2==20) ) {s = 1;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA41_3 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 25;}

                        else if ( LA41_3 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 26;}

                        else if ( LA41_3 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 27;}

                        else if ( LA41_3 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 28;}

                        else if ( LA41_3 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 29;}

                        else if ( LA41_3 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 30;}

                        else if ( LA41_3 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 31;}

                        else if ( LA41_3 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 32;}

                        else if ( LA41_3 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 33;}

                        else if ( LA41_3 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 34;}

                        else if ( LA41_3 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 35;}

                        else if ( LA41_3 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 36;}

                        else if ( LA41_3 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 37;}

                        else if ( LA41_3 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 38;}

                        else if ( LA41_3 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 39;}

                        else if ( LA41_3 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 40;}

                        else if ( LA41_3 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 41;}

                        else if ( LA41_3 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 42;}

                        else if ( LA41_3 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 43;}

                        else if ( LA41_3 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 44;}

                        else if ( LA41_3 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 45;}

                        else if ( (LA41_3==20) ) {s = 1;}

                         
                        input.seek(index41_3);
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
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProgram128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram145 = new BitSet(new long[]{0x00000000000C8010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleProgram171 = new BitSet(new long[]{0x00000000000C8010L});
    public static final BitSet FOLLOW_15_in_ruleProgram184 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleProgram208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProgram220 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleProgram248 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleProgram272 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleProgram293 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_17_in_ruleProgram309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration398 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleVariableDeclaration430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration461 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDeclaration479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration503 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleVariableDeclaration518 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration539 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDeclaration553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyStatement601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEmptyStatement647 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyStatement666 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEmptyStatement683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_entryRuleInstructionStatement720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionStatement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionStatement776 = new BitSet(new long[]{0x01801001314083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstructionStatement800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstructionStatement819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstructionStatement838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstructionStatement857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstructionStatement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_ruleInstructionStatement895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation1000 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation1035 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAnnotation1053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation1070 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConditional1252 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditional1273 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConditional1285 = new BitSet(new long[]{0x018010013D4083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional1321 = new BitSet(new long[]{0x018010013D4083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1349 = new BitSet(new long[]{0x018010013D4083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1373 = new BitSet(new long[]{0x018010013D4083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1394 = new BitSet(new long[]{0x018010013D4083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_26_in_ruleConditional1411 = new BitSet(new long[]{0x01801001394083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional1447 = new BitSet(new long[]{0x01801001394083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1475 = new BitSet(new long[]{0x01801001394083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleConditional1499 = new BitSet(new long[]{0x01801001394083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleConditional1520 = new BitSet(new long[]{0x01801001394083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_27_in_ruleConditional1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGoto1621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThread_in_entryRuleThread1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThread1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1752 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleThread1764 = new BitSet(new long[]{0x01801001314083F2L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread1792 = new BitSet(new long[]{0x01801001314083F2L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleThread1816 = new BitSet(new long[]{0x01801001314083F2L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleThread1837 = new BitSet(new long[]{0x01801001314083F2L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParallel1924 = new BitSet(new long[]{0x01801001F14083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel1946 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleParallel1959 = new BitSet(new long[]{0x01801001F14083F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleThread_in_ruleParallel1980 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleParallel1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePause2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementScope_in_entryRuleStatementScope2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementScope2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatementScope2185 = new BitSet(new long[]{0x01801001314E83F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatementScope2206 = new BitSet(new long[]{0x01801001314E83F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2231 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatementScope2243 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2271 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_ruleStatementScope2295 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatementScope2316 = new BitSet(new long[]{0x01801001314283F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_17_in_ruleStatementScope2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartRoot2572 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateRoot2676 = new BitSet(new long[]{0x103C000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTransitionRoot2780 = new BitSet(new long[]{0x1C3E000004000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStatechartSpecification2899 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2920 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2943 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope3230 = new BitSet(new long[]{0x103C000000000012L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInterfaceScope3453 = new BitSet(new long[]{0x01FFCFF004100010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceScope3487 = new BitSet(new long[]{0x0001C880000C0012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3510 = new BitSet(new long[]{0x0001C880000C0012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3529 = new BitSet(new long[]{0x0001C880000C0012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3548 = new BitSet(new long[]{0x0001C880000C0012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInternalScope3647 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInternalScope3659 = new BitSet(new long[]{0x103DC880000C0012L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3682 = new BitSet(new long[]{0x103DC880000C0012L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3701 = new BitSet(new long[]{0x103DC880000C0012L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3720 = new BitSet(new long[]{0x103DC880000C0012L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3739 = new BitSet(new long[]{0x103DC880000C0012L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3932 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEventDefinition3945 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3966 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventDefinition3979 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition4052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariableDefinition4115 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_41_in_ruleVariableDefinition4178 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_42_in_ruleVariableDefinition4263 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleVariableDefinition4337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition4349 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition4376 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition4389 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperationDefinition4606 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition4627 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleOperationDefinition4639 = new BitSet(new long[]{0x01FFEFF004000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4661 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition4674 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4695 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_45_in_ruleOperationDefinition4711 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition4724 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleParameter4845 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParameter4857 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXID5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5456 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFQN5475 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5497 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5602 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleLocalReaction5634 = new BitSet(new long[]{0x01C01000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5761 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTransitionReaction5775 = new BitSet(new long[]{0x01C01000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5796 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTransitionReaction5811 = new BitSet(new long[]{0x4000000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5832 = new BitSet(new long[]{0x4000000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger5996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger6066 = new BitSet(new long[]{0x1000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleReactionTrigger6079 = new BitSet(new long[]{0x003C000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger6100 = new BitSet(new long[]{0x1000000000800002L});
    public static final BitSet FOLLOW_60_in_ruleReactionTrigger6123 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger6145 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleReactionTrigger6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleReactionTrigger6179 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger6200 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleReactionTrigger6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger6250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDefaultTrigger6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDefaultTrigger6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect6365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect6435 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6454 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleReactionEffect6478 = new BitSet(new long[]{0x01C01000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect6502 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6521 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty6562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEntryPointSpec6734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec6844 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleExitPointSpec6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec6897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec7052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec7142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec7198 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec7219 = new BitSet(new long[]{0x0000000000000000L,0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec7276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent7431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEntryEvent7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent7526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExitEvent7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAlwaysEvent7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlwaysEvent7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression7736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEventRaisingExpression7795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression7816 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventRaisingExpression7829 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression8043 = new BitSet(new long[]{0x0000000000200002L,0x000000000003FF00L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression8076 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression8097 = new BitSet(new long[]{0x0000000000200002L,0x000000000003FF00L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression8135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8195 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleConditionalExpression8219 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConditionalExpression8252 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression8311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleLogicalOrExpression8395 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression8454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLogicalAndExpression8538 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression8597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLogicalNotExpression8687 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBitwiseXorExpression8829 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression8898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleBitwiseOrExpression8972 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression9031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression9091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleBitwiseAndExpression9115 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression9136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression9174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression9234 = new BitSet(new long[]{0x4000000000000002L,0x000000003E000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression9267 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression9288 = new BitSet(new long[]{0x4000000000000002L,0x000000003E000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression9326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9386 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression9419 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9440 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression9478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression9571 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression9630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9690 = new BitSet(new long[]{0x0400000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression9723 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9744 = new BitSet(new long[]{0x0400000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression9782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression9881 = new BitSet(new long[]{0x01801000000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression9939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression10154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall10258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall10318 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFeatureCall10342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall10366 = new BitSet(new long[]{0x0200100000000002L});
    public static final BitSet FOLLOW_44_in_ruleFeatureCall10400 = new BitSet(new long[]{0x01803000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10435 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall10448 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10469 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_45_in_ruleFeatureCall10485 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression10525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression10535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression10596 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleElementReferenceExpression10630 = new BitSet(new long[]{0x01803000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression10665 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression10678 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression10699 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_45_in_ruleElementReferenceExpression10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression10753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEventValueReferenceExpression10812 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEventValueReferenceExpression10824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression10845 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEventValueReferenceExpression10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression10893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression10903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleActiveStateReferenceExpression10952 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleActiveStateReferenceExpression10964 = new BitSet(new long[]{0x01FFCFF004000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression10991 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleActiveStateReferenceExpression11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression11039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParenthesizedExpression11098 = new BitSet(new long[]{0x01801000000003F0L,0x0000000001300004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression11119 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleParenthesizedExpression11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral11167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral11551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral11592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral11656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral11697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDirection11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDirection11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDirection11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTimeEventType12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTimeEventType12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAssignmentOperator12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator12147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator12198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator12215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleShiftOperator12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleShiftOperator12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAdditiveOperator12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAdditiveOperator12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleMultiplicativeOperator12401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMultiplicativeOperator12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleMultiplicativeOperator12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnaryOperator12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUnaryOperator12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnaryOperator12514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator12576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelationalOperator12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator12627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTimeUnit12689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTimeUnit12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTimeUnit12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred2_InternalSCL208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalSCL220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred3_InternalSCL248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred19_InternalSCL1309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred19_InternalSCL1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred20_InternalSCL1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred23_InternalSCL1435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred23_InternalSCL1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred24_InternalSCL1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred28_InternalSCL1752 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred28_InternalSCL1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred29_InternalSCL1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_synpred33_InternalSCL2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionStatement_in_synpred34_InternalSCL2231 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred34_InternalSCL2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_synpred35_InternalSCL2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred54_InternalSCL4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred55_InternalSCL4263 = new BitSet(new long[]{0x0000000000000002L});

}
